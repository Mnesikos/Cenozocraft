package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.msrandom.cenozocraft.client.renderer.entity.model.TitanisModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.TitanisEntity;

public class TitanisRenderer extends CenozocraftRenderer<TitanisEntity, TitanisModel> {
    public TitanisRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new TitanisModel(), 0.3f);
    }
}

