package rando.cenozocraft.common.entity.passive;

import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import rando.cenozocraft.common.entity.CenozocraftEntityBase;

public class EntityHouseMouse extends CenozocraftEntityBase {

    public EntityHouseMouse(World worldIn) {
        super(worldIn);
        this.setSize(0.2f, 0.1f);
    }

    @Override
    protected boolean isTameItem(ItemStack stack) {
        return stack.getItem() instanceof ItemSeeds;
    }
}
