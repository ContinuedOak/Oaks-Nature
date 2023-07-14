
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oaksnature.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.Blocks;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OaksNatureModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(OaksNatureModBlocks.BUNDLE_OF_OXEYE_DAISY.get().asItem(), 0.56f);
		ComposterBlock.COMPOSTABLES.put(OaksNatureModBlocks.BUNDLE_OF_POPPY.get().asItem(), 0.56f);
		ComposterBlock.COMPOSTABLES.put(OaksNatureModItems.BLUE_BERRY.get(), 0.45f);
		ComposterBlock.COMPOSTABLES.put(OaksNatureModBlocks.WHITE_DANDELION.get().asItem(), 0.23f);
		ComposterBlock.COMPOSTABLES.put(Blocks.PINK_TULIP.asItem(), 0.29f);
		ComposterBlock.COMPOSTABLES.put(OaksNatureModBlocks.BLUEBERRY_CAKE.get().asItem(), 0.35f);
	}
}
