package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import rando.cenozocraft.client.model.ModelHouseMouse;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.passive.EntityHouseMouse;

public class RenderHouseMouse extends CenozocraftRenderer<EntityHouseMouse> {

    public RenderHouseMouse(RenderManager renderManagerIn) {
        super(renderManagerIn, new ModelHouseMouse(), 0.01F);
    }

    protected void preRenderCallback(EntityHouseMouse entity, float partialTickTime) {
        GlStateManager.scale(2.5F, 2.5F, 2.5F);
    }
}
