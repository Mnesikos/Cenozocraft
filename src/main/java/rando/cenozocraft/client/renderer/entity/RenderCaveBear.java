package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import rando.cenozocraft.client.model.ModelCaveBear;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.monster.EntityCaveBear;
import rando.cenozocraft.common.util.CenozocraftReference;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class RenderCaveBear extends CenozocraftRenderer<EntityCaveBear> {

    private final ModelCaveBear adultStanding = new ModelCaveBear.AdultStanding();
    private final ModelCaveBear childStanding = new ModelCaveBear.ChildStanding();
    private ResourceLocation[] childTextures;

    public RenderCaveBear(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelCaveBear.Adult(), new ModelCaveBear.Child(), 0.3f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(@Nonnull EntityCaveBear entity) {
        ResourceLocation[] tex;
        if(entity.isChild()) {
            if (childTextures == null || childTextures.length == 0) {
                final int v = entity.getVariantNumber();
                childTextures = new ResourceLocation[v];
                if (textureLocation == null) textureLocation = entity.getTextures().getResourcePath();
                for (int i = 0; i < v; i++) childTextures[i] = new ResourceLocation(CenozocraftReference.ID, textureLocation + "/child_" + (i + 1) + ".png");
            }
            tex = textures;
        } else {
            if (textures == null || textures.length == 0) {
                final int v = entity.getVariantNumber();
                textures = new ResourceLocation[v];
                if (textureLocation == null) textureLocation = entity.getTextures().getResourcePath();
                for (int i = 0; i < v; i++) textures[i] = new ResourceLocation(CenozocraftReference.ID, textureLocation + "/adult_" + (i + 1) + ".png");
            }
            tex = textures;
        }
        return tex[entity.getVariant()];
    }

    @Override
    protected ModelBase getModel(EntityCaveBear entity) {
        if(entity.isStanding()) {
            if(entity.isChild()) return childStanding;
            else return adultStanding;
        } else return super.getModel(entity);
    }
}
