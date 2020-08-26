package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import net.msrandom.cenozocraft.client.renderer.entity.model.ModelElasmotherium;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.EntityElasmotherium;

public class RenderElasmotherium extends CenozocraftRenderer<EntityElasmotherium> {
    public RenderElasmotherium(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelElasmotherium(), 0.3f);
    }
}

