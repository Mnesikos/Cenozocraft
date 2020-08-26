package net.msrandom.cenozocraft.entity.monster;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.msrandom.cenozocraft.Cenozocraft;

public class EntitySmilodon extends CenozocraftMonsterBase {

    @SuppressWarnings("unchecked")
    public static final Class<? extends EntitySmilodon>[] TYPES = new Class[]{Populator.class, Fatalis.class, Gracilis.class};
    private final int variant;

    public EntitySmilodon(World worldIn, int variant) {
        super(worldIn);
        this.setSize(1, 0.5f);
        this.setTameDifficulty(1.5f);
        this.setHostileChance(0.5f);
        this.variant = variant;
    }

    @Override
    public ResourceLocation getTextureLocation() {
        if (location == null) location = new ResourceLocation(Cenozocraft.MOD_ID, "textures/entity/smilodon/");
        return super.getTextureLocation();
    }

    @Override
    public int getVariant() {
        return variant;
    }

    public static class Populator extends EntitySmilodon {
        public Populator(World worldIn) {
            super(worldIn, 0);
        }
    }

    public static class Fatalis extends EntitySmilodon {
        public Fatalis(World worldIn) {
            super(worldIn, 1);
        }
    }

    public static class Gracilis extends EntitySmilodon {
        public Gracilis(World worldIn) {
            super(worldIn, 2);
        }
    }
}
