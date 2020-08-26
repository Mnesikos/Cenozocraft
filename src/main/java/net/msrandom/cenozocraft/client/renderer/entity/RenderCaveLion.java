package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import net.msrandom.cenozocraft.client.renderer.entity.model.ModelCaveLion;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.EntityCaveLion;

public class RenderCaveLion extends CenozocraftRenderer<EntityCaveLion> {
    public RenderCaveLion(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelCaveLion(), 0.3f);
    }
}

