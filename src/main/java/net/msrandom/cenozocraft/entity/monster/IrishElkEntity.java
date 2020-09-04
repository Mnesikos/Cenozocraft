package net.msrandom.cenozocraft.entity.monster;

import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import net.msrandom.cenozocraft.entity.GenderedAnimal;

public class IrishElkEntity extends CenozocraftMonsterBase implements GenderedAnimal {
    public IrishElkEntity(EntityType<? extends IrishElkEntity> type, World world) {
        super(type, world);
        this.setTameDifficulty(1f);
        this.setHostileChance(0.25f);
    }

    @Override
    public void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(GENDER, false);
    }

    @Override
    public EntityData initialize(ServerWorldAccess serverWorldAccess, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
        entityData = super.initialize(serverWorldAccess, difficulty, spawnReason, entityData, entityTag);
        this.setGender(CenozoCraftGender.getFromBoolean(random.nextBoolean()));
        return entityData;
    }

    @Override
    public boolean canBreedWith(AnimalEntity other) {
        return other instanceof IrishElkEntity && ((IrishElkEntity) other).getGender() != this.getGender() && super.canBreedWith(other);
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);
        tag.putBoolean("gender", CenozoCraftGender.getFromGender(this.getGender()));
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);
        this.setGender(CenozoCraftGender.getFromBoolean(tag.getBoolean("gender")));
    }
}
