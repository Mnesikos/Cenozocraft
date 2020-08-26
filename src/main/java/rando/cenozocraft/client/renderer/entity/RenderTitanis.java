package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import rando.cenozocraft.client.model.ModelTitanis;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.monster.EntityTitanis;

public class RenderTitanis extends CenozocraftRenderer<EntityTitanis> {
    public RenderTitanis(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelTitanis(), 0.3f);
    }
}

