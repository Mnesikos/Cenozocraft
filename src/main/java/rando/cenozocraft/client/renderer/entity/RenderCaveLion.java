package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import rando.cenozocraft.client.model.ModelCaveLion;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.monster.EntityCaveLion;

public class RenderCaveLion extends CenozocraftRenderer<EntityCaveLion> {
    public RenderCaveLion(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelCaveLion(), 0.3f);
    }
}

