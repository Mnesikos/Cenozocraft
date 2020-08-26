package rando.cenozocraft.client.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import rando.cenozocraft.common.entity.CenozocraftEntityBase;
import rando.cenozocraft.common.util.CenozocraftReference;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class CenozocraftRenderer<T extends CenozocraftEntityBase> extends RenderLiving<T> {

    protected ModelBase childModel;
    protected ResourceLocation[] textures;
    protected String textureLocation;

    public CenozocraftRenderer(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }

    public CenozocraftRenderer(RenderManager rendermanagerIn, ModelBase modelbaseIn, ModelBase childModelIn, float shadowsizeIn) {
        this(rendermanagerIn, modelbaseIn, shadowsizeIn);
        this.childModel = childModelIn;
    }

    @Override
    public float prepareScale(T entitylivingbaseIn, float partialTicks) {
        float f = super.prepareScale(entitylivingbaseIn, partialTicks);
        if(childModel == null && entitylivingbaseIn.isChild()) {
            GlStateManager.scale(0.75F, 0.75F, 0.75F);
            GlStateManager.translate(0.0F, 16.0F * f, 0.0F);
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * f, 0.0F);
        }
        return f;
    }

    @Override
    public void doRender(@Nonnull T entity, double x, double y, double z, float entityYaw, float partialTicks) {
        ModelBase model = getModel(entity);
        if(mainModel != model) this.mainModel = model;
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(@Nonnull T entity) {
        if(textures == null || textures.length == 0) {
            final int v = entity.getVariantNumber();
            textures = new ResourceLocation[v];
            if(textureLocation == null) textureLocation = entity.getTextures().getResourcePath();
            for (int i = 0; i < v; i++) textures[i] = new ResourceLocation(CenozocraftReference.ID, textureLocation + "/texture_" + (i+1) + ".png");
        }
        return textures[entity.getVariant()];
    }

    protected ModelBase getModel(T entity) {
        if(childModel != null && entity.isChild()) return childModel;
        return mainModel;
    }
}
