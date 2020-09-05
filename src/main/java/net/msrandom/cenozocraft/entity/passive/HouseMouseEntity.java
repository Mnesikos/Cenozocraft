package net.msrandom.cenozocraft.entity.passive;

import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.msrandom.cenozocraft.entity.CenozoCraftEntityBase;

public class HouseMouseEntity extends CenozoCraftEntityBase {
    public HouseMouseEntity(EntityType<? extends HouseMouseEntity> type, World world) {
        super(type, world);
        addTameItems(Items.WHEAT_SEEDS, Items.MELON_SEEDS, Items.PUMPKIN_SEEDS, Items.BEETROOT_SEEDS);
    }

    @Override
    public int getVariantCount() {
        return 3;
    }
}
