package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import net.msrandom.cenozocraft.client.renderer.entity.model.ModelDireWolf;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.EntityDireWolf;

public class RenderDireWolf extends CenozocraftRenderer<EntityDireWolf> {
    public RenderDireWolf(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelDireWolf.Adult(), new ModelDireWolf.Child(), 0.3f);
    }
}
