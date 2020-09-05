package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.msrandom.cenozocraft.client.renderer.entity.model.IrishElkModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.IrishElkEntity;

public class IrishElkRenderer extends CenozocraftRenderer<IrishElkEntity, IrishElkModel> {
    public IrishElkRenderer(EntityRenderDispatcher renderManagerIn) {
        super(renderManagerIn, new IrishElkModel(), 0.3F);
    }

    @Override
    protected void scale(IrishElkEntity entity, MatrixStack matrices, float amount) {
        super.scale(entity, matrices, amount);
        matrices.scale(0.5f, 0.5f, 0.5f);
    }
}
