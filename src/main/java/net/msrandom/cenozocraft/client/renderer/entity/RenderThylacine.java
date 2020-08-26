package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import net.msrandom.cenozocraft.client.renderer.entity.model.ModelThylacine;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.EntityThylacine;

public class RenderThylacine extends CenozocraftRenderer<EntityThylacine> {
    public RenderThylacine(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelThylacine(), 0.3f);
    }
}

