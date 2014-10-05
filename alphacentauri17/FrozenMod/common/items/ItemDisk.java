package alphacentauri17.FrozenMod.common.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import alphacentauri17.FrozenMod.common.FrozenMod;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.IIconRegister;

public class ItemDisk extends ItemRecord
{
public ItemDisk()
{
super("Let It Go");
}
public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4)
{
	list.add("Cannot Play Because of Copyright");    	
}	
@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister iconRegister)
{
itemIcon = iconRegister.registerIcon("FrozenMod:" + "Let It Go");
}
}