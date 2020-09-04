package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.msrandom.cenozocraft.client.renderer.entity.model.DireWolfModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.DireWolfEntity;

public class DireWolfRenderer extends CenozocraftRenderer<DireWolfEntity> {
    public DireWolfRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new DireWolfModel.Adult(), new DireWolfModel.Child(), 0.3f);
    }
}
