
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oaksnature.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class OaksNatureModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == OaksNatureModBlocks.BUNDLE_OF_OXEYE_DAISY.get().asItem())
			event.setBurnTime(200);
		else if (itemstack.getItem() == OaksNatureModBlocks.BUNDLE_OF_POPPY.get().asItem())
			event.setBurnTime(200);
		else if (itemstack.getItem() == OaksNatureModBlocks.WHITE_DANDELION.get().asItem())
			event.setBurnTime(204);
		else if (itemstack.getItem() == Blocks.PINK_TULIP.asItem())
			event.setBurnTime(204);
	}
}
