package net.msrandom.cenozocraft.client.renderer.entity.model;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.msrandom.cenozocraft.entity.passive.ElasmotheriumEntity;

import java.util.Collections;

public class ElasmotheriumModel extends AnimalModel<ElasmotheriumEntity> {
    public ModelPart Body;
    public ModelPart Hips;
    public ModelPart BodyHump;
    public ModelPart NeckBase;
    public ModelPart LeftLeg1Base;
    public ModelPart RightLeg1Base;
    public ModelPart RightFur1;
    public ModelPart LeftFur1;
    public ModelPart BodyBackTop;
    public ModelPart LeftLeg2Base;
    public ModelPart RightLeg2Base;
    public ModelPart Tail;
    public ModelPart LeftLeg2_1;
    public ModelPart LeftLeg2BaseTop;
    public ModelPart LeftLeg2BaseBottom;
    public ModelPart LeftLeg2_2;
    public ModelPart LeftLeg2_3;
    public ModelPart LeftLeg2Foot;
    public ModelPart LeftLeg2Toe1_1;
    public ModelPart LeftLeg2Toe2_1;
    public ModelPart LeftLeg2Toe3_1;
    public ModelPart LeftLeg2Toe1_2;
    public ModelPart LeftLeg2Toe2_2;
    public ModelPart LeftLeg2Toe3_2;
    public ModelPart RightLeg2_1;
    public ModelPart RightLeg2BaseTop;
    public ModelPart RightLeg2BaseBottom;
    public ModelPart RightLeg2_2;
    public ModelPart RightLeg2_3;
    public ModelPart RightLeg2Foot;
    public ModelPart RightLeg2Toe1_1;
    public ModelPart RightLeg2Toe2_1;
    public ModelPart RightLeg2Toe3_1;
    public ModelPart RightLeg2Toe1_2;
    public ModelPart RightLeg2Toe2_2;
    public ModelPart RightLeg2Toe3_2;
    public ModelPart TailEnd;
    public ModelPart Neck1;
    public ModelPart HeadBase;
    public ModelPart Head;
    public ModelPart Neck2;
    public ModelPart Snout;
    public ModelPart HeadTop;
    public ModelPart HornBase;
    public ModelPart Jaw;
    public ModelPart Horn1;
    public ModelPart Horn2;
    public ModelPart Horn3;
    public ModelPart Horn4;
    public ModelPart LeftLeg1_1;
    public ModelPart LeftLeg1_2;
    public ModelPart LeftLeg1_3;
    public ModelPart LeftLeg1_4;
    public ModelPart LeftLeg1Foot;
    public ModelPart LeftLeg1Toe1_1;
    public ModelPart LeftLeg1Toe2_1;
    public ModelPart LeftLeg1Toe3_1;
    public ModelPart LeftLeg1Toe1_2;
    public ModelPart LeftLeg1Toe2_2;
    public ModelPart LeftLeg1Toe3_2;
    public ModelPart RightLeg1_1;
    public ModelPart RightLeg1_2;
    public ModelPart RightLeg1_3;
    public ModelPart RightLeg1_4;
    public ModelPart RightLeg1Foot;
    public ModelPart RightLeg1Toe1_1;
    public ModelPart RightLeg1Toe2_1;
    public ModelPart RightLeg1Toe3_1;
    public ModelPart RightLeg1Toe1_2;
    public ModelPart RightLeg1Toe2_2;
    public ModelPart RightLeg1Toe3_2;
    private final Iterable<ModelPart> parts;

    public ElasmotheriumModel() {
        this.textureWidth = 512;
        this.textureHeight = 128;
        this.Horn4 = new ModelPart(this, 0, 0);
        this.Horn4.setPivot(0.0F, -5.0F, 0.0F);
        this.Horn4.addCuboid(-1.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(Horn4, -0.17453292519943295F, 0.0F, 0.0F);
        this.Jaw = new ModelPart(this, 288, 46);
        this.Jaw.setPivot(0.0F, 7.0F, -15.0F);
        this.Jaw.addCuboid(-5.0F, -5.5F, -6.0F, 10, 5, 6, 0.0F);
        this.setRotateAngle(Jaw, -0.17453292519943295F, 0.0F, 0.0F);
        this.RightLeg1_3 = new ModelPart(this, 397, 90);
        this.RightLeg1_3.setPivot(0.0F, 8.6F, 0.0F);
        this.RightLeg1_3.addCuboid(-4.0F, 0.0F, -4.5F, 8, 8, 9, 0.0F);
        this.RightLeg1Foot = new ModelPart(this, 431, 94);
        this.RightLeg1Foot.setPivot(0.0F, 7.4F, 3.0F);
        this.RightLeg1Foot.addCuboid(-3.5F, -3.0F, -7.0F, 7, 5, 8, 0.0F);
        this.LeftLeg2_2 = new ModelPart(this, 0, 0);
        this.LeftLeg2_2.setPivot(0.0F, 11.0F, 10.0F);
        this.LeftLeg2_2.addCuboid(-4.0F, 0.0F, -8.0F, 8, 9, 8, 0.0F);
        this.setRotateAngle(LeftLeg2_2, -0.7853981633974483F, 0.0F, 0.0F);
        this.LeftLeg2Toe1_2 = new ModelPart(this, 210, 0);
        this.LeftLeg2Toe1_2.setPivot(0.0F, 1.5F, -1.1F);
        this.LeftLeg2Toe1_2.addCuboid(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(LeftLeg2Toe1_2, 0.4363323129985824F, 0.0F, 0.0F);
        this.BodyHump = new ModelPart(this, 238, 0);
        this.BodyHump.setPivot(0.0F, -10.4F, -13.6F);
        this.BodyHump.addCuboid(-11.5F, -8.0F, -15.0F, 23, 16, 30, 0.0F);
        this.setRotateAngle(BodyHump, -0.22689280275926282F, 0.0F, 0.0F);
        this.RightLeg1Toe1_2 = new ModelPart(this, 129, 4);
        this.RightLeg1Toe1_2.setPivot(0.0F, 1.5F, -1.1F);
        this.RightLeg1Toe1_2.addCuboid(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(RightLeg1Toe1_2, 0.4363323129985824F, 0.0F, 0.0F);
        this.RightLeg2BaseTop = new ModelPart(this, 170, 53);
        this.RightLeg2BaseTop.setPivot(4.0F, 1.4F, -5.1F);
        this.RightLeg2BaseTop.addCuboid(-5.5F, -12.5F, -6.0F, 11, 10, 10, 0.0F);
        this.setRotateAngle(RightLeg2BaseTop, -0.3839724354387525F, 0.0F, 0.0F);
        this.NeckBase = new ModelPart(this, 344, 0);
        this.NeckBase.setPivot(0.0F, -6.6F, -22.9F);
        this.NeckBase.addCuboid(-11.0F, -15.0F, -12.0F, 22, 34, 12, 0.0F);
        this.setRotateAngle(NeckBase, 0.22689280275926282F, 0.0F, 0.0F);
        this.RightLeg2Toe1_1 = new ModelPart(this, 336, 0);
        this.RightLeg2Toe1_1.setPivot(0.0F, 0.1F, -6.0F);
        this.RightLeg2Toe1_1.addCuboid(-1.5F, -2.0F, -2.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(RightLeg2Toe1_1, -0.4363323129985824F, 0.0F, 0.0F);
        this.RightLeg2Toe3_1 = new ModelPart(this, 400, 0);
        this.RightLeg2Toe3_1.setPivot(-1.9F, 0.0F, -5.0F);
        this.RightLeg2Toe3_1.addCuboid(-1.5F, -2.0F, -2.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(RightLeg2Toe3_1, -0.4363323129985824F, 0.7853981633974483F, 0.0F);
        this.LeftLeg1_1 = new ModelPart(this, 212, 53);
        this.LeftLeg1_1.setPivot(-3.0F, 3.5F, -1.8F);
        this.LeftLeg1_1.addCuboid(-4.0F, -1.0F, -7.0F, 8, 10, 5, 0.0F);
        this.setRotateAngle(LeftLeg1_1, 0.6108652381980153F, 0.0F, 0.0F);
        this.LeftLeg1Base = new ModelPart(this, 412, 0);
        this.LeftLeg1Base.setPivot(13.5F, 6.0F, -20.0F);
        this.LeftLeg1Base.addCuboid(-8.0F, -12.5F, -8.5F, 10, 20, 17, 0.0F);
        this.Head = new ModelPart(this, 352, 69);
        this.Head.setPivot(0.0F, 1.1F, -9.0F);
        this.Head.addCuboid(-7.5F, -7.5F, -15.0F, 15, 15, 12, 0.0F);
        this.RightLeg1_1 = new ModelPart(this, 130, 88);
        this.RightLeg1_1.setPivot(3.0F, 3.5F, -1.8F);
        this.RightLeg1_1.addCuboid(-4.0F, -1.0F, -7.0F, 8, 10, 5, 0.0F);
        this.setRotateAngle(RightLeg1_1, 0.6108652381980153F, 0.0F, -0.012740903539558604F);
        this.RightLeg2Toe1_2 = new ModelPart(this, 410, 0);
        this.RightLeg2Toe1_2.setPivot(0.0F, 1.5F, -1.1F);
        this.RightLeg2Toe1_2.addCuboid(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(RightLeg2Toe1_2, 0.4363323129985824F, 0.0F, 0.0F);
        this.RightLeg2Toe3_2 = new ModelPart(this, 459, 0);
        this.RightLeg2Toe3_2.setPivot(0.0F, 1.6F, -1.1F);
        this.RightLeg2Toe3_2.addCuboid(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(RightLeg2Toe3_2, 0.4363323129985824F, 0.0F, 0.0F);
        this.RightFur1 = new ModelPart(this, 200, 80);
        this.RightFur1.setPivot(-12.0F, 13.0F, 0.0F);
        this.RightFur1.addCuboid(0.0F, 0.0F, -13.0F, 0, 9, 30, 0.0F);
        this.RightLeg2Toe2_2 = new ModelPart(this, 449, 0);
        this.RightLeg2Toe2_2.setPivot(0.0F, 1.6F, -1.1F);
        this.RightLeg2Toe2_2.addCuboid(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(RightLeg2Toe2_2, 0.4363323129985824F, 0.0F, 0.0F);
        this.Hips = new ModelPart(this, 130, 0);
        this.Hips.setPivot(0.0F, 3.0F, 5.0F);
        this.Hips.addCuboid(-13.0F, -14.0F, 0.0F, 26, 25, 28, 0.0F);
        this.LeftLeg1Toe1_2 = new ModelPart(this, 242, 3);
        this.LeftLeg1Toe1_2.setPivot(0.0F, 1.5F, -1.1F);
        this.LeftLeg1Toe1_2.addCuboid(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(LeftLeg1Toe1_2, 0.4363323129985824F, 0.0F, 0.0F);
        this.RightLeg1Toe3_1 = new ModelPart(this, 449, 6);
        this.RightLeg1Toe3_1.setPivot(-1.9F, 0.0F, -5.0F);
        this.RightLeg1Toe3_1.addCuboid(-1.5F, -2.0F, -2.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(RightLeg1Toe3_1, -0.4363323129985824F, 0.7853981633974483F, 0.0F);
        this.HornBase = new ModelPart(this, 218, 81);
        this.HornBase.setPivot(0.0F, -2.4F, -14.5F);
        this.HornBase.addCuboid(-5.0F, -6.0F, -5.0F, 10, 6, 10, 0.0F);
        this.setRotateAngle(HornBase, 0.6108652381980153F, 0.0F, 0.0F);
        this.LeftLeg2BaseTop = new ModelPart(this, 210, 0);
        this.LeftLeg2BaseTop.setPivot(-4.0F, 1.4F, -5.1F);
        this.LeftLeg2BaseTop.addCuboid(-5.5F, -12.5F, -6.0F, 11, 10, 10, 0.0F);
        this.setRotateAngle(LeftLeg2BaseTop, -0.3839724354387525F, 0.0F, 0.0F);
        this.RightLeg2Toe2_1 = new ModelPart(this, 346, 0);
        this.RightLeg2Toe2_1.setPivot(1.9F, 0.0F, -5.0F);
        this.RightLeg2Toe2_1.addCuboid(-1.5F, -2.0F, -2.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(RightLeg2Toe2_1, -0.4363323129985824F, -0.7853981633974483F, 0.0F);
        this.RightLeg1_4 = new ModelPart(this, 480, 87);
        this.RightLeg1_4.setPivot(0.0F, 6.1F, 0.4F);
        this.RightLeg1_4.addCuboid(-3.0F, 0.0F, -3.5F, 6, 6, 7, 0.0F);
        this.HeadBase = new ModelPart(this, 64, 68);
        this.HeadBase.setPivot(0.0F, 3.9F, -6.3F);
        this.HeadBase.addCuboid(-9.0F, -10.0F, -15.0F, 18, 20, 15, 0.0F);
        this.LeftFur1 = new ModelPart(this, 300, 80);
        this.LeftFur1.setPivot(12.0F, 13.0F, 0.0F);
        this.LeftFur1.addCuboid(0.0F, 0.0F, -13.0F, 0, 9, 30, 0.0F);
        this.RightLeg2Foot = new ModelPart(this, 314, 13);
        this.RightLeg2Foot.setPivot(0.0F, 5.5F, 3.0F);
        this.RightLeg2Foot.addCuboid(-3.5F, -3.0F, -7.0F, 7, 5, 8, 0.0F);
        this.Neck2 = new ModelPart(this, 156, 73);
        this.Neck2.setPivot(0.0F, -10.0F, -14.3F);
        this.Neck2.addCuboid(-8.5F, 0.0F, 0.0F, 17, 8, 14, 0.0F);
        this.setRotateAngle(Neck2, 0.6981317007977318F, 0.0F, 0.0F);
        this.LeftLeg1Toe1_1 = new ModelPart(this, 498, 0);
        this.LeftLeg1Toe1_1.setPivot(0.0F, 0.1F, -6.0F);
        this.LeftLeg1Toe1_1.addCuboid(-1.5F, -2.0F, -2.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(LeftLeg1Toe1_1, -0.4363323129985824F, 0.0F, 0.0F);
        this.RightLeg1Toe3_2 = new ModelPart(this, 121, 6);
        this.RightLeg1Toe3_2.setPivot(0.0F, 1.6F, -1.1F);
        this.RightLeg1Toe3_2.addCuboid(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(RightLeg1Toe3_2, 0.4363323129985824F, 0.0F, 0.0F);
        this.LeftLeg1_3 = new ModelPart(this, 296, 81);
        this.LeftLeg1_3.setPivot(0.0F, 8.6F, 0.0F);
        this.LeftLeg1_3.addCuboid(-4.0F, 0.0F, -4.5F, 8, 8, 9, 0.0F);
        this.RightLeg1Toe1_1 = new ModelPart(this, 408, 4);
        this.RightLeg1Toe1_1.setPivot(0.0F, 0.1F, -6.0F);
        this.RightLeg1Toe1_1.addCuboid(-1.5F, -2.0F, -2.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(RightLeg1Toe1_1, -0.4363323129985824F, 0.0F, 0.0F);
        this.Horn2 = new ModelPart(this, 486, 19);
        this.Horn2.setPivot(0.0F, -8.0F, 0.5F);
        this.Horn2.addCuboid(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
        this.setRotateAngle(Horn2, -0.17453292519943295F, 0.0F, 0.0F);
        this.LeftLeg1Toe3_1 = new ModelPart(this, 210, 3);
        this.LeftLeg1Toe3_1.setPivot(-1.9F, 0.0F, -5.0F);
        this.LeftLeg1Toe3_1.addCuboid(-1.5F, -2.0F, -2.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(LeftLeg1Toe3_1, -0.4363323129985824F, 0.7853981633974483F, 0.0F);
        this.LeftLeg2Toe2_1 = new ModelPart(this, 92, 0);
        this.LeftLeg2Toe2_1.setPivot(1.9F, 0.0F, -5.0F);
        this.LeftLeg2Toe2_1.addCuboid(-1.5F, -2.0F, -2.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(LeftLeg2Toe2_1, -0.4363323129985824F, -0.7853981633974483F, 0.0F);
        this.LeftLeg1Foot = new ModelPart(this, 406, 77);
        this.LeftLeg1Foot.setPivot(0.0F, 7.4F, 3.0F);
        this.LeftLeg1Foot.addCuboid(-3.5F, -3.0F, -7.0F, 7, 5, 8, 0.0F);
        this.LeftLeg1Toe2_1 = new ModelPart(this, 418, 1);
        this.LeftLeg1Toe2_1.setPivot(1.9F, 0.0F, -5.0F);
        this.LeftLeg1Toe2_1.addCuboid(-1.5F, -2.0F, -2.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(LeftLeg1Toe2_1, -0.4363323129985824F, -0.7853981633974483F, 0.0F);
        this.LeftLeg1Toe2_2 = new ModelPart(this, 449, 3);
        this.LeftLeg1Toe2_2.setPivot(0.0F, 1.6F, -1.1F);
        this.LeftLeg1Toe2_2.addCuboid(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(LeftLeg1Toe2_2, 0.4363323129985824F, 0.0F, 0.0F);
        this.LeftLeg2Base = new ModelPart(this, 397, 42);
        this.LeftLeg2Base.setPivot(12.5F, 8.0F, 16.0F);
        this.LeftLeg2Base.addCuboid(-10.0F, -12.5F, -6.0F, 12, 20, 15, 0.0F);
        this.LeftLeg1_2 = new ModelPart(this, 258, 81);
        this.LeftLeg1_2.setPivot(-3.0F, 5.5F, 2.5F);
        this.LeftLeg1_2.addCuboid(-4.5F, 0.0F, -5.0F, 9, 10, 10, 0.0F);
        this.LeftLeg1Toe3_2 = new ModelPart(this, 459, 3);
        this.LeftLeg1Toe3_2.setPivot(0.0F, 1.6F, -1.1F);
        this.LeftLeg1Toe3_2.addCuboid(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(LeftLeg1Toe3_2, 0.4363323129985824F, 0.0F, 0.0F);
        this.LeftLeg2Toe2_2 = new ModelPart(this, 242, 0);
        this.LeftLeg2Toe2_2.setPivot(0.0F, 1.6F, -1.1F);
        this.LeftLeg2Toe2_2.addCuboid(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(LeftLeg2Toe2_2, 0.4363323129985824F, 0.0F, 0.0F);
        this.RightLeg2_3 = new ModelPart(this, 132, 13);
        this.RightLeg2_3.setPivot(0.0F, 9.0F, -4.0F);
        this.RightLeg2_3.addCuboid(-3.0F, -2.0F, -3.5F, 6, 6, 7, 0.0F);
        this.setRotateAngle(RightLeg2_3, 0.08726646259971647F, 0.0F, 0.0F);
        this.RightLeg2BaseBottom = new ModelPart(this, 451, 57);
        this.RightLeg2BaseBottom.setPivot(4.0F, 6.4F, 0.8F);
        this.RightLeg2BaseBottom.addCuboid(-5.5F, -13.0F, -5.8F, 11, 9, 10, 0.0F);
        this.setRotateAngle(RightLeg2BaseBottom, 0.41887902047863906F, 0.0F, 0.0F);
        this.LeftLeg2Toe3_1 = new ModelPart(this, 121, 0);
        this.LeftLeg2Toe3_1.setPivot(-1.9F, 0.0F, -5.0F);
        this.LeftLeg2Toe3_1.addCuboid(-1.5F, -2.0F, -2.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(LeftLeg2Toe3_1, -0.4363323129985824F, 0.7853981633974483F, 0.0F);
        this.Body = new ModelPart(this, 0, 0);
        this.Body.setPivot(0.0F, -12.0F, 0.0F);
        this.Body.addCuboid(-13.5F, -15.0F, -30.0F, 27, 30, 38, 0.0F);
        this.setRotateAngle(Body, 0.017453292519943295F, 0.0F, 0.0F);
        this.LeftLeg2Toe1_1 = new ModelPart(this, 24, 0);
        this.LeftLeg2Toe1_1.setPivot(0.0F, 0.1F, -6.0F);
        this.LeftLeg2Toe1_1.addCuboid(-1.5F, -2.0F, -2.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(LeftLeg2Toe1_1, -0.4363323129985824F, 0.0F, 0.0F);
        this.LeftLeg2BaseBottom = new ModelPart(this, 466, 0);
        this.LeftLeg2BaseBottom.setPivot(-4.0F, 6.4F, 0.8F);
        this.LeftLeg2BaseBottom.addCuboid(-5.5F, -13.0F, -5.8F, 11, 9, 10, 0.0F);
        this.setRotateAngle(LeftLeg2BaseBottom, 0.41887902047863906F, 0.0F, 0.0F);
        this.Tail = new ModelPart(this, 128, 105);
        this.Tail.setPivot(0.0F, -10.0F, 25.0F);
        this.Tail.addCuboid(-1.5F, 0.0F, 0.0F, 3, 16, 3, 0.0F);
        this.setRotateAngle(Tail, 0.3141592653589793F, 0.0F, 0.0F);
        this.LeftLeg2Foot = new ModelPart(this, 314, 0);
        this.LeftLeg2Foot.setPivot(0.0F, 5.5F, 3.0F);
        this.LeftLeg2Foot.addCuboid(-3.5F, -3.0F, -7.0F, 7, 5, 8, 0.0F);
        this.HeadTop = new ModelPart(this, 439, 76);
        this.HeadTop.setPivot(0.0F, -10.5F, -14.0F);
        this.HeadTop.addCuboid(-5.5F, 0.0F, 0.0F, 12, 6, 12, 0.0F);
        this.setRotateAngle(HeadTop, 0.17453292519943295F, 0.0F, 0.0F);
        this.RightLeg1Base = new ModelPart(this, 449, 20);
        this.RightLeg1Base.setPivot(-13.5F, 6.0F, -20.0F);
        this.RightLeg1Base.addCuboid(-2.0F, -12.5F, -8.5F, 10, 20, 17, 0.0F);
        this.TailEnd = new ModelPart(this, 64, 106);
        this.TailEnd.setPivot(-2.0F, 13.0F, 1.5F);
        this.TailEnd.addCuboid(0.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.Neck1 = new ModelPart(this, 0, 68);
        this.Neck1.setPivot(0.0F, 2.4F, -5.0F);
        this.Neck1.addCuboid(-10.5F, -15.0F, -11.0F, 21, 30, 11, 0.0F);
        this.setRotateAngle(Neck1, -0.12217304763960307F, 0.0F, 0.0F);
        this.RightLeg1_2 = new ModelPart(this, 320, 88);
        this.RightLeg1_2.setPivot(3.0F, 5.5F, 2.5F);
        this.RightLeg1_2.addCuboid(-4.5F, 0.1F, -5.0F, 9, 10, 10, 0.0F);
        this.Horn3 = new ModelPart(this, 252, 3);
        this.Horn3.setPivot(0.0F, -3.1F, -0.3F);
        this.Horn3.addCuboid(-2.0F, -6.0F, -2.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(Horn3, -0.17453292519943295F, 0.0F, 0.0F);
        this.LeftLeg2_3 = new ModelPart(this, 132, 0);
        this.LeftLeg2_3.setPivot(0.0F, 9.0F, -4.0F);
        this.LeftLeg2_3.addCuboid(-3.0F, -2.0F, -3.5F, 6, 6, 7, 0.0F);
        this.setRotateAngle(LeftLeg2_3, 0.08726646259971647F, 0.0F, 0.0F);
        this.Snout = new ModelPart(this, 92, 22);
        this.Snout.setPivot(0.0F, 1.0F, -15.0F);
        this.Snout.addCuboid(-5.5F, -5.5F, -7.0F, 11, 8, 7, 0.0F);
        this.RightLeg2_1 = new ModelPart(this, 130, 53);
        this.RightLeg2_1.setPivot(4.0F, 7.5F, -6.0F);
        this.RightLeg2_1.addCuboid(-4.5F, 0.0F, 0.0F, 9, 11, 11, 0.0F);
        this.setRotateAngle(RightLeg2_1, 0.6981317007977318F, 0.0F, 0.0F);
        this.RightLeg2_2 = new ModelPart(this, 0, 17);
        this.RightLeg2_2.setPivot(0.0F, 11.0F, 10.0F);
        this.RightLeg2_2.addCuboid(-4.0F, 0.0F, -8.0F, 8, 9, 8, 0.0F);
        this.setRotateAngle(RightLeg2_2, -0.7853981633974483F, 0.0F, 0.0F);
        this.RightLeg2Base = new ModelPart(this, 310, 46);
        this.RightLeg2Base.setPivot(-12.5F, 8.0F, 16.0F);
        this.RightLeg2Base.addCuboid(-2.0F, -12.5F, -6.0F, 12, 20, 15, 0.0F);
        this.RightLeg1Toe2_2 = new ModelPart(this, 92, 6);
        this.RightLeg1Toe2_2.setPivot(0.0F, 1.6F, -1.1F);
        this.RightLeg1Toe2_2.addCuboid(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(RightLeg1Toe2_2, 0.4363323129985824F, 0.0F, 0.0F);
        this.Horn1 = new ModelPart(this, 364, 46);
        this.Horn1.setPivot(0.0F, -8.0F, -0.5F);
        this.Horn1.addCuboid(-4.0F, -5.5F, -4.0F, 8, 11, 8, 0.0F);
        this.setRotateAngle(Horn1, 0.13962634015954636F, 0.0F, 0.0F);
        this.LeftLeg2_1 = new ModelPart(this, 92, 0);
        this.LeftLeg2_1.setPivot(-4.0F, 7.5F, -6.0F);
        this.LeftLeg2_1.addCuboid(-4.5F, 0.0F, 0.0F, 9, 11, 11, 0.0F);
        this.setRotateAngle(LeftLeg2_1, 0.6981317007977318F, 0.0F, 0.0F);
        this.RightLeg1Toe2_1 = new ModelPart(this, 344, 6);
        this.RightLeg1Toe2_1.setPivot(1.9F, 0.0F, -5.0F);
        this.RightLeg1Toe2_1.addCuboid(-1.5F, -2.0F, -2.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(RightLeg1Toe2_1, -0.4363323129985824F, -0.7853981633974483F, 0.0F);
        this.LeftLeg2Toe3_2 = new ModelPart(this, 252, 0);
        this.LeftLeg2Toe3_2.setPivot(0.0F, 1.6F, -1.1F);
        this.LeftLeg2Toe3_2.addCuboid(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(LeftLeg2Toe3_2, 0.4363323129985824F, 0.0F, 0.0F);
        this.LeftLeg1_4 = new ModelPart(this, 130, 75);
        this.LeftLeg1_4.setPivot(0.0F, 6.1F, 0.4F);
        this.LeftLeg1_4.addCuboid(-3.0F, 0.0F, -3.5F, 6, 6, 7, 0.0F);
        this.BodyBackTop = new ModelPart(this, 216, 46);
        this.BodyBackTop.setPivot(0.0F, -14.0F, 24.0F);
        this.BodyBackTop.addCuboid(-12.5F, 0.0F, -22.0F, 25, 13, 22, 0.0F);
        this.setRotateAngle(BodyBackTop, -0.17453292519943295F, 0.0F, 0.0F);
        this.parts = ImmutableList.of(Body);
        this.Horn3.addChild(this.Horn4);
        this.Head.addChild(this.Jaw);
        this.RightLeg1_2.addChild(this.RightLeg1_3);
        this.RightLeg1_4.addChild(this.RightLeg1Foot);
        this.LeftLeg2_1.addChild(this.LeftLeg2_2);
        this.LeftLeg2Toe1_1.addChild(this.LeftLeg2Toe1_2);
        this.Body.addChild(this.BodyHump);
        this.RightLeg1Toe1_1.addChild(this.RightLeg1Toe1_2);
        this.RightLeg2Base.addChild(this.RightLeg2BaseTop);
        this.Body.addChild(this.NeckBase);
        this.RightLeg2Foot.addChild(this.RightLeg2Toe1_1);
        this.RightLeg2Foot.addChild(this.RightLeg2Toe3_1);
        this.LeftLeg1Base.addChild(this.LeftLeg1_1);
        this.Body.addChild(this.LeftLeg1Base);
        this.HeadBase.addChild(this.Head);
        this.RightLeg1Base.addChild(this.RightLeg1_1);
        this.RightLeg2Toe1_1.addChild(this.RightLeg2Toe1_2);
        this.RightLeg2Toe3_1.addChild(this.RightLeg2Toe3_2);
        this.Body.addChild(this.RightFur1);
        this.RightLeg2Toe2_1.addChild(this.RightLeg2Toe2_2);
        this.Body.addChild(this.Hips);
        this.LeftLeg1Toe1_1.addChild(this.LeftLeg1Toe1_2);
        this.RightLeg1Foot.addChild(this.RightLeg1Toe3_1);
        this.Head.addChild(this.HornBase);
        this.LeftLeg2Base.addChild(this.LeftLeg2BaseTop);
        this.RightLeg2Foot.addChild(this.RightLeg2Toe2_1);
        this.RightLeg1_3.addChild(this.RightLeg1_4);
        this.Neck1.addChild(this.HeadBase);
        this.Body.addChild(this.LeftFur1);
        this.RightLeg2_3.addChild(this.RightLeg2Foot);
        this.HeadBase.addChild(this.Neck2);
        this.LeftLeg1Foot.addChild(this.LeftLeg1Toe1_1);
        this.RightLeg1Toe3_1.addChild(this.RightLeg1Toe3_2);
        this.LeftLeg1_2.addChild(this.LeftLeg1_3);
        this.RightLeg1Foot.addChild(this.RightLeg1Toe1_1);
        this.Horn1.addChild(this.Horn2);
        this.LeftLeg1Foot.addChild(this.LeftLeg1Toe3_1);
        this.LeftLeg2Foot.addChild(this.LeftLeg2Toe2_1);
        this.LeftLeg1_4.addChild(this.LeftLeg1Foot);
        this.LeftLeg1Foot.addChild(this.LeftLeg1Toe2_1);
        this.LeftLeg1Toe2_1.addChild(this.LeftLeg1Toe2_2);
        this.Hips.addChild(this.LeftLeg2Base);
        this.LeftLeg1Base.addChild(this.LeftLeg1_2);
        this.LeftLeg1Toe3_1.addChild(this.LeftLeg1Toe3_2);
        this.LeftLeg2Toe2_1.addChild(this.LeftLeg2Toe2_2);
        this.RightLeg2_2.addChild(this.RightLeg2_3);
        this.RightLeg2Base.addChild(this.RightLeg2BaseBottom);
        this.LeftLeg2Foot.addChild(this.LeftLeg2Toe3_1);
        this.LeftLeg2Foot.addChild(this.LeftLeg2Toe1_1);
        this.LeftLeg2Base.addChild(this.LeftLeg2BaseBottom);
        this.Hips.addChild(this.Tail);
        this.LeftLeg2_3.addChild(this.LeftLeg2Foot);
        this.Head.addChild(this.HeadTop);
        this.Body.addChild(this.RightLeg1Base);
        this.Tail.addChild(this.TailEnd);
        this.NeckBase.addChild(this.Neck1);
        this.RightLeg1Base.addChild(this.RightLeg1_2);
        this.Horn2.addChild(this.Horn3);
        this.LeftLeg2_2.addChild(this.LeftLeg2_3);
        this.Head.addChild(this.Snout);
        this.RightLeg2Base.addChild(this.RightLeg2_1);
        this.RightLeg2_1.addChild(this.RightLeg2_2);
        this.Hips.addChild(this.RightLeg2Base);
        this.RightLeg1Toe2_1.addChild(this.RightLeg1Toe2_2);
        this.HornBase.addChild(this.Horn1);
        this.LeftLeg2Base.addChild(this.LeftLeg2_1);
        this.RightLeg1Foot.addChild(this.RightLeg1Toe2_1);
        this.LeftLeg2Toe3_1.addChild(this.LeftLeg2Toe3_2);
        this.LeftLeg1_3.addChild(this.LeftLeg1_4);
        this.Hips.addChild(this.BodyBackTop);
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
    public void setAngles(ElasmotheriumEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.pitch = x;
        modelRenderer.yaw = y;
        modelRenderer.roll = z;
    }
}

