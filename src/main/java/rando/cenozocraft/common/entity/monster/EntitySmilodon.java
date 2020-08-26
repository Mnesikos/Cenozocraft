package rando.cenozocraft.common.entity.monster;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import rando.cenozocraft.common.util.CenozocraftReference;

public class EntitySmilodon extends CenozocraftMonsterBase {

    @SuppressWarnings("unchecked")
    public static final Class<? extends EntitySmilodon>[] TYPES = new Class[]{Populator.class, Fatalis.class, Gracilis.class};
    private int variant;

    public EntitySmilodon(World worldIn, int variant) {
        super(worldIn);
        this.setSize(1, 0.5f);
        this.setTameDifficulty(1.5f);
        this.setHostileChance(0.5f);
        this.variant = variant;
    }

    @Override
    public ResourceLocation getTextures() {
        if(location == null) location = new ResourceLocation(CenozocraftReference.ID, "textures/entity/smilodon/");
        return super.getTextures();
    }

    @Override
    public int getVariant() {
        return variant;
    }

    public static class Populator extends EntitySmilodon{
        public Populator(World worldIn) {
            super(worldIn, 0);
        }
    }

    public static class Fatalis extends EntitySmilodon{
        public Fatalis(World worldIn) {
            super(worldIn, 1);
        }
    }

    public static class Gracilis extends EntitySmilodon{
        public Gracilis(World worldIn) {
            super(worldIn, 2);
        }
    }
}
