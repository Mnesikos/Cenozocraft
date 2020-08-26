package rando.cenozocraft.common.entity.monster;

import net.minecraft.world.World;

public class EntityDireWolf extends CenozocraftMonsterBase {
    public EntityDireWolf(World worldIn) {
        super(worldIn);
        this.setSize(1, 0.5f);
        this.setTameDifficulty(1f);
        this.setHostileChance(0.25f);
    }
}

