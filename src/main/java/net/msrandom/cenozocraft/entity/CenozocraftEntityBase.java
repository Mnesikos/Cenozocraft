package net.msrandom.cenozocraft.entity;

import com.google.common.collect.Lists;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISit;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.msrandom.cenozocraft.entity.monster.CenozocraftMonsterBase;
import net.msrandom.cenozocraft.Cenozocraft;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.File;
import java.util.*;

public abstract class CenozocraftEntityBase extends EntityTameable {

    private static final DataParameter<Byte> STATE = EntityDataManager.createKey(CenozocraftEntityBase.class, DataSerializers.BYTE);
    private static final DataParameter<Integer> VARIANT = EntityDataManager.createKey(CenozocraftEntityBase.class, DataSerializers.VARINT);
    private final int textureCount;
    private List<Item> tameItems = new ArrayList<>();
    private int tameDifficulty = 0;
    protected ResourceLocation location;

    public CenozocraftEntityBase(World worldIn) {
        super(worldIn);
        if(worldIn.isRemote) {
            ResourceLocation textures = getTextureLocation();
            this.textureCount = Objects.requireNonNull(new File(getClass().getResource("/assets/" + textures.getNamespace() + "/" + textures.getPath()).getFile()).list()).length;
        }
        else this.textureCount = 0;
    }

    public ResourceLocation getTextureLocation() {
        if(location == null) {
            ResourceLocation key = EntityList.getKey(this);
            location = new ResourceLocation(key.getNamespace(), "textures/entity/" + key.getPath() + "/");
        }
        return location;
    }

    protected void initEntityAI() {
        super.initEntityAI();
        this.aiSit = new EntityAISit(this);
        this.tasks.addTask(0, aiSit);
        this.tasks.addTask(0, new EntityAILookIdle(this));
        this.tasks.addTask(0, new EntityAIWander(this, 0.2D) {
            @Override
            public boolean shouldExecute() {
                return getState() == EnumState.WANDERING && super.shouldExecute();
            }
        });
        this.tasks.addTask(0, new EntityAIFollowOwner(this, 0.2D, 4, 16) {
            @Override
            public boolean shouldExecute() {
                return getState() == EnumState.FOLLOWING && super.shouldExecute();
            }
        });
        this.applyEntityAI();
    }

    protected void applyEntityAI() {}

    public void entityInit(){
        super.entityInit();
        this.dataManager.register(STATE, (byte)0);
        this.dataManager.register(VARIANT, 0);
    }
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingData){
        livingData = super.onInitialSpawn(difficulty, livingData);
        if(world.isRemote && getVariantNumber() > 1) this.setVariant(this.rand.nextInt(getVariantNumber()));
        return livingData;
    }

    @Override
    public void setSitting(boolean sitting) {
        this.setState(EnumState.SITTING);
        super.setSitting(sitting);
    }

    private void setVariant(int value){
        this.dataManager.set(VARIANT, value);
    }

    public int getVariant(){
        return this.dataManager.get(VARIANT);
    }

    @SideOnly(Side.CLIENT)
    public int getVariantNumber(){
        return textureCount;
    }

    @Nullable
    @Override
    public EntityAgeable createChild(@Nonnull EntityAgeable ageable) {
        try {
            if (getClass().isInstance(ageable)) {
                CenozocraftEntityBase entity = this.getClass().getConstructor(World.class).newInstance(this.world);
                UUID uuid = this.getOwnerId();
                if (uuid != null) {
                    entity.setOwnerId(uuid);
                    entity.setTamed(true);
                }
                return entity;
            }
        } catch (ReflectiveOperationException e){
            Cenozocraft.getLogger().error("Failed to create child for " + toString(), e);
        }
        return null;
    }

    public boolean processInteract(EntityPlayer player, @Nonnull EnumHand hand) {
        ItemStack stack = player.getHeldItem(hand);
        if(!isTamed() && isTameItem(stack)) {
            if (!player.capabilities.isCreativeMode) stack.shrink(1);
            if (!this.world.isRemote) {
                if(this instanceof CenozocraftMonsterBase) ((CenozocraftMonsterBase)this).friends.put(player.getUniqueID(), 0);
                if (this.rand.nextInt(3 + tameDifficulty) == 0) {
                    this.setTamedBy(player);
                    this.playTameEffect(true);
                    this.aiSit.setSitting(true);
                    this.world.setEntityState(this, (byte)7);
                } else {
                    this.playTameEffect(false);
                    this.world.setEntityState(this, (byte)6);
                }
            }
        }
        else if(isTamed() && getOwnerId() == player.getUniqueID() && stack.getItem() == Items.STICK) this.setState(getState().ordinal()==3? EnumState.WANDERING: EnumState.values()[getState().ordinal()+1]);
        return super.processInteract(player, hand);
    }

    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setInteger("state", getState().ordinal());
        compound.setInteger("variant", getVariant());
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setState(EnumState.values()[compound.getInteger("state")]);
        this.setVariant(compound.getInteger("variant"));
    }

    protected void setTameItems(Item... items){
        tameItems = Lists.newArrayList(items);
    }

    protected boolean isTameItem(ItemStack stack) {
        return tameItems.contains(stack.getItem());
    }

    protected void setTameDifficulty(float difficulty){
        tameDifficulty = MathHelper.floor(difficulty * 2);
    }

    private void setState(EnumState state) {
        if(state != getState()) {
            this.dataManager.set(STATE, (byte) state.ordinal());
        }
    }

    private EnumState getState(){
        return EnumState.values()[this.dataManager.get(STATE)];
    }

    public enum EnumState {
        WANDERING,
        SITTING,
        @SuppressWarnings("unused") STAY,
        FOLLOWING
    }
}
