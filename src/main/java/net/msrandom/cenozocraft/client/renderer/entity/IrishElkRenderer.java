package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.msrandom.cenozocraft.client.renderer.entity.model.IrishElkModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.IrishElkEntity;

public class IrishElkRenderer extends CenozocraftRenderer<IrishElkEntity> {

    public IrishElkRenderer(EntityRenderDispatcher renderManagerIn) {
        super(renderManagerIn, new IrishElkModel(), 0.3F);
    }
}
