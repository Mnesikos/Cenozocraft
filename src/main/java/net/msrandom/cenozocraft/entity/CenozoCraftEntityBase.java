package net.msrandom.cenozocraft.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.WanderAroundGoal;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import net.msrandom.cenozocraft.entity.monster.CenozocraftMonsterBase;

import java.io.File;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class CenozoCraftEntityBase extends TameableEntity {
    private static final TrackedData<Byte> STATE = DataTracker.registerData(CenozoCraftEntityBase.class, TrackedDataHandlerRegistry.BYTE);
    private static final TrackedData<Integer> VARIANT = DataTracker.registerData(CenozoCraftEntityBase.class, TrackedDataHandlerRegistry.INTEGER);
    private final int textureCount;
    private Set<Item> tameItems = new HashSet<>();
    private int tameDifficulty = 0;
    protected Identifier location;

    public CenozoCraftEntityBase(EntityType<? extends CenozoCraftEntityBase> type, World world) {
        super(type, world);
        if(world.isClient) {
            Identifier textures = getTextureLocation();
            this.textureCount = Objects.requireNonNull(new File(getClass().getResource("/assets/" + textures.getNamespace() + "/" + textures.getPath()).getFile()).list()).length;
        }
        else this.textureCount = 0;
    }

    public Identifier getTextureLocation() {
        if(location == null) {
            Identifier key = Registry.ENTITY_TYPE.getId(getType());
            location = new Identifier(key.getNamespace(), "textures/entity/" + key.getPath() + "/");
        }
        return location;
    }

    @Override
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(0, new LookAroundGoal(this));
        this.goalSelector.add(0, new WanderAroundGoal(this, 0.2D) {
            @Override
            public boolean canStart() {
                return getState() == EnumState.WANDERING && super.canStart();
            }
        });
        this.goalSelector.add(0, new FollowOwnerGoal(this, 0.2D, 4, 16, false) {
            @Override
            public boolean canStart() {
                return getState() == EnumState.FOLLOWING && super.canStart();
            }
        });
        this.applyEntityAI();
    }

    protected void applyEntityAI() {}

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(STATE, (byte)0);
        this.dataTracker.startTracking(VARIANT, 0);
    }

    @Override
    public EntityData initialize(ServerWorldAccess serverWorldAccess, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
        entityData = super.initialize(serverWorldAccess, difficulty, spawnReason, entityData, entityTag);
        if(world.isClient && getVariantNumber() > 1) this.setVariant(this.random.nextInt(getVariantNumber()));
        return entityData;
    }

    @Override
    public void setSitting(boolean sitting) {
        this.setState(EnumState.SITTING);
        super.setSitting(sitting);
    }

    private void setVariant(int value){
        this.dataTracker.set(VARIANT, value);
    }

    public int getVariant(){
        return this.dataTracker.get(VARIANT);
    }

    @Environment(EnvType.CLIENT)
    public int getVariantNumber(){
        return textureCount;
    }

    @Override
    public PassiveEntity createChild(ServerWorld serverWorld, PassiveEntity passiveEntity) {
        if (getClass().isInstance(passiveEntity)) {
            CenozoCraftEntityBase entity = (CenozoCraftEntityBase) getType().create(serverWorld);
            UUID uuid = this.getOwnerUuid();
            if (uuid != null) {
                entity.setOwnerUuid(uuid);
                entity.setTamed(true);
            }
            return entity;
        }
        return null;
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);
        if (!isTamed() && isTameItem(stack)) {
            if (!player.isCreative()) stack.decrement(1);
            if (!this.world.isClient) {
                onHealed(player);
                if (this.random.nextInt(3 + tameDifficulty) == 0) {
                    this.setOwner(player);
                    this.setSitting(true);
                    this.world.sendEntityStatus(this, (byte) 7);
                } else {
                    this.world.sendEntityStatus(this, (byte) 6);
                }
            }
        } else if (isTamed() && player.getUuid().equals(getOwnerUuid()) && stack.getItem() == Items.STICK)
            this.setState(getState().ordinal() == 3 ? EnumState.WANDERING : EnumState.VALUES[getState().ordinal() + 1]);
        return super.interactMob(player, hand);
    }

    protected void onHealed(PlayerEntity player) {
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);
        tag.putInt("state", getState().ordinal());
        tag.putInt("variant", getVariant());
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);
        this.setState(EnumState.VALUES[tag.getInt("state")]);
        this.setVariant(tag.getInt("variant"));
    }

    protected void addTameItems(Item... items) {
        Collections.addAll(tameItems, items);
    }

    protected boolean isTameItem(ItemStack stack) {
        return tameItems.contains(stack.getItem());
    }

    protected void setTameDifficulty(float difficulty){
        tameDifficulty = MathHelper.floor(difficulty * 2);
    }

    private void setState(EnumState state) {
        if(state != getState()) {
            this.dataTracker.set(STATE, (byte) state.ordinal());
        }
    }

    private EnumState getState(){
        return EnumState.VALUES[this.dataTracker.get(STATE)];
    }

    public enum EnumState {
        WANDERING,
        SITTING,
        STAY,
        FOLLOWING;

        public static final EnumState[] VALUES = EnumState.values();
    }
}
