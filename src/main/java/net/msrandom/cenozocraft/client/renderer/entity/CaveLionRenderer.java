package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.msrandom.cenozocraft.client.renderer.entity.model.CaveLionModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.CaveLionEntity;

public class CaveLionRenderer extends CenozocraftRenderer<CaveLionEntity> {
    public CaveLionRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new CaveLionModel(), 0.3f);
    }
}

