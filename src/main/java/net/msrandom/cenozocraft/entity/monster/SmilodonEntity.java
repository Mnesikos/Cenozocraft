package net.msrandom.cenozocraft.entity.monster;

import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.msrandom.cenozocraft.CenozoCraft;

public class SmilodonEntity extends CenozocraftMonsterBase {
    private final int variant;

    public SmilodonEntity(EntityType<? extends SmilodonEntity> type, World world, int variant) {
        super(type, world);
        this.setTameDifficulty(1.5f);
        this.setHostileChance(0.5f);
        this.variant = variant;
    }

    @Override
    protected void setRandomVariant() {}

    @Override
    public int getVariantCount() {
        return 3;
    }

    @Override
    public int getVariant() {
        return variant;
    }

    @Override
    public Identifier getTextureLocation() {
        if (location == null)
            location = new Identifier(CenozoCraft.MOD_ID, "textures/entity/smilodon");
        return super.getTextureLocation();
    }

    public static class Populator extends SmilodonEntity {
        public Populator(EntityType<? extends Populator> type, World worldIn) {
            super(type, worldIn, 0);
        }
    }

    public static class Fatalis extends SmilodonEntity {
        public Fatalis(EntityType<? extends Fatalis> type, World worldIn) {
            super(type, worldIn, 1);
        }
    }

    public static class Gracilis extends SmilodonEntity {
        public Gracilis(EntityType<? extends Gracilis> type, World worldIn) {
            super(type, worldIn, 2);
        }
    }
}
