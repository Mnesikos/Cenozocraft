package net.msrandom.cenozocraft.entity.passive;

import net.minecraft.world.World;
import net.msrandom.cenozocraft.entity.CenozocraftEntityBase;

public class EntityGreatAuk extends CenozocraftEntityBase {
    public EntityGreatAuk(World worldIn) {
        super(worldIn);
    }

    @Override
    public int getVariantNumber() {
        return super.getVariantNumber() / 2;
    }
}

