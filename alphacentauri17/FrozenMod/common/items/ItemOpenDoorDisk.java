package alphacentauri17.FrozenMod.common.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemOpenDoorDisk extends ItemRecord
{
public ItemOpenDoorDisk()
{
super("Love Is An Open Door");
}
public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4)
{
	list.add("Cannot Play Because of Copyright"); 
}
@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister iconRegister)
{
itemIcon = iconRegister.registerIcon("FrozenMod:" + "Love Is An Open Door");
}
}