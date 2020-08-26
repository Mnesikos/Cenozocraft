package rando.cenozocraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import rando.cenozocraft.common.util.CenozocraftUtils;

public abstract class ModelDireWolf extends ModelBase {
    public ModelRenderer shoulders;
    public ModelRenderer neck;
    public ModelRenderer body;
    public ModelRenderer leftupperarm;
    public ModelRenderer rightupperarm;
    public ModelRenderer head;
    public ModelRenderer necklower;
    public ModelRenderer snout;
    public ModelRenderer leftear;
    public ModelRenderer rightear;
    public ModelRenderer nose;
    public ModelRenderer chin;
    public ModelRenderer butt;
    public ModelRenderer tail1;
    public ModelRenderer leftupperthigh;
    public ModelRenderer rightupperthigh;
    public ModelRenderer tail2;
    public ModelRenderer tail3;
    public ModelRenderer leftthigh;
    public ModelRenderer leftleg;
    public ModelRenderer leftfoot;
    public ModelRenderer rightthigh;
    public ModelRenderer rightleg;
    public ModelRenderer rightfoot;
    public ModelRenderer leftforearm;
    public ModelRenderer leftforearm2;
    public ModelRenderer leftpaw;
    public ModelRenderer rightforearm;
    public ModelRenderer rightforearm2;
    public ModelRenderer rightpaw;

    public static class Adult extends ModelDireWolf {
        public ModelRenderer chestlower;
        public ModelRenderer neckleft;
        public ModelRenderer neckright;
        public ModelRenderer necklower2;
        public ModelRenderer necklower3;
        public ModelRenderer bellylower2;
        public ModelRenderer lefttoes2;
        public ModelRenderer righttoes2;
        public ModelRenderer tail4;
        public ModelRenderer lefttoes;
        public ModelRenderer righttoes;
        public ModelRenderer bellylower;

        public Adult() {
            this.textureWidth = 96;
            this.textureHeight = 96;
            this.necklower3 = new ModelRenderer(this, 0, 38);
            this.necklower3.setRotationPoint(0.0F, 0.0F, 4.0F);
            this.necklower3.addBox(-2.0F, -2.0F, 0.0F, 4, 2, 3, 0.0F);
            this.setRotateAngle(necklower3, 0.2792526803190927F, 0.0F, 0.0F);
            this.snout = new ModelRenderer(this, 23, 24);
            this.snout.setRotationPoint(0.0F, -0.9F, -6.5F);
            this.snout.addBox(-2.0F, 0.0F, -5.0F, 4, 3, 5, 0.0F);
            this.setRotateAngle(snout, 0.06981317007977318F, 0.0F, 0.0F);
            this.leftthigh = new ModelRenderer(this, 80, 48);
            this.leftthigh.setRotationPoint(0.0F, 8.5F, -2.9F);
            this.leftthigh.addBox(-1.5F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
            this.setRotateAngle(leftthigh, 0.7853981633974483F, 0.0F, 0.0F);
            this.rightupperarm = new ModelRenderer(this, 25, 49);
            this.rightupperarm.mirror = true;
            this.rightupperarm.setRotationPoint(-3.2F, -2.5F, 0.7F);
            this.rightupperarm.addBox(-2.0F, 0.0F, -2.5F, 4, 8, 5, 0.0F);
            this.setRotateAngle(rightupperarm, 0.06981317007977318F, 0.017453292519943295F, 0.0F);
            this.neck = new ModelRenderer(this, 32, 0);
            this.neck.setRotationPoint(0.0F, -5.0F, 0.0F);
            this.neck.addBox(-3.0F, 0.0F, -7.0F, 6, 6, 7, 0.0F);
            this.setRotateAngle(neck, -0.5585053606381855F, 0.0F, 0.0F);
            this.necklower = new ModelRenderer(this, 0, 29);
            this.necklower.setRotationPoint(0.0F, 7.3F, -8.7F);
            this.necklower.addBox(-3.0F, -2.0F, 0.0F, 6, 2, 7, 0.0F);
            this.setRotateAngle(necklower, -0.3490658503988659F, 0.0F, 0.0F);
            this.butt = new ModelRenderer(this, 34, 34);
            this.butt.setRotationPoint(0.0F, 0.0F, 11.0F);
            this.butt.addBox(-4.0F, 0.0F, 0.0F, 8, 8, 7, 0.0F);
            this.setRotateAngle(butt, -0.20943951023931953F, 0.0F, 0.0F);
            this.tail2 = new ModelRenderer(this, 6, 70);
            this.tail2.setRotationPoint(0.0F, -1.0F, 4.0F);
            this.tail2.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 9, 0.0F);
            this.setRotateAngle(tail2, -0.3141592653589793F, 0.0F, 0.0F);
            this.rightleg = new ModelRenderer(this, 68, 52);
            this.rightleg.mirror = true;
            this.rightleg.setRotationPoint(0.01F, 7.0F, 4.0F);
            this.rightleg.addBox(-1.5F, 0.0F, -3.0F, 3, 7, 3, 0.0F);
            this.setRotateAngle(rightleg, -0.8377580409572781F, 0.0F, 0.0F);
            this.leftear = new ModelRenderer(this, 27, 0);
            this.leftear.setRotationPoint(2.3F, -2.0F, -2.5F);
            this.leftear.addBox(-1.5F, -3.0F, -1.0F, 3, 4, 2, 0.0F);
            this.setRotateAngle(leftear, 0.0F, -0.06981317007977318F, 0.13962634015954636F);
            this.leftupperthigh = new ModelRenderer(this, 64, 37);
            this.leftupperthigh.setRotationPoint(3.0F, 2.1F, 2.5F);
            this.leftupperthigh.addBox(-2.0F, 0.0F, -3.0F, 4, 9, 6, 0.0F);
            this.setRotateAngle(leftupperthigh, 0.13962634015954636F, 0.0F, -0.017453292519943295F);
            this.rightthigh = new ModelRenderer(this, 80, 48);
            this.rightthigh.mirror = true;
            this.rightthigh.setRotationPoint(0.0F, 8.5F, -2.9F);
            this.rightthigh.addBox(-1.5F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
            this.setRotateAngle(rightthigh, 0.7853981633974483F, 0.0F, 0.0F);
            this.rightear = new ModelRenderer(this, 27, 0);
            this.rightear.mirror = true;
            this.rightear.setRotationPoint(-2.3F, -2.0F, -2.5F);
            this.rightear.addBox(-1.5F, -3.0F, -1.0F, 3, 4, 2, 0.0F);
            this.setRotateAngle(rightear, 0.0F, 0.06981317007977318F, -0.13962634015954636F);
            this.leftfoot = new ModelRenderer(this, 54, 59);
            this.leftfoot.setRotationPoint(0.01F, 6.0F, -1.5F);
            this.leftfoot.addBox(-1.5F, -0.5F, -3.0F, 3, 2, 4, 0.0F);
            this.setRotateAngle(leftfoot, 0.12217304763960307F, 0.0F, 0.0F);
            this.rightupperthigh = new ModelRenderer(this, 64, 37);
            this.rightupperthigh.mirror = true;
            this.rightupperthigh.setRotationPoint(-3.0F, 2.1F, 2.5F);
            this.rightupperthigh.addBox(-2.0F, 0.0F, -3.0F, 4, 9, 6, 0.0F);
            this.setRotateAngle(rightupperthigh, 0.13962634015954636F, 0.0F, 0.017453292519943295F);
            this.leftforearm2 = new ModelRenderer(this, 27, 62);
            this.leftforearm2.setRotationPoint(-0.01F, 5.0F, -0.5F);
            this.leftforearm2.addBox(-1.5F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
            this.bellylower = new ModelRenderer(this, 67, 22);
            this.bellylower.setRotationPoint(0.0F, 0.0F, 9.0F);
            this.bellylower.addBox(-4.0F, -2.0F, 0.0F, 8, 2, 5, 0.0F);
            this.setRotateAngle(bellylower, 0.3665191429188092F, 0.0F, 0.0F);
            this.chestlower = new ModelRenderer(this, 41, 22);
            this.chestlower.setRotationPoint(0.0F, 4.3F, -0.5F);
            this.chestlower.addBox(-4.0F, -2.0F, 0.0F, 8, 2, 9, 0.0F);
            this.setRotateAngle(chestlower, -0.12217304763960307F, 0.0F, 0.0F);
            this.righttoes2 = new ModelRenderer(this, 57, 55);
            this.righttoes2.mirror = true;
            this.righttoes2.setRotationPoint(0.0F, -0.7F, -1.4F);
            this.righttoes2.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
            this.rightforearm = new ModelRenderer(this, 39, 58);
            this.rightforearm.mirror = true;
            this.rightforearm.setRotationPoint(0.0F, 7.5F, 2.0F);
            this.rightforearm.addBox(-1.5F, 0.0F, -4.0F, 3, 5, 4, 0.0F);
            this.setRotateAngle(rightforearm, -0.17453292519943295F, 0.0F, 0.0F);
            this.body = new ModelRenderer(this, 53, 2);
            this.body.setRotationPoint(0.0F, -5.5F, 3.5F);
            this.body.addBox(-4.5F, 0.0F, 0.0F, 9, 9, 11, 0.0F);
            this.setRotateAngle(body, -0.06981317007977318F, 0.0F, 0.0F);
            this.neckright = new ModelRenderer(this, 5, 38);
            this.neckright.mirror = true;
            this.neckright.setRotationPoint(-3.0F, 4.4F, -8.0F);
            this.neckright.addBox(-1.0F, -4.0F, 0.0F, 2, 7, 9, 0.0F);
            this.setRotateAngle(neckright, -0.06981317007977318F, 0.05235987755982988F, 0.0F);
            this.neckleft = new ModelRenderer(this, 5, 38);
            this.neckleft.setRotationPoint(3.0F, 4.4F, -8.0F);
            this.neckleft.addBox(-1.0F, -4.0F, 0.0F, 2, 7, 9, 0.0F);
            this.setRotateAngle(neckleft, -0.06981317007977318F, -0.05235987755982988F, 0.0F);
            this.chin = new ModelRenderer(this, 24, 16);
            this.chin.setRotationPoint(0.0F, 3.0F, 0.3F);
            this.chin.addBox(-1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F);
            this.leftforearm = new ModelRenderer(this, 39, 58);
            this.leftforearm.setRotationPoint(0.0F, 7.5F, 2.0F);
            this.leftforearm.addBox(-1.5F, 0.0F, -4.0F, 3, 5, 4, 0.0F);
            this.setRotateAngle(leftforearm, -0.17453292519943295F, 0.0F, 0.0F);
            this.head = new ModelRenderer(this, 0, 16);
            this.head.setRotationPoint(0.0F, 2.0F, -5.5F);
            this.head.addBox(-3.5F, -3.0F, -7.0F, 7, 6, 7, 0.0F);
            this.setRotateAngle(head, 0.5235987755982988F, 0.0F, 0.0F);
            this.righttoes = new ModelRenderer(this, 57, 55);
            this.righttoes.mirror = true;
            this.righttoes.setRotationPoint(0.0F, -1.5F, -1.9F);
            this.righttoes.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
            this.leftleg = new ModelRenderer(this, 68, 52);
            this.leftleg.setRotationPoint(-0.01F, 7.0F, 4.0F);
            this.leftleg.addBox(-1.5F, 0.0F, -3.0F, 3, 7, 3, 0.0F);
            this.setRotateAngle(leftleg, -0.8377580409572781F, 0.0F, 0.0F);
            this.rightfoot = new ModelRenderer(this, 54, 59);
            this.rightfoot.mirror = true;
            this.rightfoot.setRotationPoint(-0.01F, 6.0F, -1.5F);
            this.rightfoot.addBox(-1.5F, -0.5F, -3.0F, 3, 2, 4, 0.0F);
            this.setRotateAngle(rightfoot, 0.12217304763960307F, 0.0F, 0.0F);
            this.bellylower2 = new ModelRenderer(this, 74, 30);
            this.bellylower2.setRotationPoint(0.0F, 9.0F, 11.0F);
            this.bellylower2.addBox(-3.5F, -1.0F, 0.0F, 7, 1, 4, 0.0F);
            this.setRotateAngle(bellylower2, 0.13962634015954636F, 0.0F, 0.0F);
            this.tail4 = new ModelRenderer(this, 37, 73);
            this.tail4.setRotationPoint(0.0F, -0.5F, 2.7F);
            this.tail4.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(tail4, 0.20943951023931953F, 0.0F, 0.0F);
            this.nose = new ModelRenderer(this, 37, 13);
            this.nose.setRotationPoint(0.0F, -0.6F, 0.9F);
            this.nose.addBox(-1.5F, 0.0F, -6.0F, 3, 1, 5, 0.0F);
            this.setRotateAngle(nose, 0.06981317007977318F, 0.0F, 0.0F);
            this.lefttoes = new ModelRenderer(this, 57, 55);
            this.lefttoes.setRotationPoint(0.0F, -1.5F, -1.9F);
            this.lefttoes.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
            this.necklower2 = new ModelRenderer(this, 22, 34);
            this.necklower2.setRotationPoint(0.0F, 0.0F, 7.0F);
            this.necklower2.addBox(-2.5F, -3.0F, 0.0F, 5, 3, 4, 0.0F);
            this.setRotateAngle(necklower2, 0.41887902047863906F, 0.0F, 0.0F);
            this.rightforearm2 = new ModelRenderer(this, 27, 62);
            this.rightforearm2.mirror = true;
            this.rightforearm2.setRotationPoint(-0.01F, 5.0F, -0.5F);
            this.rightforearm2.addBox(-1.5F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
            this.shoulders = new ModelRenderer(this, 0, 0);
            this.shoulders.setRotationPoint(0.0F, 10.5F, -8.0F);
            this.shoulders.addBox(-4.5F, -5.5F, -3.5F, 9, 9, 7, 0.0F);
            this.setRotateAngle(shoulders, 0.06981317007977318F, 0.0F, 0.0F);
            this.tail1 = new ModelRenderer(this, 0, 70);
            this.tail1.setRotationPoint(0.0F, 1.0F, 6.0F);
            this.tail1.addBox(-1.5F, -1.0F, 0.0F, 3, 4, 4, 0.0F);
            this.setRotateAngle(tail1, -0.8196066167365371F, 0.0F, 0.0F);
            this.leftupperarm = new ModelRenderer(this, 25, 49);
            this.leftupperarm.setRotationPoint(3.2F, -2.5F, 0.7F);
            this.leftupperarm.addBox(-2.0F, 0.0F, -2.5F, 4, 8, 5, 0.0F);
            this.setRotateAngle(leftupperarm, 0.06981317007977318F, -0.017453292519943295F, 0.0F);
            this.leftpaw = new ModelRenderer(this, 54, 59);
            this.leftpaw.setRotationPoint(0.01F, 4.8F, -1.0F);
            this.leftpaw.addBox(-1.5F, -1.3F, -3.5F, 3, 2, 4, 0.0F);
            this.setRotateAngle(leftpaw, 0.03490658503988659F, 0.0F, 0.0F);
            this.lefttoes2 = new ModelRenderer(this, 57, 55);
            this.lefttoes2.setRotationPoint(0.0F, -0.7F, -1.4F);
            this.lefttoes2.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
            this.tail3 = new ModelRenderer(this, 24, 72);
            this.tail3.setRotationPoint(0.0F, 3.5F, 9.0F);
            this.tail3.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 3, 0.0F);
            this.setRotateAngle(tail3, 0.2792526803190927F, 0.0F, 0.0F);
            this.rightpaw = new ModelRenderer(this, 54, 59);
            this.rightpaw.mirror = true;
            this.rightpaw.setRotationPoint(-0.01F, 4.8F, -1.0F);
            this.rightpaw.addBox(-1.5F, -1.3F, -3.5F, 3, 2, 4, 0.0F);
            this.setRotateAngle(rightpaw, 0.03490658503988659F, 0.0F, 0.0F);
            this.necklower2.addChild(this.necklower3);
            this.head.addChild(this.snout);
            this.leftupperthigh.addChild(this.leftthigh);
            this.shoulders.addChild(this.rightupperarm);
            this.shoulders.addChild(this.neck);
            this.neck.addChild(this.necklower);
            this.body.addChild(this.butt);
            this.tail1.addChild(this.tail2);
            this.rightthigh.addChild(this.rightleg);
            this.head.addChild(this.leftear);
            this.butt.addChild(this.leftupperthigh);
            this.rightupperthigh.addChild(this.rightthigh);
            this.head.addChild(this.rightear);
            this.leftleg.addChild(this.leftfoot);
            this.butt.addChild(this.rightupperthigh);
            this.leftforearm.addChild(this.leftforearm2);
            this.chestlower.addChild(this.bellylower);
            this.shoulders.addChild(this.chestlower);
            this.rightfoot.addChild(this.righttoes2);
            this.rightupperarm.addChild(this.rightforearm);
            this.shoulders.addChild(this.body);
            this.neck.addChild(this.neckright);
            this.neck.addChild(this.neckleft);
            this.snout.addChild(this.chin);
            this.leftupperarm.addChild(this.leftforearm);
            this.neck.addChild(this.head);
            this.rightpaw.addChild(this.righttoes);
            this.leftthigh.addChild(this.leftleg);
            this.rightleg.addChild(this.rightfoot);
            this.body.addChild(this.bellylower2);
            this.tail3.addChild(this.tail4);
            this.snout.addChild(this.nose);
            this.leftpaw.addChild(this.lefttoes);
            this.necklower.addChild(this.necklower2);
            this.rightforearm.addChild(this.rightforearm2);
            this.butt.addChild(this.tail1);
            this.shoulders.addChild(this.leftupperarm);
            this.leftforearm2.addChild(this.leftpaw);
            this.leftfoot.addChild(this.lefttoes2);
            this.tail2.addChild(this.tail3);
            this.rightforearm2.addChild(this.rightpaw);
        }

        @Override
        public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            CenozocraftUtils.simpleRender(shoulders, f5, 0.9);
        }
    }

    public static class Child extends ModelDireWolf {
        public Child() {
            this.textureWidth = 96;
            this.textureHeight = 96;
            this.leftear = new ModelRenderer(this, 27, 0);
            this.leftear.setRotationPoint(1.8F, -2.2F, -2.5F);
            this.leftear.addBox(-1.0F, -2.0F, -0.5F, 2, 3, 1, 0.0F);
            this.setRotateAngle(leftear, 0.0F, -0.06981317007977318F, 0.13962634015954636F);
            this.neck = new ModelRenderer(this, 32, 0);
            this.neck.setRotationPoint(0.0F, -3.0F, 0.5F);
            this.neck.addBox(-2.0F, 0.0F, -4.0F, 4, 4, 4, 0.0F);
            this.setRotateAngle(neck, -0.5585053606381855F, 0.0F, 0.0F);
            this.leftupperthigh = new ModelRenderer(this, 64, 37);
            this.leftupperthigh.setRotationPoint(2.1F, 2.6F, 1.5F);
            this.leftupperthigh.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
            this.setRotateAngle(leftupperthigh, 0.13962634015954636F, 0.0F, -0.017453292519943295F);
            this.rightfoot = new ModelRenderer(this, 54, 59);
            this.rightfoot.mirror = true;
            this.rightfoot.setRotationPoint(-0.01F, 3.0F, -1.2F);
            this.rightfoot.addBox(-1.0F, -0.3F, -2.0F, 2, 1, 3, 0.0F);
            this.setRotateAngle(rightfoot, 0.10471975511965977F, 0.0F, 0.0F);
            this.shoulders = new ModelRenderer(this, 0, 0);
            this.shoulders.setRotationPoint(0.0F, 17.3F, -3.5F);
            this.shoulders.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
            this.setRotateAngle(shoulders, 0.06981317007977318F, 0.0F, 0.0F);
            this.leftleg = new ModelRenderer(this, 68, 52);
            this.leftleg.setRotationPoint(-0.01F, 3.0F, 2.0F);
            this.leftleg.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(leftleg, -0.7330382858376184F, 0.0F, 0.0F);
            this.tail3 = new ModelRenderer(this, 24, 72);
            this.tail3.setRotationPoint(0.0F, 2.0F, 4.0F);
            this.tail3.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(tail3, 0.2792526803190927F, 0.0F, 0.0F);
            this.nose = new ModelRenderer(this, 37, 13);
            this.nose.setRotationPoint(0.0F, -0.6F, 0.9F);
            this.nose.addBox(-1.0F, 0.0F, -4.0F, 2, 1, 4, 0.0F);
            this.setRotateAngle(nose, 0.10471975511965977F, 0.0F, 0.0F);
            this.tail2 = new ModelRenderer(this, 6, 70);
            this.tail2.setRotationPoint(0.0F, -0.5F, 2.0F);
            this.tail2.addBox(-1.01F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
            this.setRotateAngle(tail2, -0.5585053606381855F, 0.0F, 0.0F);
            this.leftforearm = new ModelRenderer(this, 39, 58);
            this.leftforearm.setRotationPoint(0.0F, 4.0F, 1.0F);
            this.leftforearm.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(leftforearm, -0.08726646259971647F, 0.0F, 0.0F);
            this.leftforearm2 = new ModelRenderer(this, 27, 62);
            this.leftforearm2.setRotationPoint(0.0F, 2.0F, 0.0F);
            this.leftforearm2.addBox(-1.01F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
            this.snout = new ModelRenderer(this, 23, 24);
            this.snout.setRotationPoint(0.0F, -0.4F, -4.5F);
            this.snout.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
            this.setRotateAngle(snout, 0.06981317007977318F, 0.0F, 0.0F);
            this.necklower = new ModelRenderer(this, 0, 29);
            this.necklower.setRotationPoint(0.0F, 5.7F, 1.0F);
            this.necklower.addBox(-1.5F, -2.0F, -5.0F, 3, 2, 5, 0.0F);
            this.setRotateAngle(necklower, -0.2792526803190927F, 0.0F, 0.0F);
            this.rightear = new ModelRenderer(this, 27, 0);
            this.rightear.mirror = true;
            this.rightear.setRotationPoint(-1.8F, -2.2F, -2.5F);
            this.rightear.addBox(-1.0F, -2.0F, -0.5F, 2, 3, 1, 0.0F);
            this.setRotateAngle(rightear, 0.0F, 0.06981317007977318F, -0.13962634015954636F);
            this.rightforearm2 = new ModelRenderer(this, 27, 62);
            this.rightforearm2.mirror = true;
            this.rightforearm2.setRotationPoint(0.0F, 2.0F, 0.0F);
            this.rightforearm2.addBox(-0.99F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
            this.rightpaw = new ModelRenderer(this, 54, 59);
            this.rightpaw.mirror = true;
            this.rightpaw.setRotationPoint(0.0F, 1.8F, -1.2F);
            this.rightpaw.addBox(-1.0F, -0.3F, -2.0F, 2, 1, 3, 0.0F);
            this.setRotateAngle(rightpaw, 0.05235987755982988F, 0.0F, 0.0F);
            this.butt = new ModelRenderer(this, 34, 34);
            this.butt.setRotationPoint(0.0F, 0.0F, 6.0F);
            this.butt.addBox(-2.5F, 0.0F, 0.0F, 5, 6, 4, 0.0F);
            this.setRotateAngle(butt, -0.20943951023931953F, 0.0F, 0.0F);
            this.body = new ModelRenderer(this, 53, 2);
            this.body.setRotationPoint(0.0F, -3.0F, 2.0F);
            this.body.addBox(-3.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
            this.setRotateAngle(body, -0.06981317007977318F, 0.0F, 0.0F);
            this.tail1 = new ModelRenderer(this, 0, 70);
            this.tail1.setRotationPoint(0.0F, 0.7F, 3.5F);
            this.tail1.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(tail1, -0.6981317007977318F, 0.0F, 0.0F);
            this.rightthigh = new ModelRenderer(this, 80, 48);
            this.rightthigh.mirror = true;
            this.rightthigh.setRotationPoint(0.0F, 4.0F, -1.3F);
            this.rightthigh.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(rightthigh, 0.6981317007977318F, 0.0F, 0.0F);
            this.rightforearm = new ModelRenderer(this, 39, 58);
            this.rightforearm.mirror = true;
            this.rightforearm.setRotationPoint(0.0F, 4.0F, 1.0F);
            this.rightforearm.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(rightforearm, -0.08726646259971647F, 0.0F, 0.0F);
            this.head = new ModelRenderer(this, 0, 16);
            this.head.setRotationPoint(0.0F, 1.8F, -2.7F);
            this.head.addBox(-2.5F, -2.5F, -5.0F, 5, 5, 5, 0.0F);
            this.setRotateAngle(head, 0.5235987755982988F, 0.0F, 0.0F);
            this.leftfoot = new ModelRenderer(this, 54, 59);
            this.leftfoot.setRotationPoint(0.01F, 3.0F, -1.2F);
            this.leftfoot.addBox(-1.0F, -0.3F, -2.0F, 2, 1, 3, 0.0F);
            this.setRotateAngle(leftfoot, 0.10471975511965977F, 0.0F, 0.0F);
            this.rightleg = new ModelRenderer(this, 68, 52);
            this.rightleg.mirror = true;
            this.rightleg.setRotationPoint(0.01F, 3.0F, 2.0F);
            this.rightleg.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(rightleg, -0.7330382858376184F, 0.0F, 0.0F);
            this.leftupperarm = new ModelRenderer(this, 25, 49);
            this.leftupperarm.setRotationPoint(2.1F, 0.0F, 0.5F);
            this.leftupperarm.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
            this.setRotateAngle(leftupperarm, -0.03490658503988659F, -0.017453292519943295F, 0.0F);
            this.rightupperarm = new ModelRenderer(this, 25, 49);
            this.rightupperarm.mirror = true;
            this.rightupperarm.setRotationPoint(-2.1F, 0.0F, 0.5F);
            this.rightupperarm.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
            this.setRotateAngle(rightupperarm, -0.03490658503988659F, -0.017453292519943295F, 0.0F);
            this.chin = new ModelRenderer(this, 24, 16);
            this.chin.setRotationPoint(0.0F, 2.0F, 0.3F);
            this.chin.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
            this.leftthigh = new ModelRenderer(this, 80, 48);
            this.leftthigh.setRotationPoint(0.0F, 4.0F, -1.3F);
            this.leftthigh.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(leftthigh, 0.6981317007977318F, 0.0F, 0.0F);
            this.leftpaw = new ModelRenderer(this, 54, 59);
            this.leftpaw.setRotationPoint(0.0F, 1.8F, -1.2F);
            this.leftpaw.addBox(-1.0F, -0.3F, -2.0F, 2, 1, 3, 0.0F);
            this.setRotateAngle(leftpaw, 0.05235987755982988F, 0.0F, 0.0F);
            this.rightupperthigh = new ModelRenderer(this, 64, 37);
            this.rightupperthigh.mirror = true;
            this.rightupperthigh.setRotationPoint(-2.1F, 2.6F, 1.5F);
            this.rightupperthigh.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
            this.setRotateAngle(rightupperthigh, 0.13962634015954636F, 0.0F, -0.017453292519943295F);
            this.head.addChild(this.leftear);
            this.shoulders.addChild(this.neck);
            this.butt.addChild(this.leftupperthigh);
            this.rightleg.addChild(this.rightfoot);
            this.leftthigh.addChild(this.leftleg);
            this.tail2.addChild(this.tail3);
            this.snout.addChild(this.nose);
            this.tail1.addChild(this.tail2);
            this.leftupperarm.addChild(this.leftforearm);
            this.leftforearm.addChild(this.leftforearm2);
            this.head.addChild(this.snout);
            this.neck.addChild(this.necklower);
            this.head.addChild(this.rightear);
            this.rightforearm.addChild(this.rightforearm2);
            this.rightforearm2.addChild(this.rightpaw);
            this.body.addChild(this.butt);
            this.shoulders.addChild(this.body);
            this.butt.addChild(this.tail1);
            this.rightupperthigh.addChild(this.rightthigh);
            this.rightupperarm.addChild(this.rightforearm);
            this.neck.addChild(this.head);
            this.leftleg.addChild(this.leftfoot);
            this.rightthigh.addChild(this.rightleg);
            this.shoulders.addChild(this.leftupperarm);
            this.shoulders.addChild(this.rightupperarm);
            this.snout.addChild(this.chin);
            this.leftupperthigh.addChild(this.leftthigh);
            this.leftforearm2.addChild(this.leftpaw);
            this.butt.addChild(this.rightupperthigh);
        }

        @Override
        public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            CenozocraftUtils.simpleRender(shoulders, f5, 0.8);
        }
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
