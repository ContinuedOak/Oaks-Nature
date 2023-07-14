
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oaksnature.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.oaksnature.client.gui.WoodGrindingBowlUIScreen;
import net.mcreator.oaksnature.client.gui.WoodCutterUIScreen;
import net.mcreator.oaksnature.client.gui.VaseGUIScreen;
import net.mcreator.oaksnature.client.gui.OaksNatureGuideHomeScreen;
import net.mcreator.oaksnature.client.gui.CraftingPage1Screen;
import net.mcreator.oaksnature.client.gui.BiomesPage1Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OaksNatureModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(OaksNatureModMenus.VASE_GUI.get(), VaseGUIScreen::new);
			MenuScreens.register(OaksNatureModMenus.WOOD_CUTTER_UI.get(), WoodCutterUIScreen::new);
			MenuScreens.register(OaksNatureModMenus.WOOD_GRINDING_BOWL_UI.get(), WoodGrindingBowlUIScreen::new);
			MenuScreens.register(OaksNatureModMenus.BIOMES_PAGE_1.get(), BiomesPage1Screen::new);
			MenuScreens.register(OaksNatureModMenus.OAKS_NATURE_GUIDE_HOME.get(), OaksNatureGuideHomeScreen::new);
			MenuScreens.register(OaksNatureModMenus.CRAFTING_PAGE_1.get(), CraftingPage1Screen::new);
		});
	}
}
