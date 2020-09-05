package net.msrandom.cenozocraft.entity.passive;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import net.msrandom.cenozocraft.entity.CenozoCraftEntityBase;

public class DodoEntity extends CenozoCraftEntityBase {
    public DodoEntity(EntityType<? extends DodoEntity> type, World world) {
        super(type, world);
    }

    @Override
    public int getVariantCount() {
        return 5;
    }
}

