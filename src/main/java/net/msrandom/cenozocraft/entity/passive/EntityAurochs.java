package net.msrandom.cenozocraft.entity.passive;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityAurochs extends CenozocraftGenderedAnimal {

    public EntityAurochs(World worldIn) {
        super(worldIn);
        this.setSize(3, 2.5f);
        this.setTameItems(Item.getItemFromBlock(Blocks.GRASS));
    }
}
