package net.msrandom.cenozocraft.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.msrandom.cenozocraft.client.renderer.entity.model.SmilodonModel;
import net.msrandom.cenozocraft.client.renderer.CenozocraftRenderer;
import net.msrandom.cenozocraft.entity.monster.SmilodonEntity;

public class SmilodonRenderer extends CenozocraftRenderer<SmilodonEntity> {

    private final SmilodonModel fatallis = new SmilodonModel.Fatallis();
    private final SmilodonModel gracillis = new SmilodonModel.Gracillis();

    public SmilodonRenderer(EntityRenderDispatcher rendermanagerIn) {
        super(rendermanagerIn, new SmilodonModel.Populator(), 0.2f);
    }

    protected ModelBase getModel(SmilodonEntity entity) {
        switch (entity.getVariant()) {
            case 0: default: return mainModel;
            case 1: return fatallis;
            case 2: return gracillis;
        }
    }
}
