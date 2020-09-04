package net.msrandom.cenozocraft.entity.passive;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class AurochsEntity extends CenozoCraftGenderedAnimal {
    public AurochsEntity(EntityType<? extends AurochsEntity> type, World world) {
        super(type, world);
        this.addTameItems(Blocks.GRASS_BLOCK.asItem());
    }
}
