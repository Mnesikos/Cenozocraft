package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import rando.cenozocraft.client.model.ModelDodo;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.passive.EntityDodo;

public class RenderDodo extends CenozocraftRenderer<EntityDodo> {
    public RenderDodo(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelDodo(), 0.3f);
    }
}

