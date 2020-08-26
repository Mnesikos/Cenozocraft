package rando.cenozocraft.common.entity.passive;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import rando.cenozocraft.common.entity.CenozocraftEntityBase;
import rando.cenozocraft.common.entity.IGender;

public class EntityAurochs extends CenozocraftGenderedAnimal {

    public EntityAurochs(World worldIn) {
        super(worldIn);
        this.setSize(3, 2.5f);
        this.setTameItems(Item.getItemFromBlock(Blocks.GRASS));
    }
}
