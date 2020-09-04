package net.msrandom.cenozocraft.entity.monster;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class DireWolfEntity extends CenozocraftMonsterBase {
    public DireWolfEntity(EntityType<? extends DireWolfEntity> type, World worldIn) {
        super(type, worldIn);
        this.setTameDifficulty(1f);
        this.setHostileChance(0.25f);
    }
}

