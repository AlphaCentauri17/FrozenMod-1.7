package alphacentauri17.FrozenMod.common.items;

import com.google.common.eventbus.Subscribe;

import net.minecraft.block.Block;
import net.minecraft.block.BlockIce;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import alphacentauri17.FrozenMod.common.FrozenMod;

public class IceBreak {

@Subscribe
public void on(HarvestDropsEvent event)
{
if (event.block instanceof BlockIce)
{
event.drops.add(new ItemStack(FrozenMod.IceCube, 2));
}
}

}