package net.msrandom.cenozocraft.client.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.msrandom.cenozocraft.Cenozocraft;
import net.msrandom.cenozocraft.entity.CenozocraftEntityBase;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class CenozocraftRenderer<T extends CenozocraftEntityBase> extends RenderLiving<T> {
    protected ModelBase childModel;
    protected ResourceLocation[] textures;
    protected ResourceLocation textureLocation;

    public CenozocraftRenderer(RenderManager manager, ModelBase model, float shadow) {
        super(manager, model, shadow);
    }

    public CenozocraftRenderer(RenderManager manager, ModelBase adultModel, ModelBase childModel, float shadow) {
        this(manager, adultModel, shadow);
        this.childModel = childModel;
    }

    @Override
    public float prepareScale(@Nonnull T entity, float partialTicks) {
        float f = super.prepareScale(entity, partialTicks);
        if (childModel == null && entity.isChild()) {
            GlStateManager.scale(0.75F, 0.75F, 0.75F);
            GlStateManager.translate(0.0F, 16.0F * f, 0.0F);
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * f, 0.0F);
        }
        return f;
    }

    @Override
    public void doRender(@Nonnull T entity, double x, double y, double z, float entityYaw, float partialTicks) {
        mainModel = getModel(entity);
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(@Nonnull T entity) {
        if (textures == null || textures.length == 0) {
            final int v = entity.getVariantNumber();
            textures = new ResourceLocation[v];
            if (textureLocation == null) textureLocation = entity.getTextureLocation();
            for (int i = 0; i < v; i++)
                textures[i] = new ResourceLocation(textureLocation.getPath(), textureLocation.getPath() + "/texture_" + (i + 1) + ".png");
        }
        return textures[entity.getVariant()];
    }

    protected ModelBase getModel(T entity) {
        if (childModel != null && entity.isChild()) return childModel;
        return mainModel;
    }
}
