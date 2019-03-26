package danger.orespawn;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class ModelSeaViper extends ModelBase
{
    private float wingspeed;
    ModelRenderer TailTip;
    ModelRenderer Neck;
    ModelRenderer tBase;
    ModelRenderer t2;
    ModelRenderer t3;
    ModelRenderer t4;
    ModelRenderer t5;
    ModelRenderer t6;
    ModelRenderer t7;
    ModelRenderer t8;
    ModelRenderer t9;
    ModelRenderer t10;
    ModelRenderer t12;
    ModelRenderer t11;
    ModelRenderer t13;
    ModelRenderer t14;
    ModelRenderer t15;
    ModelRenderer t16;
    ModelRenderer t17;
    ModelRenderer t18;
    ModelRenderer t19;
    ModelRenderer t20;
    ModelRenderer t21;
    ModelRenderer MouthBottom;
    ModelRenderer ToungBase;
    ModelRenderer MiddleTounge;
    ModelRenderer EyeRight;
    ModelRenderer EyeLeft;
    ModelRenderer MouthTop;
    ModelRenderer Head;
    ModelRenderer FangRight;
    ModelRenderer FangLeft;
    ModelRenderer ForkRight;
    ModelRenderer ForkLeft;
    
    public ModelSeaViper(final float f1) {
        this.wingspeed = 1.0f;
        this.wingspeed = f1;
        this.textureWidth = 128;
        this.textureHeight = 128;
        (this.TailTip = new ModelRenderer((ModelBase)this, 0, 90)).addBox(-1.0f, -1.0f, 0.0f, 2, 5, 10);
        this.TailTip.setRotationPoint(1.0f, 20.0f, 120.0f);
        this.TailTip.setTextureSize(128, 128);
        this.TailTip.mirror = true;
        this.setRotation(this.TailTip, 0.0f, -0.6981317f, 0.0f);
        (this.Neck = new ModelRenderer((ModelBase)this, 60, 60)).addBox(-4.0f, -4.0f, -10.0f, 8, 8, 10);
        this.Neck.setRotationPoint(0.0f, 4.5f, -33.0f);
        this.Neck.setTextureSize(128, 128);
        this.Neck.mirror = true;
        this.setRotation(this.Neck, -0.2617994f, 0.0f, 0.0f);
        (this.tBase = new ModelRenderer((ModelBase)this, 0, 31)).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 10);
        this.tBase.setRotationPoint(0.0f, 4.0f, -34.0f);
        this.tBase.setTextureSize(128, 128);
        this.tBase.mirror = true;
        this.setRotation(this.tBase, -0.5235988f, 0.0f, 0.0f);
        (this.t2 = new ModelRenderer((ModelBase)this, 0, 31)).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 10);
        this.t2.setRotationPoint(0.0f, 7.0f, -27.0f);
        this.t2.setTextureSize(128, 128);
        this.t2.mirror = true;
        this.setRotation(this.t2, -1.047198f, 0.0f, 0.0f);
        (this.t3 = new ModelRenderer((ModelBase)this, 0, 31)).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 10);
        this.t3.setRotationPoint(0.0f, 14.0f, -24.0f);
        this.t3.setTextureSize(128, 128);
        this.t3.mirror = true;
        this.setRotation(this.t3, -0.5235988f, 0.0f, 0.0f);
        (this.t4 = new ModelRenderer((ModelBase)this, 0, 31)).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 10);
        this.t4.setRotationPoint(0.0f, 19.0f, -17.0f);
        this.t4.setTextureSize(128, 128);
        this.t4.mirror = true;
        this.setRotation(this.t4, -0.0872665f, 0.0f, 0.0f);
        (this.t5 = new ModelRenderer((ModelBase)this, 0, 31)).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 10);
        this.t5.setRotationPoint(0.0f, 20.0f, -9.0f);
        this.t5.setTextureSize(128, 128);
        this.t5.mirror = true;
        this.setRotation(this.t5, 0.0f, 0.0f, 0.0f);
        (this.t6 = new ModelRenderer((ModelBase)this, 0, 31)).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 10);
        this.t6.setRotationPoint(0.0f, 20.0f, -1.0f);
        this.t6.setTextureSize(128, 128);
        this.t6.mirror = true;
        this.setRotation(this.t6, 0.0f, 0.3490659f, 0.0f);
        (this.t7 = new ModelRenderer((ModelBase)this, 0, 31)).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 10);
        this.t7.setRotationPoint(2.0f, 20.0f, 6.0f);
        this.t7.setTextureSize(128, 128);
        this.t7.mirror = true;
        this.setRotation(this.t7, 0.0f, 0.6981317f, 0.0f);
        (this.t8 = new ModelRenderer((ModelBase)this, 0, 31)).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 10);
        this.t8.setRotationPoint(7.0f, 20.0f, 12.0f);
        this.t8.setTextureSize(128, 128);
        this.t8.mirror = true;
        this.setRotation(this.t8, 0.0f, 0.3490659f, 0.0f);
        (this.t9 = new ModelRenderer((ModelBase)this, 0, 31)).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 10);
        this.t9.setRotationPoint(10.0f, 20.0f, 20.0f);
        this.t9.setTextureSize(128, 128);
        this.t9.mirror = true;
        this.setRotation(this.t9, 0.0f, 0.0f, 0.0f);
        (this.t10 = new ModelRenderer((ModelBase)this, 0, 31)).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 10);
        this.t10.setRotationPoint(10.0f, 20.0f, 28.0f);
        this.t10.setTextureSize(128, 128);
        this.t10.mirror = true;
        this.setRotation(this.t10, 0.0f, -0.3490659f, 0.0f);
        (this.t12 = new ModelRenderer((ModelBase)this, 0, 31)).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 10);
        this.t12.setRotationPoint(2.0f, 20.0f, 42.0f);
        this.t12.setTextureSize(128, 128);
        this.t12.mirror = true;
        this.setRotation(this.t12, 0.0f, -0.6981317f, 0.0f);
        (this.t11 = new ModelRenderer((ModelBase)this, 0, 31)).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 10);
        this.t11.setRotationPoint(8.0f, 20.0f, 35.0f);
        this.t11.setTextureSize(128, 128);
        this.t11.mirror = true;
        this.setRotation(this.t11, 0.0f, -0.6981317f, 0.0f);
        (this.t13 = new ModelRenderer((ModelBase)this, 0, 31)).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 10);
        this.t13.setRotationPoint(-4.0f, 20.0f, 48.0f);
        this.t13.setTextureSize(128, 128);
        this.t13.mirror = true;
        this.setRotation(this.t13, 0.0f, -0.3490659f, 0.0f);
        (this.t14 = new ModelRenderer((ModelBase)this, 0, 51)).addBox(-3.0f, -3.0f, 0.0f, 6, 7, 10);
        this.t14.setRotationPoint(-8.0f, 20.0f, 56.0f);
        this.t14.setTextureSize(128, 128);
        this.t14.mirror = true;
        this.setRotation(this.t14, 0.0f, 0.0f, 0.0f);
        (this.t15 = new ModelRenderer((ModelBase)this, 0, 51)).addBox(-3.0f, -3.0f, 0.0f, 6, 7, 10);
        this.t15.setRotationPoint(-8.0f, 20.0f, 65.0f);
        this.t15.setTextureSize(128, 128);
        this.t15.mirror = true;
        this.setRotation(this.t15, 0.0f, 0.3490659f, 0.0f);
        (this.t16 = new ModelRenderer((ModelBase)this, 0, 51)).addBox(-3.0f, -3.0f, 0.0f, 6, 7, 10);
        this.t16.setRotationPoint(-5.0f, 20.0f, 73.0f);
        this.t16.setTextureSize(128, 128);
        this.t16.mirror = true;
        this.setRotation(this.t16, 0.0f, 0.6981317f, 0.0f);
        (this.t17 = new ModelRenderer((ModelBase)this, 0, 70)).addBox(-2.0f, -2.0f, 0.0f, 4, 6, 10);
        this.t17.setRotationPoint(1.0f, 20.0f, 80.0f);
        this.t17.setTextureSize(128, 128);
        this.t17.mirror = true;
        this.setRotation(this.t17, 0.0f, 0.6981317f, 0.0f);
        (this.t18 = new ModelRenderer((ModelBase)this, 0, 70)).addBox(-2.0f, -2.0f, 0.0f, 4, 6, 10);
        this.t18.setRotationPoint(7.0f, 20.0f, 87.0f);
        this.t18.setTextureSize(128, 128);
        this.t18.mirror = true;
        this.setRotation(this.t18, 0.0f, 0.3490659f, 0.0f);
        (this.t19 = new ModelRenderer((ModelBase)this, 0, 70)).addBox(-2.0f, -2.0f, 0.0f, 4, 6, 10);
        this.t19.setRotationPoint(10.0f, 20.0f, 95.0f);
        this.t19.setTextureSize(128, 128);
        this.t19.mirror = true;
        this.setRotation(this.t19, 0.0f, 0.0f, 0.0f);
        (this.t20 = new ModelRenderer((ModelBase)this, 0, 90)).addBox(-1.0f, -1.0f, 0.0f, 2, 5, 10);
        this.t20.setRotationPoint(10.0f, 20.0f, 104.0f);
        this.t20.setTextureSize(128, 128);
        this.t20.mirror = true;
        this.setRotation(this.t20, 0.0f, -0.3490659f, 0.0f);
        (this.t21 = new ModelRenderer((ModelBase)this, 0, 90)).addBox(-1.0f, -1.0f, 0.0f, 2, 5, 10);
        this.t21.setRotationPoint(7.0f, 20.0f, 113.0f);
        this.t21.setTextureSize(128, 128);
        this.t21.mirror = true;
        this.setRotation(this.t21, 0.0f, -0.6981317f, 0.0f);
        (this.MouthBottom = new ModelRenderer((ModelBase)this, 58, 78)).addBox(-4.0f, 0.0f, -12.0f, 8, 2, 12);
        this.MouthBottom.setRotationPoint(0.0f, 4.0f, -42.0f);
        this.MouthBottom.setTextureSize(128, 128);
        this.MouthBottom.mirror = true;
        this.setRotation(this.MouthBottom, 0.5235988f, 0.0f, 0.0f);
        (this.ToungBase = new ModelRenderer((ModelBase)this, 70, 17)).addBox(-1.0f, -2.0f, -11.0f, 2, 1, 6);
        this.ToungBase.setRotationPoint(0.0f, 6.0f, -40.0f);
        this.ToungBase.setTextureSize(128, 128);
        this.ToungBase.mirror = true;
        this.setRotation(this.ToungBase, 0.2617994f, 0.0f, 0.0f);
        (this.MiddleTounge = new ModelRenderer((ModelBase)this, 70, 10)).addBox(-1.0f, -1.0f, -17.0f, 2, 1, 6);
        this.MiddleTounge.setRotationPoint(0.0f, 6.0f, -40.0f);
        this.MiddleTounge.setTextureSize(128, 128);
        this.MiddleTounge.mirror = true;
        this.setRotation(this.MiddleTounge, 0.1745329f, 0.0f, 0.0f);
        (this.EyeRight = new ModelRenderer((ModelBase)this, 96, 60)).addBox(-7.0f, -7.0f, -3.0f, 1, 3, 4);
        this.EyeRight.setRotationPoint(0.0f, 6.0f, -40.0f);
        this.EyeRight.setTextureSize(128, 128);
        this.EyeRight.mirror = true;
        this.setRotation(this.EyeRight, 0.3490659f, 0.0f, 0.0f);
        (this.EyeLeft = new ModelRenderer((ModelBase)this, 50, 60)).addBox(6.0f, -7.0f, -3.0f, 1, 3, 4);
        this.EyeLeft.setRotationPoint(0.0f, 6.0f, -40.0f);
        this.EyeLeft.setTextureSize(128, 128);
        this.EyeLeft.mirror = true;
        this.setRotation(this.EyeLeft, 0.3490659f, 0.0f, 0.0f);
        (this.MouthTop = new ModelRenderer((ModelBase)this, 52, 24)).addBox(-5.0f, -6.0f, -16.0f, 10, 6, 16);
        this.MouthTop.setRotationPoint(0.0f, 6.0f, -40.0f);
        this.MouthTop.setTextureSize(128, 128);
        this.MouthTop.mirror = true;
        this.setRotation(this.MouthTop, 0.0f, 0.0f, 0.0f);
        (this.Head = new ModelRenderer((ModelBase)this, 60, 46)).addBox(-6.0f, -8.0f, -6.0f, 12, 8, 6);
        this.Head.setRotationPoint(0.0f, 6.0f, -40.0f);
        this.Head.setTextureSize(128, 128);
        this.Head.mirror = true;
        this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
        (this.FangRight = new ModelRenderer((ModelBase)this, 92, 18)).addBox(-4.0f, -3.0f, -15.0f, 1, 5, 1);
        this.FangRight.setRotationPoint(0.0f, 6.0f, -40.0f);
        this.FangRight.setTextureSize(128, 128);
        this.FangRight.mirror = true;
        this.setRotation(this.FangRight, 0.1745329f, 0.0f, 0.0f);
        (this.FangLeft = new ModelRenderer((ModelBase)this, 60, 18)).addBox(3.0f, -3.0f, -15.0f, 1, 5, 1);
        this.FangLeft.setRotationPoint(0.0f, 6.0f, -40.0f);
        this.FangLeft.setTextureSize(128, 128);
        this.FangLeft.mirror = true;
        this.setRotation(this.FangLeft, 0.1745329f, 0.0f, 0.0f);
        (this.ForkRight = new ModelRenderer((ModelBase)this, 60, 3)).addBox(6.0f, 0.6f, -21.0f, 2, 1, 6);
        this.ForkRight.setRotationPoint(0.0f, 6.0f, -40.0f);
        this.ForkRight.setTextureSize(128, 128);
        this.ForkRight.mirror = true;
        this.setRotation(this.ForkRight, 0.0872665f, 0.4363323f, 0.0f);
        (this.ForkLeft = new ModelRenderer((ModelBase)this, 80, 3)).addBox(-8.0f, 0.6f, -21.0f, 2, 1, 6);
        this.ForkLeft.setRotationPoint(0.0f, 6.0f, -40.0f);
        this.ForkLeft.setTextureSize(128, 128);
        this.ForkLeft.mirror = true;
        this.setRotation(this.ForkLeft, 0.0872665f, -0.4363323f, 0.0f);
        final ModelRenderer tailTip = this.TailTip;
        tailTip.rotationPointZ += 32.0f;
        final ModelRenderer neck = this.Neck;
        neck.rotationPointZ += 32.0f;
        final ModelRenderer tBase = this.tBase;
        tBase.rotationPointZ += 32.0f;
        final ModelRenderer t2 = this.t2;
        t2.rotationPointZ += 32.0f;
        final ModelRenderer t3 = this.t3;
        t3.rotationPointZ += 32.0f;
        final ModelRenderer t4 = this.t4;
        t4.rotationPointZ += 32.0f;
        final ModelRenderer t5 = this.t5;
        t5.rotationPointZ += 32.0f;
        final ModelRenderer t6 = this.t6;
        t6.rotationPointZ += 32.0f;
        final ModelRenderer t7 = this.t7;
        t7.rotationPointZ += 32.0f;
        final ModelRenderer t8 = this.t8;
        t8.rotationPointZ += 32.0f;
        final ModelRenderer t9 = this.t9;
        t9.rotationPointZ += 32.0f;
        final ModelRenderer t10 = this.t10;
        t10.rotationPointZ += 32.0f;
        final ModelRenderer t11 = this.t12;
        t11.rotationPointZ += 32.0f;
        final ModelRenderer t12 = this.t11;
        t12.rotationPointZ += 32.0f;
        final ModelRenderer t13 = this.t13;
        t13.rotationPointZ += 32.0f;
        final ModelRenderer t14 = this.t14;
        t14.rotationPointZ += 32.0f;
        final ModelRenderer t15 = this.t15;
        t15.rotationPointZ += 32.0f;
        final ModelRenderer t16 = this.t16;
        t16.rotationPointZ += 32.0f;
        final ModelRenderer t17 = this.t17;
        t17.rotationPointZ += 32.0f;
        final ModelRenderer t18 = this.t18;
        t18.rotationPointZ += 32.0f;
        final ModelRenderer t19 = this.t19;
        t19.rotationPointZ += 32.0f;
        final ModelRenderer t20 = this.t20;
        t20.rotationPointZ += 32.0f;
        final ModelRenderer t21 = this.t21;
        t21.rotationPointZ += 32.0f;
        final ModelRenderer mouthBottom = this.MouthBottom;
        mouthBottom.rotationPointZ += 32.0f;
        final ModelRenderer toungBase = this.ToungBase;
        toungBase.rotationPointZ += 32.0f;
        final ModelRenderer middleTounge = this.MiddleTounge;
        middleTounge.rotationPointZ += 32.0f;
        final ModelRenderer eyeRight = this.EyeRight;
        eyeRight.rotationPointZ += 32.0f;
        final ModelRenderer eyeLeft = this.EyeLeft;
        eyeLeft.rotationPointZ += 32.0f;
        final ModelRenderer mouthTop = this.MouthTop;
        mouthTop.rotationPointZ += 32.0f;
        final ModelRenderer head = this.Head;
        head.rotationPointZ += 32.0f;
        final ModelRenderer fangRight = this.FangRight;
        fangRight.rotationPointZ += 32.0f;
        final ModelRenderer fangLeft = this.FangLeft;
        fangLeft.rotationPointZ += 32.0f;
        final ModelRenderer forkRight = this.ForkRight;
        forkRight.rotationPointZ += 32.0f;
        final ModelRenderer forkLeft = this.ForkLeft;
        forkLeft.rotationPointZ += 32.0f;
    }
    
    public void render(final Entity entity, final float f, float f1, final float f2, final float f3, final float f4, final float f5) {
        final SeaViper e = (SeaViper)entity;
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        float newangle = 0.0f;
        if (f1 < 0.0f) {
            f1 = 0.0f;
        }
        newangle = MathHelper.cos(f2 * 1.3f * this.wingspeed) * 3.1415927f * 0.1f * f1;
        this.tBase.rotateAngleY = newangle;
        this.doseg(this.tBase, this.t2, 2.0f, f1, f2);
        this.doseg(this.t2, this.t3, 2.0f, f1, f2);
        this.doseg(this.t3, this.t4, 3.0f, f1, f2);
        this.doseg(this.t4, this.t5, 4.0f, f1, f2);
        this.doseg(this.t5, this.t6, 5.0f, f1, f2);
        this.doseg(this.t6, this.t7, 6.0f, f1, f2);
        this.doseg(this.t7, this.t8, 7.0f, f1, f2);
        this.doseg(this.t8, this.t9, 8.0f, f1, f2);
        this.doseg(this.t9, this.t10, 9.0f, f1, f2);
        this.doseg(this.t10, this.t11, 10.0f, f1, f2);
        this.doseg(this.t11, this.t12, 11.0f, f1, f2);
        this.doseg(this.t12, this.t13, 12.0f, f1, f2);
        this.doseg(this.t13, this.t14, 13.0f, f1, f2);
        this.doseg(this.t14, this.t15, 14.0f, f1, f2);
        this.doseg(this.t15, this.t16, 15.0f, f1, f2);
        this.doseg(this.t16, this.t17, 16.0f, f1, f2);
        this.doseg(this.t17, this.t18, 17.0f, f1, f2);
        this.doseg(this.t18, this.t19, 18.0f, f1, f2);
        this.doseg(this.t19, this.t20, 19.0f, f1, f2);
        this.doseg(this.t20, this.t21, 20.0f, f1, f2);
        this.doseg(this.t21, this.TailTip, 21.0f, f1, f2);
        if (e.getAttacking() != 0) {
            newangle = MathHelper.cos(f2 * 1.7f * this.wingspeed) * 3.1415927f * 0.17f;
            this.MouthBottom.rotateAngleX = 0.65f + newangle;
            newangle = MathHelper.cos(f2 * 4.7f * this.wingspeed) * 3.1415927f * 0.07f;
            this.ToungBase.rotateAngleX = 0.261f + newangle;
            this.MiddleTounge.rotateAngleX = 0.174f + newangle;
            this.ForkLeft.rotateAngleX = 0.087f + newangle;
            this.ForkRight.rotateAngleX = 0.087f + newangle;
            newangle = MathHelper.cos(f2 * 1.5f * this.wingspeed) * 3.1415927f * 0.05f;
            final ModelRenderer toungBase = this.ToungBase;
            final ModelRenderer middleTounge = this.MiddleTounge;
            final ModelRenderer forkLeft = this.ForkLeft;
            final ModelRenderer forkRight = this.ForkRight;
            final float n = newangle;
            forkRight.offsetZ = n;
            forkLeft.offsetZ = n;
            middleTounge.offsetZ = n;
            toungBase.offsetZ = n;
        }
        else {
            newangle = MathHelper.cos(f2 * 0.2f * this.wingspeed) * 3.1415927f * 0.02f;
            this.MouthBottom.rotateAngleX = 0.45f + newangle;
            newangle = MathHelper.cos(f2 * 1.7f * this.wingspeed) * 3.1415927f * 0.03f;
            this.ToungBase.rotateAngleX = 0.261f + newangle;
            this.MiddleTounge.rotateAngleX = 0.174f + newangle;
            this.ForkLeft.rotateAngleX = 0.087f + newangle;
            this.ForkRight.rotateAngleX = 0.087f + newangle;
            newangle = MathHelper.cos(f2 * 0.5f * this.wingspeed) * 3.1415927f * 0.05f;
            final ModelRenderer toungBase2 = this.ToungBase;
            final ModelRenderer middleTounge2 = this.MiddleTounge;
            final ModelRenderer forkLeft2 = this.ForkLeft;
            final ModelRenderer forkRight2 = this.ForkRight;
            final float n2 = newangle;
            forkRight2.offsetZ = n2;
            forkLeft2.offsetZ = n2;
            middleTounge2.offsetZ = n2;
            toungBase2.offsetZ = n2;
        }
        newangle = (float)Math.toRadians(f3) * 0.5f;
        final ModelRenderer head = this.Head;
        final ModelRenderer mouthTop = this.MouthTop;
        final ModelRenderer eyeLeft = this.EyeLeft;
        final ModelRenderer eyeRight = this.EyeRight;
        final float n3 = newangle;
        eyeRight.rotateAngleY = n3;
        eyeLeft.rotateAngleY = n3;
        mouthTop.rotateAngleY = n3;
        head.rotateAngleY = n3;
        final ModelRenderer fangLeft = this.FangLeft;
        final ModelRenderer fangRight = this.FangRight;
        final float n4 = newangle;
        fangRight.rotateAngleY = n4;
        fangLeft.rotateAngleY = n4;
        this.MouthBottom.rotateAngleY = newangle;
        this.MouthBottom.rotationPointZ = this.Head.rotationPointZ - (float)Math.cos(this.Head.rotateAngleY) * 2.0f;
        this.MouthBottom.rotationPointX = this.Head.rotationPointX - (float)Math.sin(this.Head.rotateAngleY) * 2.0f;
        this.ToungBase.rotateAngleY = newangle;
        this.MiddleTounge.rotateAngleY = newangle;
        this.ForkLeft.rotateAngleY = newangle - 0.436f;
        this.ForkRight.rotateAngleY = newangle + 0.436f;
        this.TailTip.render(f5);
        this.Neck.render(f5);
        this.tBase.render(f5);
        this.t2.render(f5);
        this.t3.render(f5);
        this.t4.render(f5);
        this.t5.render(f5);
        this.t6.render(f5);
        this.t7.render(f5);
        this.t8.render(f5);
        this.t9.render(f5);
        this.t10.render(f5);
        this.t12.render(f5);
        this.t11.render(f5);
        this.t13.render(f5);
        this.t14.render(f5);
        this.t15.render(f5);
        this.t16.render(f5);
        this.t17.render(f5);
        this.t18.render(f5);
        this.t19.render(f5);
        this.t20.render(f5);
        this.t21.render(f5);
        this.MouthBottom.render(f5);
        this.ToungBase.render(f5);
        this.MiddleTounge.render(f5);
        this.EyeRight.render(f5);
        this.EyeLeft.render(f5);
        this.MouthTop.render(f5);
        this.Head.render(f5);
        this.FangRight.render(f5);
        this.FangLeft.render(f5);
        this.ForkRight.render(f5);
        this.ForkLeft.render(f5);
    }
    
    private void doseg(final ModelRenderer inn, final ModelRenderer notinn, final float f, final float f1, final float f2) {
        final float pi4 = 0.7853982f;
        float newangle = 0.0f;
        notinn.rotationPointZ = (float)(inn.rotationPointZ + (float)Math.cos(inn.rotateAngleY) * (9.0 * Math.abs(Math.cos(inn.rotateAngleX))));
        notinn.rotationPointX = (float)(inn.rotationPointX + (float)Math.sin(inn.rotateAngleY) * 9.0f * Math.abs(Math.cos(inn.rotateAngleX)));
        newangle = MathHelper.cos(f2 * 1.3f * this.wingspeed - pi4 * f) * 3.1415927f * 0.2f * f1;
        final float a = MathHelper.cos(-(pi4 * f));
        notinn.rotateAngleY = newangle + a - a * f1;
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    }
}
