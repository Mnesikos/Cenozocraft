package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.msrandom.cenozocraft.client.renderer.entity.model.ElasmotheriumModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.ElasmotheriumEntity;

public class ElasmotheriumRenderer extends CenozocraftRenderer<ElasmotheriumEntity> {
    public ElasmotheriumRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new ElasmotheriumModel(), 0.3f);
    }
}

