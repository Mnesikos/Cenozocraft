package rando.cenozocraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCaveLion extends ModelBase {
    public ModelRenderer shoulders;
    public ModelRenderer neck;
    public ModelRenderer body;
    public ModelRenderer leftupperarm;
    public ModelRenderer rightupperarm;
    public ModelRenderer chestlower;
    public ModelRenderer head;
    public ModelRenderer necklower;
    public ModelRenderer snout;
    public ModelRenderer leftear;
    public ModelRenderer rightear;
    public ModelRenderer nose;
    public ModelRenderer cheek1;
    public ModelRenderer cheek2;
    public ModelRenderer chin;
    public ModelRenderer butt;
    public ModelRenderer bellylower2;
    public ModelRenderer leftupperthigh;
    public ModelRenderer rightupperthigh;
    public ModelRenderer tail1;
    public ModelRenderer leftthigh;
    public ModelRenderer leftleg;
    public ModelRenderer leftfoot;
    public ModelRenderer lefttoes2;
    public ModelRenderer rightthigh;
    public ModelRenderer rightleg;
    public ModelRenderer rightfoot;
    public ModelRenderer righttoes2;
    public ModelRenderer tail2;
    public ModelRenderer tail3;
    public ModelRenderer tail4;
    public ModelRenderer leftforearm;
    public ModelRenderer leftforearm2;
    public ModelRenderer leftpaw;
    public ModelRenderer lefttoes;
    public ModelRenderer rightforearm;
    public ModelRenderer rightforearm2;
    public ModelRenderer rightpaw;
    public ModelRenderer righttoes;
    public ModelRenderer bellylower;

    public ModelCaveLion() {
        this.textureWidth = 128;
        this.textureHeight = 96;
        this.tail2 = new ModelRenderer(this, 111, 48);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail2.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(tail2, -0.13962634015954636F, 0.0F, 0.0F);
        this.rightpaw = new ModelRenderer(this, 74, 58);
        this.rightpaw.mirror = true;
        this.rightpaw.setRotationPoint(-0.01F, 4.6F, -2.3F);
        this.rightpaw.addBox(-2.0F, -1.3F, -4.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(rightpaw, 0.03490658503988659F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 80, 24);
        this.head.setRotationPoint(0.0F, 2.5F, -5.0F);
        this.head.addBox(-4.0F, -3.5F, -7.0F, 8, 7, 7, 0.0F);
        this.setRotateAngle(head, 0.6457718232379019F, 0.0F, 0.0F);
        this.rightear = new ModelRenderer(this, 29, 0);
        this.rightear.mirror = true;
        this.rightear.setRotationPoint(-2.7F, -2.0F, -2.5F);
        this.rightear.addBox(-1.5F, -3.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(rightear, 0.0F, 0.06981317007977318F, -0.20943951023931953F);
        this.cheek2 = new ModelRenderer(this, 64, 2);
        this.cheek2.mirror = true;
        this.cheek2.setRotationPoint(0.0F, 4.0F, -3.0F);
        this.cheek2.addBox(-3.0F, -4.0F, -3.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(cheek2, 0.0F, 0.0F, -0.017453292519943295F);
        this.cheek1 = new ModelRenderer(this, 64, 2);
        this.cheek1.setRotationPoint(0.0F, 4.0F, -3.0F);
        this.cheek1.addBox(0.0F, -4.0F, -3.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(cheek1, 0.0F, 0.0F, 0.017453292519943295F);
        this.chin = new ModelRenderer(this, 17, 26);
        this.chin.setRotationPoint(0.0F, 3.3F, -0.8F);
        this.chin.addBox(-2.0F, 0.0F, -5.0F, 4, 2, 5, 0.0F);
        this.setRotateAngle(chin, 0.13962634015954636F, 0.0F, 0.0F);
        this.snout = new ModelRenderer(this, 105, 19);
        this.snout.setRotationPoint(0.0F, -1.9F, -5.5F);
        this.snout.addBox(-2.5F, 0.0F, -5.99F, 5, 4, 5, 0.0F);
        this.setRotateAngle(snout, 0.20943951023931953F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 68, 44);
        this.rightleg.mirror = true;
        this.rightleg.setRotationPoint(0.01F, 7.0F, 4.8F);
        this.rightleg.addBox(-2.0F, 0.0F, -4.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(rightleg, -0.6283185307179586F, 0.0F, 0.0F);
        this.chestlower = new ModelRenderer(this, 42, 24);
        this.chestlower.setRotationPoint(0.0F, 4.0F, -4.3F);
        this.chestlower.addBox(-4.5F, -1.0F, 0.0F, 9, 1, 10, 0.0F);
        this.setRotateAngle(chestlower, -0.2792526803190927F, 0.0F, 0.0F);
        this.righttoes = new ModelRenderer(this, 70, 24);
        this.righttoes.mirror = true;
        this.righttoes.setRotationPoint(0.0F, -1.5F, -2.4F);
        this.righttoes.addBox(-1.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F);
        this.leftforearm2 = new ModelRenderer(this, 92, 54);
        this.leftforearm2.setRotationPoint(-0.01F, 5.0F, -0.5F);
        this.leftforearm2.addBox(-2.0F, 0.0F, -5.0F, 4, 5, 5, 0.0F);
        this.leftforearm = new ModelRenderer(this, 62, 54);
        this.leftforearm.setRotationPoint(0.0F, 8.0F, 3.0F);
        this.leftforearm.addBox(-2.0F, 0.0F, -5.5F, 4, 5, 5, 0.0F);
        this.setRotateAngle(leftforearm, -0.17453292519943295F, 0.0F, 0.0F);
        this.bellylower = new ModelRenderer(this, 56, 67);
        this.bellylower.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.bellylower.addBox(-4.5F, -1.0F, 0.0F, 9, 1, 8, 0.0F);
        this.setRotateAngle(bellylower, 0.28797932657906433F, 0.0F, 0.0F);
        this.tail3 = new ModelRenderer(this, 0, 53);
        this.tail3.setRotationPoint(0.0F, 2.0F, 6.0F);
        this.tail3.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(tail3, 0.2792526803190927F, 0.0F, 0.0F);
        this.tail4 = new ModelRenderer(this, 16, 53);
        this.tail4.setRotationPoint(0.0F, -1.0F, 1.5F);
        this.tail4.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F);
        this.leftupperthigh = new ModelRenderer(this, 46, 35);
        this.leftupperthigh.setRotationPoint(3.3F, 2.7F, 6.0F);
        this.leftupperthigh.addBox(-2.5F, 0.0F, -3.0F, 5, 8, 6, 0.0F);
        this.setRotateAngle(leftupperthigh, 0.06981317007977318F, 0.0F, -0.017453292519943295F);
        this.rightfoot = new ModelRenderer(this, 79, 50);
        this.rightfoot.mirror = true;
        this.rightfoot.setRotationPoint(-0.01F, 6.0F, -2.3F);
        this.rightfoot.addBox(-2.0F, -1.3F, -3.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(rightfoot, 0.13962634015954636F, 0.0F, 0.0F);
        this.bellylower2 = new ModelRenderer(this, 28, 35);
        this.bellylower2.setRotationPoint(0.0F, 11.0F, 13.0F);
        this.bellylower2.addBox(-4.0F, -1.0F, 0.0F, 8, 1, 4, 0.0F);
        this.setRotateAngle(bellylower2, 0.13962634015954636F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 36, 0);
        this.neck.setRotationPoint(0.0F, -5.5F, 0.0F);
        this.neck.addBox(-3.5F, 0.0F, -7.0F, 7, 7, 7, 0.0F);
        this.setRotateAngle(neck, -0.6981317007977318F, 0.0F, 0.0F);
        this.rightforearm2 = new ModelRenderer(this, 92, 54);
        this.rightforearm2.mirror = true;
        this.rightforearm2.setRotationPoint(-0.01F, 5.0F, -0.5F);
        this.rightforearm2.addBox(-2.0F, 0.0F, -5.0F, 4, 5, 5, 0.0F);
        this.nose = new ModelRenderer(this, 46, 14);
        this.nose.setRotationPoint(0.0F, -1.0F, -1.2F);
        this.nose.addBox(-2.0F, 0.0F, -5.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(nose, 0.10471975511965977F, 0.0F, 0.0F);
        this.butt = new ModelRenderer(this, 0, 33);
        this.butt.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.butt.addBox(-4.5F, 0.0F, 0.0F, 9, 10, 10, 0.0F);
        this.setRotateAngle(butt, -0.10471975511965977F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 68, 44);
        this.leftleg.setRotationPoint(-0.01F, 7.0F, 4.8F);
        this.leftleg.addBox(-2.0F, 0.0F, -4.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(leftleg, -0.6283185307179586F, 0.0F, 0.0F);
        this.lefttoes2 = new ModelRenderer(this, 70, 24);
        this.lefttoes2.setRotationPoint(0.0F, -1.5F, -1.4F);
        this.lefttoes2.addBox(-1.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F);
        this.body = new ModelRenderer(this, 64, 0);
        this.body.setRotationPoint(0.0F, -5.5F, 2.5F);
        this.body.addBox(-5.0F, 0.0F, 0.0F, 10, 11, 13, 0.0F);
        this.setRotateAngle(body, -0.10471975511965977F, 0.0F, 0.0F);
        this.necklower = new ModelRenderer(this, 97, 0);
        this.necklower.setRotationPoint(0.0F, 8.0F, -7.0F);
        this.necklower.addBox(-3.0F, -2.0F, 0.0F, 6, 2, 9, 0.0F);
        this.setRotateAngle(necklower, -0.13962634015954636F, 0.0F, 0.0F);
        this.leftear = new ModelRenderer(this, 29, 0);
        this.leftear.setRotationPoint(2.7F, -2.0F, -2.5F);
        this.leftear.addBox(-1.5F, -3.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(leftear, 0.0F, -0.06981317007977318F, 0.20943951023931953F);
        this.shoulders = new ModelRenderer(this, 0, 0);
        this.shoulders.setRotationPoint(0.0F, 6.8F, -7.0F);
        this.shoulders.addBox(-5.5F, -5.5F, -4.5F, 11, 10, 7, 0.0F);
        this.setRotateAngle(shoulders, 0.06981317007977318F, 0.0F, 0.0F);
        this.leftpaw = new ModelRenderer(this, 74, 58);
        this.leftpaw.setRotationPoint(0.01F, 4.6F, -2.3F);
        this.leftpaw.addBox(-2.0F, -1.3F, -4.0F, 4, 3, 6, 0.0F);
        this.setRotateAngle(leftpaw, 0.03490658503988659F, 0.0F, 0.0F);
        this.rightforearm = new ModelRenderer(this, 62, 54);
        this.rightforearm.mirror = true;
        this.rightforearm.setRotationPoint(0.0F, 8.0F, 3.0F);
        this.rightforearm.addBox(-2.0F, 0.0F, -5.5F, 4, 5, 5, 0.0F);
        this.setRotateAngle(rightforearm, -0.17453292519943295F, 0.0F, 0.0F);
        this.rightupperthigh = new ModelRenderer(this, 46, 35);
        this.rightupperthigh.mirror = true;
        this.rightupperthigh.setRotationPoint(-3.3F, 2.7F, 6.0F);
        this.rightupperthigh.addBox(-2.5F, 0.0F, -3.0F, 5, 8, 6, 0.0F);
        this.setRotateAngle(rightupperthigh, 0.06981317007977318F, 0.0F, 0.017453292519943295F);
        this.leftfoot = new ModelRenderer(this, 79, 50);
        this.leftfoot.setRotationPoint(0.01F, 6.0F, -2.3F);
        this.leftfoot.addBox(-2.0F, -1.3F, -3.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(leftfoot, 0.13962634015954636F, 0.0F, 0.0F);
        this.righttoes2 = new ModelRenderer(this, 70, 24);
        this.righttoes2.mirror = true;
        this.righttoes2.setRotationPoint(0.0F, -1.5F, -1.4F);
        this.righttoes2.addBox(-1.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F);
        this.rightthigh = new ModelRenderer(this, 86, 38);
        this.rightthigh.mirror = true;
        this.rightthigh.setRotationPoint(0.0F, 8.0F, -3.0F);
        this.rightthigh.addBox(-2.0F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(rightthigh, 0.5585053606381855F, 0.0F, 0.0F);
        this.leftupperarm = new ModelRenderer(this, 0, 17);
        this.leftupperarm.setRotationPoint(3.6F, -1.5F, -0.5F);
        this.leftupperarm.addBox(-2.5F, 0.0F, -3.0F, 5, 8, 6, 0.0F);
        this.setRotateAngle(leftupperarm, 0.06981317007977318F, -0.017453292519943295F, 0.0F);
        this.rightupperarm = new ModelRenderer(this, 0, 17);
        this.rightupperarm.mirror = true;
        this.rightupperarm.setRotationPoint(-3.6F, -1.5F, -0.5F);
        this.rightupperarm.addBox(-2.5F, 0.0F, -3.0F, 5, 8, 6, 0.0F);
        this.setRotateAngle(rightupperarm, 0.06981317007977318F, 0.017453292519943295F, 0.0F);
        this.tail1 = new ModelRenderer(this, 68, 35);
        this.tail1.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail1.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(tail1, -1.2217304763960306F, 0.0F, 0.0F);
        this.lefttoes = new ModelRenderer(this, 70, 24);
        this.lefttoes.setRotationPoint(0.0F, -1.5F, -2.4F);
        this.lefttoes.addBox(-1.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F);
        this.leftthigh = new ModelRenderer(this, 86, 38);
        this.leftthigh.setRotationPoint(0.0F, 8.0F, -3.0F);
        this.leftthigh.addBox(-2.0F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(leftthigh, 0.5585053606381855F, 0.0F, 0.0F);
        this.tail1.addChild(this.tail2);
        this.rightforearm2.addChild(this.rightpaw);
        this.neck.addChild(this.head);
        this.head.addChild(this.rightear);
        this.snout.addChild(this.cheek2);
        this.snout.addChild(this.cheek1);
        this.snout.addChild(this.chin);
        this.head.addChild(this.snout);
        this.rightthigh.addChild(this.rightleg);
        this.shoulders.addChild(this.chestlower);
        this.rightpaw.addChild(this.righttoes);
        this.leftforearm.addChild(this.leftforearm2);
        this.leftupperarm.addChild(this.leftforearm);
        this.chestlower.addChild(this.bellylower);
        this.tail2.addChild(this.tail3);
        this.tail3.addChild(this.tail4);
        this.butt.addChild(this.leftupperthigh);
        this.rightleg.addChild(this.rightfoot);
        this.body.addChild(this.bellylower2);
        this.shoulders.addChild(this.neck);
        this.rightforearm.addChild(this.rightforearm2);
        this.snout.addChild(this.nose);
        this.body.addChild(this.butt);
        this.leftthigh.addChild(this.leftleg);
        this.leftfoot.addChild(this.lefttoes2);
        this.shoulders.addChild(this.body);
        this.neck.addChild(this.necklower);
        this.head.addChild(this.leftear);
        this.leftforearm2.addChild(this.leftpaw);
        this.rightupperarm.addChild(this.rightforearm);
        this.butt.addChild(this.rightupperthigh);
        this.leftleg.addChild(this.leftfoot);
        this.rightfoot.addChild(this.righttoes2);
        this.rightupperthigh.addChild(this.rightthigh);
        this.shoulders.addChild(this.leftupperarm);
        this.shoulders.addChild(this.rightupperarm);
        this.butt.addChild(this.tail1);
        this.leftpaw.addChild(this.lefttoes);
        this.leftupperthigh.addChild(this.leftthigh);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shoulders.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

