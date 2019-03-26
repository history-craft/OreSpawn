package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelAlien extends ModelBase
{
    private float wingspeed;
    ModelRenderer torso;
    ModelRenderer stomach;
    ModelRenderer rThigh;
    ModelRenderer lThigh;
    ModelRenderer lShin;
    ModelRenderer rShin;
    ModelRenderer lShin1;
    ModelRenderer rShin1;
    ModelRenderer lFoot;
    ModelRenderer rFoot;
    ModelRenderer neck;
    ModelRenderer fan;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer tail4;
    ModelRenderer tail5;
    ModelRenderer tail1;
    ModelRenderer fanl1;
    ModelRenderer fanr1;
    ModelRenderer fanl2;
    ModelRenderer fanr2;
    ModelRenderer fanl3;
    ModelRenderer fanr3;
    ModelRenderer fanl4;
    ModelRenderer fanr4;
    ModelRenderer fanl5;
    ModelRenderer fanr5;
    ModelRenderer fanl6;
    ModelRenderer fanr6;
    ModelRenderer spike4;
    ModelRenderer spike5;
    ModelRenderer spike3;
    ModelRenderer fanl7;
    ModelRenderer fanr7;
    ModelRenderer head;
    ModelRenderer head1;
    ModelRenderer jaw1;
    ModelRenderer head2;
    ModelRenderer jaw2;
    ModelRenderer fang1;
    ModelRenderer fang2;
    ModelRenderer fang3;
    ModelRenderer fang4;
    ModelRenderer spike2;
    ModelRenderer spike1;
    ModelRenderer arml1;
    ModelRenderer armr1;
    ModelRenderer arml2;
    ModelRenderer armr2;
    ModelRenderer clawr1;
    ModelRenderer clawr2;
    ModelRenderer clawr3;
    ModelRenderer clawl2;
    ModelRenderer clawl3;
    ModelRenderer clawl1;
    
    public ModelAlien(final float f1) {
        this.wingspeed = 1.0f;
        this.wingspeed = f1;
        this.textureWidth = 256;
        this.textureHeight = 128;
        (this.torso = new ModelRenderer((ModelBase)this, 0, 46)).addBox(-4.5f, -2.0f, 0.0f, 9, 8, 10);
        this.torso.setRotationPoint(0.0f, -2.5f, -8.0f);
        this.torso.setTextureSize(64, 32);
        this.torso.mirror = true;
        this.setRotation(this.torso, -0.1919862f, 0.0f, 0.0f);
        (this.stomach = new ModelRenderer((ModelBase)this, 0, 27)).addBox(-3.5f, -5.0f, 8.0f, 7, 6, 12);
        this.stomach.setRotationPoint(0.0f, -2.5f, -8.0f);
        this.stomach.setTextureSize(64, 32);
        this.stomach.mirror = true;
        this.setRotation(this.stomach, -0.5585054f, 0.0f, 0.0f);
        (this.rThigh = new ModelRenderer((ModelBase)this, 59, 45)).addBox(-1.5f, -4.0f, -2.5f, 4, 14, 5);
        this.rThigh.setRotationPoint(-4.5f, 7.0f, 8.0f);
        this.rThigh.setTextureSize(64, 32);
        this.rThigh.mirror = true;
        this.setRotation(this.rThigh, -0.8028515f, 0.2443461f, 0.418879f);
        (this.lThigh = new ModelRenderer((ModelBase)this, 40, 45)).addBox(-2.5f, -4.0f, -2.5f, 4, 14, 5);
        this.lThigh.setRotationPoint(4.5f, 7.0f, 8.0f);
        this.lThigh.setTextureSize(64, 32);
        this.lThigh.mirror = true;
        this.setRotation(this.lThigh, -0.8028515f, -0.2443461f, -0.418879f);
        (this.lShin = new ModelRenderer((ModelBase)this, 79, 49)).addBox(-2.0f, 8.0f, -5.5f, 3, 3, 12);
        this.lShin.setRotationPoint(4.5f, 7.0f, 8.0f);
        this.lShin.setTextureSize(64, 32);
        this.lShin.mirror = true;
        this.setRotation(this.lShin, -0.4014257f, -0.2443461f, -0.418879f);
        (this.rShin = new ModelRenderer((ModelBase)this, 79, 33)).addBox(-1.0f, 8.0f, -5.5f, 3, 3, 12);
        this.rShin.setRotationPoint(-4.5f, 7.0f, 8.0f);
        this.rShin.setTextureSize(64, 32);
        this.rShin.mirror = true;
        this.setRotation(this.rShin, -0.4014257f, 0.2443461f, 0.418879f);
        (this.lShin1 = new ModelRenderer((ModelBase)this, 113, 40)).addBox(-1.5f, 5.5f, 9.0f, 2, 9, 2);
        this.lShin1.setRotationPoint(4.5f, 7.0f, 8.0f);
        this.lShin1.setTextureSize(64, 32);
        this.lShin1.mirror = true;
        this.setRotation(this.lShin1, -0.8028515f, -0.2443461f, -0.418879f);
        (this.rShin1 = new ModelRenderer((ModelBase)this, 113, 53)).addBox(-0.5f, 5.5f, 9.0f, 2, 9, 2);
        this.rShin1.setRotationPoint(-4.5f, 7.0f, 8.0f);
        this.rShin1.setTextureSize(64, 32);
        this.rShin1.mirror = true;
        this.setRotation(this.rShin1, -0.8028515f, 0.2443461f, 0.418879f);
        (this.lFoot = new ModelRenderer((ModelBase)this, 110, 24)).addBox(5.0f, 15.0f, -8.0f, 2, 2, 6);
        this.lFoot.setRotationPoint(4.5f, 7.0f, 8.0f);
        this.lFoot.setTextureSize(64, 32);
        this.lFoot.mirror = true;
        this.setRotation(this.lFoot, 0.0f, -0.2443461f, 0.0f);
        (this.rFoot = new ModelRenderer((ModelBase)this, 95, 24)).addBox(-7.0f, 15.0f, -8.0f, 2, 2, 6);
        this.rFoot.setRotationPoint(-4.5f, 7.0f, 8.0f);
        this.rFoot.setTextureSize(64, 32);
        this.rFoot.mirror = true;
        this.setRotation(this.rFoot, 0.0f, 0.2443461f, 0.0f);
        (this.neck = new ModelRenderer((ModelBase)this, 23, 86)).addBox(-2.0f, -2.0f, -4.0f, 4, 6, 5);
        this.neck.setRotationPoint(0.0f, -2.5f, -8.0f);
        this.neck.setTextureSize(64, 32);
        this.neck.mirror = true;
        this.setRotation(this.neck, -0.1919862f, 0.0f, 0.0f);
        (this.fan = new ModelRenderer((ModelBase)this, 149, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fan.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fan.setTextureSize(64, 32);
        this.fan.mirror = true;
        this.setRotation(this.fan, 0.0f, 0.0f, 0.0f);
        (this.tail2 = new ModelRenderer((ModelBase)this, 85, 66)).addBox(-2.0f, -1.5f, 0.0f, 4, 4, 11);
        this.tail2.setRotationPoint(0.0f, 9.5f, 20.5f);
        this.tail2.setTextureSize(64, 32);
        this.tail2.mirror = true;
        this.setRotation(this.tail2, -0.3141593f, 0.0f, 0.0f);
        (this.tail3 = new ModelRenderer((ModelBase)this, 118, 66)).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 11);
        this.tail3.setRotationPoint(0.0f, 13.5f, 30.5f);
        this.tail3.setTextureSize(64, 32);
        this.tail3.mirror = true;
        this.setRotation(this.tail3, -0.2094395f, 0.0f, 0.0f);
        (this.tail4 = new ModelRenderer((ModelBase)this, 149, 66)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 11);
        this.tail4.setRotationPoint(0.0f, 15.5f, 40.5f);
        this.tail4.setTextureSize(64, 32);
        this.tail4.mirror = true;
        this.setRotation(this.tail4, -0.1396263f, 0.0f, 0.0f);
        (this.tail5 = new ModelRenderer((ModelBase)this, 178, 66)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 11);
        this.tail5.setRotationPoint(0.0f, 17.5f, 50.5f);
        this.tail5.setTextureSize(64, 32);
        this.tail5.mirror = true;
        this.setRotation(this.tail5, -0.0523599f, 0.0f, 0.0f);
        (this.tail1 = new ModelRenderer((ModelBase)this, 50, 66)).addBox(-2.0f, -2.5f, 0.0f, 4, 4, 11);
        this.tail1.setRotationPoint(0.0f, 6.5f, 10.5f);
        this.tail1.setTextureSize(64, 32);
        this.tail1.mirror = true;
        this.setRotation(this.tail1, -0.4014257f, 0.0f, 0.0f);
        (this.fanl1 = new ModelRenderer((ModelBase)this, 130, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fanl1.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fanl1.setTextureSize(64, 32);
        this.fanl1.mirror = true;
        this.setRotation(this.fanl1, 0.0f, 0.0f, 0.2617994f);
        (this.fanr1 = new ModelRenderer((ModelBase)this, 130, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fanr1.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fanr1.setTextureSize(64, 32);
        this.fanr1.mirror = true;
        this.setRotation(this.fanr1, 0.0f, 0.0f, -0.2617994f);
        (this.fanl2 = new ModelRenderer((ModelBase)this, 130, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fanl2.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fanl2.setTextureSize(64, 32);
        this.fanl2.mirror = true;
        this.setRotation(this.fanl2, 0.0f, 0.0f, 0.5235988f);
        (this.fanr2 = new ModelRenderer((ModelBase)this, 130, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fanr2.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fanr2.setTextureSize(64, 32);
        this.fanr2.mirror = true;
        this.setRotation(this.fanr2, 0.0f, 0.0f, -0.5235988f);
        (this.fanl3 = new ModelRenderer((ModelBase)this, 130, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fanl3.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fanl3.setTextureSize(64, 32);
        this.fanl3.mirror = true;
        this.setRotation(this.fanl3, 0.0f, 0.0f, 0.7853982f);
        (this.fanr3 = new ModelRenderer((ModelBase)this, 130, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fanr3.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fanr3.setTextureSize(64, 32);
        this.fanr3.mirror = true;
        this.setRotation(this.fanr3, 0.0f, 0.0f, -0.7853982f);
        (this.fanl4 = new ModelRenderer((ModelBase)this, 130, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fanl4.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fanl4.setTextureSize(64, 32);
        this.fanl4.mirror = true;
        this.setRotation(this.fanl4, 0.0f, 0.0f, 1.047198f);
        (this.fanr4 = new ModelRenderer((ModelBase)this, 130, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fanr4.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fanr4.setTextureSize(64, 32);
        this.fanr4.mirror = true;
        this.setRotation(this.fanr4, 0.0f, 0.0f, -1.047198f);
        (this.fanl5 = new ModelRenderer((ModelBase)this, 130, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fanl5.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fanl5.setTextureSize(64, 32);
        this.fanl5.mirror = true;
        this.setRotation(this.fanl5, 0.0f, 0.0f, 1.308997f);
        (this.fanr5 = new ModelRenderer((ModelBase)this, 130, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fanr5.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fanr5.setTextureSize(64, 32);
        this.fanr5.mirror = true;
        this.setRotation(this.fanr5, 0.0f, 0.0f, -1.308997f);
        (this.fanl6 = new ModelRenderer((ModelBase)this, 130, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fanl6.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fanl6.setTextureSize(64, 32);
        this.fanl6.mirror = true;
        this.setRotation(this.fanl6, 0.0f, 0.0f, 1.570796f);
        (this.fanr6 = new ModelRenderer((ModelBase)this, 130, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fanr6.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fanr6.setTextureSize(64, 32);
        this.fanr6.mirror = true;
        this.setRotation(this.fanr6, 0.0f, 0.0f, -1.570796f);
        (this.spike4 = new ModelRenderer((ModelBase)this, 178, 66)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 11);
        this.spike4.setRotationPoint(0.0f, 16.0f, 41.0f);
        this.spike4.setTextureSize(64, 32);
        this.spike4.mirror = true;
        this.setRotation(this.spike4, -0.0523599f, 0.5235988f, 0.0f);
        (this.spike5 = new ModelRenderer((ModelBase)this, 178, 66)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 11);
        this.spike5.setRotationPoint(0.0f, 16.0f, 41.0f);
        this.spike5.setTextureSize(64, 32);
        this.spike5.mirror = true;
        this.setRotation(this.spike5, -0.0523599f, -0.5759587f, 0.0f);
        (this.spike3 = new ModelRenderer((ModelBase)this, 178, 66)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 11);
        this.spike3.setRotationPoint(0.0f, 13.5f, 30.5f);
        this.spike3.setTextureSize(64, 32);
        this.spike3.mirror = true;
        this.setRotation(this.spike3, 0.3141593f, 0.0f, 0.0f);
        (this.fanl7 = new ModelRenderer((ModelBase)this, 130, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fanl7.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fanl7.setTextureSize(64, 32);
        this.fanl7.mirror = true;
        this.setRotation(this.fanl7, 0.0f, 0.0f, 1.832596f);
        (this.fanr7 = new ModelRenderer((ModelBase)this, 130, 10)).addBox(-3.0f, -24.0f, 0.0f, 6, 24, 1);
        this.fanr7.setRotationPoint(0.0f, -7.0f, -10.0f);
        this.fanr7.setTextureSize(64, 32);
        this.fanr7.mirror = true;
        this.setRotation(this.fanr7, 0.0f, 0.0f, -1.832596f);
        (this.head = new ModelRenderer((ModelBase)this, 200, 0)).addBox(-3.0f, -4.0f, -7.0f, 6, 7, 8);
        this.head.setRotationPoint(0.0f, -3.0f, -11.0f);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
        (this.head1 = new ModelRenderer((ModelBase)this, 200, 18)).addBox(-2.5f, -2.0f, -15.0f, 5, 2, 8);
        this.head1.setRotationPoint(0.0f, -3.0f, -11.0f);
        this.head1.setTextureSize(64, 32);
        this.head1.mirror = true;
        this.setRotation(this.head1, 0.0f, 0.0f, 0.0f);
        (this.jaw1 = new ModelRenderer((ModelBase)this, 200, 43)).addBox(-2.0f, -1.0f, -7.0f, 4, 2, 8);
        this.jaw1.setRotationPoint(0.0f, -2.0f, -19.0f);
        this.jaw1.setTextureSize(64, 32);
        this.jaw1.mirror = true;
        this.setRotation(this.jaw1, 0.0f, 0.0f, 0.0f);
        (this.head2 = new ModelRenderer((ModelBase)this, 200, 31)).addBox(-2.0f, -2.0f, -22.0f, 4, 2, 7);
        this.head2.setRotationPoint(0.0f, -3.0f, -11.0f);
        this.head2.setTextureSize(64, 32);
        this.head2.mirror = true;
        this.setRotation(this.head2, 0.0f, 0.0f, 0.0f);
        (this.jaw2 = new ModelRenderer((ModelBase)this, 200, 56)).addBox(-1.5f, -1.0f, -13.0f, 3, 2, 6);
        this.jaw2.setRotationPoint(0.0f, -2.0f, -19.0f);
        this.jaw2.setTextureSize(64, 32);
        this.jaw2.mirror = true;
        this.setRotation(this.jaw2, 0.0f, 0.0f, 0.0f);
        (this.fang1 = new ModelRenderer((ModelBase)this, 42, 0)).addBox(1.0f, 0.0f, -20.0f, 1, 5, 1);
        this.fang1.setRotationPoint(0.0f, -3.0f, -11.0f);
        this.fang1.setTextureSize(64, 32);
        this.fang1.mirror = true;
        this.setRotation(this.fang1, 0.0f, 0.0f, 0.0f);
        (this.fang2 = new ModelRenderer((ModelBase)this, 50, 0)).addBox(-2.0f, 0.0f, -20.0f, 1, 5, 1);
        this.fang2.setRotationPoint(0.0f, -3.0f, -11.0f);
        this.fang2.setTextureSize(64, 32);
        this.fang2.mirror = true;
        this.setRotation(this.fang2, 0.0f, 0.0f, 0.0f);
        (this.fang3 = new ModelRenderer((ModelBase)this, 60, 0)).addBox(1.0f, 0.0f, -14.0f, 1, 3, 1);
        this.fang3.setRotationPoint(0.0f, -3.0f, -11.0f);
        this.fang3.setTextureSize(64, 32);
        this.fang3.mirror = true;
        this.setRotation(this.fang3, 0.0f, 0.0f, 0.0f);
        (this.fang4 = new ModelRenderer((ModelBase)this, 69, 0)).addBox(-2.0f, 0.0f, -14.0f, 1, 3, 1);
        this.fang4.setRotationPoint(0.0f, -3.0f, -11.0f);
        this.fang4.setTextureSize(64, 32);
        this.fang4.mirror = true;
        this.setRotation(this.fang4, 0.0f, 0.0f, 0.0f);
        (this.spike2 = new ModelRenderer((ModelBase)this, 178, 66)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 11);
        this.spike2.setRotationPoint(0.0f, 9.5f, 20.5f);
        this.spike2.setTextureSize(64, 32);
        this.spike2.mirror = true;
        this.setRotation(this.spike2, 0.3141593f, 0.0f, 0.0f);
        (this.spike1 = new ModelRenderer((ModelBase)this, 178, 66)).addBox(-0.5f, -1.5f, 0.0f, 1, 1, 11);
        this.spike1.setRotationPoint(0.0f, 6.5f, 10.5f);
        this.spike1.setTextureSize(64, 32);
        this.spike1.mirror = true;
        this.setRotation(this.spike1, 0.3141593f, 0.0f, 0.0f);
        (this.arml1 = new ModelRenderer((ModelBase)this, 50, 98)).addBox(0.0f, 0.0f, -2.0f, 11, 3, 4);
        this.arml1.setRotationPoint(2.0f, -1.0f, -6.0f);
        this.arml1.setTextureSize(64, 32);
        this.arml1.mirror = true;
        this.setRotation(this.arml1, 0.0f, -0.5235988f, 0.1745329f);
        (this.armr1 = new ModelRenderer((ModelBase)this, 49, 88)).addBox(0.0f, 0.0f, -2.0f, 11, 3, 4);
        this.armr1.setRotationPoint(-3.0f, -1.0f, -6.0f);
        this.armr1.setTextureSize(64, 32);
        this.armr1.mirror = true;
        this.setRotation(this.armr1, 0.0f, -2.617994f, -0.1745329f);
        (this.arml2 = new ModelRenderer((ModelBase)this, 41, 107)).addBox(0.0f, -1.0f, -1.0f, 15, 3, 3);
        this.arml2.setRotationPoint(11.0f, 2.0f, -1.0f);
        this.arml2.setTextureSize(64, 32);
        this.arml2.mirror = true;
        this.setRotation(this.arml2, 0.0f, 0.8552113f, 0.0f);
        (this.armr2 = new ModelRenderer((ModelBase)this, 42, 115)).addBox(0.0f, -1.0f, -2.0f, 15, 3, 3);
        this.armr2.setRotationPoint(-11.0f, 2.0f, -1.0f);
        this.armr2.setTextureSize(64, 32);
        this.armr2.mirror = true;
        this.setRotation(this.armr2, 0.0f, 2.268928f, 0.0f);
        (this.clawr1 = new ModelRenderer((ModelBase)this, 100, 85)).addBox(-0.5f, -1.0f, -6.0f, 1, 1, 6);
        this.clawr1.setRotationPoint(-21.0f, 2.0f, -12.0f);
        this.clawr1.setTextureSize(64, 32);
        this.clawr1.mirror = true;
        this.setRotation(this.clawr1, -0.1745329f, 0.4363323f, 0.0f);
        (this.clawr2 = new ModelRenderer((ModelBase)this, 100, 94)).addBox(0.0f, 0.0f, -10.0f, 1, 1, 10);
        this.clawr2.setRotationPoint(-21.0f, 2.0f, -12.0f);
        this.clawr2.setTextureSize(64, 32);
        this.clawr2.mirror = true;
        this.setRotation(this.clawr2, 0.0f, 0.8726646f, 0.0f);
        (this.clawr3 = new ModelRenderer((ModelBase)this, 100, 107)).addBox(0.0f, 1.0f, -6.0f, 1, 1, 6);
        this.clawr3.setRotationPoint(-21.0f, 2.0f, -12.0f);
        this.clawr3.setTextureSize(64, 32);
        this.clawr3.mirror = true;
        this.setRotation(this.clawr3, 0.1745329f, 0.4363323f, 0.0f);
        (this.clawl2 = new ModelRenderer((ModelBase)this, 130, 94)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 10);
        this.clawl2.setRotationPoint(21.0f, 2.0f, -12.0f);
        this.clawl2.setTextureSize(64, 32);
        this.clawl2.mirror = true;
        this.setRotation(this.clawl2, 0.0f, 2.268928f, 0.0f);
        (this.clawl3 = new ModelRenderer((ModelBase)this, 130, 109)).addBox(0.0f, 1.0f, 0.0f, 1, 1, 6);
        this.clawl3.setRotationPoint(21.0f, 2.0f, -12.0f);
        this.clawl3.setTextureSize(64, 32);
        this.clawl3.mirror = true;
        this.setRotation(this.clawl3, -0.1745329f, 2.70526f, 0.0f);
        (this.clawl1 = new ModelRenderer((ModelBase)this, 130, 83)).addBox(0.0f, -1.0f, 0.0f, 1, 1, 6);
        this.clawl1.setRotationPoint(21.0f, 2.0f, -12.0f);
        this.clawl1.setTextureSize(64, 32);
        this.clawl1.mirror = true;
        this.setRotation(this.clawl1, 0.1745329f, 2.70526f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final Alien e = (Alien)entity;
        RenderInfo r = null;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle = 0.0f;
        float nextangle = 0.0f;
        newangle = MathHelper.cos(f2 * 4.0f * this.wingspeed) * 3.1415927f * 0.5f * f1;
        this.doLeftLeg(newangle);
        this.doRightLeg(-newangle);
        if (e.getAttacking() == 0) {
            this.fan.rotateAngleZ = 0.0f;
            this.fanl1.rotateAngleZ = 0.0f;
            this.fanl2.rotateAngleZ = 0.0f;
            this.fanl3.rotateAngleZ = 0.0f;
            this.fanl4.rotateAngleZ = 0.0f;
            this.fanl5.rotateAngleZ = 0.0f;
            this.fanl6.rotateAngleZ = 0.0f;
            this.fanl7.rotateAngleZ = 0.0f;
            this.fanr1.rotateAngleZ = 0.0f;
            this.fanr2.rotateAngleZ = 0.0f;
            this.fanr3.rotateAngleZ = 0.0f;
            this.fanr4.rotateAngleZ = 0.0f;
            this.fanr5.rotateAngleZ = 0.0f;
            this.fanr6.rotateAngleZ = 0.0f;
            this.fanr7.rotateAngleZ = 0.0f;
            this.fan.rotateAngleX = -1.85f;
            this.fanl1.rotateAngleX = -1.85f;
            this.fanl2.rotateAngleX = -1.85f;
            this.fanl3.rotateAngleX = -1.85f;
            this.fanl4.rotateAngleX = -1.85f;
            this.fanl5.rotateAngleX = -1.85f;
            this.fanl6.rotateAngleX = -1.85f;
            this.fanl7.rotateAngleX = -1.85f;
            this.fanr1.rotateAngleX = -1.85f;
            this.fanr2.rotateAngleX = -1.85f;
            this.fanr3.rotateAngleX = -1.85f;
            this.fanr4.rotateAngleX = -1.85f;
            this.fanr5.rotateAngleX = -1.85f;
            this.fanr6.rotateAngleX = -1.85f;
            this.fanr7.rotateAngleX = -1.85f;
        }
        else {
            final float pi6 = 0.5235988f;
            final float fanspeed = 1.22f;
            final float fanamp = 0.1f;
            this.fan.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed) * 3.1415927f * fanamp;
            this.fanl1.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 1.0f * pi6) * 3.1415927f * fanamp;
            this.fanl2.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 2.0f * pi6) * 3.1415927f * fanamp;
            this.fanl3.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 3.0f * pi6) * 3.1415927f * fanamp;
            this.fanl4.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 4.0f * pi6) * 3.1415927f * fanamp;
            this.fanl5.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 5.0f * pi6) * 3.1415927f * fanamp;
            this.fanl6.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 6.0f * pi6) * 3.1415927f * fanamp;
            this.fanl7.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 7.0f * pi6) * 3.1415927f * fanamp;
            this.fanr1.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 1.0f * pi6) * 3.1415927f * fanamp;
            this.fanr2.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 2.0f * pi6) * 3.1415927f * fanamp;
            this.fanr3.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 3.0f * pi6) * 3.1415927f * fanamp;
            this.fanr4.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 4.0f * pi6) * 3.1415927f * fanamp;
            this.fanr5.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 5.0f * pi6) * 3.1415927f * fanamp;
            this.fanr6.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 6.0f * pi6) * 3.1415927f * fanamp;
            this.fanr7.rotateAngleX = MathHelper.cos(f2 * fanspeed * this.wingspeed - 7.0f * pi6) * 3.1415927f * fanamp;
            this.fan.rotateAngleZ = 0.0f;
            this.fanl1.rotateAngleZ = 0.261f;
            this.fanl2.rotateAngleZ = 0.523f;
            this.fanl3.rotateAngleZ = 0.785f;
            this.fanl4.rotateAngleZ = 1.047f;
            this.fanl5.rotateAngleZ = 1.309f;
            this.fanl6.rotateAngleZ = 1.571f;
            this.fanl7.rotateAngleZ = 1.832f;
            this.fanr1.rotateAngleZ = -0.261f;
            this.fanr2.rotateAngleZ = -0.523f;
            this.fanr3.rotateAngleZ = -0.785f;
            this.fanr4.rotateAngleZ = -1.047f;
            this.fanr5.rotateAngleZ = -1.309f;
            this.fanr6.rotateAngleZ = -1.571f;
            this.fanr7.rotateAngleZ = -1.832f;
        }
        this.neck.rotateAngleY = (float)Math.toRadians(f3) * 0.35f;
        this.head.rotateAngleY = (float)Math.toRadians(f3) * 0.75f;
        this.head.rotationPointZ = this.neck.rotationPointZ - (float)Math.cos(this.neck.rotateAngleY) * 3.0f;
        this.head.rotationPointX = this.neck.rotationPointX + (float)Math.sin(this.neck.rotateAngleY) * 3.0f;
        this.head1.rotateAngleY = this.head.rotateAngleY;
        this.head1.rotationPointZ = this.head.rotationPointZ;
        this.head1.rotationPointX = this.head.rotationPointX;
        this.head2.rotateAngleY = this.head.rotateAngleY;
        this.head2.rotationPointZ = this.head.rotationPointZ;
        this.head2.rotationPointX = this.head.rotationPointX;
        this.fang1.rotateAngleY = this.head.rotateAngleY;
        this.fang1.rotationPointZ = this.head.rotationPointZ;
        this.fang1.rotationPointX = this.head.rotationPointX;
        this.fang2.rotateAngleY = this.head.rotateAngleY;
        this.fang2.rotationPointZ = this.head.rotationPointZ;
        this.fang2.rotationPointX = this.head.rotationPointX;
        this.fang3.rotateAngleY = this.head.rotateAngleY;
        this.fang3.rotationPointZ = this.head.rotationPointZ;
        this.fang3.rotationPointX = this.head.rotationPointX;
        this.fang4.rotateAngleY = this.head.rotateAngleY;
        this.fang4.rotationPointZ = this.head.rotationPointZ;
        this.fang4.rotationPointX = this.head.rotationPointX;
        this.jaw1.rotateAngleY = this.head.rotateAngleY;
        this.jaw1.rotationPointZ = this.head.rotationPointZ - (float)Math.cos(this.head.rotateAngleY) * 8.0f;
        this.jaw1.rotationPointX = this.head.rotationPointX - (float)Math.sin(this.head.rotateAngleY) * 8.0f;
        this.jaw2.rotateAngleY = this.jaw1.rotateAngleY;
        this.jaw2.rotationPointZ = this.jaw1.rotationPointZ;
        this.jaw2.rotationPointX = this.jaw1.rotationPointX;
        r = e.getRenderInfo();
        newangle = MathHelper.cos(f2 * 3.5f * this.wingspeed) * 3.1415927f * 0.5f;
        nextangle = MathHelper.cos((f2 + 0.2f) * 3.5f * this.wingspeed) * 3.1415927f * 0.5f;
        if (nextangle > 0.0f && newangle < 0.0f) {
            if (e.getAttacking() == 0) {
                r.ri1 = e.worldObj.rand.nextInt(15);
                r.ri2 = e.worldObj.rand.nextInt(15);
                r.ri3 = e.worldObj.rand.nextInt(15);
            }
            else {
                r.ri1 = e.worldObj.rand.nextInt(4);
                r.ri2 = e.worldObj.rand.nextInt(2);
                r.ri3 = 1;
            }
        }
        if (r.ri2 == 1) {
            this.doTail(newangle);
        }
        else {
            newangle = MathHelper.cos(f2 * this.wingspeed) * 3.1415927f * 0.05f;
            this.doTail(newangle);
        }
        if (r.ri3 == 1) {
            newangle = MathHelper.cos(f2 * 3.5f * this.wingspeed) * 3.1415927f * 0.35f;
            this.doJaw(newangle);
        }
        else {
            newangle = MathHelper.cos(f2 * this.wingspeed) * 3.1415927f * 0.02f;
            this.doJaw(newangle);
        }
        newangle = MathHelper.cos(f2 * this.wingspeed * 3.5f) * 3.1415927f * 0.2f;
        if (r.ri1 == 1 || r.ri1 == 3) {
            this.doLeftClaw(newangle);
        }
        else {
            newangle = MathHelper.cos(f2 * this.wingspeed) * 3.1415927f * 0.03f;
            this.doLeftClaw(newangle);
        }
        if (r.ri1 == 2 || r.ri1 == 3) {
            this.doRightClaw(-newangle);
        }
        else {
            newangle = MathHelper.cos(f2 * this.wingspeed) * 3.1415927f * 0.03f;
            this.doRightClaw(-newangle);
        }
        e.setRenderInfo(r);
        this.torso.render(f5);
        this.stomach.render(f5);
        this.rThigh.render(f5);
        this.lThigh.render(f5);
        this.lShin.render(f5);
        this.rShin.render(f5);
        this.lShin1.render(f5);
        this.rShin1.render(f5);
        this.lFoot.render(f5);
        this.rFoot.render(f5);
        this.neck.render(f5);
        this.tail2.render(f5);
        this.tail3.render(f5);
        this.tail4.render(f5);
        this.tail5.render(f5);
        this.tail1.render(f5);
        this.spike4.render(f5);
        this.spike5.render(f5);
        this.spike3.render(f5);
        this.head.render(f5);
        this.head1.render(f5);
        this.jaw1.render(f5);
        this.head2.render(f5);
        this.jaw2.render(f5);
        this.fang1.render(f5);
        this.fang2.render(f5);
        this.fang3.render(f5);
        this.fang4.render(f5);
        this.spike2.render(f5);
        this.spike1.render(f5);
        this.arml1.render(f5);
        this.armr1.render(f5);
        this.arml2.render(f5);
        this.armr2.render(f5);
        this.clawr1.render(f5);
        this.clawr2.render(f5);
        this.clawr3.render(f5);
        this.clawl2.render(f5);
        this.clawl3.render(f5);
        this.clawl1.render(f5);
        this.fan.render(f5);
        this.fanl1.render(f5);
        this.fanr1.render(f5);
        this.fanl2.render(f5);
        this.fanr2.render(f5);
        this.fanl3.render(f5);
        this.fanr3.render(f5);
        this.fanl4.render(f5);
        this.fanr4.render(f5);
        this.fanl5.render(f5);
        this.fanr5.render(f5);
        this.fanl6.render(f5);
        this.fanr6.render(f5);
        this.fanl7.render(f5);
        this.fanr7.render(f5);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
    
    private void doLeftLeg(final float angle) {
        this.lFoot.rotateAngleX = angle;
        this.lShin.rotateAngleX = angle - 0.4f;
        this.lShin1.rotateAngleX = angle - 0.8f;
        this.lThigh.rotateAngleX = angle - 0.8f;
    }
    
    private void doRightLeg(final float angle) {
        this.rFoot.rotateAngleX = angle;
        this.rShin.rotateAngleX = angle - 0.4f;
        this.rShin1.rotateAngleX = angle - 0.8f;
        this.rThigh.rotateAngleX = angle - 0.8f;
    }
    
    private void doJaw(final float angle) {
        this.jaw1.rotateAngleX = Math.abs(angle);
        this.jaw2.rotateAngleX = this.jaw1.rotateAngleX;
    }
    
    private void doTail(final float angle) {
        this.tail1.rotateAngleY = angle * 0.25f;
        this.spike1.rotateAngleY = this.tail1.rotateAngleY;
        this.tail2.rotateAngleY = angle * 0.5f;
        this.tail2.rotationPointZ = this.tail1.rotationPointZ + (float)Math.cos(this.tail1.rotateAngleY) * 10.0f;
        this.tail2.rotationPointX = this.tail1.rotationPointX + (float)Math.sin(this.tail1.rotateAngleY) * 10.0f;
        this.spike2.rotateAngleY = this.tail2.rotateAngleY;
        this.spike2.rotationPointZ = this.tail2.rotationPointZ;
        this.spike2.rotationPointX = this.tail2.rotationPointX;
        this.tail3.rotateAngleY = angle * 0.8f;
        this.tail3.rotationPointZ = this.tail2.rotationPointZ + (float)Math.cos(this.tail2.rotateAngleY) * 10.0f;
        this.tail3.rotationPointX = this.tail2.rotationPointX + (float)Math.sin(this.tail2.rotateAngleY) * 10.0f;
        this.spike3.rotateAngleY = this.tail3.rotateAngleY;
        this.spike3.rotationPointZ = this.tail3.rotationPointZ;
        this.spike3.rotationPointX = this.tail3.rotationPointX;
        this.tail4.rotateAngleY = angle * 1.25f;
        this.tail4.rotationPointZ = this.tail3.rotationPointZ + (float)Math.cos(this.tail3.rotateAngleY) * 10.0f;
        this.tail4.rotationPointX = this.tail3.rotationPointX + (float)Math.sin(this.tail3.rotateAngleY) * 10.0f;
        this.spike4.rotateAngleY = this.tail4.rotateAngleY + 0.52f;
        this.spike4.rotationPointZ = this.tail4.rotationPointZ;
        this.spike4.rotationPointX = this.tail4.rotationPointX;
        this.spike5.rotateAngleY = this.tail4.rotateAngleY - 0.52f;
        this.spike5.rotationPointZ = this.tail4.rotationPointZ;
        this.spike5.rotationPointX = this.tail4.rotationPointX;
        this.tail5.rotateAngleY = angle * 1.5f;
        this.tail5.rotationPointZ = this.tail4.rotationPointZ + (float)Math.cos(this.tail4.rotateAngleY) * 10.0f;
        this.tail5.rotationPointX = this.tail4.rotationPointX + (float)Math.sin(this.tail4.rotateAngleY) * 10.0f;
    }
    
    private void doLeftClaw(final float angle) {
        this.arml1.rotateAngleY = -0.52f + Math.abs(angle * 2.0f);
        this.arml2.rotationPointZ = this.arml1.rotationPointZ - (float)Math.sin(this.arml1.rotateAngleY) * 9.0f;
        this.arml2.rotationPointX = this.arml1.rotationPointX + (float)Math.cos(this.arml1.rotateAngleY) * 9.0f;
        this.arml2.rotateAngleY = 0.855f + Math.abs(angle);
        this.clawl1.rotationPointZ = this.arml2.rotationPointZ - (float)Math.sin(this.arml2.rotateAngleY) * 14.0f;
        this.clawl1.rotationPointX = this.arml2.rotationPointX + (float)Math.cos(this.arml2.rotateAngleY) * 14.0f;
        this.clawl1.rotateAngleY = 2.7f + Math.abs(angle * 4.0f);
        this.clawl2.rotationPointZ = this.clawl1.rotationPointZ;
        this.clawl2.rotationPointX = this.clawl1.rotationPointX;
        this.clawl2.rotateAngleY = 2.27f + Math.abs(angle * 4.0f);
        this.clawl3.rotationPointZ = this.clawl1.rotationPointZ;
        this.clawl3.rotationPointX = this.clawl1.rotationPointX;
        this.clawl3.rotateAngleY = 2.7f + Math.abs(angle * 4.0f);
    }
    
    private void doRightClaw(final float angle) {
        this.armr1.rotateAngleY = -2.61f - Math.abs(angle * 2.0f);
        this.armr2.rotationPointZ = this.armr1.rotationPointZ - (float)Math.sin(this.armr1.rotateAngleY) * 9.0f;
        this.armr2.rotationPointX = this.armr1.rotationPointX + (float)Math.cos(this.armr1.rotateAngleY) * 9.0f;
        this.armr2.rotateAngleY = 2.27f - Math.abs(angle);
        this.clawr1.rotationPointZ = this.armr2.rotationPointZ - (float)Math.sin(this.armr2.rotateAngleY) * 14.0f;
        this.clawr1.rotationPointX = this.armr2.rotationPointX + (float)Math.cos(this.armr2.rotateAngleY) * 14.0f;
        this.clawr1.rotateAngleY = 0.436f - Math.abs(angle * 4.0f);
        this.clawr2.rotationPointZ = this.clawr1.rotationPointZ;
        this.clawr2.rotationPointX = this.clawr1.rotationPointX;
        this.clawr2.rotateAngleY = 0.87f - Math.abs(angle * 4.0f);
        this.clawr3.rotationPointZ = this.clawr1.rotationPointZ;
        this.clawr3.rotationPointX = this.clawr1.rotationPointX;
        this.clawr3.rotateAngleY = 0.436f - Math.abs(angle * 4.0f);
    }
}
