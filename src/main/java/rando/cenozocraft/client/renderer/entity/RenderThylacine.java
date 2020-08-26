package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import rando.cenozocraft.client.model.ModelThylacine;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.monster.EntityThylacine;

public class RenderThylacine extends CenozocraftRenderer<EntityThylacine> {
    public RenderThylacine(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelThylacine(), 0.3f);
    }
}

