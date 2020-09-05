package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.msrandom.cenozocraft.client.renderer.entity.model.DodoModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.DodoEntity;

public class DodoRenderer extends CenozocraftRenderer<DodoEntity, DodoModel> {
    public DodoRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new DodoModel(), 0.3f);
    }
}

