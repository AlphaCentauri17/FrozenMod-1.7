package alphacentauri17.FrozenMod.common.mobs;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class EntityOlaf extends EntityAnimal
{

public EntityOlaf(World par1world)
{
super(par1world);

this.setSize(1.0F, 1.75F);

this.getNavigator().setAvoidsWater(false);

this.tasks.addTask(0, new EntityAISwimming(this));
this.tasks.addTask(1, new EntityAIWander(this, .5D));
this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
}
/*
@Override
protected void applyEntityAttributes()
{
  super.applyEntityAttributes();
  // Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
  this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(20.0D);
  // Follow Range - default 32.0D - min 0.0D - max 2048.0D
  this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(32.0D);
  // Knockback Resistance - default 0.0D - min 0.0D - max 1.0D
  this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setAttribute(0.0D);
  // Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
  this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.5D);
  // Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
}
*/
public void onLivingUpdate()
{

super.onLivingUpdate();
int i = MathHelper.floor_double(this.posX);
int j = MathHelper.floor_double(this.posZ);
j = MathHelper.floor_double(this.posX + (double)((float)(i % 2 * 2 - 1) * 0.25F));
int k = MathHelper.floor_double(this.posY);
int m = MathHelper.floor_double(this.posY - 2F);
int n = MathHelper.floor_double(this.posY - 2F);
int l = MathHelper.floor_double(this.posZ + (double)((float)(i / 2 % 2 * 2 - 1) * 0.25F));
int f = MathHelper.floor_double(this.posY - 1F);

        if (this.worldObj.getBlockMetadata(j, k, l) == 0 && Blocks.snow_layer.canPlaceBlockAt(this.worldObj, j, k, l))
        {
            this.worldObj.setBlock(j, k, l, Blocks.snow_layer);}
		}
public EnumCreatureAttribute getCreatureAttribute()
{
return EnumCreatureAttribute.UNDEFINED;
}

protected boolean isAIEnabled()
{
return true;
}

protected boolean canDespawn()
{
return false;
}
protected Item getDropItemId()
{
    return Items.snowball;
}
@Override
public EntityAgeable createChild(EntityAgeable entityageable) {
// TODO Auto-generated method stub
return null;
}

}
