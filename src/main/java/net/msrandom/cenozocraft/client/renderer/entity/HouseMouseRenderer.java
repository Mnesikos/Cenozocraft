package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.client.renderer.entity.model.HouseMouseModel;
import net.msrandom.cenozocraft.entity.passive.HouseMouseEntity;

public class HouseMouseRenderer extends CenozocraftRenderer<HouseMouseEntity, HouseMouseModel> {
    public HouseMouseRenderer(EntityRenderDispatcher renderManagerIn) {
        super(renderManagerIn, new HouseMouseModel(), 0.01F);
    }

    @Override
    protected void scale(HouseMouseEntity entity, MatrixStack matrices, float amount) {
        super.scale(entity, matrices, amount);
        matrices.scale(0.5f, 0.5f, 0.5f);
    }
}
