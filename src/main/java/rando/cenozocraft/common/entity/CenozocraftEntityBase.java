package rando.cenozocraft.common.entity;

import com.google.common.collect.Lists;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import rando.cenozocraft.common.datasync.CenozocraftDataSerializers;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public abstract class CenozocraftEntityBase extends EntityCreature {

    private static final DataParameter<Integer> MODE = EntityDataManager.createKey(CenozocraftEntityBase.class, DataSerializers.VARINT);
    private static final DataParameter<Boolean> TAMED = EntityDataManager.createKey(CenozocraftEntityBase.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Optional<UUID>> OWNER = EntityDataManager.createKey(CenozocraftEntityBase.class, CenozocraftDataSerializers.UUID);
    private EntityAIWander wander;
    public static boolean tamable = false;
    public static List<Item> tameItems = null;
    protected boolean isSitting;

    public CenozocraftEntityBase(World worldIn) {
        super(worldIn);
        wander = new EntityAIWander(this, 0.2D);
        this.tasks.addTask(0, wander);
    }

    public void entityInit(){
        this.dataManager.register(MODE, 0);
        this.dataManager.register(TAMED, false);
        this.dataManager.register(OWNER, Optional.empty());
        super.entityInit();
    }

    public void setMode(int value){
        this.dataManager.set(MODE, value);
    }

    public int getMode(){
        return this.dataManager.get(MODE);
    }

    public void setTamed(boolean value){
        this.dataManager.set(TAMED, value);
    }

    public boolean getTamed(){
        return this.dataManager.get(TAMED);
    }

    public void setOwner(@Nullable UUID value){
        this.dataManager.set(OWNER, Optional.ofNullable(value));
    }

    public UUID getOwner(){
        return this.dataManager.get(OWNER).orElse(null);
    }

    protected void setTamable(Item... items){
        tamable = true;
        tameItems = Lists.newArrayList(items);
    }

    protected boolean processInteract(EntityPlayer player, EnumHand hand) {
        ItemStack item = player.getHeldItem(hand);
        if(tamable && !getTamed() && tameItems.contains(item.getItem())) {
            if (!player.capabilities.isCreativeMode)
            {
                item.shrink(1);
            }
            if (!this.world.isRemote)
            {
                if (this.rand.nextInt(3) == 0)
                {
                    this.setTamed(true);
                    this.setOwner(player.getUniqueID());
                    this.playTameEffect(true);
                    this.setMode(1);
                    this.world.setEntityState(this, (byte)7);
                }
                else
                {
                    this.playTameEffect(false);
                    this.world.setEntityState(this, (byte)6);
                }
            }
        }
        else if(getTamed() && getOwner() == player.getUniqueID() && item.getItem() == Items.STICK){
            this.setMode(getMode()==3?0:getMode()+1);
        }
        return super.processInteract(player, hand);
    }

    public void onLivingUpdate(){
        //TODO: finish the mode setup
        if(!world.isRemote){
            wander.setExecutionChance(getMode()!=0?Integer.MAX_VALUE:120);
            isSitting = getMode()==1;
        }
        super.onLivingUpdate();
    }

    public void writeEntityToNBT(NBTTagCompound compound)
    {
        compound.setInteger("mode", getMode());
        compound.setBoolean("tamed", getTamed());
        super.writeEntityToNBT(compound);
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        this.setMode(compound.getInteger("mode"));
        this.setTamed(compound.getBoolean("tamed"));
        super.readEntityFromNBT(compound);
    }

    private void playTameEffect(boolean play)
    {
        for (int i = 0; i < 7; ++i)
        {
            double d0 = this.rand.nextGaussian() * 0.02D;
            double d1 = this.rand.nextGaussian() * 0.02D;
            double d2 = this.rand.nextGaussian() * 0.02D;
            this.world.spawnParticle(!play?EnumParticleTypes.SMOKE_NORMAL:EnumParticleTypes.HEART, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + 0.5D + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, d0, d1, d2);
        }
    }
}
