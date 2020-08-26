package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import net.msrandom.cenozocraft.client.renderer.entity.model.ModelMegatherium;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.EntityMegatherium;

public class RenderMegatherium extends CenozocraftRenderer<EntityMegatherium> {
    public RenderMegatherium(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelMegatherium(), 0.3f);
    }
}

