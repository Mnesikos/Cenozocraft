package net.msrandom.cenozocraft.entity.monster;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class ThylacineEntity extends CenozocraftMonsterBase {
    public ThylacineEntity(EntityType<? extends ThylacineEntity> type, World world) {
        super(type, world);
        this.setTameDifficulty(1f);
        this.setHostileChance(0.25f);
    }
}

