package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.msrandom.cenozocraft.client.renderer.entity.model.ThylacineModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.ThylacineEntity;

public class ThylacineRenderer extends CenozocraftRenderer<ThylacineEntity, ThylacineModel> {
    public ThylacineRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new ThylacineModel(), 0.3f);
    }
}

