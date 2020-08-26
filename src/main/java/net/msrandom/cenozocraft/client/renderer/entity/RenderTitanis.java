package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import net.msrandom.cenozocraft.client.renderer.entity.model.ModelTitanis;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.EntityTitanis;

public class RenderTitanis extends CenozocraftRenderer<EntityTitanis> {
    public RenderTitanis(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelTitanis(), 0.3f);
    }
}

