package alphacentauri17.FrozenMod.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.SidedProxy;
import alphacentauri17.FrozenMod.common.FrozenModCommonProxy;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import alphacentauri17.FrozenMod.common.items.IceBreak;
import alphacentauri17.FrozenMod.common.items.ItemDisk;
import alphacentauri17.FrozenMod.common.items.ItemElsaPower;
import alphacentauri17.FrozenMod.common.items.ItemIceCube;
import alphacentauri17.FrozenMod.common.items.ItemKristoffPickaxe;
import alphacentauri17.FrozenMod.common.items.ItemOpenDoorDisk;
import alphacentauri17.FrozenMod.common.items.ItemSnowmanDisk;
import alphacentauri17.FrozenMod.common.items.ItemWandOfWinter;
import alphacentauri17.FrozenMod.common.mobs.EntityAnna;
import alphacentauri17.FrozenMod.common.mobs.EntityElsa;
import alphacentauri17.FrozenMod.common.mobs.EntityKristoff;
import alphacentauri17.FrozenMod.common.mobs.EntityOlaf;

//MOD BASICS
@Mod(modid="FrozenMod",name="Frozen Mod",version="0.0.3 FIX :)")

public class FrozenMod {

	public static final String modid = "Frozen Mod";	

//ITEMS
public static Item Disk;
public static Item SnowmanDisk;
public static Item OpenDoorDisk;
public static Item KristoffPickaxe;
public static Item ElsaPower;
public static Item WandOfWinter;
public static Item IceCube;

public static CreativeTabs FrozenTab = new CreativeTabs("Frozen Mod"){
	public Item getTabIconItem(){
		return FrozenMod.IceCube;
	}
};
@EventHandler
public void PreInitFrozenMod(FMLPreInitializationEvent e){

	//ITEMS
	Disk = new ItemDisk().setUnlocalizedName("Let It Go").setCreativeTab(FrozenTab);	
	GameRegistry.registerItem(Disk, modid + (Disk.setUnlocalizedName("Disk")));
	SnowmanDisk = new ItemSnowmanDisk() .setUnlocalizedName("Do You Want To Build A Snowman").setTextureName("FrozenMod:Do You Want To Build A Snowman").setCreativeTab(FrozenTab);
	GameRegistry.registerItem(SnowmanDisk, modid + (SnowmanDisk.setUnlocalizedName("Do You Want To Build A Snowman")));
	OpenDoorDisk = new ItemOpenDoorDisk() .setUnlocalizedName("Love Is An Open Door").setTextureName("Love Is An Open Door").setCreativeTab(FrozenTab);
	GameRegistry.registerItem(OpenDoorDisk, modid + (OpenDoorDisk.setUnlocalizedName("Love Is An Open Door")));
	KristoffPickaxe = new ItemKristoffPickaxe() .setUnlocalizedName("Kristoff's Pickaxe").setTextureName("KristoffPickaxe").setCreativeTab(FrozenTab);
	GameRegistry.registerItem(KristoffPickaxe, modid + (KristoffPickaxe.setUnlocalizedName("Kristoff's Pickaxe")));
	ElsaPower = new ItemElsaPower() .setUnlocalizedName("Elsa's Power").setTextureName("ElsaPower") .setCreativeTab(FrozenTab);
	GameRegistry.registerItem(ElsaPower, modid + (ElsaPower.setUnlocalizedName("Elsa's Power")));
	WandOfWinter = new ItemWandOfWinter() .setUnlocalizedName("Wand of Winter's Power").setTextureName("WandOfWinter") .setCreativeTab(FrozenTab);
	GameRegistry.registerItem(WandOfWinter, modid + (WandOfWinter.setUnlocalizedName("Wand Of Winter's Power")));
	IceCube = new ItemIceCube () .setUnlocalizedName ("Ice Cube").setTextureName("IceCube") .setCreativeTab (FrozenTab);
	GameRegistry.registerItem(IceCube, modid + (IceCube.setUnlocalizedName("Ice Cube")));


/* Not Safe Yet
	//NPCs
	//Kristoff
	EntityRegistry.registerModEntity(EntityKristoff.class, "Kristoff", 1, this, 80, 3, true);
	EntityList.addMapping(EntityKristoff.class, "Kristoff", 500, 0x75FAFA, 0x161EFA);
	//Elsa
	EntityRegistry.registerModEntity(EntityElsa.class, "Elsa", 2, this, 80, 3, true);
	EntityList.addMapping(EntityElsa.class, "Elsa", 501, 0x75FAFA, 0x161EFA);
	//Anna
	EntityRegistry.registerModEntity(EntityAnna.class, "Anna", 3, this, 80, 3, true);
	EntityList.addMapping(EntityAnna.class, "Anna", 502, 0x75FAFA, 0x161EFA);
	//Olaf
	EntityRegistry.registerModEntity(EntityOlaf.class, "Olaf", 4, this, 80, 3, true);
	EntityList.addMapping(EntityOlaf.class, "Olaf", 503, 0x75FAFA, 0x161EFA);
*/	
	//Kristoff
	 EntityRegistry.registerModEntity(EntityKristoff.class, "Kristoff", 1, this, 80, 3, true);
	 EntityList.addMapping(EntityKristoff.class, "Kristoff", 500, 0x523a37, 0x5b7971);
	 
	 //Anna
	 EntityRegistry.registerModEntity(EntityAnna.class, "Anna", 2, this, 80, 3, true);
	 EntityList.addMapping(EntityAnna.class, "Anna",501, 0x7D9810, 0x465215);
	 
	 //Elsa
	 EntityRegistry.registerModEntity(EntityElsa.class, "Elsa", 3, this, 80, 3, true);
	 EntityList.addMapping(EntityElsa.class, "Elsa", 502, 0x75FAFA, 0x161EFA);

}





public void InitFrozenMod(FMLInitializationEvent event){ //Your main initialization method

MinecraftForge.EVENT_BUS.register(new IceBreak());	



}

public void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
int id = EntityRegistry.findGlobalUniqueEntityId();

EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
}

public void addSpawn(Class<? extends EntityLiving> entityClass, int spawnProb, int min, int max, BiomeGenBase[] biomes) {
if (spawnProb > 0) {
EntityRegistry.addSpawn(entityClass, spawnProb, min, max, EnumCreatureType.creature, biomes);
}
}
}