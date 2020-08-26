package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import net.msrandom.cenozocraft.client.renderer.entity.model.ModelGiantBeaver;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.EntityGiantBeaver;

public class RenderGiantBeaver extends CenozocraftRenderer<EntityGiantBeaver> {
    public RenderGiantBeaver(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelGiantBeaver(), 0.3f);
    }
}

