package net.msrandom.cenozocraft.client.renderer.entity.model;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.msrandom.cenozocraft.entity.passive.MegatheriumEntity;

import java.util.Collections;

public class MegatheriumModel extends AnimalModel<MegatheriumEntity> {
    @Override
    protected Iterable<ModelPart> getHeadParts() {
        return Collections.emptyList();
    }

    @Override
    protected Iterable<ModelPart> getBodyParts() {
        return Collections.emptyList();
    }

    @Override
    public void setAngles(MegatheriumEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }
}

