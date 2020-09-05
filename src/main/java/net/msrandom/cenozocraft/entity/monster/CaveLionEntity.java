package net.msrandom.cenozocraft.entity.monster;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class CaveLionEntity extends CenozocraftMonsterBase {
    public CaveLionEntity(EntityType<? extends CaveLionEntity> type, World worldIn) {
        super(type, worldIn);
        this.setTameDifficulty(1.6f);
        this.setHostileChance(0.5f);
    }

    @Override
    public int getVariantCount() {
        return 3;
    }
}

