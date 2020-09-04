package net.msrandom.cenozocraft.entity.monster;

import net.minecraft.world.World;

public class TitanisEntity extends CenozocraftMonsterBase {
    public TitanisEntity(World worldIn) {
        super(worldIn);
        this.setSize(1, 0.5f);
        this.setTameDifficulty(1f);
        this.setHostileChance(0.25f);
    }
}

