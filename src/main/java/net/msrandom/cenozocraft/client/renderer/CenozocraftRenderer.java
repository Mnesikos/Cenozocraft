package net.msrandom.cenozocraft.client.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.msrandom.cenozocraft.entity.CenozoCraftEntityBase;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class CenozocraftRenderer<T extends CenozoCraftEntityBase, M extends EntityModel<T>> extends MobEntityRenderer<T, M> {
    protected M childModel;
    protected Identifier[] textures;
    protected Identifier textureLocation;

    public CenozocraftRenderer(EntityRenderDispatcher manager, M model, float shadow) {
        super(manager, model, shadow);
    }

    public CenozocraftRenderer(EntityRenderDispatcher manager, M adultModel, M childModel, float shadow) {
        this(manager, adultModel, shadow);
        this.childModel = childModel;
    }

    @Override
    public void render(T mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        model = getModel(mobEntity);
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(T entity) {
        return (textures = getTextures(entity, "texture", textures))[entity.getVariant()];
    }

    protected Identifier[] getTextures(T entity, String prefix, Identifier[] textures) {
        if (textures == null) {
            final int v = entity.getVariantNumber();
            textures = new Identifier[v];
            if (textureLocation == null) textureLocation = entity.getTextureLocation();
            for (int i = 0; i < v; i++)
                textures[i] = new Identifier(textureLocation.getPath(), String.format("%s/%s_%d.png", textureLocation.getPath(), prefix, i + 1));
        }

        return textures;
    }

    protected M getModel(T entity) {
        if (childModel != null && entity.isBaby()) return childModel;
        return model;
    }
}
