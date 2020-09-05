package net.msrandom.cenozocraft.entity.monster;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.World;

public class CaveBearEntity extends CenozocraftMonsterBase {
    private static final TrackedData<Boolean> STANDING = DataTracker.registerData(CaveBearEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    public CaveBearEntity(EntityType<? extends CaveBearEntity> type, World world) {
        super(type, world);
        this.setTameDifficulty(1.6f);
        this.setHostileChance(0.5f);
    }

    @Override
    public void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(STANDING, false);
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);
        tag.putBoolean("standing", isStanding());
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);
        setISStanding(tag.getBoolean("standing"));
    }

    @Override
    public int getVariantCount() {
        return 2;
    }

    private void setISStanding(boolean standing) {
        this.dataTracker.set(STANDING, standing);
    }

    public boolean isStanding(){
        return this.dataTracker.get(STANDING);
    }
}
