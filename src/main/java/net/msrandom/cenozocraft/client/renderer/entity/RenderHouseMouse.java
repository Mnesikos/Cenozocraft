package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.EntityHouseMouse;
import net.msrandom.cenozocraft.client.renderer.entity.model.ModelHouseMouse;

public class RenderHouseMouse extends CenozocraftRenderer<EntityHouseMouse> {

    public RenderHouseMouse(RenderManager renderManagerIn) {
        super(renderManagerIn, new ModelHouseMouse(), 0.01F);
    }

    protected void preRenderCallback(EntityHouseMouse entity, float partialTickTime) {
        GlStateManager.scale(2.5F, 2.5F, 2.5F);
    }
}
