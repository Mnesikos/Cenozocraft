package net.msrandom.cenozocraft.entity.monster;

import net.minecraft.world.World;

public class EntityCaveLion extends CenozocraftMonsterBase {
    public EntityCaveLion(World worldIn) {
        super(worldIn);
        this.setSize(1.5f, 1);
        this.setTameDifficulty(1.6f);
        this.setHostileChance(0.5f);
    }
}

