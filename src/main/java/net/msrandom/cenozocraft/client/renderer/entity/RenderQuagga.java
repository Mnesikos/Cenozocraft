package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import net.msrandom.cenozocraft.client.renderer.entity.model.ModelQuagga;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.passive.EntityQuagga;

public class RenderQuagga extends CenozocraftRenderer<EntityQuagga> {
    public RenderQuagga(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelQuagga(), 0.3f);
    }
}
