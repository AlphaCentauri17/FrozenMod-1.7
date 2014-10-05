package alphacentauri17.FrozenMod.common.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWandOfWinter extends Item
{
public ItemWandOfWinter()
{
super();
}

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister iconRegister)
{
itemIcon = iconRegister.registerIcon("FrozenMod:" + "WandOfWinter");
}
}