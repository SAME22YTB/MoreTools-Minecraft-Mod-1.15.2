
package net.mcreator.moretools.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.moretools.item.InfusedCoalIngotItem;
import net.mcreator.moretools.MoretoolsModElements;

@MoretoolsModElements.ModElement.Tag
public class IciFuel extends MoretoolsModElements.ModElement {
	public IciFuel(MoretoolsModElements instance) {
		super(instance, 8);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(InfusedCoalIngotItem.block, (int) (1)).getItem())
			event.setBurnTime(6600);
	}
}
