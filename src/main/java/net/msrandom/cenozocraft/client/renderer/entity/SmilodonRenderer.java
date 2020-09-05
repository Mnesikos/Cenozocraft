package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.client.renderer.entity.model.SmilodonModel;
import net.msrandom.cenozocraft.entity.monster.SmilodonEntity;

public class SmilodonRenderer<T extends SmilodonEntity> extends CenozocraftRenderer<T, SmilodonModel<T>> {
    private final SmilodonModel<T> fatallis = new SmilodonModel.Fatallis<>();
    private final SmilodonModel<T> gracillis = new SmilodonModel.Gracilis<>();

    public SmilodonRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new SmilodonModel.Populator<>(), 0.2f);
    }

    @Override
    protected void scale(T entity, MatrixStack matrices, float amount) {
        super.scale(entity, matrices, amount);
        float scale = 1f;
        switch (entity.getVariant()) {
            case 1:
                scale = 0.9f;
                break;
            case 2:
                scale = 0.8f;
                break;
        }
        matrices.scale(scale, scale, scale);
    }

    protected SmilodonModel<T> getModel(T entity) {
        switch (entity.getVariant()) {
            default:
            case 0:
                return model;
            case 1:
                return fatallis;
            case 2:
                return gracillis;
        }
    }
}
