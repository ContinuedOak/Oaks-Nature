
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oaksnature.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.oaksnature.world.inventory.WoodGrindingBowlUIMenu;
import net.mcreator.oaksnature.world.inventory.WoodCutterUIMenu;
import net.mcreator.oaksnature.world.inventory.VaseGUIMenu;
import net.mcreator.oaksnature.world.inventory.OaksNatureGuideHomeMenu;
import net.mcreator.oaksnature.world.inventory.CraftingPage1Menu;
import net.mcreator.oaksnature.world.inventory.BiomesPage1Menu;
import net.mcreator.oaksnature.OaksNatureMod;

public class OaksNatureModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, OaksNatureMod.MODID);
	public static final RegistryObject<MenuType<VaseGUIMenu>> VASE_GUI = REGISTRY.register("vase_gui", () -> IForgeMenuType.create(VaseGUIMenu::new));
	public static final RegistryObject<MenuType<WoodCutterUIMenu>> WOOD_CUTTER_UI = REGISTRY.register("wood_cutter_ui", () -> IForgeMenuType.create(WoodCutterUIMenu::new));
	public static final RegistryObject<MenuType<WoodGrindingBowlUIMenu>> WOOD_GRINDING_BOWL_UI = REGISTRY.register("wood_grinding_bowl_ui", () -> IForgeMenuType.create(WoodGrindingBowlUIMenu::new));
	public static final RegistryObject<MenuType<BiomesPage1Menu>> BIOMES_PAGE_1 = REGISTRY.register("biomes_page_1", () -> IForgeMenuType.create(BiomesPage1Menu::new));
	public static final RegistryObject<MenuType<OaksNatureGuideHomeMenu>> OAKS_NATURE_GUIDE_HOME = REGISTRY.register("oaks_nature_guide_home", () -> IForgeMenuType.create(OaksNatureGuideHomeMenu::new));
	public static final RegistryObject<MenuType<CraftingPage1Menu>> CRAFTING_PAGE_1 = REGISTRY.register("crafting_page_1", () -> IForgeMenuType.create(CraftingPage1Menu::new));
}
