package net.msrandom.cenozocraft.entity.monster;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class TitanisEntity extends CenozocraftMonsterBase {
    public TitanisEntity(EntityType<? extends TitanisEntity> type, World world) {
        super(type, world);
        this.setTameDifficulty(1f);
        this.setHostileChance(0.25f);
    }
}

