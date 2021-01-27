package net.msrandom.cenozocraft.client.renderer.entity.model;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.msrandom.cenozocraft.entity.passive.AurochsEntity;

@SuppressWarnings("WeakerAccess")
public abstract class AurochsModel extends EntityModel<AurochsEntity> {
    public ModelPart Body2;
    public ModelPart Neck;
    public ModelPart Body1;
    public ModelPart Body3;
    public ModelPart Body5;
    public ModelPart Body1_1;
    public ModelPart Body3_1;
    public ModelPart FrontRightLeg;
    public ModelPart Body4;
    public ModelPart Tail1;
    public ModelPart BackRightLeg;
    public ModelPart Tail2;
    public ModelPart Tail3;
    public ModelPart FrontRightLeg_1;
    public ModelPart BackRightLeg_1;
    public ModelPart Head1;
    public ModelPart Neck2;
    public ModelPart Head2;
    public ModelPart Head3;
    public ModelPart Head4;
    public ModelPart Mouth;
    public ModelPart RightEar;
    public ModelPart LeftEar;
    public ModelPart Horns;
    public ModelPart Horns_1;
    public ModelPart Horns_2;
    public ModelPart Horns_3;
    public ModelPart Horns_4;
    public ModelPart Horns_5;
    public ModelPart Horns_6;

    @Override
    public void setAngles(AurochsEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.pitch = x;
        modelRenderer.yaw = y;
        modelRenderer.roll = z;
    }

    public static class Bull extends AurochsModel {
        public Bull() {
            this.textureWidth = 128;
            this.textureHeight = 128;
            this.Body1 = new ModelPart(this, 14, 44);
            this.Body1.setPivot(-0.5F, -0.2F, -6.5F);
            this.Body1.addCuboid(0.0F, 0.0F, 0.0F, 4, 13, 8, 0.0F);
            this.setRotateAngle(Body1, -0.08726646259971647F, 0.0F, 0.0F);
            this.Body3 = new ModelPart(this, 64, 44);
            this.Body3.setPivot(-0.5F, 0.7F, 10.5F);
            this.Body3.addCuboid(0.0F, 0.0F, 0.0F, 4, 13, 7, 0.0F);
            this.setRotateAngle(Body3, 0.12217304763960307F, 0.0F, 0.0F);
            this.Body1_1 = new ModelPart(this, 14, 44);
            this.Body1_1.setPivot(6.4F, 0.0F, -6.7F);
            this.Body1_1.addCuboid(0.0F, 0.0F, 0.0F, 4, 13, 8, 0.0F);
            this.setRotateAngle(Body1_1, -0.06981317007977318F, 0.0F, 0.0F);
            this.Head2 = new ModelPart(this, 0, 0);
            this.Head2.setPivot(0.0F, 0.1F, -6.3F);
            this.Head2.addCuboid(-2.0F, 1.33F, -5.5F, 5, 4, 6, 0.0F);
            this.setRotateAngle(Head2, 0.24434609527920614F, 0.0F, 0.0F);
            this.Neck = new ModelPart(this, 30, 30);
            this.Neck.setPivot(-1.0F, -5.899999999999997F, -7.1F);
            this.Neck.addCuboid(-3.0F, -6.0F, -10.2F, 8, 6, 6, 0.0F);
            this.setRotateAngle(Neck, 0.21642082724729686F, 0.0F, 0.0F);
            this.Horns_2 = new ModelPart(this, 68, 20);
            this.Horns_2.setPivot(5.7F, -2.7F, -4.4F);
            this.Horns_2.addCuboid(-2.8F, 0.0F, 0.0F, 3, 6, 2, 0.0F);
            this.setRotateAngle(Horns_2, 0.9773843811168246F, 0.10471975511965977F, 0.03490658503988659F);
            this.Body4 = new ModelPart(this, 51, 66);
            this.Body4.setPivot(1.0F, -1.9F, 0.0F);
            this.Body4.addCuboid(0.0F, 0.0F, 0.0F, 10, 3, 6, 0.0F);
            this.setRotateAngle(Body4, -0.03490658503988659F, 0.0F, 0.0F);
            this.Head3 = new ModelPart(this, 19, 22);
            this.Head3.setPivot(1.5F, 2.5F, -10.3F);
            this.Head3.addCuboid(-3.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
            this.setRotateAngle(Head3, 0.5235987755982988F, 0.0F, 0.0F);
            this.BackRightLeg = new ModelPart(this, 0, 51);
            this.BackRightLeg.setPivot(2.0F, 10.9F, 4.0F);
            this.BackRightLeg.addCuboid(-1.5F, 0.0F, -2.0F, 3, 11, 3, 0.0F);
            this.setRotateAngle(BackRightLeg, -0.13962634015954636F, -0.0F, 0.0F);
            this.Head1 = new ModelPart(this, 36, 0);
            this.Head1.setPivot(0.5F, -5.6F, -9.2F);
            this.Head1.addCuboid(-3.0F, 0.0F, -7.0F, 7, 7, 7, 0.0F);
            this.setRotateAngle(Head1, -0.20943951023931953F, 0.0F, 0.0F);
            this.Neck2 = new ModelPart(this, 94, 68);
            this.Neck2.setPivot(-2.0F, -3.1F, -7.4F);
            this.Neck2.addCuboid(0.0F, 0.0F, 0.0F, 6, 6, 10, 0.0F);
            this.setRotateAngle(Neck2, -1.1536626355682515F, 0.0F, 0.0F);
            this.Mouth = new ModelPart(this, 41, 19);
            this.Mouth.setPivot(1.5F, 6.0F, -10.3F);
            this.Mouth.addCuboid(-3.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F);
            this.setRotateAngle(Mouth, 0.04363323129985824F, -0.0F, 0.0F);
            this.Horns_3 = new ModelPart(this, 96, 8);
            this.Horns_3.setPivot(-1.5F, -0.9F, -0.4F);
            this.Horns_3.addCuboid(-3.0F, 0.0F, 0.0F, 3, 4, 2, 0.0F);
            this.setRotateAngle(Horns_3, 0.24434609527920614F, 0.0F, -0.296705972839036F);
            this.Body5 = new ModelPart(this, 51, 77);
            this.Body5.setPivot(1.0F, -1.3F, -0.7F);
            this.Body5.addCuboid(0.0F, 0.0F, 0.0F, 9, 3, 16, 0.0F);
            this.setRotateAngle(Body5, -0.30543261909900765F, 0.0F, 0.0F);
            this.Tail2 = new ModelPart(this, 0, 68);
            this.Tail2.setPivot(0.0F, 6.5F, 0.1F);
            this.Tail2.addCuboid(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
            this.setRotateAngle(Tail2, -0.2303834612632515F, -0.0F, 0.0F);
            this.BackRightLeg_1 = new ModelPart(this, 0, 51);
            this.BackRightLeg_1.setPivot(2.0F, 10.4F, 4.0F);
            this.BackRightLeg_1.addCuboid(-1.5F, 0.0F, -2.0F, 3, 11, 3, 0.0F);
            this.setRotateAngle(BackRightLeg_1, -0.13962634015954636F, -0.0F, 0.0F);
            this.Horns_4 = new ModelPart(this, 68, 20);
            this.Horns_4.setPivot(-1.8F, -2.8F, -4.4F);
            this.Horns_4.addCuboid(-3.3F, 0.0F, 0.0F, 3, 6, 2, 0.0F);
            this.setRotateAngle(Horns_4, 0.9773843811168246F, 0.06981317007977318F, -0.05235987755982988F);
            this.Horns_5 = new ModelPart(this, 68, 13);
            this.Horns_5.setPivot(6.4F, -6.5F, -4.7F);
            this.Horns_5.addCuboid(-2.8F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(Horns_5, 0.05235987755982988F, 0.10471975511965977F, 0.03490658503988659F);
            this.Body3_1 = new ModelPart(this, 64, 44);
            this.Body3_1.setPivot(6.8F, 0.7F, 10.5F);
            this.Body3_1.addCuboid(0.0F, 0.0F, 0.0F, 4, 13, 7, 0.0F);
            this.setRotateAngle(Body3_1, 0.12217304763960307F, 0.0F, 0.0F);
            this.FrontRightLeg = new ModelPart(this, 0, 51);
            this.FrontRightLeg.setPivot(2.0F, 10.6F, 4.0F);
            this.FrontRightLeg.addCuboid(-1.5F, 0.0F, -2.0F, 3, 11, 3, 0.0F);
            this.setRotateAngle(FrontRightLeg, 0.08726646259971647F, -0.0F, 0.0F);
            this.Tail3 = new ModelPart(this, 0, 38);
            this.Tail3.setPivot(-0.5F, 5.5F, -0.5F);
            this.Tail3.addCuboid(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
            this.setRotateAngle(Tail3, -0.153588974175501F, 0.0F, 0.0F);
            this.LeftEar = new ModelPart(this, 0, 22);
            this.LeftEar.setPivot(6.0F, 0.7F, -3.0F);
            this.LeftEar.addCuboid(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
            this.setRotateAngle(LeftEar, 0.0F, 0.0F, -0.20943951023931953F);
            this.RightEar = new ModelPart(this, 0, 31);
            this.RightEar.setPivot(-2.0F, 1.2F, -3.0F);
            this.RightEar.addCuboid(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
            this.setRotateAngle(RightEar, 0.0F, -0.0F, 0.20943951023931953F);
            this.Horns_6 = new ModelPart(this, 68, 13);
            this.Horns_6.setPivot(-1.8F, -6.5F, -4.7F);
            this.Horns_6.addCuboid(-2.8F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(Horns_6, 0.05235987755982988F, 0.10471975511965977F, 0.03490658503988659F);
            this.FrontRightLeg_1 = new ModelPart(this, 0, 51);
            this.FrontRightLeg_1.setPivot(2.0F, 10.4F, 4.0F);
            this.FrontRightLeg_1.addCuboid(-1.5F, 0.0F, -2.0F, 3, 11, 3, 0.0F);
            this.setRotateAngle(FrontRightLeg_1, 0.08726646259971647F, -0.0F, 0.0F);
            this.Head4 = new ModelPart(this, 67, 5);
            this.Head4.setPivot(1.0F, -0.4F, -5.0F);
            this.Head4.addCuboid(-3.0F, 0.0F, -0.0F, 5, 1, 4, 0.0F);
            this.setRotateAngle(Head4, 0.06981317007977318F, -0.0F, 0.0F);
            this.Horns = new ModelPart(this, 96, 0);
            this.Horns.setPivot(-0.6F, -1.2F, -3.7F);
            this.Horns.addCuboid(-3.0F, 0.0F, 0.0F, 7, 2, 2, 0.0F);
            this.setRotateAngle(Horns, 0.22689280275926282F, 0.0F, 0.0F);
            this.Body2 = new ModelPart(this, 11, 85);
            this.Body2.setPivot(-5.6F, -9.499999999999993F, -6.0F);
            this.Body2.addCuboid(-0.4F, 0.4F, 0.0F, 11, 10, 17, 0.0F);
            this.Tail1 = new ModelPart(this, 0, 68);
            this.Tail1.setPivot(5.0F, 1.8F, 4.6F);
            this.Tail1.addCuboid(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
            this.setRotateAngle(Tail1, 0.3839724354387525F, -0.0F, 0.0F);
            this.Horns_1 = new ModelPart(this, 96, 8);
            this.Horns_1.setPivot(5.9F, -0.3F, -0.4F);
            this.Horns_1.addCuboid(-2.6F, 0.0F, 0.0F, 3, 4, 2, 0.0F);
            this.setRotateAngle(Horns_1, 0.24434609527920614F, 0.0F, 0.2617993877991494F);
            this.Body2.addChild(this.Body1);
            this.Body2.addChild(this.Body3);
            this.Body2.addChild(this.Body1_1);
            this.Head1.addChild(this.Head2);
            this.Horns.addChild(this.Horns_2);
            this.Body1.addChild(this.Body4);
            this.Head1.addChild(this.Head3);
            this.Body3.addChild(this.BackRightLeg);
            this.Neck.addChild(this.Head1);
            this.Neck.addChild(this.Neck2);
            this.Head1.addChild(this.Mouth);
            this.Horns.addChild(this.Horns_3);
            this.Body2.addChild(this.Body5);
            this.Tail1.addChild(this.Tail2);
            this.Body3_1.addChild(this.BackRightLeg_1);
            this.Horns.addChild(this.Horns_4);
            this.Horns.addChild(this.Horns_5);
            this.Body2.addChild(this.Body3_1);
            this.Body1.addChild(this.FrontRightLeg);
            this.Tail2.addChild(this.Tail3);
            this.Head1.addChild(this.LeftEar);
            this.Head1.addChild(this.RightEar);
            this.Horns.addChild(this.Horns_6);
            this.Body1_1.addChild(this.FrontRightLeg_1);
            this.Head1.addChild(this.Head4);
            this.Head1.addChild(this.Horns);
            this.Body3.addChild(this.Tail1);
            this.Horns.addChild(this.Horns_1);
        }

        @Override
        public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
            matrices.push();
            matrices.scale(1.2f, 1.46f, 1.46f);
            this.Neck.render(matrices, vertices, light, overlay, red, green, blue, alpha);
            matrices.pop();
            matrices.push();
            matrices.scale(1.2f, 1.56f, 1.56f);
            this.Body2.render(matrices, vertices, light, overlay, red, green, blue, alpha);
            matrices.pop();
        }
    }

    public static class Cow extends AurochsModel {
        public ModelPart shape53;
        public ModelPart shape54;
        public ModelPart shape54_1;
        public ModelPart shape54_2;
        public ModelPart shape54_3;

        public Cow() {
            this.textureWidth = 128;
            this.textureHeight = 128;
            this.Horns_2 = new ModelPart(this, 68, 20);
            this.Horns_2.setPivot(5.7F, -2.7F, -4.4F);
            this.Horns_2.addCuboid(-2.8F, 0.0F, 0.0F, 3, 6, 2, 0.0F);
            this.setRotateAngle(Horns_2, 0.9773843811168246F, 0.10471975511965977F, 0.03490658503988659F);
            this.Body1_1 = new ModelPart(this, 14, 44);
            this.Body1_1.setPivot(6.4F, 0.0F, -6.7F);
            this.Body1_1.addCuboid(0.0F, 0.0F, 0.0F, 4, 13, 8, 0.0F);
            this.setRotateAngle(Body1_1, -0.08726646259971647F, 0.0F, 0.0F);
            this.Body1 = new ModelPart(this, 14, 44);
            this.Body1.setPivot(-0.5F, -0.2F, -6.5F);
            this.Body1.addCuboid(0.0F, 0.0F, 0.0F, 4, 13, 8, 0.0F);
            this.setRotateAngle(Body1, -0.08726646259971647F, 0.0F, 0.0F);
            this.Head2 = new ModelPart(this, 0, 0);
            this.Head2.setPivot(0.0F, 0.1F, -6.3F);
            this.Head2.addCuboid(-2.0F, 1.33F, -5.5F, 5, 4, 6, 0.0F);
            this.setRotateAngle(Head2, 0.24434609527920614F, 0.0F, 0.0F);
            this.shape54_2 = new ModelPart(this, 0, 15);
            this.shape54_2.setPivot(3.0F, 2.0F, 2.1F);
            this.shape54_2.addCuboid(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
            this.Horns_6 = new ModelPart(this, 68, 13);
            this.Horns_6.setPivot(-1.8F, -6.5F, -4.7F);
            this.Horns_6.addCuboid(-2.8F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(Horns_6, 0.05235987755982988F, 0.10471975511965977F, 0.03490658503988659F);
            this.Horns_4 = new ModelPart(this, 68, 20);
            this.Horns_4.setPivot(-1.8F, -2.8F, -4.4F);
            this.Horns_4.addCuboid(-3.3F, 0.0F, 0.0F, 3, 6, 2, 0.0F);
            this.setRotateAngle(Horns_4, 0.9773843811168246F, 0.06981317007977318F, -0.05235987755982988F);
            this.Body4 = new ModelPart(this, 51, 66);
            this.Body4.setPivot(1.0F, -1.0F, 0.0F);
            this.Body4.addCuboid(0.0F, 0.0F, 0.0F, 10, 3, 6, 0.0F);
            this.setRotateAngle(Body4, -0.03490658503988659F, 0.0F, 0.0F);
            this.shape53 = new ModelPart(this, 0, 15);
            this.shape53.setPivot(3.4F, 9.3F, 19.0F);
            this.shape53.addCuboid(0.0F, 0.0F, 0.0F, 4, 3, 2, 0.0F);
            this.RightEar = new ModelPart(this, 0, 31);
            this.RightEar.setPivot(-2.0F, 1.2F, -3.0F);
            this.RightEar.addCuboid(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
            this.setRotateAngle(RightEar, 0.0F, -0.0F, 0.20943951023931953F);
            this.Tail3 = new ModelPart(this, 0, 38);
            this.Tail3.setPivot(-0.5F, 5.5F, -0.5F);
            this.Tail3.addCuboid(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
            this.setRotateAngle(Tail3, -0.153588974175501F, 0.0F, 0.0F);
            this.shape54 = new ModelPart(this, 0, 15);
            this.shape54.setPivot(1.0F, 2.0F, 0.1F);
            this.shape54.addCuboid(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
            this.Tail1 = new ModelPart(this, 0, 68);
            this.Tail1.setPivot(5.0F, 1.8F, 4.6F);
            this.Tail1.addCuboid(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
            this.setRotateAngle(Tail1, 0.3839724354387525F, -0.0F, 0.0F);
            this.Mouth = new ModelPart(this, 41, 19);
            this.Mouth.setPivot(1.5F, 6.0F, -10.3F);
            this.Mouth.addCuboid(-3.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F);
            this.setRotateAngle(Mouth, 0.04363323129985824F, -0.0F, 0.0F);
            this.Body3 = new ModelPart(this, 64, 44);
            this.Body3.setPivot(-0.5F, 0.7F, 10.5F);
            this.Body3.addCuboid(0.0F, 0.0F, 0.0F, 4, 13, 7, 0.0F);
            this.setRotateAngle(Body3, 0.12217304763960307F, 0.0F, 0.0F);
            this.FrontRightLeg_1 = new ModelPart(this, 0, 51);
            this.FrontRightLeg_1.setPivot(2.0F, 10.4F, 4.0F);
            this.FrontRightLeg_1.addCuboid(-1.5F, 0.0F, -2.0F, 3, 11, 3, 0.0F);
            this.setRotateAngle(FrontRightLeg_1, 0.08726646259971647F, -0.0F, 0.0F);
            this.Horns_3 = new ModelPart(this, 96, 8);
            this.Horns_3.setPivot(-1.5F, -0.9F, -0.4F);
            this.Horns_3.addCuboid(-3.0F, 0.0F, 0.0F, 3, 4, 2, 0.0F);
            this.setRotateAngle(Horns_3, 0.24434609527920614F, 0.0F, -0.296705972839036F);
            this.Head1 = new ModelPart(this, 36, 0);
            this.Head1.setPivot(0.5F, -6.0F, -10.6F);
            this.Head1.addCuboid(-3.0F, 0.0F, -7.0F, 7, 7, 7, 0.0F);
            this.setRotateAngle(Head1, -0.20943951023931953F, 0.0F, 0.0F);
            this.Body5 = new ModelPart(this, 51, 77);
            this.Body5.setPivot(1.0F, -0.6F, -0.7F);
            this.Body5.addCuboid(0.0F, 0.0F, 0.0F, 9, 3, 16, 0.0F);
            this.setRotateAngle(Body5, -0.30543261909900765F, 0.0F, 0.0F);
            this.Horns_1 = new ModelPart(this, 96, 8);
            this.Horns_1.setPivot(5.9F, -0.3F, -0.4F);
            this.Horns_1.addCuboid(-2.6F, 0.0F, 0.0F, 3, 4, 2, 0.0F);
            this.setRotateAngle(Horns_1, 0.24434609527920614F, 0.0F, 0.2617993877991494F);
            this.Body3_1 = new ModelPart(this, 64, 44);
            this.Body3_1.setPivot(6.8F, 0.7F, 10.5F);
            this.Body3_1.addCuboid(0.0F, 0.0F, 0.0F, 4, 13, 7, 0.0F);
            this.setRotateAngle(Body3_1, 0.12217304763960307F, 0.0F, 0.0F);
            this.Neck2 = new ModelPart(this, 94, 68);
            this.Neck2.setPivot(-2.0F, -3.8F, -7.0F);
            this.Neck2.addCuboid(0.0F, 0.0F, 0.0F, 6, 6, 10, 0.0F);
            this.setRotateAngle(Neck2, -1.1536626355682515F, 0.0F, 0.0F);
            this.BackRightLeg_1 = new ModelPart(this, 0, 51);
            this.BackRightLeg_1.setPivot(2.0F, 10.4F, 4.0F);
            this.BackRightLeg_1.addCuboid(-1.5F, 0.0F, -2.0F, 3, 11, 3, 0.0F);
            this.setRotateAngle(BackRightLeg_1, -0.13962634015954636F, -0.0F, 0.0F);
            this.Neck = new ModelPart(this, 28, 28);
            this.Neck.setPivot(-1.0F, 1.0000000000000007F, -7.1F);
            this.Neck.addCuboid(-3.0F, -6.0F, -12.2F, 8, 6, 8, 0.0F);
            this.setRotateAngle(Neck, 0.21642082724729686F, 0.0F, 0.0F);
            this.Horns = new ModelPart(this, 96, 0);
            this.Horns.setPivot(-0.6F, -1.2F, -3.7F);
            this.Horns.addCuboid(-3.0F, 0.0F, 0.0F, 7, 2, 2, 0.0F);
            this.setRotateAngle(Horns, 0.22689280275926282F, 0.0F, 0.0F);
            this.Body2 = new ModelPart(this, 11, 85);
            this.Body2.setPivot(-5.6F, -4.400000000000007F, -6.0F);
            this.Body2.addCuboid(-0.4F, 0.4F, 0.0F, 11, 10, 17, 0.0F);
            this.shape54_1 = new ModelPart(this, 0, 15);
            this.shape54_1.setPivot(1.0F, 2.0F, 2.1F);
            this.shape54_1.addCuboid(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
            this.Horns_5 = new ModelPart(this, 68, 13);
            this.Horns_5.setPivot(6.4F, -6.5F, -4.7F);
            this.Horns_5.addCuboid(-2.8F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(Horns_5, 0.05235987755982988F, 0.10471975511965977F, 0.03490658503988659F);
            this.Head4 = new ModelPart(this, 67, 5);
            this.Head4.setPivot(1.0F, -0.4F, -5.0F);
            this.Head4.addCuboid(-3.0F, 0.0F, -0.0F, 5, 1, 4, 0.0F);
            this.setRotateAngle(Head4, 0.06981317007977318F, -0.0F, 0.0F);
            this.LeftEar = new ModelPart(this, 0, 22);
            this.LeftEar.setPivot(6.0F, 0.7F, -3.0F);
            this.LeftEar.addCuboid(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
            this.setRotateAngle(LeftEar, 0.0F, 0.0F, -0.20943951023931953F);
            this.FrontRightLeg = new ModelPart(this, 0, 51);
            this.FrontRightLeg.setPivot(2.0F, 10.6F, 4.0F);
            this.FrontRightLeg.addCuboid(-1.5F, 0.0F, -2.0F, 3, 11, 3, 0.0F);
            this.setRotateAngle(FrontRightLeg, 0.08726646259971647F, -0.0F, 0.0F);
            this.Tail2 = new ModelPart(this, 0, 68);
            this.Tail2.setPivot(0.0F, 6.5F, 0.1F);
            this.Tail2.addCuboid(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
            this.setRotateAngle(Tail2, -0.2303834612632515F, -0.0F, 0.0F);
            this.Head3 = new ModelPart(this, 19, 22);
            this.Head3.setPivot(1.5F, 2.5F, -10.3F);
            this.Head3.addCuboid(-3.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
            this.setRotateAngle(Head3, 0.5235987755982988F, 0.0F, 0.0F);
            this.shape54_3 = new ModelPart(this, 0, 15);
            this.shape54_3.setPivot(3.0F, 2.0F, 0.1F);
            this.shape54_3.addCuboid(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
            this.BackRightLeg = new ModelPart(this, 0, 51);
            this.BackRightLeg.setPivot(2.0F, 10.9F, 4.0F);
            this.BackRightLeg.addCuboid(-1.5F, 0.0F, -2.0F, 3, 11, 3, 0.0F);
            this.setRotateAngle(BackRightLeg, -0.13962634015954636F, -0.0F, 0.0F);
            this.Horns.addChild(this.Horns_2);
            this.Body2.addChild(this.Body1_1);
            this.Body2.addChild(this.Body1);
            this.Head1.addChild(this.Head2);
            this.shape53.addChild(this.shape54_2);
            this.Horns.addChild(this.Horns_6);
            this.Horns.addChild(this.Horns_4);
            this.Body1.addChild(this.Body4);
            this.Body1.addChild(this.shape53);
            this.Head1.addChild(this.RightEar);
            this.Tail2.addChild(this.Tail3);
            this.shape53.addChild(this.shape54);
            this.Body3.addChild(this.Tail1);
            this.Head1.addChild(this.Mouth);
            this.Body2.addChild(this.Body3);
            this.Body1_1.addChild(this.FrontRightLeg_1);
            this.Horns.addChild(this.Horns_3);
            this.Neck.addChild(this.Head1);
            this.Body2.addChild(this.Body5);
            this.Horns.addChild(this.Horns_1);
            this.Body2.addChild(this.Body3_1);
            this.Neck.addChild(this.Neck2);
            this.Body3_1.addChild(this.BackRightLeg_1);
            this.Head1.addChild(this.Horns);
            this.shape53.addChild(this.shape54_1);
            this.Horns.addChild(this.Horns_5);
            this.Head1.addChild(this.Head4);
            this.Head1.addChild(this.LeftEar);
            this.Body1.addChild(this.FrontRightLeg);
            this.Tail1.addChild(this.Tail2);
            this.Head1.addChild(this.Head3);
            this.shape53.addChild(this.shape54_3);
            this.Body3.addChild(this.BackRightLeg);
        }

        @Override
        public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
            matrices.push();
            matrices.scale(1.2937320000000003f, 1.2878514000000003f, 1.2749728860000005f);
            this.Neck.render(matrices, vertices, light, overlay, red, green, blue, alpha);
            matrices.pop();
            matrices.push();
            matrices.scale(1.2914679690000002f, 1.2914679690000006f, 1.2785532893100007f);
            this.Body2.render(matrices, vertices, light, overlay, red, green, blue, alpha);
            matrices.pop();
        }
    }

    public static class Child extends AurochsModel {
        public Child() {
            this.textureWidth = 128;
            this.textureHeight = 128;
            this.Neck = new ModelPart(this, 27, 95);
            this.Neck.setPivot(-1.0F, 9.2F, -14.3F);
            this.Neck.addCuboid(-3.0F, -6.0F, -12.2F, 8, 6, 9, 0.0F);
            this.setRotateAngle(Neck, 0.05235987755982988F, 0.0F, 0.0F);
            this.Tail1 = new ModelPart(this, 0, 68);
            this.Tail1.setPivot(5.0F, 1.8F, 4.6F);
            this.Tail1.addCuboid(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
            this.setRotateAngle(Tail1, 0.3839724354387525F, -0.0F, 0.0F);
            this.FrontRightLeg_1 = new ModelPart(this, 0, 51);
            this.FrontRightLeg_1.setPivot(2.0F, 10.4F, 4.0F);
            this.FrontRightLeg_1.addCuboid(-1.5F, 0.0F, -2.0F, 3, 11, 3, 0.0F);
            this.setRotateAngle(FrontRightLeg_1, 0.08726646259971647F, -0.0F, 0.0F);
            this.Body2 = new ModelPart(this, 13, 86);
            this.Body2.setPivot(-5.6F, 3.7F, -15.9F);
            this.Body2.addCuboid(-0.4F, 0.4F, -3.4F, 11, 10, 16, 0.0F);
            this.BackRightLeg_1 = new ModelPart(this, 0, 51);
            this.BackRightLeg_1.setPivot(2.0F, 10.4F, 4.0F);
            this.BackRightLeg_1.addCuboid(-1.5F, 0.0F, -2.0F, 3, 11, 3, 0.0F);
            this.setRotateAngle(BackRightLeg_1, -0.13962634015954636F, -0.0F, 0.0F);
            this.Neck2 = new ModelPart(this, 94, 68);
            this.Neck2.setPivot(-2.0F, -3.9F, -7.0F);
            this.Neck2.addCuboid(0.0F, 0.0F, 0.0F, 6, 6, 10, 0.0F);
            this.setRotateAngle(Neck2, -1.1536626355682515F, 0.0F, 0.0F);
            this.LeftEar = new ModelPart(this, 0, 22);
            this.LeftEar.setPivot(6.0F, 0.7F, -3.0F);
            this.LeftEar.addCuboid(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
            this.setRotateAngle(LeftEar, 0.0F, 0.0F, -0.20943951023931953F);
            this.Body3_1 = new ModelPart(this, 64, 44);
            this.Body3_1.setPivot(7.0F, 0.7F, 6.5F);
            this.Body3_1.addCuboid(0.0F, 0.0F, 0.0F, 4, 13, 7, 0.0F);
            this.setRotateAngle(Body3_1, 0.12217304763960307F, 0.0F, 0.0F);
            this.RightEar = new ModelPart(this, 0, 31);
            this.RightEar.setPivot(-2.0F, 1.2F, -3.0F);
            this.RightEar.addCuboid(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
            this.setRotateAngle(RightEar, 0.0F, -0.0F, 0.20943951023931953F);
            this.BackRightLeg = new ModelPart(this, 0, 51);
            this.BackRightLeg.setPivot(2.0F, 10.9F, 4.0F);
            this.BackRightLeg.addCuboid(-1.5F, 0.0F, -2.0F, 3, 11, 3, 0.0F);
            this.setRotateAngle(BackRightLeg, -0.13962634015954636F, -0.0F, 0.0F);
            this.FrontRightLeg = new ModelPart(this, 0, 51);
            this.FrontRightLeg.setPivot(2.0F, 10.6F, 4.0F);
            this.FrontRightLeg.addCuboid(-1.5F, 0.0F, -2.0F, 3, 11, 3, 0.0F);
            this.setRotateAngle(FrontRightLeg, 0.08726646259971647F, -0.0F, 0.0F);
            this.Body1_1 = new ModelPart(this, 14, 44);
            this.Body1_1.setPivot(6.8F, 0.0F, -6.7F);
            this.Body1_1.addCuboid(0.0F, 0.0F, 0.0F, 4, 13, 8, 0.0F);
            this.setRotateAngle(Body1_1, -0.08726646259971647F, 0.0F, 0.0F);
            this.Body3 = new ModelPart(this, 64, 44);
            this.Body3.setPivot(-0.7F, 0.7F, 6.5F);
            this.Body3.addCuboid(0.0F, 0.0F, 0.0F, 4, 13, 7, 0.0F);
            this.setRotateAngle(Body3, 0.12217304763960307F, 0.0F, 0.0F);
            this.Head1 = new ModelPart(this, 36, 0);
            this.Head1.setPivot(0.5F, -7.0F, -10.6F);
            this.Head1.addCuboid(-3.0F, 0.0F, -7.0F, 7, 7, 7, 0.0F);
            this.setRotateAngle(Head1, -0.08726646259971647F, 0.0F, 0.0F);
            this.Body1 = new ModelPart(this, 14, 44);
            this.Body1.setPivot(-0.7F, -0.2F, -6.5F);
            this.Body1.addCuboid(0.0F, 0.0F, 0.0F, 4, 13, 8, 0.0F);
            this.setRotateAngle(Body1, -0.08726646259971647F, 0.0F, 0.0F);
            this.Head4 = new ModelPart(this, 67, 5);
            this.Head4.setPivot(1.0F, -0.4F, -5.0F);
            this.Head4.addCuboid(-3.0F, 0.0F, -0.0F, 5, 1, 4, 0.0F);
            this.setRotateAngle(Head4, 0.06981317007977318F, -0.0F, 0.0F);
            this.Head3 = new ModelPart(this, 19, 22);
            this.Head3.setPivot(1.5F, 2.5F, -10.3F);
            this.Head3.addCuboid(-3.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
            this.setRotateAngle(Head3, 0.5235987755982988F, 0.0F, 0.0F);
            this.Mouth = new ModelPart(this, 41, 19);
            this.Mouth.setPivot(1.5F, 6.0F, -10.3F);
            this.Mouth.addCuboid(-3.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F);
            this.setRotateAngle(Mouth, 0.04363323129985824F, -0.0F, 0.0F);
            this.Tail3 = new ModelPart(this, 0, 38);
            this.Tail3.setPivot(-0.5F, 5.5F, -0.5F);
            this.Tail3.addCuboid(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
            this.setRotateAngle(Tail3, -0.153588974175501F, 0.0F, 0.0F);
            this.Tail2 = new ModelPart(this, 0, 68);
            this.Tail2.setPivot(0.0F, 6.5F, 0.1F);
            this.Tail2.addCuboid(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
            this.setRotateAngle(Tail2, -0.2303834612632515F, -0.0F, 0.0F);
            this.Head2 = new ModelPart(this, 0, 0);
            this.Head2.setPivot(0.0F, 0.1F, -6.3F);
            this.Head2.addCuboid(-2.0F, 1.33F, -5.5F, 5, 4, 6, 0.0F);
            this.setRotateAngle(Head2, 0.24434609527920614F, 0.0F, 0.0F);
            this.Body3.addChild(this.Tail1);
            this.Body1_1.addChild(this.FrontRightLeg_1);
            this.Body3_1.addChild(this.BackRightLeg_1);
            this.Neck.addChild(this.Neck2);
            this.Head1.addChild(this.LeftEar);
            this.Body2.addChild(this.Body3_1);
            this.Head1.addChild(this.RightEar);
            this.Body3.addChild(this.BackRightLeg);
            this.Body1.addChild(this.FrontRightLeg);
            this.Body2.addChild(this.Body1_1);
            this.Body2.addChild(this.Body3);
            this.Neck.addChild(this.Head1);
            this.Body2.addChild(this.Body1);
            this.Head1.addChild(this.Head4);
            this.Head1.addChild(this.Head3);
            this.Head1.addChild(this.Mouth);
            this.Tail2.addChild(this.Tail3);
            this.Tail1.addChild(this.Tail2);
            this.Head1.addChild(this.Head2);
        }

        @Override
        public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
            matrices.scale(0.75F, 0.75F, 0.75F);
            matrices.translate(0.0F, 0.125f, 0.0F);
            matrices.scale(0.5F, 0.5F, 0.5F);
            matrices.translate(0.0F, 1.875F, 0.0F);
            matrices.push();
            matrices.scale(0.94f, 0.94f, 0.93f);
            this.Neck.render(matrices, vertices, light, overlay, red, green, blue, alpha);
            matrices.pop();
            matrices.push();
            matrices.scale(0.94f, 0.94f, 0.93f);
            this.Body2.render(matrices, vertices, light, overlay, red, green, blue, alpha);
            matrices.pop();
        }
    }
}
