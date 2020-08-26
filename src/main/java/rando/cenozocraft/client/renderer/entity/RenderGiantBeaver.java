package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import rando.cenozocraft.client.model.ModelGiantBeaver;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.passive.EntityGiantBeaver;

public class RenderGiantBeaver extends CenozocraftRenderer<EntityGiantBeaver> {
    public RenderGiantBeaver(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelGiantBeaver(), 0.3f);
    }
}

