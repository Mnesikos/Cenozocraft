package rando.cenozocraft.common.entity.passive;

import net.minecraft.world.World;
import rando.cenozocraft.common.entity.CenozocraftEntityBase;

public class EntityGreatAuk extends CenozocraftEntityBase {
    public EntityGreatAuk(World worldIn) {
        super(worldIn);
    }

    @Override
    public int getVariantNumber() {
        return super.getVariantNumber() / 2;
    }
}

