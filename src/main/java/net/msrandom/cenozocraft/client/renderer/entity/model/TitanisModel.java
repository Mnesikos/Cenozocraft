package net.msrandom.cenozocraft.client.renderer.entity.model;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.msrandom.cenozocraft.entity.monster.TitanisEntity;

import java.util.Collections;

public class TitanisModel extends AnimalModel<TitanisEntity> {
    @Override
    protected Iterable<ModelPart> getHeadParts() {
        return Collections.emptyList();
    }

    @Override
    protected Iterable<ModelPart> getBodyParts() {
        return Collections.emptyList();
    }

    @Override
    public void setAngles(TitanisEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }
}

