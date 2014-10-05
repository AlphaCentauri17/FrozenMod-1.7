package alphacentauri17.FrozenMod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class FrozenModCommonProxy implements IGuiHandler{ //THIS IS IMPORTANT, CANNOT BE A PROXY/GUI HANDLER WITHOUT THIS!!
public void registerRenderInformation() //Client side texture registering
{
}
@Override
public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
return null;
}
@Override
public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
return null;
}

public void registerTiles(){ //For registering TileEntities
}

public void registerBlocks(){ //For registering Blocks
}

public void registerItems(){ //For registering Items
//KristoffPickaxe
GameRegistry.addRecipe(new ItemStack(FrozenMod.KristoffPickaxe), "MNM"," N "," N ", Character.valueOf('M'), Items.iron_ingot, Character.valueOf('N'), Items.stick);
//WandOfWinter;
GameRegistry.addRecipe(new ItemStack(FrozenMod.WandOfWinter), " Y "," X "," Z ", Character.valueOf('Y'), FrozenMod.ElsaPower, Character.valueOf('X'), Items.diamond, Character.valueOf('Z'), Items.stick);
//IceCube
GameRegistry.addRecipe(new ItemStack(Blocks.ice), "XX ","XX ","   ", Character.valueOf('X'), FrozenMod.IceCube);
}
}