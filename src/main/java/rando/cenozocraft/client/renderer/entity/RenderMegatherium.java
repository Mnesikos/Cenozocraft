package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import rando.cenozocraft.client.model.ModelMegatherium;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.passive.EntityMegatherium;

public class RenderMegatherium extends CenozocraftRenderer<EntityMegatherium> {
    public RenderMegatherium(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelMegatherium(), 0.3f);
    }
}

