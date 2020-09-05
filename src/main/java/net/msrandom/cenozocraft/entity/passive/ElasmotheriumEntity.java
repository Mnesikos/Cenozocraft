package net.msrandom.cenozocraft.entity.passive;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import net.msrandom.cenozocraft.entity.CenozoCraftEntityBase;

public class ElasmotheriumEntity extends CenozoCraftEntityBase {
    public ElasmotheriumEntity(EntityType<? extends ElasmotheriumEntity> type, World world) {
        super(type, world);
    }

    @Override
    public int getVariantCount() {
        return 3;
    }
}

