package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.msrandom.cenozocraft.client.renderer.entity.model.GiantBeaverModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.GiantBeaverEntity;

public class GiantBeaverRenderer extends CenozocraftRenderer<GiantBeaverEntity> {
    public GiantBeaverRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new GiantBeaverModel(), 0.3f);
    }
}

