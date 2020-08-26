package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.msrandom.cenozocraft.client.renderer.entity.model.ModelCaveBear;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.EntityCaveBear;

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
        if(entity.isChild()) {
            if (childTextures == null) {
                final int v = entity.getVariantNumber();
                childTextures = new ResourceLocation[v];
                if (textureLocation == null) textureLocation = entity.getTextureLocation();
                for (int i = 0; i < v; i++) childTextures[i] = new ResourceLocation(textureLocation.getNamespace(), textureLocation.getPath() + "/child_" + (i + 1) + ".png");
            }
        } else {
            if (textures == null) {
                final int v = entity.getVariantNumber();
                textures = new ResourceLocation[v];
                if (textureLocation == null) textureLocation = entity.getTextureLocation();
                for (int i = 0; i < v; i++) textures[i] = new ResourceLocation(textureLocation.getPath(), textureLocation.getPath() + "/adult_" + (i + 1) + ".png");
            }
        }
        return textures[entity.getVariant()];
    }

    @Override
    protected ModelBase getModel(EntityCaveBear entity) {
        if(entity.isStanding()) {
            if(entity.isChild()) return childStanding;
            else return adultStanding;
        } else return super.getModel(entity);
    }
}
