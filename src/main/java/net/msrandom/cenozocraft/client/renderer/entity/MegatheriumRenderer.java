package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.msrandom.cenozocraft.client.renderer.entity.model.MegatheriumModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.MegatheriumEntity;

public class MegatheriumRenderer extends CenozocraftRenderer<MegatheriumEntity> {
    public MegatheriumRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new MegatheriumModel(), 0.3f);
    }
}

