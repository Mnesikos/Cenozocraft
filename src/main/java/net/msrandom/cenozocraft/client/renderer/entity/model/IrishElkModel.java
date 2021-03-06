package net.msrandom.cenozocraft.client.renderer.entity.model;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.msrandom.cenozocraft.entity.monster.IrishElkEntity;

import java.util.Collections;

@SuppressWarnings("WeakerAccess")
public class IrishElkModel extends AnimalModel<IrishElkEntity> {
    public ModelPart Body;
    public ModelPart Hips;
    public ModelPart neck;
    public ModelPart ThighRight;
    public ModelPart ThighLeft;
    public ModelPart Hips2;
    public ModelPart ThighRight_1;
    public ModelPart tail;
    public ModelPart ThighLeft_1;
    public ModelPart UpperLegRight;
    public ModelPart LegRight;
    public ModelPart FootRight;
    public ModelPart UpperLegLeft;
    public ModelPart LegLeft;
    public ModelPart FootLeft;
    public ModelPart necklower;
    public ModelPart Head;
    public ModelPart Mouth;
    public ModelPart EarRight;
    public ModelPart EarLeft;
    public ModelPart tophead;
    public ModelPart Jaw;
    public ModelPart Nose;
    public ModelPart Snout;
    public ModelPart LegRight_1;
    public ModelPart FootRight_1;
    public ModelPart LegLeft_1;
    public ModelPart FootLeft_1;
    private final Iterable<ModelPart> parts;

    public IrishElkModel() {
        this.textureWidth = 131;
        this.textureHeight = 131;
        this.neck = new ModelPart(this, 0, 27);
        this.neck.setPivot(0.0F, -5.0F, -0.5F);
        this.neck.addCuboid(-4.5F, -4.0F, -5.0F, 9, 7, 12, 0.0F);
        this.setRotateAngle(neck, -0.5235987755982988F, 0.0F, 0.0F);
        this.LegLeft_1 = new ModelPart(this, 88, 73);
        this.LegLeft_1.mirror = true;
        this.LegLeft_1.setPivot(-1.5F, 12.0F, 2.5F);
        this.LegLeft_1.addCuboid(-2.0F, 0.0F, -5.0F, 4, 10, 5, 0.0F);
        this.setRotateAngle(LegLeft_1, -0.17453292519943295F, 0.0F, 0.0F);
        this.Body = new ModelPart(this, 1, 0);
        this.Body.setPivot(0.0F, 11.1F, -7.0F);
        this.Body.addCuboid(-7.0F, -7.0F, -1.5F, 14, 14, 13, 0.0F);
        this.setRotateAngle(Body, -0.08726646259971647F, 0.0F, 0.0F);
        this.Nose = new ModelPart(this, 15, 52);
        this.Nose.setPivot(0.0F, -3.8F, 1.0F);
        this.Nose.addCuboid(-1.0F, 0.0F, -7.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(Nose, 0.2155481626212997F, 0.0F, 0.0F);
        this.necklower = new ModelPart(this, 0, 64);
        this.necklower.setPivot(0.0F, 5.5F, 1.5F);
        this.necklower.addCuboid(-4.0F, -5.0F, -15.0F, 8, 7, 20, 0.0F);
        this.setRotateAngle(necklower, -0.5235987755982988F, 0.0F, 0.0F);
        this.UpperLegRight = new ModelPart(this, 101, 30);
        this.UpperLegRight.mirror = true;
        this.UpperLegRight.setPivot(1.5F, 11.0F, -3.0F);
        this.UpperLegRight.addCuboid(-2.5F, 0.0F, 0.0F, 5, 7, 6, 0.0F);
        this.setRotateAngle(UpperLegRight, 0.7853981633974483F, -0.0F, 0.0F);
        this.tophead = new ModelPart(this, 0, 0);
        this.tophead.setPivot(0.0F, -0.5F, -3.5F);
        this.tophead.addCuboid(-2.5F, -1.0F, -2.5F, 5, 2, 5, 0.0F);
        this.FootLeft_1 = new ModelPart(this, 36, 73);
        this.FootLeft_1.mirror = true;
        this.FootLeft_1.setPivot(0.0F, 10.0F, -4.5F);
        this.FootLeft_1.addCuboid(-1.5F, -1.0F, 0.0F, 3, 4, 4, 0.0F);
        this.setRotateAngle(FootLeft_1, 0.08726646259971647F, -0.0F, -0.03490658503988659F);
        this.Hips = new ModelPart(this, 55, 0);
        this.Hips.setPivot(0.0F, -1.0F, 10.0F);
        this.Hips.addCuboid(-6.5F, -5.5F, 0.0F, 13, 13, 14, 0.0F);
        this.setRotateAngle(Hips, 0.08726646259971647F, 0.0F, 0.0F);
        this.Hips2 = new ModelPart(this, 64, 27);
        this.Hips2.setPivot(0.0F, -5.0F, 14.0F);
        this.Hips2.addCuboid(-6.0F, 0.0F, 0.0F, 12, 12, 6, 0.0F);
        this.setRotateAngle(Hips2, -0.2617993877991494F, 0.0F, 0.0F);
        this.ThighRight = new ModelPart(this, 42, 27);
        this.ThighRight.mirror = true;
        this.ThighRight.setPivot(-6.5F, 1.5F, 2.5F);
        this.ThighRight.addCuboid(-1.0F, 0.0F, -3.0F, 5, 12, 6, 0.0F);
        this.setRotateAngle(ThighRight, 0.17453292519943295F, 0.0F, -0.03490658503988659F);
        this.tail = new ModelPart(this, 41, 0);
        this.tail.setPivot(0.0F, 0.3F, 6.0F);
        this.tail.addCuboid(-2.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(tail, -1.0471975511965976F, 0.0F, 0.0F);
        this.UpperLegLeft = new ModelPart(this, 101, 30);
        this.UpperLegLeft.mirror = true;
        this.UpperLegLeft.setPivot(-1.5F, 11.0F, -3.0F);
        this.UpperLegLeft.addCuboid(-2.5F, 0.0F, 0.0F, 5, 7, 6, 0.0F);
        this.setRotateAngle(UpperLegLeft, 0.7853981633974483F, -0.0F, 0.0F);
        this.Mouth = new ModelPart(this, 36, 64);
        this.Mouth.setPivot(0.0F, 3.3F, -6.5F);
        this.Mouth.addCuboid(-2.5F, -2.0F, -5.5F, 5, 3, 6, 0.0F);
        this.setRotateAngle(Mouth, 0.09651670763528643F, 0.0F, 0.0F);
        this.EarLeft = new ModelPart(this, 110, 0);
        this.EarLeft.setPivot(1.5F, 2.0F, -1.5F);
        this.EarLeft.addCuboid(0.0F, -3.0F, -1.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(EarLeft, 0.17453292519943295F, 0.0F, 0.4363323129985824F);
        this.Snout = new ModelPart(this, 0, 67);
        this.Snout.setPivot(0.0F, -3.8F, 0.5F);
        this.Snout.addCuboid(-2.0F, 0.0F, -5.6F, 4, 2, 6, 0.0F);
        this.setRotateAngle(Snout, 0.27663468644110123F, 0.0F, 0.0F);
        this.ThighLeft = new ModelPart(this, 42, 27);
        this.ThighLeft.mirror = true;
        this.ThighLeft.setPivot(6.5F, 1.5F, 2.5F);
        this.ThighLeft.addCuboid(-4.0F, 0.0F, -3.0F, 5, 12, 6, 0.0F);
        this.setRotateAngle(ThighLeft, 0.17453292519943295F, 0.0F, 0.03490658503988659F);
        this.LegLeft = new ModelPart(this, 75, 57);
        this.LegLeft.mirror = true;
        this.LegLeft.setPivot(0.0F, 6.8F, 5.7F);
        this.LegLeft.addCuboid(-2.0F, 0.0F, -5.0F, 4, 12, 5, 0.0F);
        this.setRotateAngle(LegLeft, -0.9599310885968813F, -0.0F, 0.0F);
        this.FootRight_1 = new ModelPart(this, 36, 73);
        this.FootRight_1.mirror = true;
        this.FootRight_1.setPivot(0.0F, 10.0F, -4.5F);
        this.FootRight_1.addCuboid(-1.5F, 0.0F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(FootRight_1, 0.08726646259971647F, -0.0F, 0.03490658503988659F);
        this.ThighLeft_1 = new ModelPart(this, 34, 45);
        this.ThighLeft_1.mirror = true;
        this.ThighLeft_1.setPivot(5.5F, 5.5F, -0.5F);
        this.ThighLeft_1.addCuboid(-4.5F, 0.0F, -3.0F, 6, 11, 8, 0.0F);
        this.setRotateAngle(ThighLeft_1, 0.17453292519943295F, 0.0F, -0.03490658503988659F);
        this.ThighRight_1 = new ModelPart(this, 34, 45);
        this.ThighRight_1.mirror = true;
        this.ThighRight_1.setPivot(-5.5F, 5.5F, -0.5F);
        this.ThighRight_1.addCuboid(-1.5F, 0.0F, -3.0F, 6, 11, 8, 0.0F);
        this.setRotateAngle(ThighRight_1, 0.12217304763960307F, 0.0F, 0.03490658503988659F);
        this.LegRight = new ModelPart(this, 75, 57);
        this.LegRight.mirror = true;
        this.LegRight.setPivot(0.0F, 6.8F, 5.7F);
        this.LegRight.addCuboid(-2.0F, 0.0F, -5.0F, 4, 12, 5, 0.0F);
        this.setRotateAngle(LegRight, -0.9599310885968813F, -0.0F, 0.0F);
        this.Head = new ModelPart(this, 93, 58);
        this.Head.setPivot(0.0F, -5.0F, -15.0F);
        this.Head.addCuboid(-3.5F, -1.0F, -7.0F, 7, 8, 7, 0.0F);
        this.setRotateAngle(Head, 1.1344640137963142F, 0.0F, 0.0F);
        this.LegRight_1 = new ModelPart(this, 88, 73);
        this.LegRight_1.mirror = true;
        this.LegRight_1.setPivot(1.5F, 12.0F, 2.5F);
        this.LegRight_1.addCuboid(-2.0F, 0.0F, -5.0F, 4, 10, 5, 0.0F);
        this.setRotateAngle(LegRight_1, -0.17453292519943295F, 0.0F, 0.0F);
        this.FootLeft = new ModelPart(this, 36, 73);
        this.FootLeft.mirror = true;
        this.FootLeft.setPivot(0.0F, 12.0F, -4.5F);
        this.FootLeft.addCuboid(-1.5F, -1.0F, 0.0F, 3, 4, 4, 0.0F);
        this.setRotateAngle(FootLeft, 0.2617993877991494F, -0.0F, 0.03490658503988659F);
        this.FootRight = new ModelPart(this, 36, 73);
        this.FootRight.mirror = true;
        this.FootRight.setPivot(0.0F, 12.0F, -4.5F);
        this.FootRight.addCuboid(-1.5F, -1.0F, 0.0F, 3, 4, 4, 0.0F);
        this.setRotateAngle(FootRight, 0.2617993877991494F, -0.0F, -0.03490658503988659F);
        this.EarRight = new ModelPart(this, 110, 0);
        this.EarRight.setPivot(-1.5F, 2.0F, -1.5F);
        this.EarRight.addCuboid(-3.0F, -3.0F, -1.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(EarRight, 0.17453292519943295F, 0.0F, -0.4363323129985824F);
        this.Jaw = new ModelPart(this, 0, 59);
        this.Jaw.setPivot(0.0F, 0.9F, -0.8F);
        this.Jaw.addCuboid(-2.0F, 0.0F, -4.5F, 4, 2, 6, 0.0F);
        this.parts = ImmutableList.of(Body);
        this.Body.addChild(this.neck);
        this.ThighLeft.addChild(this.LegLeft_1);
        this.Mouth.addChild(this.Nose);
        this.neck.addChild(this.necklower);
        this.ThighRight_1.addChild(this.UpperLegRight);
        this.Head.addChild(this.tophead);
        this.LegLeft_1.addChild(this.FootLeft_1);
        this.Body.addChild(this.Hips);
        this.Hips.addChild(this.Hips2);
        this.Body.addChild(this.ThighRight);
        this.Hips2.addChild(this.tail);
        this.ThighLeft_1.addChild(this.UpperLegLeft);
        this.Head.addChild(this.Mouth);
        this.Head.addChild(this.EarLeft);
        this.Mouth.addChild(this.Snout);
        this.Body.addChild(this.ThighLeft);
        this.UpperLegLeft.addChild(this.LegLeft);
        this.LegRight_1.addChild(this.FootRight_1);
        this.Hips2.addChild(this.ThighLeft_1);
        this.Hips2.addChild(this.ThighRight_1);
        this.UpperLegRight.addChild(this.LegRight);
        this.necklower.addChild(this.Head);
        this.ThighRight.addChild(this.LegRight_1);
        this.LegLeft.addChild(this.FootLeft);
        this.LegRight.addChild(this.FootRight);
        this.Head.addChild(this.EarRight);
        this.Mouth.addChild(this.Jaw);
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
    public void setAngles(IrishElkEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.pitch = x;
        modelRenderer.yaw = y;
        modelRenderer.roll = z;
    }
}
