package net.msrandom.cenozocraft.client.renderer.entity.model;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.msrandom.cenozocraft.entity.passive.QuaggaEntity;

import java.util.Collections;

public class QuaggaModel extends AnimalModel<QuaggaEntity> {
    public ModelPart body;
    public ModelPart bodyback;
    public ModelPart bodyfront;
    public ModelPart tail1;
    public ModelPart backleftthigh;
    public ModelPart backrightthigh;
    public ModelPart tail2;
    public ModelPart tail3;
    public ModelPart backleftleg1;
    public ModelPart backleftleg2;
    public ModelPart backlefthoove;
    public ModelPart backrightleg1;
    public ModelPart backrightleg2;
    public ModelPart backrighthoove;
    public ModelPart neckfront;
    public ModelPart frontleftthigh;
    public ModelPart frontrightthigh;
    public ModelPart neckback;
    public ModelPart head;
    public ModelPart mane;
    public ModelPart leftear;
    public ModelPart rightear;
    public ModelPart snout;
    public ModelPart lowerjaw;
    public ModelPart frontleftleg1;
    public ModelPart frontleftleg2;
    public ModelPart frontlefthoove;
    public ModelPart frontrightleg1;
    public ModelPart frontrightleg2;
    public ModelPart frontrighthoove;
    private final Iterable<ModelPart> parts;

    public QuaggaModel() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.frontrightleg1 = new ModelPart(this, 32, 43);
        this.frontrightleg1.setPivot(1.5F, 7.0F, 2.0F);
        this.frontrightleg1.addCuboid(-2.0F, 0.0F, -4.0F, 4, 7, 4, 0.0F);
        this.frontrightthigh = new ModelPart(this, 75, 41);
        this.frontrightthigh.setPivot(-5.0F, -5.5F, -4.5F);
        this.frontrightthigh.addCuboid(-1.0F, -1.0F, -3.0F, 5, 8, 6, 0.0F);
        this.setRotateAngle(frontrightthigh, 0.08726646259971647F, 0.0F, 0.0F);
        this.snout = new ModelPart(this, 0, 61);
        this.snout.setPivot(0.0F, -1.0F, -7.5F);
        this.snout.addCuboid(-2.5F, -2.0F, -6.0F, 5, 4, 6, 0.0F);
        this.setRotateAngle(snout, 0.08726646259971647F, 0.0F, 0.0F);
        this.bodyback = new ModelPart(this, 50, 0);
        this.bodyback.setPivot(0.0F, -6.0F, 7.0F);
        this.bodyback.addCuboid(-5.0F, 0.0F, 0.0F, 10, 12, 8, 0.0F);
        this.setRotateAngle(bodyback, -0.17453292519943295F, 0.0F, 0.0F);
        this.neckfront = new ModelPart(this, 12, 43);
        this.neckfront.setPivot(0.0F, -6.0F, -5.5F);
        this.neckfront.addCuboid(-2.0F, -3.0F, -12.0F, 4, 6, 12, 0.0F);
        this.setRotateAngle(neckfront, -1.0471975511965976F, 0.0F, 0.0F);
        this.backrightleg1 = new ModelPart(this, 109, 36);
        this.backrightleg1.setPivot(1.5F, 8.0F, -3.0F);
        this.backrightleg1.addCuboid(-2.0F, 0.0F, 0.0F, 4, 6, 5, 0.0F);
        this.setRotateAngle(backrightleg1, 0.7853981633974483F, 0.0F, 0.0F);
        this.backrightthigh = new ModelPart(this, 49, 39);
        this.backrightthigh.setPivot(-5.0F, 8.5F, 2.5F);
        this.backrightthigh.addCuboid(-1.0F, -4.0F, -3.5F, 5, 12, 8, 0.0F);
        this.setRotateAngle(backrightthigh, 0.08726646259971647F, 0.0F, 0.0F);
        this.rightear = new ModelPart(this, 8, 0);
        this.rightear.mirror = true;
        this.rightear.setPivot(-2.9F, -2.6F, -1.4F);
        this.rightear.addCuboid(0.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(rightear, -0.2617993877991494F, 0.0F, -0.4363323129985824F);
        this.backleftthigh = new ModelPart(this, 49, 39);
        this.backleftthigh.setPivot(5.0F, 8.5F, 2.5F);
        this.backleftthigh.addCuboid(-4.0F, -4.0F, -3.5F, 5, 12, 8, 0.0F);
        this.setRotateAngle(backleftthigh, 0.08726646259971647F, 0.0F, 0.0F);
        this.frontleftleg1 = new ModelPart(this, 32, 43);
        this.frontleftleg1.setPivot(-1.5F, 7.0F, 2.0F);
        this.frontleftleg1.addCuboid(-2.0F, 0.0F, -4.0F, 4, 7, 4, 0.0F);
        this.bodyfront = new ModelPart(this, 78, 12);
        this.bodyfront.setPivot(0.0F, 6.0F, -7.0F);
        this.bodyfront.addCuboid(-5.0F, -12.0F, -8.0F, 10, 12, 8, 0.0F);
        this.setRotateAngle(bodyfront, -0.08726646259971647F, 0.0F, 0.0F);
        this.tail1 = new ModelPart(this, 36, 0);
        this.tail1.setPivot(0.0F, 0.5F, 8.0F);
        this.tail1.addCuboid(-1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(tail1, 0.6981317007977318F, 0.0F, 0.0F);
        this.leftear = new ModelPart(this, 8, 0);
        this.leftear.setPivot(2.9F, -2.6F, -1.4F);
        this.leftear.addCuboid(-2.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(leftear, -0.2617993877991494F, 0.0F, 0.4363323129985824F);
        this.tail3 = new ModelPart(this, 36, 0);
        this.tail3.setPivot(0.0F, 10.0F, 0.0F);
        this.tail3.addCuboid(-1.5F, -1.0F, -3.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(tail3, -0.13962634015954636F, 0.0F, 0.0F);
        this.backleftleg2 = new ModelPart(this, 114, 12);
        this.backleftleg2.setPivot(0.0F, 6.0F, 5.0F);
        this.backleftleg2.addCuboid(-1.5F, 0.0F, -3.0F, 3, 8, 3, 0.0F);
        this.setRotateAngle(backleftleg2, -0.9599310885968813F, 0.0F, 0.0F);
        this.mane = new ModelPart(this, 57, 56);
        this.mane.setPivot(0.0F, 1.0F, -6.2F);
        this.mane.addCuboid(-1.0F, -6.0F, -8.0F, 2, 6, 18, 0.0F);
        this.frontleftthigh = new ModelPart(this, 75, 41);
        this.frontleftthigh.setPivot(5.0F, -5.5F, -4.5F);
        this.frontleftthigh.addCuboid(-4.0F, -1.0F, -3.0F, 5, 8, 6, 0.0F);
        this.setRotateAngle(frontleftthigh, 0.08726646259971647F, 0.0F, 0.0F);
        this.frontlefthoove = new ModelPart(this, 78, 0);
        this.frontlefthoove.setPivot(0.0F, 4.0F, 1.5F);
        this.frontlefthoove.addCuboid(-2.0F, 0.0F, -2.0F, 4, 3, 4, 0.0F);
        this.backleftleg1 = new ModelPart(this, 109, 36);
        this.backleftleg1.setPivot(-1.5F, 8.0F, -3.0F);
        this.backleftleg1.addCuboid(-2.0F, 0.0F, 0.0F, 4, 6, 5, 0.0F);
        this.setRotateAngle(backleftleg1, 0.7853981633974483F, 0.0F, 0.0F);
        this.backlefthoove = new ModelPart(this, 78, 0);
        this.backlefthoove.setPivot(0.0F, 7.2F, -3.0F);
        this.backlefthoove.addCuboid(-2.0F, 0.0F, -0.5F, 4, 3, 4, 0.0F);
        this.setRotateAngle(backlefthoove, 0.2617993877991494F, 0.0F, 0.0F);
        this.body = new ModelPart(this, 0, 0);
        this.body.setPivot(0.0F, 3.0F, 0.0F);
        this.body.addCuboid(-5.5F, -6.0F, -7.0F, 11, 12, 14, 0.0F);
        this.tail2 = new ModelPart(this, 0, 71);
        this.tail2.setPivot(0.0F, 3.0F, 0.0F);
        this.tail2.addCuboid(-1.5F, 0.0F, -3.0F, 3, 10, 3, 0.0F);
        this.setRotateAngle(tail2, -0.41887902047863906F, 0.0F, 0.0F);
        this.lowerjaw = new ModelPart(this, 0, 46);
        this.lowerjaw.setPivot(0.0F, 3.1F, 0.2F);
        this.lowerjaw.addCuboid(-2.0F, -1.0F, -6.0F, 4, 2, 6, 0.0F);
        this.setRotateAngle(lowerjaw, -0.17453292519943295F, 0.0F, 0.0F);
        this.frontleftleg2 = new ModelPart(this, 114, 24);
        this.frontleftleg2.setPivot(0.0F, 7.0F, -3.5F);
        this.frontleftleg2.addCuboid(-1.5F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.backrightleg2 = new ModelPart(this, 114, 12);
        this.backrightleg2.setPivot(0.0F, 6.0F, 5.0F);
        this.backrightleg2.addCuboid(-1.5F, 0.0F, -3.0F, 3, 8, 3, 0.0F);
        this.setRotateAngle(backrightleg2, -0.9599310885968813F, 0.0F, 0.0F);
        this.head = new ModelPart(this, 36, 59);
        this.head.setPivot(0.0F, -2.6F, -12.5F);
        this.head.addCuboid(-3.0F, -3.5F, -8.0F, 6, 7, 8, 0.0F);
        this.setRotateAngle(head, 1.5707963267948966F, 0.0F, 0.0F);
        this.backrighthoove = new ModelPart(this, 78, 0);
        this.backrighthoove.setPivot(0.0F, 7.2F, -3.0F);
        this.backrighthoove.addCuboid(-2.0F, 0.0F, -0.5F, 4, 3, 4, 0.0F);
        this.setRotateAngle(backrighthoove, 0.2617993877991494F, 0.0F, 0.0F);
        this.neckback = new ModelPart(this, 84, 47);
        this.neckback.setPivot(0.0F, -2.5F, -2.5F);
        this.neckback.addCuboid(-2.5F, -2.5F, -13.0F, 5, 5, 13, 0.0F);
        this.setRotateAngle(neckback, 0.18989182261698306F, 0.0F, 0.0F);
        this.frontrightleg2 = new ModelPart(this, 114, 24);
        this.frontrightleg2.setPivot(0.0F, 7.0F, -3.5F);
        this.frontrightleg2.addCuboid(-1.5F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.frontrighthoove = new ModelPart(this, 78, 0);
        this.frontrighthoove.setPivot(0.0F, 4.0F, 1.5F);
        this.frontrighthoove.addCuboid(-2.0F, 0.0F, -2.0F, 4, 3, 4, 0.0F);
        this.parts = ImmutableList.of(body);
        this.frontrightthigh.addChild(this.frontrightleg1);
        this.bodyfront.addChild(this.frontrightthigh);
        this.head.addChild(this.snout);
        this.body.addChild(this.bodyback);
        this.bodyfront.addChild(this.neckfront);
        this.backrightthigh.addChild(this.backrightleg1);
        this.bodyback.addChild(this.backrightthigh);
        this.head.addChild(this.rightear);
        this.bodyback.addChild(this.backleftthigh);
        this.frontleftthigh.addChild(this.frontleftleg1);
        this.body.addChild(this.bodyfront);
        this.bodyback.addChild(this.tail1);
        this.head.addChild(this.leftear);
        this.tail2.addChild(this.tail3);
        this.backleftleg1.addChild(this.backleftleg2);
        this.neckback.addChild(this.mane);
        this.bodyfront.addChild(this.frontleftthigh);
        this.frontleftleg2.addChild(this.frontlefthoove);
        this.backleftthigh.addChild(this.backleftleg1);
        this.backleftleg2.addChild(this.backlefthoove);
        this.tail1.addChild(this.tail2);
        this.snout.addChild(this.lowerjaw);
        this.frontleftleg1.addChild(this.frontleftleg2);
        this.backrightleg1.addChild(this.backrightleg2);
        this.neckfront.addChild(this.head);
        this.backrightleg2.addChild(this.backrighthoove);
        this.neckfront.addChild(this.neckback);
        this.frontrightleg1.addChild(this.frontrightleg2);
        this.frontrightleg2.addChild(this.frontrighthoove);
    }

    @Override
    protected Iterable<ModelPart> getBodyParts() {
        return parts;
    }

    @Override
    protected Iterable<ModelPart> getHeadParts() {
        return Collections.emptyList();
    }

    @Override
    public void setAngles(QuaggaEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.pitch = x;
        modelRenderer.yaw = y;
        modelRenderer.roll = z;
    }
}
