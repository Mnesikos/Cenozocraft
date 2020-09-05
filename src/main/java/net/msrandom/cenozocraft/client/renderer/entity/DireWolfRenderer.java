package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.msrandom.cenozocraft.client.renderer.entity.model.DireWolfModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.DireWolfEntity;

public class DireWolfRenderer extends CenozocraftRenderer<DireWolfEntity, DireWolfModel> {
    public DireWolfRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new DireWolfModel.Adult(), new DireWolfModel.Child(), 0.3f);
    }

    @Override
    protected void scale(DireWolfEntity entity, MatrixStack matrices, float amount) {
        super.scale(entity, matrices, amount);
        float scale = entity.isBaby() ? 0.8f : 0.9f;
        matrices.scale(scale, scale, scale);
    }
}
