package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import net.msrandom.cenozocraft.client.renderer.entity.model.ModelDodo;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.EntityDodo;

public class RenderDodo extends CenozocraftRenderer<EntityDodo> {
    public RenderDodo(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelDodo(), 0.3f);
    }
}

