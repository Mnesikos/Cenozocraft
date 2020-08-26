package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import rando.cenozocraft.client.model.ModelDireWolf;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.monster.EntityDireWolf;

public class RenderDireWolf extends CenozocraftRenderer<EntityDireWolf> {
    public RenderDireWolf(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelDireWolf.Adult(), new ModelDireWolf.Child(), 0.3f);
    }
}
