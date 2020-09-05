package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.client.renderer.entity.model.AurochsModel;
import net.msrandom.cenozocraft.entity.passive.AurochsEntity;

public class AurochsRenderer extends CenozocraftRenderer<AurochsEntity, AurochsModel> {
    private final AurochsModel bull = new AurochsModel.Bull();

    public AurochsRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new AurochsModel.Cow(), new AurochsModel.Child(), 0.5f);
    }

    protected AurochsModel getModel(AurochsEntity entity) {
        if(entity.isBaby()) return childModel;
        switch (entity.getGender()) {
            default:
            case FEMALE:
                return model;
            case MALE:
                return bull;
        }
    }
}
