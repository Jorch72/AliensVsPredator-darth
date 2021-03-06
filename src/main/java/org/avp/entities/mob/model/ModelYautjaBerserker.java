package org.avp.entities.mob.model;

import org.avp.entities.mob.EntitySpeciesYautja;

import com.arisux.amdxlib.lib.client.Model;
import com.arisux.amdxlib.lib.client.render.OpenGL;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.MathHelper;

public class ModelYautjaBerserker extends Model
{
    public ModelRenderer head;
    public ModelRenderer head1Biomask;
    public ModelRenderer head13Biomask;
    public ModelRenderer head14BioMask;
    public ModelRenderer BiomaskMouth;
    public ModelRenderer biomaksVisor;
    public ModelRenderer BiomaskHeadPlate;
    public ModelRenderer BiomaskSlope;
    public ModelRenderer BiomaskSlope2;
    public ModelRenderer BiomaskSlope3;
    public ModelRenderer RBiomaskRidge;
    public ModelRenderer LBiomaskRidge;
    public ModelRenderer SightsLaser;
    public ModelRenderer RCheekLower;
    public ModelRenderer RCheekLower2;
    public ModelRenderer RCheekUpper;
    public ModelRenderer RCheekUpper2;
    public ModelRenderer REyeSide;
    public ModelRenderer LCheekLower;
    public ModelRenderer LCheekUpper;
    public ModelRenderer LCheekLower2;
    public ModelRenderer LCheekUpper2;
    public ModelRenderer LEyeSide;
    public ModelRenderer Sights;
    public ModelRenderer Sights_1;
    public ModelRenderer head_1;
    public ModelRenderer body;
    public ModelRenderer rightarm;
    public ModelRenderer leftarm;
    public ModelRenderer rightleg;
    public ModelRenderer leftleg;
    public ModelRenderer body1;
    public ModelRenderer head1;
    public ModelRenderer head2;
    public ModelRenderer head3;
    public ModelRenderer head4;
    public ModelRenderer head5;
    public ModelRenderer head6;
    public ModelRenderer head7;
    public ModelRenderer head8;
    public ModelRenderer head9;
    public ModelRenderer head10;
    public ModelRenderer head11;
    public ModelRenderer head12;
    public ModelRenderer head13;
    public ModelRenderer head14;
    public ModelRenderer head15;
    public ModelRenderer head16;
    public ModelRenderer head17;
    public ModelRenderer head18;
    public ModelRenderer head19;
    public ModelRenderer head20;
    public ModelRenderer head21;
    public ModelRenderer head22;
    public ModelRenderer head23;
    public ModelRenderer head24;
    public ModelRenderer head25;
    public ModelRenderer head26;
    public ModelRenderer head27;
    public ModelRenderer head28;
    public ModelRenderer head29;
    public ModelRenderer head30;
    public ModelRenderer head31;
    public ModelRenderer head32;
    public ModelRenderer head33;
    public ModelRenderer head34;
    public ModelRenderer head35;
    public ModelRenderer head36;
    public ModelRenderer head37;
    public ModelRenderer head38;
    public ModelRenderer head39;
    public ModelRenderer head40;
    public ModelRenderer head41;
    public ModelRenderer head42;
    public ModelRenderer head43;
    public ModelRenderer head44;
    public ModelRenderer head45;
    public ModelRenderer head46;
    public ModelRenderer head47;
    public ModelRenderer head48;
    public ModelRenderer head49;
    public ModelRenderer head50;
    public ModelRenderer head51;
    public ModelRenderer head52;
    public ModelRenderer rightarm2;
    public ModelRenderer body2;
    public ModelRenderer blade1;
    public ModelRenderer blade2;
    public ModelRenderer leftarm2;
    public ModelRenderer leftleg2;
    public ModelRenderer rightleg2;
    public ModelRenderer leftleg3;
    public ModelRenderer rightleg3;
    public ModelRenderer leftarm3;
    public ModelRenderer rightarm3;
    public ModelRenderer rightlegLower;
    public ModelRenderer leftlegLower;
    public ModelRenderer leftarm_1;
    public ModelRenderer rightarm_1;

    public ModelYautjaBerserker()
    {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.head19 = new ModelRenderer(this, 85, 37);
        this.head19.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head19.addBox(-1.5F, -5.0F, -6.699999809265137F, 2, 1, 0, 0.0F);
        this.setRotation(head19, 0.024399814707723674F, -0.43569335187530495F, -0.057761264741490854F);
        this.SightsLaser = new ModelRenderer(this, 224, 55);
        this.SightsLaser.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.SightsLaser.addBox(-3.5F, -8.899999618530273F, -2.200000047683716F, 1, 1, 0, 0.0F);
        this.setRotation(SightsLaser, 0.22406615555415907F, -0.10369694562713362F, -0.140385401790922F);
        this.Sights = new ModelRenderer(this, 204, 55);
        this.Sights.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Sights.addBox(-4.0F, -8.699999809265137F, 0.5F, 1, 1, 3, 0.0F);
        this.setRotation(Sights, 0.4188790321350096F, 0.19198621809482574F, 0.0F);
        this.head25 = new ModelRenderer(this, 17, 30);
        this.head25.mirror = true;
        this.head25.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head25.addBox(-4.0F, -8.699999809265137F, -8.800000190734863F, 8, 9, 1, 0.0F);
        this.setRotation(head25, -1.2217304706573486F, -0.0F, 0.0F);
        this.LCheekLower = new ModelRenderer(this, 221, 93);
        this.LCheekLower.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.LCheekLower.addBox(-2.0F, -4.0F, -5.0F, 3, 3, 1, 0.0F);
        this.setRotation(LCheekLower, 0.0F, -0.6457718014717102F, 0.0F);
        this.head1Biomask = new ModelRenderer(this, 65, 0);
        this.head1Biomask.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head1Biomask.addBox(0.5F, -2.5F, -4.0F, 1, 2, 5, 0.0F);
        this.setRotation(head1Biomask, 0.0F, 0.12217304855585097F, 0.0F);
        this.head36 = new ModelRenderer(this, 28, 77);
        this.head36.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head36.addBox(-10.0F, -9.0F, 1.5F, 6, 9, 0, 0.0F);
        this.setRotation(head36, -0.1047197580337524F, 0.19198621809482574F, 0.0F);
        this.head30 = new ModelRenderer(this, 0, 45);
        this.head30.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head30.addBox(-3.5F, -7.199999809265137F, -7.800000190734863F, 7, 6, 2, 0.0F);
        this.setRotation(head30, -1.2217304706573486F, -0.0F, 0.0F);
        this.rightarm2 = new ModelRenderer(this, 134, 44);
        this.rightarm2.setRotationPoint(-5.0F, -1.5F, 0.0F);
        this.rightarm2.addBox(-4.5F, 3.0F, 0.0F, 4, 6, 4, 0.0F);
        this.setRotation(rightarm2, -0.4188790321350098F, -0.0F, 0.0F);
        this.head10 = new ModelRenderer(this, 38, 22);
        this.head10.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head10.addBox(-1.5F, -5.0F, -7.199999809265137F, 1, 1, 8, 0.0F);
        this.setRotation(head10, 0.024399814707723674F, 0.43569335187530495F, 0.057761264741490854F);
        this.head14BioMask = new ModelRenderer(this, 16, 0);
        this.head14BioMask.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head14BioMask.addBox(-1.0F, -2.5F, -4.300000190734863F, 2, 2, 5, 0.0F);
        this.rightleg3 = new ModelRenderer(this, 176, 38);
        this.rightleg3.setRotationPoint(-2.0F, 10.0F, 0.0F);
        this.rightleg3.addBox(-2.200000047683716F, 4.0F, -4.0F, 4, 4, 1, 0.0F);
        this.head50 = new ModelRenderer(this, 60, 110);
        this.head50.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head50.addBox(3.0F, -8.5F, 0.5F, 6, 9, 0, 0.0F);
        this.setRotation(head50, -0.10471975803375246F, -0.15707963705062866F, 0.0F);
        this.leftleg2 = new ModelRenderer(this, 176, 0);
        this.leftleg2.setRotationPoint(2.0F, 10.0F, 0.0F);
        this.leftleg2.addBox(1.7999999523162842F, 1.0F, -2.5999999046325684F, 1, 7, 5, 0.0F);
        this.setRotation(leftleg2, -0.13962633907794952F, -0.0F, -0.06981316953897475F);
        this.head7 = new ModelRenderer(this, 85, 30);
        this.head7.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head7.addBox(-2.0F, -5.900000095367432F, -6.800000190734863F, 0, 2, 1, 0.0F);
        this.setRotation(head7, 0.45323146962190447F, 0.27074538844277285F, 0.2537832774830515F);
        this.head29 = new ModelRenderer(this, 38, 56);
        this.head29.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head29.addBox(-3.5F, -6.199999809265137F, -7.800000190734863F, 7, 6, 3, 0.0F);
        this.setRotation(head29, -1.2217304706573486F, -0.0F, 0.0F);
        this.BiomaskHeadPlate = new ModelRenderer(this, 173, 57);
        this.BiomaskHeadPlate.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.BiomaskHeadPlate.addBox(-3.5F, -8.0F, -10.0F, 7, 8, 2, 0.0F);
        this.setRotation(BiomaskHeadPlate, -1.2217304706573486F, -0.0F, 0.0F);
        this.head37 = new ModelRenderer(this, 43, 77);
        this.head37.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head37.addBox(-10.0F, -9.0F, 2.5F, 6, 9, 0, 0.0F);
        this.setRotation(head37, -0.1047197580337524F, 0.19198621809482574F, 0.0F);
        this.head1 = new ModelRenderer(this, 65, 0);
        this.head1.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head1.addBox(0.5F, -2.0F, -4.0F, 1, 2, 5, 0.0F);
        this.setRotation(head1, 0.0F, 0.12217304855585097F, 0.0F);
        this.head5 = new ModelRenderer(this, 80, 30);
        this.head5.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head5.addBox(1.5F, -3.9000000953674316F, -6.800000190734863F, 1, 2, 1, 0.0F);
        this.setRotation(head5, 0.45323146962190447F, -0.27074538844277285F, -0.2537832774830515F);
        this.leftarm3 = new ModelRenderer(this, 86, 52);
        this.leftarm3.setRotationPoint(4.900000095367432F, -2.5F, -0.5F);
        this.leftarm3.addBox(0.5F, -1.5F, -2.0F, 3, 4, 4, 0.0F);
        this.setRotation(leftarm3, 0.06981316953897475F, -0.0F, -0.27925267815589905F);
        this.RCheekUpper = new ModelRenderer(this, 207, 88);
        this.RCheekUpper.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.RCheekUpper.addBox(-1.0F, -5.0F, -5.300000190734863F, 3, 2, 2, 0.0F);
        this.setRotation(RCheekUpper, 0.0F, 0.6457718014717102F, 0.0F);
        this.head16 = new ModelRenderer(this, 38, 10);
        this.head16.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head16.addBox(0.5F, -5.0F, -7.199999809265137F, 1, 1, 8, 0.0F);
        this.setRotation(head16, 0.024399814707723674F, -0.43569335187530495F, -0.057761264741490854F);
        this.head48 = new ModelRenderer(this, 30, 110);
        this.head48.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head48.addBox(4.0F, -9.0F, 2.5F, 6, 9, 0, 0.0F);
        this.setRotation(head48, -0.1047197580337524F, -0.19198621809482574F, 0.0F);
        this.leftarm2 = new ModelRenderer(this, 84, 39);
        this.leftarm2.setRotationPoint(4.900000095367432F, -1.5F, 0.0F);
        this.leftarm2.addBox(0.5F, 4.0F, -1.5F, 4, 6, 4, 0.0F);
        this.setRotation(leftarm2, -0.13962633907794952F, -0.0F, 0.0F);
        this.head38 = new ModelRenderer(this, 58, 77);
        this.head38.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head38.addBox(-10.0F, -9.5F, 3.5F, 6, 9, 0, 0.0F);
        this.setRotation(head38, -0.06981316953897476F, 0.2094395160675049F, 0.0F);
        this.head33 = new ModelRenderer(this, 69, 59);
        this.head33.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head33.addBox(-2.5F, -4.0F, 1.0F, 5, 2, 1, 0.0F);
        this.BiomaskSlope = new ModelRenderer(this, 174, 69);
        this.BiomaskSlope.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.BiomaskSlope.addBox(-4.0F, 0.0F, -9.0F, 8, 1, 1, 0.0F);
        this.setRotation(BiomaskSlope, -1.2217304706573486F, -0.0F, 0.0F);
        this.head15 = new ModelRenderer(this, 80, 36);
        this.head15.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head15.addBox(-1.0F, -3.0F, -4.0F, 2, 2, 0, 0.0F);
        this.head13Biomask = new ModelRenderer(this, 33, 0);
        this.head13Biomask.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head13Biomask.addBox(-1.5F, -2.5F, -4.0F, 1, 2, 5, 0.0F);
        this.setRotation(head13Biomask, 0.0F, -0.12217304855585097F, 0.0F);
        this.head21 = new ModelRenderer(this, 18, 10);
        this.head21.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head21.addBox(-2.5F, -2.0F, -2.0F, 5, 2, 4, 0.0F);
        this.head42 = new ModelRenderer(this, 38, 89);
        this.head42.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head42.addBox(2.0F, -10.0F, 2.0F, 0, 10, 8, 0.0F);
        this.setRotation(head42, 0.0F, 0.10471975803375246F, 0.0F);
        this.rightarm3 = new ModelRenderer(this, 103, 55);
        this.rightarm3.setRotationPoint(-4.900000095367432F, -2.5F, 0.0F);
        this.rightarm3.addBox(-3.5F, -1.5F, -2.0F, 3, 4, 4, 0.0F);
        this.setRotation(rightarm3, 0.06981316953897475F, -0.0F, 0.27925267815589905F);
        this.head = new ModelRenderer(this, 114, 89);
        this.head.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head.addBox(-1.0F, -10.0F, 2.0F, 0, 10, 8, 0.0F);
        this.setRotation(head, 0.01745329238474369F, -0.06981316953897476F, 0.0F);
        this.head34 = new ModelRenderer(this, 0, 77);
        this.head34.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head34.addBox(-8.0F, -8.0F, -0.5F, 5, 8, 0, 0.0F);
        this.setRotation(head34, -0.10471975803375246F, 0.15707963705062866F, 0.0F);
        this.head14 = new ModelRenderer(this, 16, 0);
        this.head14.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head14.addBox(-1.0F, -2.0F, -4.300000190734863F, 2, 2, 5, 0.0F);
        this.rightlegLower = new ModelRenderer(this, 155, 7);
        this.rightlegLower.setRotationPoint(-2.0F, 11.0F, 0.0F);
        this.rightlegLower.addBox(-2.5F, 6.0F, -3.5F, 4, 7, 5, 0.0F);
        this.head44 = new ModelRenderer(this, 76, 89);
        this.head44.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head44.addBox(-2.0F, -10.0F, 2.0F, 0, 10, 8, 0.0F);
        this.setRotation(head44, 0.0F, -0.24434609711170194F, 0.0F);
        this.Sights_1 = new ModelRenderer(this, 214, 55);
        this.Sights_1.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Sights_1.addBox(-3.5F, -8.899999618530273F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotation(Sights_1, 0.22406615555415907F, -0.10369694562713362F, -0.140385401790922F);
        this.LCheekLower2 = new ModelRenderer(this, 221, 98);
        this.LCheekLower2.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.LCheekLower2.addBox(-3.0F, -4.0F, -4.0F, 3, 3, 1, 0.0F);
        this.setRotation(LCheekLower2, 0.0F, -1.413716673851013F, 0.0F);
        this.head43 = new ModelRenderer(this, 57, 89);
        this.head43.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head43.addBox(1.0F, -10.0F, 2.0F, 0, 10, 8, 0.0F);
        this.setRotation(head43, 0.0F, 0.06981316953897476F, 0.0F);
        this.head13 = new ModelRenderer(this, 33, 0);
        this.head13.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head13.addBox(-1.5F, -2.0F, -4.0F, 1, 2, 5, 0.0F);
        this.setRotation(head13, 0.0F, -0.12217304855585097F, 0.0F);
        this.RCheekLower = new ModelRenderer(this, 207, 93);
        this.RCheekLower.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.RCheekLower.addBox(-1.0F, -4.0F, -5.0F, 3, 3, 1, 0.0F);
        this.setRotation(RCheekLower, 0.0F, 0.6457718014717102F, 0.0F);
        this.rightleg = new ModelRenderer(this, 155, 0);
        this.rightleg.setRotationPoint(-2.0F, 9.0F, 0.0F);
        this.rightleg.addBox(-2.0F, 0.0F, -2.5F, 4, 8, 5, 0.0F);
        this.setRotation(rightleg, -0.13962633907794952F, -0.0F, 0.06981316953897475F);
        this.head12 = new ModelRenderer(this, 80, 34);
        this.head12.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head12.addBox(-1.0F, -3.5F, -4.699999809265137F, 2, 1, 0, 0.0F);
        this.setRotation(head12, -0.15707963705062866F, -0.0F, 0.0F);
        this.head32 = new ModelRenderer(this, 7, 29);
        this.head32.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head32.addBox(2.5F, -4.0F, -2.0F, 0, 2, 4, 0.0F);
        this.leftlegLower = new ModelRenderer(this, 134, 7);
        this.leftlegLower.setRotationPoint(2.0F, 11.0F, 0.0F);
        this.leftlegLower.addBox(-1.5F, 6.0F, -3.5F, 4, 7, 5, 0.0F);
        this.RBiomaskRidge = new ModelRenderer(this, 180, 101);
        this.RBiomaskRidge.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.RBiomaskRidge.addBox(-4.5F, -10.5F, -8.699999809265137F, 3, 10, 1, 0.0F);
        this.setRotation(RBiomaskRidge, -1.1344640254974365F, -0.12217304855585097F, 0.0F);
        this.leftarm_1 = new ModelRenderer(this, 103, 42);
        this.leftarm_1.setRotationPoint(4.900000095367432F, -1.5F, 0.0F);
        this.leftarm_1.addBox(1.0F, 5.0F, -1.0F, 3, 7, 3, 0.0F);
        this.setRotation(leftarm_1, -0.13962633907794952F, -0.0F, 0.0F);
        this.head47 = new ModelRenderer(this, 15, 110);
        this.head47.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head47.addBox(4.0F, -9.5F, 3.5F, 6, 9, 0, 0.0F);
        this.setRotation(head47, -0.06981316953897476F, -0.2094395160675049F, 0.0F);
        this.head52 = new ModelRenderer(this, 88, 110);
        this.head52.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head52.addBox(3.0F, -8.0F, -1.5F, 5, 8, 0, 0.0F);
        this.setRotation(head52, -0.1047197580337524F, -0.06981316953897476F, 0.0F);
        this.LCheekUpper2 = new ModelRenderer(this, 221, 104);
        this.LCheekUpper2.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.LCheekUpper2.addBox(-3.0F, -5.0F, -4.300000190734863F, 3, 1, 1, 0.0F);
        this.setRotation(LCheekUpper2, 0.0F, -1.4835298061370847F, 0.0F);
        this.head20 = new ModelRenderer(this, 90, 37);
        this.head20.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head20.addBox(-0.5F, -5.0F, -6.699999809265137F, 2, 1, 0, 0.0F);
        this.setRotation(head20, 0.024399814707723674F, 0.43569335187530495F, 0.057761264741490854F);
        this.head26 = new ModelRenderer(this, 19, 43);
        this.head26.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head26.addBox(-3.0F, -8.199999809265137F, -9.800000190734863F, 6, 8, 2, 0.0F);
        this.setRotation(head26, -1.2217304706573486F, -0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 103, 35);
        this.leftarm.setRotationPoint(4.900000095367432F, -2.5F, 0.0F);
        this.leftarm.addBox(0.0F, -1.0F, -2.0F, 3, 7, 3, 0.0F);
        this.setRotation(leftarm, 0.06981316953897475F, -0.0F, -0.17453292012214658F);
        this.BiomaskSlope3 = new ModelRenderer(this, 178, 77);
        this.BiomaskSlope3.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.BiomaskSlope3.addBox(-1.5F, -8.0F, -3.0999999046325684F, 3, 1, 1, 0.0F);
        this.setRotation(BiomaskSlope3, 0.19198621809482574F, -0.0F, 0.0F);
        this.blade2 = new ModelRenderer(this, 89, 26);
        this.blade2.setRotationPoint(-5.0F, -1.5F, 0.0F);
        this.blade2.addBox(-6.0F, 9.0F, 1.5F, 2, 10, 0, 0.0F);
        this.setRotation(blade2, -0.4188790321350098F, -0.0F, 0.0F);
        this.LBiomaskRidge = new ModelRenderer(this, 180, 115);
        this.LBiomaskRidge.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.LBiomaskRidge.addBox(1.5F, -10.5F, -8.699999809265137F, 3, 10, 1, 0.0F);
        this.setRotation(LBiomaskRidge, -1.1344640254974365F, 0.12217304855585097F, 0.0F);
        this.head24 = new ModelRenderer(this, 25, 19);
        this.head24.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head24.addBox(-8.0F, -8.0F, -1.5F, 5, 8, 0, 0.0F);
        this.setRotation(head24, -0.1047197580337524F, 0.06981316953897476F, 0.0F);
        this.head49 = new ModelRenderer(this, 45, 110);
        this.head49.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head49.addBox(4.0F, -9.0F, 1.5F, 6, 9, 0, 0.0F);
        this.setRotation(head49, -0.1047197580337524F, -0.19198621809482574F, 0.0F);
        this.head46 = new ModelRenderer(this, 0, 110);
        this.head46.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head46.addBox(5.0F, -10.0F, 2.5F, 6, 9, 0, 0.0F);
        this.setRotation(head46, 0.0F, -0.5235987901687622F, 0.0F);
        this.head41 = new ModelRenderer(this, 19, 89);
        this.head41.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head41.addBox(2.0F, -10.0F, 2.0F, 0, 10, 8, 0.0F);
        this.setRotation(head41, 0.0F, 0.24434609711170194F, 0.0F);
        this.head51 = new ModelRenderer(this, 75, 110);
        this.head51.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head51.addBox(3.0F, -8.0F, -0.5F, 5, 8, 0, 0.0F);
        this.setRotation(head51, -0.10471975803375246F, -0.15707963705062866F, 0.0F);
        this.head22 = new ModelRenderer(this, 56, 49);
        this.head22.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head22.addBox(-1.0F, -5.0F, 0.800000011920929F, 3, 4, 0, 0.0F);
        this.setRotation(head22, 0.0F, 0.5410520434379578F, 0.0F);
        this.head3 = new ModelRenderer(this, 59, 22);
        this.head3.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head3.addBox(1.5F, -1.5F, -7.0F, 1, 1, 8, 0.0F);
        this.setRotation(head3, 0.2437919535543996F, -0.27074538844277285F, -0.2537832774830515F);
        this.rightarm = new ModelRenderer(this, 119, 35);
        this.rightarm.setRotationPoint(-4.900000095367432F, -2.5F, 0.0F);
        this.rightarm.addBox(-3.0F, -1.0F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotation(rightarm, 0.06981316953897475F, -0.0F, 0.17453292012214658F);
        this.RCheekLower2 = new ModelRenderer(this, 207, 98);
        this.RCheekLower2.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.RCheekLower2.addBox(0.0F, -4.0F, -4.0F, 3, 3, 1, 0.0F);
        this.setRotation(RCheekLower2, 0.0F, 1.413716673851013F, 0.0F);
        this.LCheekUpper = new ModelRenderer(this, 219, 88);
        this.LCheekUpper.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.LCheekUpper.addBox(-2.0F, -5.0F, -5.300000190734863F, 3, 2, 2, 0.0F);
        this.setRotation(LCheekUpper, 0.0F, -0.6457718014717102F, 0.0F);
        this.head31 = new ModelRenderer(this, 7, 37);
        this.head31.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head31.addBox(-2.5F, -4.0F, -2.0F, 0, 2, 4, 0.0F);
        this.head35 = new ModelRenderer(this, 13, 77);
        this.head35.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head35.addBox(-9.0F, -8.5F, 0.5F, 6, 9, 0, 0.0F);
        this.setRotation(head35, -0.10471975803375246F, 0.15707963705062866F, 0.0F);
        this.head11 = new ModelRenderer(this, 48, 1);
        this.head11.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head11.addBox(-1.0F, -4.5F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotation(head11, -0.15707963705062866F, -0.0F, 0.0F);
        this.leftleg3 = new ModelRenderer(this, 176, 30);
        this.leftleg3.setRotationPoint(2.0F, 10.0F, 0.0F);
        this.leftleg3.addBox(-1.7999999523162842F, 4.0F, -4.0F, 4, 4, 1, 0.0F);
        this.head9 = new ModelRenderer(this, 42, 34);
        this.head9.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head9.addBox(-2.0F, -4.5F, -6.5F, 0, 4, 8, 0.0F);
        this.setRotation(head9, 0.015005967811893462F, 0.2788597256800733F, 0.054465862515085284F);
        this.rightleg2 = new ModelRenderer(this, 176, 15);
        this.rightleg2.setRotationPoint(-2.0F, 10.0F, 0.0F);
        this.rightleg2.addBox(-2.799999952316284F, 1.0F, -2.5999999046325684F, 1, 7, 5, 0.0F);
        this.setRotation(rightleg2, -0.13962633907794952F, -0.0F, 0.06981316953897475F);
        this.BiomaskMouth = new ModelRenderer(this, 180, 87);
        this.BiomaskMouth.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.BiomaskMouth.addBox(-1.5F, -5.0F, -5.5F, 3, 5, 2, 0.0F);
        this.body1 = new ModelRenderer(this, 80, 0);
        this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body1.addBox(-5.0F, -4.0F, -3.0F, 5, 5, 5, 0.0F);
        this.setRotation(body1, 0.0F, -0.0F, -0.08726646006107329F);
        this.head27 = new ModelRenderer(this, 0, 18);
        this.head27.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head27.addBox(-3.5F, -7.0F, -9.5F, 7, 1, 4, 0.0F);
        this.setRotation(head27, -1.3613568544387817F, -0.0F, 0.0F);
        this.head45 = new ModelRenderer(this, 95, 89);
        this.head45.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head45.addBox(-2.0F, -10.0F, 2.0F, 0, 10, 8, 0.0F);
        this.setRotation(head45, 0.0F, -0.10471975803375246F, 0.0F);
        this.body = new ModelRenderer(this, 103, 13);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-4.5F, -4.0F, -2.5F, 9, 14, 5, 0.0F);
        this.head8 = new ModelRenderer(this, 61, 34);
        this.head8.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head8.addBox(2.0F, -4.5F, -6.5F, 0, 4, 8, 0.0F);
        this.setRotation(head8, 0.10227242787296675F, -0.2788597256800733F, -0.054465862515085284F);
        this.head2 = new ModelRenderer(this, 59, 10);
        this.head2.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head2.addBox(-2.5F, -1.5F, -7.0F, 1, 1, 8, 0.0F);
        this.setRotation(head2, 0.2437919535543996F, 0.27074538844277285F, 0.2537832774830515F);
        this.head17 = new ModelRenderer(this, 65, 49);
        this.head17.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head17.addBox(-4.5F, -4.699999809265137F, -4.199999809265137F, 6, 0, 2, 0.0F);
        this.setRotation(head17, 0.0F, -0.34906584024429316F, 0.0F);
        this.head18 = new ModelRenderer(this, 65, 54);
        this.head18.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head18.addBox(-1.5F, -4.699999809265137F, -4.199999809265137F, 6, 0, 2, 0.0F);
        this.setRotation(head18, 0.0F, 0.34906584024429316F, 0.0F);
        this.head40 = new ModelRenderer(this, 0, 89);
        this.head40.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head40.addBox(0.0F, -10.0F, 2.0F, 0, 10, 8, 0.0F);
        this.head4 = new ModelRenderer(this, 80, 25);
        this.head4.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head4.addBox(-2.5F, -3.9000000953674316F, -6.800000190734863F, 1, 2, 1, 0.0F);
        this.setRotation(head4, 0.45323146962190447F, 0.27074538844277285F, 0.2537832774830515F);
        this.RCheekUpper2 = new ModelRenderer(this, 207, 104);
        this.RCheekUpper2.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.RCheekUpper2.addBox(0.30000001192092896F, -5.0F, -4.300000190734863F, 3, 1, 1, 0.0F);
        this.setRotation(RCheekUpper2, 0.0F, 1.4835298061370847F, 0.0F);
        this.head6 = new ModelRenderer(this, 85, 25);
        this.head6.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head6.addBox(2.0F, -5.900000095367432F, -6.800000190734863F, 0, 2, 1, 0.0F);
        this.setRotation(head6, 0.45323146962190447F, -0.27074538844277285F, -0.2537832774830515F);
        this.LEyeSide = new ModelRenderer(this, 219, 78);
        this.LEyeSide.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.LEyeSide.addBox(3.200000047683716F, -8.0F, -3.200000047683716F, 1, 4, 4, 0.0F);
        this.setRotation(LEyeSide, 0.0F, 0.17453292012214658F, 0.0F);
        this.head_1 = new ModelRenderer(this, 103, 0);
        this.head_1.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head_1.addBox(-3.5F, -7.5F, -4.599999904632568F, 7, 4, 6, 0.0F);
        this.setRotation(head_1, -0.15707963705062866F, -0.0F, 0.0F);
        this.head23 = new ModelRenderer(this, 47, 49);
        this.head23.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head23.addBox(-2.0F, -5.0F, 0.800000011920929F, 3, 4, 0, 0.0F);
        this.setRotation(head23, 0.0F, -0.5410520434379578F, 0.0F);
        this.head39 = new ModelRenderer(this, 73, 77);
        this.head39.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head39.addBox(-11.0F, -10.0F, 2.5F, 6, 9, 0, 0.0F);
        this.setRotation(head39, 0.0F, 0.5235987901687622F, 0.0F);
        this.head28 = new ModelRenderer(this, 13, 56);
        this.head28.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head28.addBox(-3.5F, -8.899999618530273F, -4.400000095367432F, 7, 6, 4, 0.0F);
        this.setRotation(head28, -0.7330383062362671F, -0.0F, 0.0F);
        this.biomaksVisor = new ModelRenderer(this, 176, 82);
        this.biomaksVisor.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.biomaksVisor.addBox(-3.5F, -6.5F, -5.300000190734863F, 7, 3, 1, 0.0F);
        this.setRotation(biomaksVisor, -0.22689279913902285F, -0.0F, 0.0F);
        this.blade1 = new ModelRenderer(this, 96, 26);
        this.blade1.setRotationPoint(-5.0F, -1.5F, 0.0F);
        this.blade1.addBox(-6.0F, 9.0F, 2.5F, 2, 10, 0, 0.0F);
        this.setRotation(blade1, -0.4188790321350098F, -0.0F, 0.0F);
        this.BiomaskSlope2 = new ModelRenderer(this, 178, 73);
        this.BiomaskSlope2.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.BiomaskSlope2.addBox(-1.5F, -4.5F, -7.900000095367432F, 3, 1, 1, 0.0F);
        this.setRotation(BiomaskSlope2, -0.593411922454834F, -0.0F, 0.0F);
        this.REyeSide = new ModelRenderer(this, 207, 78);
        this.REyeSide.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.REyeSide.addBox(-4.199999809265137F, -8.0F, -3.200000047683716F, 1, 4, 4, 0.0F);
        this.setRotation(REyeSide, 0.0F, -0.17453292012214658F, 0.0F);
        this.leftleg = new ModelRenderer(this, 134, 0);
        this.leftleg.setRotationPoint(2.0F, 9.0F, 0.0F);
        this.leftleg.addBox(-2.0F, 0.0F, -2.5F, 4, 8, 5, 0.0F);
        this.setRotation(leftleg, -0.13962633907794952F, -0.0F, -0.06981316953897475F);
        this.body2 = new ModelRenderer(this, 80, 13);
        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body2.addBox(0.0F, -4.0F, -3.0F, 5, 5, 5, 0.0F);
        this.setRotation(body2, 0.0F, -0.0F, 0.08726646006107329F);
        this.rightarm_1 = new ModelRenderer(this, 119, 42);
        this.rightarm_1.setRotationPoint(-4.900000095367432F, -1.5F, 0.0F);
        this.rightarm_1.addBox(-4.0F, 5.0F, 0.5F, 3, 7, 3, 0.0F);
        this.setRotation(rightarm_1, -0.4188790321350098F, -0.0F, 0.0F);
    }

    @Override
    protected void render(IRenderObject renderObject, float boxTranslation)
    {
        RenderObject o = (RenderObject) renderObject;
        
        this.rightarm.rotateAngleX = MathHelper.cos(o.swingProgress * boxTranslation + (float) Math.PI) * 2.0F * o.swingProgressPrev * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.rightarm2.rotateAngleX = this.rightarm.rotateAngleX;
        this.rightarm2.rotateAngleZ = this.rightarm.rotateAngleZ;
        this.rightarm3.rotateAngleX = this.rightarm.rotateAngleX;
        this.rightarm3.rotateAngleZ = this.rightarm.rotateAngleZ;
        this.blade1.rotateAngleX = this.rightarm.rotateAngleX;
        this.blade1.rotateAngleZ = this.rightarm.rotateAngleZ;
        this.blade2.rotateAngleX = this.rightarm.rotateAngleX;
        this.blade2.rotateAngleZ = this.rightarm.rotateAngleZ;
        this.leftarm.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 2.0F * o.swingProgressPrev * 0.5F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.leftarm2.rotateAngleX = this.leftarm.rotateAngleX;
        this.leftarm2.rotateAngleZ = this.leftarm.rotateAngleZ;
        this.leftarm3.rotateAngleX = this.leftarm.rotateAngleX;
        this.leftarm3.rotateAngleZ = this.leftarm.rotateAngleZ;
        this.rightleg.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev;
        this.rightleg.rotateAngleY = 0.0F;
        this.rightleg.rotateAngleX = this.rightleg.rotateAngleX;
        this.rightleg2.rotateAngleX = this.rightleg.rotateAngleX;
        this.rightleg2.rotateAngleZ = this.rightleg.rotateAngleZ;
        this.rightleg3.rotateAngleX = this.rightleg.rotateAngleX;
        this.rightleg3.rotateAngleZ = this.rightleg.rotateAngleZ;
        this.leftleg.rotateAngleX = MathHelper.cos(o.swingProgress * 0.6662F + (float) Math.PI) * 1.4F * o.swingProgressPrev;
        this.leftleg.rotateAngleY = 0.0F;
        this.leftleg2.rotateAngleX = this.leftleg.rotateAngleX;
        this.leftleg2.rotateAngleZ = this.leftleg.rotateAngleZ;
        this.leftleg3.rotateAngleX = this.leftleg.rotateAngleX;
        this.leftleg3.rotateAngleZ = this.leftleg.rotateAngleZ;

        this.head19.render(boxTranslation);
        this.SightsLaser.render(boxTranslation);
        this.Sights.render(boxTranslation);
        this.head25.render(boxTranslation);
        this.LCheekLower.render(boxTranslation);
        this.head36.render(boxTranslation);
        this.head30.render(boxTranslation);
        this.head10.render(boxTranslation);
        this.head50.render(boxTranslation);
        this.head7.render(boxTranslation);
        this.head29.render(boxTranslation);
        this.head37.render(boxTranslation);
        this.head1.render(boxTranslation);
        this.head5.render(boxTranslation);
        this.RCheekUpper.render(boxTranslation);
        this.head16.render(boxTranslation);
        this.head48.render(boxTranslation);
        this.head38.render(boxTranslation);
        this.head33.render(boxTranslation);
        this.head15.render(boxTranslation);
        this.head21.render(boxTranslation);
        this.head42.render(boxTranslation);
        this.head.render(boxTranslation);
        this.head34.render(boxTranslation);
        this.head14.render(boxTranslation);
        this.head44.render(boxTranslation);
        this.head43.render(boxTranslation);
        this.head13.render(boxTranslation);
        this.RCheekLower.render(boxTranslation);
        this.head12.render(boxTranslation);
        this.head32.render(boxTranslation);
        this.head47.render(boxTranslation);
        this.head52.render(boxTranslation);
        this.LCheekUpper2.render(boxTranslation);
        this.head20.render(boxTranslation);
        this.head26.render(boxTranslation);
        this.head24.render(boxTranslation);
        this.head49.render(boxTranslation);
        this.head46.render(boxTranslation);
        this.head41.render(boxTranslation);
        this.head51.render(boxTranslation);
        this.head22.render(boxTranslation);
        this.head3.render(boxTranslation);
        this.LCheekUpper.render(boxTranslation);
        this.head31.render(boxTranslation);
        this.head35.render(boxTranslation);
        this.head11.render(boxTranslation);
        this.head9.render(boxTranslation);
        this.body1.render(boxTranslation);
        this.head27.render(boxTranslation);
        this.head45.render(boxTranslation);
        this.body.render(boxTranslation);
        this.head8.render(boxTranslation);
        this.head2.render(boxTranslation);
        this.head17.render(boxTranslation);
        this.head18.render(boxTranslation);
        this.head40.render(boxTranslation);
        this.head4.render(boxTranslation);
        this.RCheekUpper2.render(boxTranslation);
        this.head6.render(boxTranslation);
        this.head_1.render(boxTranslation);
        this.head23.render(boxTranslation);
        this.head39.render(boxTranslation);
        this.head28.render(boxTranslation);
        this.body2.render(boxTranslation);

        EntitySpeciesYautja predator = (EntitySpeciesYautja) o.getEntity();

        if (predator != null && predator.isWearingMask())
        {
            this.biomaksVisor.render(boxTranslation);
            this.BiomaskSlope2.render(boxTranslation);
            this.REyeSide.render(boxTranslation);
            this.LEyeSide.render(boxTranslation);
            this.BiomaskMouth.render(boxTranslation);
            this.RCheekLower2.render(boxTranslation);
            this.BiomaskSlope3.render(boxTranslation);
            this.LBiomaskRidge.render(boxTranslation);
            this.RBiomaskRidge.render(boxTranslation);
            this.Sights_1.render(boxTranslation);
            this.LCheekLower2.render(boxTranslation);
            this.head13Biomask.render(boxTranslation);
            this.BiomaskSlope.render(boxTranslation);
            this.head1Biomask.render(boxTranslation);
            this.head14BioMask.render(boxTranslation);
            this.BiomaskHeadPlate.render(boxTranslation);
        }

        OpenGL.pushMatrix();
        {
            float rightArmRotation = MathHelper.cos(o.swingProgress * boxTranslation + (float) Math.PI) * 2.0F * o.swingProgressPrev * 0.5F;
            OpenGL.rotate(rightArmRotation * 60, 1F, 0F, 0F);
            this.rightarm.render(boxTranslation);
            this.rightarm_1.render(boxTranslation);
            this.rightarm3.render(boxTranslation);
            this.rightarm2.render(boxTranslation);
            this.blade1.render(boxTranslation);
            this.blade2.render(boxTranslation);
        }
        OpenGL.popMatrix();

        OpenGL.pushMatrix();
        {
            float leftArmRotation = -MathHelper.cos(o.swingProgress * boxTranslation + (float) Math.PI) * 2.0F * o.swingProgressPrev * 0.5F;
            OpenGL.rotate(leftArmRotation * 60, 1F, 0F, 0F);
            this.leftarm.render(boxTranslation);
            this.leftarm_1.render(boxTranslation);
            this.leftarm2.render(boxTranslation);
            this.leftarm3.render(boxTranslation);
        }
        OpenGL.popMatrix();

        OpenGL.pushMatrix();
        {
            float leftLegRotation = -MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev;
            OpenGL.rotate(leftLegRotation * 20, 1F, 0F, 0F);
            this.leftleg.render(boxTranslation);
            this.leftleg2.render(boxTranslation);
            this.leftleg3.render(boxTranslation);
            this.leftlegLower.render(boxTranslation);
        }
        OpenGL.popMatrix();

        OpenGL.pushMatrix();
        {
            float rightLegRotation = MathHelper.cos(o.swingProgress * 0.6662F) * 1.4F * o.swingProgressPrev;
            OpenGL.rotate(rightLegRotation * 20, 1F, 0F, 0F);
            this.rightleg.render(boxTranslation);
            this.rightleg2.render(boxTranslation);
            this.rightleg3.render(boxTranslation);
            this.rightlegLower.render(boxTranslation);
        }
        OpenGL.popMatrix();
    }
}
