package net.msrandom.cenozocraft.entity.monster;

import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.FollowTargetIfTamedGoal;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import net.msrandom.cenozocraft.entity.CenozoCraftEntityBase;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public abstract class CenozocraftMonsterBase extends CenozoCraftEntityBase implements Monster {
    private static final TrackedData<Byte> TYPE = DataTracker.registerData(CenozoCraftEntityBase.class, TrackedDataHandlerRegistry.BYTE);
    public Map<UUID, AtomicInteger> friends = new HashMap<>();
    private float hostileChance = 0;

    CenozocraftMonsterBase(EntityType<? extends CenozocraftMonsterBase> type, World world) {
        super(type, world);
        this.setTameDifficulty(1);
    }

    public void initDataTracker(){
        super.initDataTracker();
        this.dataTracker.startTracking(TYPE, (byte)0);
    }

    @Override
    public EntityData initialize(ServerWorldAccess serverWorldAccess, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
        entityData = super.initialize(serverWorldAccess, difficulty, spawnReason, entityData, entityTag);
        this.setHostility(this.random.nextFloat() <= hostileChance ? (this.random.nextBoolean() ? Hostility.HOSTILE : Hostility.NEUTRAL) : Hostility.PASSIVE);
        return entityData;
    }

    @Override
    protected void applyEntityAI() {
        super.applyEntityAI();
        this.targetSelector.add(0, new AttackGoal<>(this, PlayerEntity.class));
        this.targetSelector.add(0, new AttackGoal<>(this, CenozoCraftEntityBase.class, input -> !(input instanceof CenozocraftMonsterBase)));
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        if (getHostility() != Hostility.PASSIVE && source.getAttacker() instanceof LivingEntity)
            this.setAttacker((LivingEntity) source.getAttacker());
        return super.damage(source, amount);
    }

    @Override
    protected void mobTick() {
        /*for (Map.Entry<UUID, AtomicInteger> set : friends.entrySet()) {
            if (set.getValue().get() > 1000) friends.remove(set.getKey());
            else set.getValue().incrementAndGet();
        }*/
        super.mobTick();
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);
        tag.putInt("type", getHostility().ordinal());
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);
        this.setHostility(Hostility.VALUES[tag.getInt("type")]);
    }

    private void setHostility(Hostility type) {
        this.dataTracker.set(TYPE, (byte) type.ordinal());
    }

    private Hostility getHostility(){
        return Hostility.VALUES[this.dataTracker.get(TYPE)];
    }

    void setHostileChance(float chance) {
        hostileChance = chance;
    }

    @Override
    protected void onHealed(PlayerEntity player) {
        //friends.computeIfAbsent(player.getUuid(), k -> new AtomicInteger()).set(0);
    }

    protected static class AttackGoal<T extends LivingEntity> extends FollowTargetIfTamedGoal<T> {
        private final CenozocraftMonsterBase entity;

        AttackGoal(CenozocraftMonsterBase entity, Class<T> classTarget, Predicate<LivingEntity> targetSelector) {
            super(entity, classTarget, true, input -> (targetSelector != null && !targetSelector.test(input)) || (entity.getHostility() == Hostility.NEUTRAL && input != entity.getAttacker()) && (!(input instanceof PlayerEntity) || !entity.friends.containsKey(input.getUuid())));
            this.entity = entity;
        }

        AttackGoal(CenozocraftMonsterBase entity, Class<T> target) {
            this(entity, target, null);
        }

        @Override
        public boolean canStart() {
            return entity.getHostility() != Hostility.PASSIVE && (entity.getHostility() != Hostility.NEUTRAL || entity.getAttacker() != null);
        }
    }

    public enum Hostility {
        HOSTILE,
        PASSIVE,
        NEUTRAL;

        public static final Hostility[] VALUES = values();
    }
}
