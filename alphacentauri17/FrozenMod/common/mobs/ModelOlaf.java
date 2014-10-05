package alphacentauri17.FrozenMod.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelOlaf extends ModelBase
{
  //fields
    ModelRenderer lowerbody;
    ModelRenderer foot1;
    ModelRenderer foot2;
    ModelRenderer upperbody;
    ModelRenderer head;
    ModelRenderer nose;
    ModelRenderer arm1;
    ModelRenderer arm2;
  
  public ModelOlaf()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      lowerbody = new ModelRenderer(this, 0, 0);
      lowerbody.addBox(0F, 0F, 0F, 7, 5, 6);
      lowerbody.setRotationPoint(-4F, 16F, 0F);
      lowerbody.setTextureSize(64, 32);
      lowerbody.mirror = true;
      setRotation(lowerbody, 0F, 0F, 0F);
      foot1 = new ModelRenderer(this, 64, 0);
      foot1.addBox(0F, 0F, -4F, 3, 1, 4);
      foot1.setRotationPoint(0F, 21F, 5F);
      foot1.setTextureSize(64, 32);
      foot1.mirror = true;
      setRotation(foot1, 0F, 0F, 0F);
      foot2 = new ModelRenderer(this, 43, 0);
      foot2.addBox(0F, 0F, -4F, 3, 1, 4);
      foot2.setRotationPoint(-4F, 21F, 5F);
      foot2.setTextureSize(64, 32);
      foot2.mirror = true;
      setRotation(foot2, 0F, 0F, 0F);
      upperbody = new ModelRenderer(this, 4, 26);
      upperbody.addBox(0F, 0F, 0F, 5, 4, 4);
      upperbody.setRotationPoint(-3F, 12F, 1F);
      upperbody.setTextureSize(64, 32);
      upperbody.mirror = true;
      setRotation(upperbody, 0F, 0F, 0F);
      head = new ModelRenderer(this, 8, 44);
      head.addBox(0F, 0F, 0F, 3, 4, 4);
      head.setRotationPoint(-2F, 8F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      nose = new ModelRenderer(this, 83, 0);
      nose.addBox(0F, 0F, 0F, 1, 1, 2);
      nose.setRotationPoint(-1F, 10F, -2F);
      nose.setTextureSize(64, 32);
      nose.mirror = true;
      setRotation(nose, 0F, 0F, 0F);
      arm1 = new ModelRenderer(this, 28, 0);
      arm1.addBox(-5F, 0F, 0F, 5, 1, 1);
      arm1.setRotationPoint(-3F, 13F, 3F);
      arm1.setTextureSize(64, 32);
      arm1.mirror = true;
      setRotation(arm1, 0F, 0F, -0.9448118F);
      arm2 = new ModelRenderer(this, 28, 4);
      arm2.addBox(0F, 0F, 0F, 5, 1, 1);
      arm2.setRotationPoint(2F, 13F, 3F);
      arm2.setTextureSize(64, 32);
      arm2.mirror = true;
      setRotation(arm2, 0F, 0F, 0.8943935F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    lowerbody.render(f5);
    foot1.render(f5);
    foot2.render(f5);
    upperbody.render(f5);
    head.render(f5);
    nose.render(f5);
    arm1.render(f5);
    arm2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);

    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.arm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * -1.4F * f1;
    this.arm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.foot1.rotateAngleX = MathHelper.cos((float)Math.PI)*-1.4F *f1; 
    this.foot2.rotateAngleX = MathHelper.cos(f * 0.6662F) * -1.4F * f1;
  }
 

}

