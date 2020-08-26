package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import rando.cenozocraft.client.model.ModelAurochs;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.passive.EntityAurochs;

public class RenderAurochs extends CenozocraftRenderer<EntityAurochs> {

    private final ModelAurochs bull = new ModelAurochs.Bull();

    public RenderAurochs(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelAurochs.Cow(), new ModelAurochs.Child(), 0.5f);
    }

    protected ModelBase getModel(EntityAurochs entity) {
        if(entity.isChild()) return childModel;
        switch (entity.getGender()) {
            case FEMALE: default: return mainModel;
            case MALE: return bull;
        }
    }
}
