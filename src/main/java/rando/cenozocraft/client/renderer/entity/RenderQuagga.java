package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderManager;
import rando.cenozocraft.client.model.ModelQuagga;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.passive.EntityQuagga;

public class RenderQuagga extends CenozocraftRenderer<EntityQuagga> {
    public RenderQuagga(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelQuagga(), 0.3f);
    }
}
