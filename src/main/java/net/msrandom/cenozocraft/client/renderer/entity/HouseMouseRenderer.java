package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.HouseMouseEntity;
import net.msrandom.cenozocraft.client.renderer.entity.model.HouseMouseModel;

public class HouseMouseRenderer extends CenozocraftRenderer<HouseMouseEntity> {

    public HouseMouseRenderer(EntityRenderDispatcher renderManagerIn) {
        super(renderManagerIn, new HouseMouseModel(), 0.01F);
    }

    protected void preRenderCallback(HouseMouseEntity entity, float partialTickTime) {
        GlStateManager.scale(2.5F, 2.5F, 2.5F);
    }
}
