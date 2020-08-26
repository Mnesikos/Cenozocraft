package rando.cenozocraft.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import rando.cenozocraft.client.model.ModelSmilodon;
import rando.cenozocraft.client.renderer.CenozocraftRenderer;
import rando.cenozocraft.common.entity.monster.EntitySmilodon;

public class RenderSmilodon extends CenozocraftRenderer<EntitySmilodon> {

    private final ModelSmilodon fatallis = new ModelSmilodon.Fatallis();
    private final ModelSmilodon gracillis = new ModelSmilodon.Gracillis();

    public RenderSmilodon(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelSmilodon.Populator(), 0.2f);
    }

    protected ModelBase getModel(EntitySmilodon entity) {
        switch (entity.getVariant()) {
            case 0: default: return mainModel;
            case 1: return fatallis;
            case 2: return gracillis;
        }
    }
}
