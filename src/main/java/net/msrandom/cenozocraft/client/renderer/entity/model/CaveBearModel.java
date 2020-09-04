package net.msrandom.cenozocraft.client.renderer.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.CompositeEntityModel;
import net.minecraft.entity.Entity;
import net.msrandom.cenozocraft.entity.monster.CaveBearEntity;

public abstract class CaveBearModel extends CompositeEntityModel<CaveBearEntity> {
    public ModelPart body;
    public ModelPart butt;
    public ModelPart back1;
    public ModelPart shoulders;
    public ModelPart Thigh1;
    public ModelPart Thigh2;
    public ModelPart Thigh3;
    public ModelPart Thigh4;
    public ModelPart tail;
    public ModelPart back2;
    public ModelPart neck;
    public ModelPart head;
    public ModelPart necklower;
    public ModelPart snout;
    public ModelPart leftear;
    public ModelPart rightear;
    public ModelPart nose;
    public ModelPart chin;
    public ModelPart inwardLegJoint1;
    public ModelPart Leg1;
    public ModelPart Foot1;
    public ModelPart inwardLegJoint2;
    public ModelPart Leg2;
    public ModelPart Foot2;
    public ModelPart Leg3;
    public ModelPart Foot3;
    public ModelPart Leg4;
    public ModelPart Foot4;

    public static class Adult extends CaveBearModel {
        public Adult() {
            this.textureWidth = 128;
            this.textureHeight = 128;
            this.Thigh2 = new ModelPart(this, 0, 75);
            this.Thigh2.mirror = true;
            this.Thigh2.setPivot(-5.5F, -2.0F, -7.0F);
            this.Thigh2.addCuboid(-3.5F, 0.0F, -4.0F, 7, 12, 8, 0.0F);
            this.setRotateAngle(Thigh2, 0.10471975511965977F, 0.03490658503988659F, 0.0F);
            this.Thigh4 = new ModelPart(this, 0, 95);
            this.Thigh4.mirror = true;
            this.Thigh4.setPivot(-5.5F, -1.0F, 14.0F);
            this.Thigh4.addCuboid(-3.5F, 0.0F, -4.0F, 7, 12, 9, 0.0F);
            this.setRotateAngle(Thigh4, -0.24434609527920614F, 0.0F, 0.0F);
            this.Foot2 = new ModelPart(this, 56, 77);
            this.Foot2.mirror = true;
            this.Foot2.setPivot(-0.01F, 9.0F, -2.5F);
            this.Foot2.addCuboid(-3.0F, -1.0F, -6.7F, 6, 3, 9, 0.0F);
            this.setRotateAngle(Foot2, 0.13962634015954636F, 0.0F, 0.0F);
            this.head = new ModelPart(this, 53, 0);
            this.head.setPivot(0.0F, 0.0F, -5.8F);
            this.head.addCuboid(-6.0F, -5.5F, -10.5F, 12, 11, 11, 0.0F);
            this.setRotateAngle(head, 0.20943951023931953F, 0.0F, 0.0F);
            this.Leg3 = new ModelPart(this, 32, 93);
            this.Leg3.setPivot(0.0F, 12.0F, -3.5F);
            this.Leg3.addCuboid(-3.0F, 0.0F, 0.0F, 6, 9, 7, 0.0F);
            this.setRotateAngle(Leg3, 0.593411945678072F, 0.0F, 0.0F);
            this.inwardLegJoint2 = new ModelPart(this, 0, 0);
            this.inwardLegJoint2.setPivot(-3.0F, 12.0F, 3.0F);
            this.inwardLegJoint2.addCuboid(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
            this.setRotateAngle(inwardLegJoint2, 0.0F, -0.08726646259971647F, 0.0F);
            this.Leg1 = new ModelPart(this, 30, 77);
            this.Leg1.setPivot(-2.6F, 0.0F, 0.5F);
            this.Leg1.addCuboid(-3.0F, 0.0F, -7.0F, 6, 9, 7, 0.0F);
            this.setRotateAngle(Leg1, -0.17453292519943295F, 0.0F, 0.0F);
            this.leftear = new ModelPart(this, 5, 0);
            this.leftear.setPivot(6.1F, -2.6F, -1.5F);
            this.leftear.addCuboid(-2.0F, -3.0F, -4.0F, 2, 3, 4, 0.0F);
            this.setRotateAngle(leftear, -0.3490658503988659F, 0.13962634015954636F, 0.20943951023931953F);
            this.back2 = new ModelPart(this, 0, 41);
            this.back2.setPivot(0.0F, 2.2F, -9.5F);
            this.back2.addCuboid(-5.5F, 0.0F, -3.0F, 11, 8, 3, 0.0F);
            this.setRotateAngle(back2, -0.7853981633974483F, 0.0F, 0.0F);
            this.rightear = new ModelPart(this, 5, 0);
            this.rightear.mirror = true;
            this.rightear.setPivot(-6.1F, -2.6F, -1.5F);
            this.rightear.addCuboid(0.0F, -3.0F, -4.0F, 2, 3, 4, 0.0F);
            this.setRotateAngle(rightear, -0.3490658503988659F, -0.13962634015954636F, -0.20943951023931953F);
            this.necklower = new ModelPart(this, 80, 55);
            this.necklower.setPivot(0.0F, 11.0F, 3.0F);
            this.necklower.addCuboid(-4.5F, -12.0F, 0.0F, 9, 12, 6, 0.0F);
            this.setRotateAngle(necklower, 1.0471975511965976F, 0.0F, 0.0F);
            this.Foot3 = new ModelPart(this, 58, 89);
            this.Foot3.setPivot(0.01F, 9.0F, 3.8F);
            this.Foot3.addCuboid(-3.0F, -1.0F, -6.0F, 6, 3, 9, 0.0F);
            this.setRotateAngle(Foot3, -0.2792526803190927F, 0.0F, 0.0F);
            this.shoulders = new ModelPart(this, 0, 56);
            this.shoulders.setPivot(0.0F, 5.5F, -11.5F);
            this.shoulders.addCuboid(-6.5F, -13.0F, 0.0F, 13, 13, 6, 0.0F);
            this.setRotateAngle(shoulders, 0.3839724354387525F, 0.0F, 0.0F);
            this.Thigh3 = new ModelPart(this, 0, 95);
            this.Thigh3.setPivot(5.5F, -1.0F, 14.0F);
            this.Thigh3.addCuboid(-3.5F, 0.0F, -4.0F, 7, 12, 9, 0.0F);
            this.setRotateAngle(Thigh3, -0.24434609527920614F, 0.0F, 0.0F);
            this.body = new ModelPart(this, 0, 0);
            this.body.setPivot(0.0F, 4.1F, 2.0F);
            this.body.addCuboid(-7.5F, -9.0F, -11.5F, 15, 18, 23, 0.0F);
            this.setRotateAngle(body, -0.06981317007977318F, 0.0F, 0.0F);
            this.neck = new ModelPart(this, 38, 56);
            this.neck.setPivot(0.0F, -7.2F, 2.5F);
            this.neck.addCuboid(-5.0F, -5.0F, -8.0F, 10, 10, 11, 0.0F);
            this.setRotateAngle(neck, -0.17453292519943295F, 0.0F, 0.0F);
            this.inwardLegJoint1 = new ModelPart(this, 0, 0);
            this.inwardLegJoint1.setPivot(3.0F, 12.0F, 3.0F);
            this.inwardLegJoint1.addCuboid(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
            this.setRotateAngle(inwardLegJoint1, 0.0F, 0.08726646259971647F, 0.0F);
            this.butt = new ModelPart(this, 64, 28);
            this.butt.setPivot(0.0F, -9.0F, 11.5F);
            this.butt.addCuboid(-7.0F, 0.0F, 0.0F, 14, 14, 13, 0.0F);
            this.setRotateAngle(butt, -0.6981317007977318F, 0.0F, 0.0F);
            this.back1 = new ModelPart(this, 16, 41);
            this.back1.setPivot(0.0F, -9.0F, 3.0F);
            this.back1.addCuboid(-6.0F, 0.0F, -12.0F, 12, 3, 12, 0.0F);
            this.setRotateAngle(back1, -0.20943951023931953F, 0.0F, 0.0F);
            this.snout = new ModelPart(this, 101, 9);
            this.snout.setPivot(0.0F, 0.7F, -10.3F);
            this.snout.addCuboid(-3.0F, -2.0F, -5.0F, 6, 5, 5, 0.0F);
            this.setRotateAngle(snout, -0.06981317007977318F, 0.0F, 0.0F);
            this.nose = new ModelPart(this, 102, 1);
            this.nose.setPivot(0.0F, -2.8F, -0.2F);
            this.nose.addCuboid(-2.5F, 0.0F, -5.0F, 5, 2, 5, 0.0F);
            this.setRotateAngle(nose, 0.10471975511965977F, 0.0F, 0.0F);
            this.Foot1 = new ModelPart(this, 56, 77);
            this.Foot1.setPivot(0.01F, 9.0F, -2.5F);
            this.Foot1.addCuboid(-3.0F, -1.0F, -6.7F, 6, 3, 9, 0.0F);
            this.setRotateAngle(Foot1, 0.13962634015954636F, 0.0F, 0.0F);
            this.Leg4 = new ModelPart(this, 32, 93);
            this.Leg4.mirror = true;
            this.Leg4.setPivot(0.0F, 12.0F, -3.5F);
            this.Leg4.addCuboid(-3.0F, 0.0F, 0.0F, 6, 9, 7, 0.0F);
            this.setRotateAngle(Leg4, 0.593411945678072F, 0.0F, 0.0F);
            this.tail = new ModelPart(this, 4, 11);
            this.tail.setPivot(0.0F, 1.6F, 11.5F);
            this.tail.addCuboid(-2.0F, 0.0F, -1.5F, 4, 3, 3, 0.0F);
            this.setRotateAngle(tail, 0.9075712110370513F, 0.0F, 0.0F);
            this.Thigh1 = new ModelPart(this, 0, 75);
            this.Thigh1.setPivot(5.5F, -2.0F, -7.0F);
            this.Thigh1.addCuboid(-3.5F, 0.0F, -4.0F, 7, 12, 8, 0.0F);
            this.setRotateAngle(Thigh1, 0.10471975511965977F, -0.03490658503988659F, 0.0F);
            this.Leg2 = new ModelPart(this, 30, 77);
            this.Leg2.mirror = true;
            this.Leg2.setPivot(2.6F, 0.0F, 0.5F);
            this.Leg2.addCuboid(-3.0F, 0.0F, -7.0F, 6, 9, 7, 0.0F);
            this.setRotateAngle(Leg2, -0.17453292519943295F, 0.0F, 0.0F);
            this.chin = new ModelPart(this, 102, 20);
            this.chin.setPivot(0.0F, 2.4F, 0.2F);
            this.chin.addCuboid(-2.5F, 0.0F, -5.0F, 5, 2, 5, 0.0F);
            this.setRotateAngle(chin, 0.10471975511965977F, 0.0F, 0.0F);
            this.Foot4 = new ModelPart(this, 58, 89);
            this.Foot4.mirror = true;
            this.Foot4.setPivot(-0.01F, 9.0F, 3.8F);
            this.Foot4.addCuboid(-3.0F, -1.0F, -6.0F, 6, 3, 9, 0.0F);
            this.setRotateAngle(Foot4, -0.2792526803190927F, 0.0F, 0.0F);
            this.body.addChild(this.Thigh2);
            this.body.addChild(this.Thigh4);
            this.Leg2.addChild(this.Foot2);
            this.neck.addChild(this.head);
            this.Thigh3.addChild(this.Leg3);
            this.Thigh2.addChild(this.inwardLegJoint2);
            this.inwardLegJoint1.addChild(this.Leg1);
            this.head.addChild(this.leftear);
            this.back1.addChild(this.back2);
            this.head.addChild(this.rightear);
            this.neck.addChild(this.necklower);
            this.Leg3.addChild(this.Foot3);
            this.body.addChild(this.shoulders);
            this.body.addChild(this.Thigh3);
            this.shoulders.addChild(this.neck);
            this.Thigh1.addChild(this.inwardLegJoint1);
            this.body.addChild(this.butt);
            this.body.addChild(this.back1);
            this.head.addChild(this.snout);
            this.snout.addChild(this.nose);
            this.Leg1.addChild(this.Foot1);
            this.Thigh4.addChild(this.Leg4);
            this.butt.addChild(this.tail);
            this.body.addChild(this.Thigh1);
            this.inwardLegJoint2.addChild(this.Leg2);
            this.snout.addChild(this.chin);
            this.Leg4.addChild(this.Foot4);
        }
    }

    public static class AdultStanding extends CaveBearModel {
        public AdultStanding() {
            this.textureWidth = 128;
            this.textureHeight = 128;
            this.Leg3 = new ModelPart(this, 32, 93);
            this.Leg3.setPivot(0.0F, 12.0F, -3.5F);
            this.Leg3.addCuboid(-3.0F, 0.0F, 0.0F, 6, 9, 7, 0.0F);
            this.setRotateAngle(Leg3, 0.593411945678072F, 0.0F, 0.0F);
            this.head = new ModelPart(this, 53, 0);
            this.head.setPivot(0.0F, 0.0F, -5.8F);
            this.head.addCuboid(-6.0F, -5.5F, -10.5F, 12, 11, 11, 0.0F);
            this.setRotateAngle(head, 0.7740535232594852F, 0.0F, 0.0F);
            this.rightear = new ModelPart(this, 5, 0);
            this.rightear.mirror = true;
            this.rightear.setPivot(-6.1F, -2.6F, -1.5F);
            this.rightear.addCuboid(0.0F, -3.0F, -4.0F, 2, 3, 4, 0.0F);
            this.setRotateAngle(rightear, -0.3490658503988659F, -0.13962634015954636F, -0.20943951023931953F);
            this.Foot4 = new ModelPart(this, 58, 89);
            this.Foot4.mirror = true;
            this.Foot4.setPivot(-0.01F, 9.0F, 3.8F);
            this.Foot4.addCuboid(-3.0F, -1.0F, -6.0F, 6, 3, 9, 0.0F);
            this.setRotateAngle(Foot4, -0.2792526803190927F, 0.0F, 0.0F);
            this.back1 = new ModelPart(this, 16, 41);
            this.back1.setPivot(0.0F, -9.0F, 3.0F);
            this.back1.addCuboid(-6.0F, 0.0F, -12.0F, 12, 3, 12, 0.0F);
            this.setRotateAngle(back1, -0.20943951023931953F, 0.0F, 0.0F);
            this.inwardLegJoint2 = new ModelPart(this, 0, 0);
            this.inwardLegJoint2.setPivot(-3.0F, 12.0F, 3.0F);
            this.inwardLegJoint2.addCuboid(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
            this.setRotateAngle(inwardLegJoint2, 0.0F, -0.08726646259971647F, 0.0F);
            this.tail = new ModelPart(this, 4, 11);
            this.tail.setPivot(0.0F, 1.6F, 11.5F);
            this.tail.addCuboid(-2.0F, 0.0F, -1.5F, 4, 3, 3, 0.0F);
            this.setRotateAngle(tail, 0.9075712110370513F, 0.0F, 0.0F);
            this.snout = new ModelPart(this, 101, 9);
            this.snout.setPivot(0.0F, 0.7F, -10.3F);
            this.snout.addCuboid(-3.0F, -2.0F, -5.0F, 6, 5, 5, 0.0F);
            this.setRotateAngle(snout, -0.06981317007977318F, 0.0F, 0.0F);
            this.butt = new ModelPart(this, 64, 28);
            this.butt.setPivot(0.0F, -9.0F, 11.5F);
            this.butt.addCuboid(-7.0F, 0.0F, 0.0F, 14, 14, 13, 0.0F);
            this.setRotateAngle(butt, -0.6981317007977318F, 0.0F, 0.0F);
            this.inwardLegJoint1 = new ModelPart(this, 0, 0);
            this.inwardLegJoint1.setPivot(3.0F, 12.0F, 3.0F);
            this.inwardLegJoint1.addCuboid(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
            this.setRotateAngle(inwardLegJoint1, 0.0F, 0.08726646259971647F, 0.0F);
            this.Leg4 = new ModelPart(this, 32, 93);
            this.Leg4.mirror = true;
            this.Leg4.setPivot(0.0F, 12.0F, -3.5F);
            this.Leg4.addCuboid(-3.0F, 0.0F, 0.0F, 6, 9, 7, 0.0F);
            this.setRotateAngle(Leg4, 0.593411945678072F, 0.0F, 0.0F);
            this.necklower = new ModelPart(this, 80, 55);
            this.necklower.setPivot(0.0F, 11.0F, 3.0F);
            this.necklower.addCuboid(-4.5F, -12.0F, 0.0F, 9, 12, 6, 0.0F);
            this.setRotateAngle(necklower, 1.0927506446736497F, 0.0F, 0.0F);
            this.Leg2 = new ModelPart(this, 30, 77);
            this.Leg2.mirror = true;
            this.Leg2.setPivot(2.6F, 0.0F, 0.5F);
            this.Leg2.addCuboid(-3.0F, 0.0F, -7.0F, 6, 9, 7, 0.0F);
            this.setRotateAngle(Leg2, -0.4553564018453205F, 0.0F, -0.4553564018453205F);
            this.Foot1 = new ModelPart(this, 56, 77);
            this.Foot1.setPivot(0.01F, 8.0F, -3.5F);
            this.Foot1.addCuboid(-3.0F, -1.0F, -6.7F, 6, 3, 9, 0.0F);
            this.setRotateAngle(Foot1, 0.7285004297824331F, 0.0F, 0.0F);
            this.shoulders = new ModelPart(this, 0, 56);
            this.shoulders.setPivot(0.0F, 5.5F, -11.5F);
            this.shoulders.addCuboid(-6.5F, -13.0F, 0.0F, 13, 13, 6, 0.0F);
            this.setRotateAngle(shoulders, 0.3839724354387525F, 0.0F, 0.0F);
            this.Thigh3 = new ModelPart(this, 0, 95);
            this.Thigh3.setPivot(5.5F, -1.0F, 14.0F);
            this.Thigh3.addCuboid(-3.5F, 0.0F, -4.0F, 7, 12, 9, 0.0F);
            this.setRotateAngle(Thigh3, 1.0927506446736497F, 0.0F, 0.0F);
            this.Leg1 = new ModelPart(this, 30, 77);
            this.Leg1.setPivot(-2.6F, 0.0F, 0.5F);
            this.Leg1.addCuboid(-3.0F, 0.0F, -7.0F, 6, 9, 7, 0.0F);
            this.setRotateAngle(Leg1, -0.4553564018453205F, 0.0F, 0.4553564018453205F);
            this.Thigh2 = new ModelPart(this, 0, 75);
            this.Thigh2.mirror = true;
            this.Thigh2.setPivot(-5.5F, -2.0F, -7.0F);
            this.Thigh2.addCuboid(-3.5F, 0.0F, -4.0F, 7, 12, 8, 0.0F);
            this.setRotateAngle(Thigh2, 1.0016444577195458F, -0.5009094953223726F, 0.27314402793711257F);
            this.Thigh1 = new ModelPart(this, 0, 75);
            this.Thigh1.setPivot(5.5F, -2.0F, -7.0F);
            this.Thigh1.addCuboid(-3.5F, 0.0F, -4.0F, 7, 12, 8, 0.0F);
            this.setRotateAngle(Thigh1, 1.0016444577195458F, 0.5009094953223726F, -0.136659280431156F);
            this.leftear = new ModelPart(this, 5, 0);
            this.leftear.setPivot(6.1F, -2.6F, -1.5F);
            this.leftear.addCuboid(-2.0F, -3.0F, -4.0F, 2, 3, 4, 0.0F);
            this.setRotateAngle(leftear, -0.3490658503988659F, 0.13962634015954636F, 0.20943951023931953F);
            this.neck = new ModelPart(this, 38, 56);
            this.neck.setPivot(0.0F, -7.2F, 2.5F);
            this.neck.addCuboid(-5.0F, -5.0F, -8.0F, 10, 10, 11, 0.0F);
            this.setRotateAngle(neck, 0.40980330836826856F, 0.0F, 0.0F);
            this.back2 = new ModelPart(this, 0, 41);
            this.back2.setPivot(0.0F, 2.2F, -9.5F);
            this.back2.addCuboid(-5.5F, 0.0F, -3.0F, 11, 8, 3, 0.0F);
            this.setRotateAngle(back2, -0.7853981633974483F, 0.0F, 0.0F);
            this.chin = new ModelPart(this, 102, 20);
            this.chin.setPivot(0.0F, 2.4F, 0.2F);
            this.chin.addCuboid(-2.5F, 0.0F, -5.0F, 5, 2, 5, 0.0F);
            this.setRotateAngle(chin, 0.045553093477052F, 0.0F, 0.0F);
            this.body = new ModelPart(this, 0, 0);
            this.body.setPivot(0.0F, -9.5F, 2.0F);
            this.body.addCuboid(-7.5F, -9.0F, -11.5F, 15, 18, 23, 0.0F);
            this.setRotateAngle(body, -1.4114477660878142F, 0.0F, 0.0F);
            this.Foot2 = new ModelPart(this, 56, 77);
            this.Foot2.mirror = true;
            this.Foot2.setPivot(-0.01F, 8.0F, -3.5F);
            this.Foot2.addCuboid(-3.0F, -1.0F, -6.7F, 6, 3, 9, 0.0F);
            this.setRotateAngle(Foot2, 0.7285004297824331F, 0.0F, 0.0F);
            this.Foot3 = new ModelPart(this, 58, 89);
            this.Foot3.setPivot(0.01F, 9.0F, 3.8F);
            this.Foot3.addCuboid(-3.0F, -1.0F, -6.0F, 6, 3, 9, 0.0F);
            this.setRotateAngle(Foot3, -0.2792526803190927F, 0.0F, 0.0F);
            this.nose = new ModelPart(this, 102, 1);
            this.nose.setPivot(0.0F, -2.8F, -0.2F);
            this.nose.addCuboid(-2.5F, 0.0F, -5.0F, 5, 2, 5, 0.0F);
            this.setRotateAngle(nose, 0.10471975511965977F, 0.0F, 0.0F);
            this.Thigh4 = new ModelPart(this, 0, 95);
            this.Thigh4.mirror = true;
            this.Thigh4.setPivot(-5.5F, -1.0F, 14.0F);
            this.Thigh4.addCuboid(-3.5F, 0.0F, -4.0F, 7, 12, 9, 0.0F);
            this.setRotateAngle(Thigh4, 1.0927506446736497F, 0.0F, 0.0F);
            this.Thigh3.addChild(this.Leg3);
            this.neck.addChild(this.head);
            this.head.addChild(this.rightear);
            this.Leg4.addChild(this.Foot4);
            this.body.addChild(this.back1);
            this.Thigh2.addChild(this.inwardLegJoint2);
            this.butt.addChild(this.tail);
            this.head.addChild(this.snout);
            this.body.addChild(this.butt);
            this.Thigh1.addChild(this.inwardLegJoint1);
            this.Thigh4.addChild(this.Leg4);
            this.neck.addChild(this.necklower);
            this.inwardLegJoint2.addChild(this.Leg2);
            this.Leg1.addChild(this.Foot1);
            this.body.addChild(this.shoulders);
            this.body.addChild(this.Thigh3);
            this.inwardLegJoint1.addChild(this.Leg1);
            this.body.addChild(this.Thigh2);
            this.body.addChild(this.Thigh1);
            this.head.addChild(this.leftear);
            this.shoulders.addChild(this.neck);
            this.back1.addChild(this.back2);
            this.snout.addChild(this.chin);
            this.Leg2.addChild(this.Foot2);
            this.Leg3.addChild(this.Foot3);
            this.snout.addChild(this.nose);
            this.body.addChild(this.Thigh4);
        }

        @Override
        public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.body.render(f5);
        }
    }

    public static class Child extends CaveBearModel {
        public Child() {
            this.textureWidth = 128;
            this.textureHeight = 128;
            this.Thigh2 = new ModelPart(this, 0, 75);
            this.Thigh2.mirror = true;
            this.Thigh2.setPivot(-5.5F, -2.0F, -7.0F);
            this.Thigh2.addCuboid(-3.5F, 0.0F, -4.0F, 7, 12, 8, 0.0F);
            this.setRotateAngle(Thigh2, 0.10471975511965977F, 0.03490658503988659F, 0.0F);
            this.Thigh4 = new ModelPart(this, 0, 95);
            this.Thigh4.mirror = true;
            this.Thigh4.setPivot(-5.5F, -1.0F, 14.0F);
            this.Thigh4.addCuboid(-3.5F, 0.0F, -4.0F, 7, 12, 9, 0.0F);
            this.setRotateAngle(Thigh4, -0.24434609527920614F, 0.0F, 0.0F);
            this.Foot2 = new ModelPart(this, 56, 77);
            this.Foot2.mirror = true;
            this.Foot2.setPivot(-0.01F, 9.0F, -2.5F);
            this.Foot2.addCuboid(-3.0F, -1.0F, -6.7F, 6, 3, 9, 0.0F);
            this.setRotateAngle(Foot2, 0.13962634015954636F, 0.0F, 0.0F);
            this.head = new ModelPart(this, 53, 0);
            this.head.setPivot(0.0F, 0.0F, -5.8F);
            this.head.addCuboid(-6.0F, -5.5F, -10.5F, 12, 11, 11, 0.0F);
            this.setRotateAngle(head, 0.20943951023931953F, 0.0F, 0.0F);
            this.Leg3 = new ModelPart(this, 32, 93);
            this.Leg3.setPivot(0.0F, 12.0F, -3.5F);
            this.Leg3.addCuboid(-3.0F, 0.0F, 0.0F, 6, 9, 7, 0.0F);
            this.setRotateAngle(Leg3, 0.593411945678072F, 0.0F, 0.0F);
            this.inwardLegJoint2 = new ModelPart(this, 0, 0);
            this.inwardLegJoint2.setPivot(-3.0F, 12.0F, 3.0F);
            this.inwardLegJoint2.addCuboid(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
            this.setRotateAngle(inwardLegJoint2, 0.0F, -0.08726646259971647F, 0.0F);
            this.Leg1 = new ModelPart(this, 30, 77);
            this.Leg1.setPivot(-2.6F, 0.0F, 0.5F);
            this.Leg1.addCuboid(-3.0F, 0.0F, -7.0F, 6, 9, 7, 0.0F);
            this.setRotateAngle(Leg1, -0.17453292519943295F, 0.0F, 0.0F);
            this.leftear = new ModelPart(this, 5, 0);
            this.leftear.setPivot(6.1F, -2.6F, -1.5F);
            this.leftear.addCuboid(-2.0F, -3.0F, -4.0F, 2, 3, 4, 0.0F);
            this.setRotateAngle(leftear, -0.3490658503988659F, 0.13962634015954636F, 0.20943951023931953F);
            this.back2 = new ModelPart(this, 0, 41);
            this.back2.setPivot(0.0F, 2.2F, -9.5F);
            this.back2.addCuboid(-5.5F, 0.0F, -3.0F, 11, 8, 3, 0.0F);
            this.setRotateAngle(back2, -0.7853981633974483F, 0.0F, 0.0F);
            this.rightear = new ModelPart(this, 5, 0);
            this.rightear.mirror = true;
            this.rightear.setPivot(-6.1F, -2.6F, -1.5F);
            this.rightear.addCuboid(0.0F, -3.0F, -4.0F, 2, 3, 4, 0.0F);
            this.setRotateAngle(rightear, -0.3490658503988659F, -0.13962634015954636F, -0.20943951023931953F);
            this.necklower = new ModelPart(this, 80, 55);
            this.necklower.setPivot(0.0F, 11.0F, 3.0F);
            this.necklower.addCuboid(-4.5F, -12.0F, 0.0F, 9, 12, 6, 0.0F);
            this.setRotateAngle(necklower, 1.0471975511965976F, 0.0F, 0.0F);
            this.Foot3 = new ModelPart(this, 58, 89);
            this.Foot3.setPivot(0.01F, 9.0F, 3.8F);
            this.Foot3.addCuboid(-3.0F, -1.0F, -6.0F, 6, 3, 9, 0.0F);
            this.setRotateAngle(Foot3, -0.2792526803190927F, 0.0F, 0.0F);
            this.shoulders = new ModelPart(this, 0, 56);
            this.shoulders.setPivot(0.0F, 5.5F, -11.5F);
            this.shoulders.addCuboid(-6.5F, -13.0F, 0.0F, 13, 13, 6, 0.0F);
            this.setRotateAngle(shoulders, 0.3839724354387525F, 0.0F, 0.0F);
            this.Thigh3 = new ModelPart(this, 0, 95);
            this.Thigh3.setPivot(5.5F, -1.0F, 14.0F);
            this.Thigh3.addCuboid(-3.5F, 0.0F, -4.0F, 7, 12, 9, 0.0F);
            this.setRotateAngle(Thigh3, -0.24434609527920614F, 0.0F, 0.0F);
            this.body = new ModelPart(this, 0, 0);
            this.body.setPivot(0.0F, 4.1F, 2.0F);
            this.body.addCuboid(-7.5F, -9.0F, -11.5F, 15, 18, 23, 0.0F);
            this.setRotateAngle(body, -0.06981317007977318F, 0.0F, 0.0F);
            this.neck = new ModelPart(this, 38, 56);
            this.neck.setPivot(0.0F, -7.2F, 2.5F);
            this.neck.addCuboid(-5.0F, -5.0F, -8.0F, 10, 10, 11, 0.0F);
            this.setRotateAngle(neck, -0.17453292519943295F, 0.0F, 0.0F);
            this.inwardLegJoint1 = new ModelPart(this, 0, 0);
            this.inwardLegJoint1.setPivot(3.0F, 12.0F, 3.0F);
            this.inwardLegJoint1.addCuboid(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
            this.setRotateAngle(inwardLegJoint1, 0.0F, 0.08726646259971647F, 0.0F);
            this.butt = new ModelPart(this, 64, 28);
            this.butt.setPivot(0.0F, -9.0F, 11.5F);
            this.butt.addCuboid(-7.0F, 0.0F, 0.0F, 14, 14, 13, 0.0F);
            this.setRotateAngle(butt, -0.6981317007977318F, 0.0F, 0.0F);
            this.back1 = new ModelPart(this, 16, 41);
            this.back1.setPivot(0.0F, -9.0F, 3.0F);
            this.back1.addCuboid(-6.0F, 0.0F, -12.0F, 12, 3, 12, 0.0F);
            this.setRotateAngle(back1, -0.20943951023931953F, 0.0F, 0.0F);
            this.snout = new ModelPart(this, 101, 9);
            this.snout.setPivot(0.0F, 0.7F, -10.3F);
            this.snout.addCuboid(-3.0F, -2.0F, -5.0F, 6, 5, 5, 0.0F);
            this.setRotateAngle(snout, -0.06981317007977318F, 0.0F, 0.0F);
            this.nose = new ModelPart(this, 102, 1);
            this.nose.setPivot(0.0F, -2.8F, -0.2F);
            this.nose.addCuboid(-2.5F, 0.0F, -5.0F, 5, 2, 5, 0.0F);
            this.setRotateAngle(nose, 0.10471975511965977F, 0.0F, 0.0F);
            this.Foot1 = new ModelPart(this, 56, 77);
            this.Foot1.setPivot(0.01F, 9.0F, -2.5F);
            this.Foot1.addCuboid(-3.0F, -1.0F, -6.7F, 6, 3, 9, 0.0F);
            this.setRotateAngle(Foot1, 0.13962634015954636F, 0.0F, 0.0F);
            this.Leg4 = new ModelPart(this, 32, 93);
            this.Leg4.mirror = true;
            this.Leg4.setPivot(0.0F, 12.0F, -3.5F);
            this.Leg4.addCuboid(-3.0F, 0.0F, 0.0F, 6, 9, 7, 0.0F);
            this.setRotateAngle(Leg4, 0.593411945678072F, 0.0F, 0.0F);
            this.tail = new ModelPart(this, 4, 11);
            this.tail.setPivot(0.0F, 1.6F, 11.5F);
            this.tail.addCuboid(-2.0F, 0.0F, -1.5F, 4, 3, 3, 0.0F);
            this.setRotateAngle(tail, 0.9075712110370513F, 0.0F, 0.0F);
            this.Thigh1 = new ModelPart(this, 0, 75);
            this.Thigh1.setPivot(5.5F, -2.0F, -7.0F);
            this.Thigh1.addCuboid(-3.5F, 0.0F, -4.0F, 7, 12, 8, 0.0F);
            this.setRotateAngle(Thigh1, 0.10471975511965977F, -0.03490658503988659F, 0.0F);
            this.Leg2 = new ModelPart(this, 30, 77);
            this.Leg2.mirror = true;
            this.Leg2.setPivot(2.6F, 0.0F, 0.5F);
            this.Leg2.addCuboid(-3.0F, 0.0F, -7.0F, 6, 9, 7, 0.0F);
            this.setRotateAngle(Leg2, -0.17453292519943295F, 0.0F, 0.0F);
            this.chin = new ModelPart(this, 102, 20);
            this.chin.setPivot(0.0F, 2.4F, 0.2F);
            this.chin.addCuboid(-2.5F, 0.0F, -5.0F, 5, 2, 5, 0.0F);
            this.setRotateAngle(chin, 0.10471975511965977F, 0.0F, 0.0F);
            this.Foot4 = new ModelPart(this, 58, 89);
            this.Foot4.mirror = true;
            this.Foot4.setPivot(-0.01F, 9.0F, 3.8F);
            this.Foot4.addCuboid(-3.0F, -1.0F, -6.0F, 6, 3, 9, 0.0F);
            this.setRotateAngle(Foot4, -0.2792526803190927F, 0.0F, 0.0F);
            this.body.addChild(this.Thigh2);
            this.body.addChild(this.Thigh4);
            this.Leg2.addChild(this.Foot2);
            this.neck.addChild(this.head);
            this.Thigh3.addChild(this.Leg3);
            this.Thigh2.addChild(this.inwardLegJoint2);
            this.inwardLegJoint1.addChild(this.Leg1);
            this.head.addChild(this.leftear);
            this.back1.addChild(this.back2);
            this.head.addChild(this.rightear);
            this.neck.addChild(this.necklower);
            this.Leg3.addChild(this.Foot3);
            this.body.addChild(this.shoulders);
            this.body.addChild(this.Thigh3);
            this.shoulders.addChild(this.neck);
            this.Thigh1.addChild(this.inwardLegJoint1);
            this.body.addChild(this.butt);
            this.body.addChild(this.back1);
            this.head.addChild(this.snout);
            this.snout.addChild(this.nose);
            this.Leg1.addChild(this.Foot1);
            this.Thigh4.addChild(this.Leg4);
            this.butt.addChild(this.tail);
            this.body.addChild(this.Thigh1);
            this.inwardLegJoint2.addChild(this.Leg2);
            this.snout.addChild(this.chin);
            this.Leg4.addChild(this.Foot4);
        }
    }

    public static class ChildStanding extends CaveBearModel {
        public ChildStanding() {
            this.textureWidth = 64;
            this.textureHeight = 64;
            this.butt = new ModelPart(this, 36, 15);
            this.butt.setPivot(0.0F, -9.0F, 0.5F);
            this.butt.addCuboid(-4.0F, 0.0F, 0.0F, 8, 7, 6, 0.0F);
            this.setRotateAngle(butt, -0.6981317007977318F, 0.0F, 0.0F);
            this.Foot4 = new ModelPart(this, 28, 39);
            this.Foot4.mirror = true;
            this.Foot4.setPivot(-0.01F, 4.5F, 1.45F);
            this.Foot4.addCuboid(-1.5F, -0.3F, -2.5F, 3, 2, 4, 0.0F);
            this.setRotateAngle(Foot4, -0.3839724354387525F, 0.0F, 0.0F);
            this.Thigh3 = new ModelPart(this, 0, 40);
            this.Thigh3.setPivot(3.0F, -5.0F, 0.0F);
            this.Thigh3.addCuboid(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
            this.setRotateAngle(Thigh3, 1.1838568316277536F, 0.0F, 0.0F);
            this.neck = new ModelPart(this, 16, 22);
            this.neck.setPivot(0.0F, -5.9F, -12.2F);
            this.neck.addCuboid(-3.0F, -2.5F, -2.5F, 6, 5, 6, 0.0F);
            this.setRotateAngle(neck, 0.31869712141416456F, 0.0F, 0.0F);
            this.leftear = new ModelPart(this, 2, 0);
            this.leftear.setPivot(3.6F, -1.2F, -0.2F);
            this.leftear.addCuboid(-1.0F, -2.0F, -3.0F, 1, 2, 3, 0.0F);
            this.setRotateAngle(leftear, -0.20943951023931953F, 0.13962634015954636F, 0.20943951023931953F);
            this.body = new ModelPart(this, 0, 0);
            this.body.setPivot(0.0F, 14.4F, -3.0F);
            this.body.addCuboid(-4.5F, -9.0F, -11.5F, 9, 9, 12, 0.0F);
            this.setRotateAngle(body, -1.4114477660878142F, 0.0F, 0.0F);
            this.inwardLegJoint1 = new ModelPart(this, 0, 0);
            this.inwardLegJoint1.setPivot(3.0F, 12.0F, 3.0F);
            this.inwardLegJoint1.addCuboid(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
            this.setRotateAngle(inwardLegJoint1, 0.0F, 0.08726646259971647F, 0.0F);
            this.Leg1 = new ModelPart(this, 16, 33);
            this.Leg1.setPivot(-2.6F, -6.5F, -1.5F);
            this.Leg1.addCuboid(-1.5F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
            this.setRotateAngle(Leg1, -0.4553564018453205F, 0.0F, 0.4553564018453205F);
            this.inwardLegJoint2 = new ModelPart(this, 0, 0);
            this.inwardLegJoint2.setPivot(-3.0F, 12.0F, 3.0F);
            this.inwardLegJoint2.addCuboid(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
            this.setRotateAngle(inwardLegJoint2, 0.0F, -0.08726646259971647F, 0.0F);
            this.Thigh2 = new ModelPart(this, 0, 30);
            this.Thigh2.mirror = true;
            this.Thigh2.setPivot(-3.0F, -5.3F, -9.0F);
            this.Thigh2.addCuboid(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
            this.setRotateAngle(Thigh2, 1.0016444577195458F, -0.5009094953223726F, 0.27314402793711257F);
            this.Thigh4 = new ModelPart(this, 0, 40);
            this.Thigh4.mirror = true;
            this.Thigh4.setPivot(-3.0F, -5.0F, 0.0F);
            this.Thigh4.addCuboid(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
            this.setRotateAngle(Thigh4, 1.2292353921796064F, 0.0F, 0.0F);
            this.rightear = new ModelPart(this, 2, 0);
            this.rightear.mirror = true;
            this.rightear.setPivot(-3.6F, -1.2F, -0.2F);
            this.rightear.addCuboid(0.0F, -2.0F, -3.0F, 1, 2, 3, 0.0F);
            this.setRotateAngle(rightear, -0.20943951023931953F, -0.13962634015954636F, -0.20943951023931953F);
            this.Foot2 = new ModelPart(this, 28, 33);
            this.Foot2.mirror = true;
            this.Foot2.setPivot(-0.01F, 5.3F, -1.1F);
            this.Foot2.addCuboid(-1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F);
            this.setRotateAngle(Foot2, 0.40980330836826856F, 0.0F, 0.0F);
            this.tail = new ModelPart(this, 2, 6);
            this.tail.setPivot(0.0F, 0.6F, 5.5F);
            this.tail.addCuboid(-1.0F, 0.0F, -1.5F, 2, 2, 2, 0.0F);
            this.setRotateAngle(tail, 0.9075712110370513F, 0.0F, 0.0F);
            this.Leg3 = new ModelPart(this, 16, 41);
            this.Leg3.setPivot(0.0F, 6.0F, -2.0F);
            this.Leg3.addCuboid(-1.5F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
            this.setRotateAngle(Leg3, 0.6283185307179586F, 0.0F, 0.0F);
            this.chin = new ModelPart(this, 48, 41);
            this.chin.setPivot(0.0F, 1.1F, -0.3F);
            this.chin.addCuboid(-1.5F, 0.0F, -2.5F, 3, 1, 3, 0.0F);
            this.setRotateAngle(chin, 0.10471975511965977F, 0.0F, 0.0F);
            this.nose = new ModelPart(this, 48, 29);
            this.nose.setPivot(0.0F, -2.1F, -0.2F);
            this.nose.addCuboid(-1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F);
            this.setRotateAngle(nose, 0.10471975511965977F, 0.0F, 0.0F);
            this.Foot1 = new ModelPart(this, 28, 33);
            this.Foot1.setPivot(0.01F, 5.3F, -1.1F);
            this.Foot1.addCuboid(-1.5F, -1.3F, -3.0F, 3, 2, 4, 0.0F);
            this.setRotateAngle(Foot1, 0.40980330836826856F, 0.0F, 0.0F);
            this.Leg2 = new ModelPart(this, 16, 33);
            this.Leg2.mirror = true;
            this.Leg2.setPivot(2.6F, -6.5F, -1.5F);
            this.Leg2.addCuboid(-1.5F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
            this.setRotateAngle(Leg2, -0.4553564018453205F, 0.0F, -0.4553564018453205F);
            this.Leg4 = new ModelPart(this, 16, 41);
            this.Leg4.mirror = true;
            this.Leg4.setPivot(0.0F, 6.0F, -2.0F);
            this.Leg4.addCuboid(-1.5F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
            this.setRotateAngle(Leg4, 0.6283185307179586F, 0.0F, 0.0F);
            this.snout = new ModelPart(this, 47, 34);
            this.snout.setPivot(0.0F, 0.7F, -4.9F);
            this.snout.addCuboid(-2.0F, -1.5F, -3.0F, 4, 3, 3, 0.0F);
            this.setRotateAngle(snout, -0.05235987755982988F, 0.0F, 0.0F);
            this.Thigh1 = new ModelPart(this, 0, 30);
            this.Thigh1.setPivot(3.0F, -5.3F, -9.0F);
            this.Thigh1.addCuboid(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
            this.setRotateAngle(Thigh1, 1.0016444577195458F, 0.5009094953223726F, -0.27314402793711257F);
            this.Foot3 = new ModelPart(this, 28, 39);
            this.Foot3.setPivot(0.01F, 4.5F, 1.45F);
            this.Foot3.addCuboid(-1.5F, -0.3F, -2.5F, 3, 2, 4, 0.0F);
            this.setRotateAngle(Foot3, -0.3839724354387525F, 0.0F, 0.0F);
            this.necklower = new ModelPart(this, 0, 21);
            this.necklower.setPivot(0.0F, 5.3F, 1.0F);
            this.necklower.addCuboid(-2.5F, -5.0F, 0.0F, 5, 6, 3, 0.0F);
            this.setRotateAngle(necklower, 1.0471975511965976F, 0.0F, 0.0F);
            this.head = new ModelPart(this, 30, 0);
            this.head.setPivot(0.0F, -1.0F, -1.8F);
            this.head.addCuboid(-3.5F, -3.0F, -5.5F, 7, 6, 6, 0.0F);
            this.setRotateAngle(head, 1.0927506446736497F, 0.0F, 0.0F);
            this.body.addChild(this.butt);
            this.Leg4.addChild(this.Foot4);
            this.body.addChild(this.Thigh3);
            this.body.addChild(this.neck);
            this.head.addChild(this.leftear);
            this.Thigh1.addChild(this.inwardLegJoint1);
            this.inwardLegJoint1.addChild(this.Leg1);
            this.Thigh2.addChild(this.inwardLegJoint2);
            this.body.addChild(this.Thigh2);
            this.body.addChild(this.Thigh4);
            this.head.addChild(this.rightear);
            this.Leg2.addChild(this.Foot2);
            this.butt.addChild(this.tail);
            this.Thigh3.addChild(this.Leg3);
            this.snout.addChild(this.chin);
            this.snout.addChild(this.nose);
            this.Leg1.addChild(this.Foot1);
            this.inwardLegJoint2.addChild(this.Leg2);
            this.Thigh4.addChild(this.Leg4);
            this.head.addChild(this.snout);
            this.body.addChild(this.Thigh1);
            this.Leg3.addChild(this.Foot3);
            this.neck.addChild(this.necklower);
            this.neck.addChild(this.head);
        }

        @Override
        public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            this.body.render(f5);
        }
    }
    
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.pitch = x;
        modelRenderer.yaw = y;
        modelRenderer.roll = z;
    }
}