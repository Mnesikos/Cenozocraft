package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.msrandom.cenozocraft.client.renderer.entity.model.QuaggaModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.QuaggaEntity;

public class QuaggaRenderer extends CenozocraftRenderer<QuaggaEntity> {
    public QuaggaRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new QuaggaModel(), 0.3f);
    }
}
