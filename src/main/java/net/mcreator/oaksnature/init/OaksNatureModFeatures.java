
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oaksnature.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.oaksnature.world.features.plants.WildWheatFeature;
import net.mcreator.oaksnature.world.features.plants.WhiteDandelionFeature;
import net.mcreator.oaksnature.world.features.plants.SpruceLeafPileFeature;
import net.mcreator.oaksnature.world.features.plants.RosePinkTulipFeature;
import net.mcreator.oaksnature.world.features.plants.OakLeafPileFeature;
import net.mcreator.oaksnature.world.features.plants.GoatHeadSkullFeature;
import net.mcreator.oaksnature.world.features.plants.FloweringAzaleaLeafPileFeature;
import net.mcreator.oaksnature.world.features.plants.DarkOakLeafPileFeature;
import net.mcreator.oaksnature.world.features.plants.BundleOfPoppyFeature;
import net.mcreator.oaksnature.world.features.plants.BundleOfOxeyeDaisyFeature;
import net.mcreator.oaksnature.world.features.plants.BirchLeafPileFeature;
import net.mcreator.oaksnature.world.features.plants.AzaleaLeafPileFeature;
import net.mcreator.oaksnature.world.features.plants.AcaciaLeafPileFeature;
import net.mcreator.oaksnature.world.features.ores.LushGrassFeature;
import net.mcreator.oaksnature.world.features.ores.LimestoneRedstoneOreFeature;
import net.mcreator.oaksnature.world.features.ores.LimestoneLapisOreFeature;
import net.mcreator.oaksnature.world.features.ores.LimestoneIronOreFeature;
import net.mcreator.oaksnature.world.features.ores.LimestoneFeature;
import net.mcreator.oaksnature.world.features.ores.LimestoneDiamondOreFeature;
import net.mcreator.oaksnature.world.features.ores.LimestoneCopperOreFeature;
import net.mcreator.oaksnature.world.features.ores.LimestoneCoalOreFeature;
import net.mcreator.oaksnature.world.features.ores.InfestedEndStoneFeature;
import net.mcreator.oaksnature.world.features.SnifferFossilFeature;
import net.mcreator.oaksnature.world.features.RuinLargeHouseFeature;
import net.mcreator.oaksnature.world.features.PlainsWellFeature;
import net.mcreator.oaksnature.world.features.MossystonespikeFeature;
import net.mcreator.oaksnature.world.features.MossystonerocksFeature;
import net.mcreator.oaksnature.world.features.MossystonelFeature;
import net.mcreator.oaksnature.world.features.LargeRibcageFossilFeature;
import net.mcreator.oaksnature.world.features.GiantPumpkinFeature;
import net.mcreator.oaksnature.world.features.DigSiteDFeature;
import net.mcreator.oaksnature.world.features.DigSiteCFeature;
import net.mcreator.oaksnature.world.features.DigSiteBFeature;
import net.mcreator.oaksnature.world.features.DigSiteAFeature;
import net.mcreator.oaksnature.world.features.CampsiteFeature;
import net.mcreator.oaksnature.OaksNatureMod;

@Mod.EventBusSubscriber
public class OaksNatureModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, OaksNatureMod.MODID);
	public static final RegistryObject<Feature<?>> INFESTED_END_STONE = REGISTRY.register("infested_end_stone", InfestedEndStoneFeature::new);
	public static final RegistryObject<Feature<?>> ACACIA_LEAF_PILE = REGISTRY.register("acacia_leaf_pile", AcaciaLeafPileFeature::new);
	public static final RegistryObject<Feature<?>> AZALEA_LEAF_PILE = REGISTRY.register("azalea_leaf_pile", AzaleaLeafPileFeature::new);
	public static final RegistryObject<Feature<?>> FLOWERING_AZALEA_LEAF_PILE = REGISTRY.register("flowering_azalea_leaf_pile", FloweringAzaleaLeafPileFeature::new);
	public static final RegistryObject<Feature<?>> BIRCH_LEAF_PILE = REGISTRY.register("birch_leaf_pile", BirchLeafPileFeature::new);
	public static final RegistryObject<Feature<?>> DARK_OAK_LEAF_PILE = REGISTRY.register("dark_oak_leaf_pile", DarkOakLeafPileFeature::new);
	public static final RegistryObject<Feature<?>> OAK_LEAF_PILE = REGISTRY.register("oak_leaf_pile", OakLeafPileFeature::new);
	public static final RegistryObject<Feature<?>> SPRUCE_LEAF_PILE = REGISTRY.register("spruce_leaf_pile", SpruceLeafPileFeature::new);
	public static final RegistryObject<Feature<?>> BUNDLE_OF_POPPY = REGISTRY.register("bundle_of_poppy", BundleOfPoppyFeature::new);
	public static final RegistryObject<Feature<?>> BUNDLE_OF_OXEYE_DAISY = REGISTRY.register("bundle_of_oxeye_daisy", BundleOfOxeyeDaisyFeature::new);
	public static final RegistryObject<Feature<?>> LUSH_GRASS = REGISTRY.register("lush_grass", LushGrassFeature::new);
	public static final RegistryObject<Feature<?>> LIMESTONE = REGISTRY.register("limestone", LimestoneFeature::new);
	public static final RegistryObject<Feature<?>> LIMESTONE_COAL_ORE = REGISTRY.register("limestone_coal_ore", LimestoneCoalOreFeature::new);
	public static final RegistryObject<Feature<?>> LIMESTONE_IRON_ORE = REGISTRY.register("limestone_iron_ore", LimestoneIronOreFeature::new);
	public static final RegistryObject<Feature<?>> LIMESTONE_COPPER_ORE = REGISTRY.register("limestone_copper_ore", LimestoneCopperOreFeature::new);
	public static final RegistryObject<Feature<?>> LIMESTONE_LAPIS_ORE = REGISTRY.register("limestone_lapis_ore", LimestoneLapisOreFeature::new);
	public static final RegistryObject<Feature<?>> LIMESTONE_REDSTONE_ORE = REGISTRY.register("limestone_redstone_ore", LimestoneRedstoneOreFeature::new);
	public static final RegistryObject<Feature<?>> LIMESTONE_DIAMOND_ORE = REGISTRY.register("limestone_diamond_ore", LimestoneDiamondOreFeature::new);
	public static final RegistryObject<Feature<?>> WHITE_DANDELION = REGISTRY.register("white_dandelion", WhiteDandelionFeature::new);
	public static final RegistryObject<Feature<?>> WILD_WHEAT = REGISTRY.register("wild_wheat", WildWheatFeature::new);
	public static final RegistryObject<Feature<?>> ROSE_PINK_TULIP = REGISTRY.register("rose_pink_tulip", RosePinkTulipFeature::new);
	public static final RegistryObject<Feature<?>> PLAINS_WELL = REGISTRY.register("plains_well", PlainsWellFeature::new);
	public static final RegistryObject<Feature<?>> DIG_SITE_A = REGISTRY.register("dig_site_a", DigSiteAFeature::new);
	public static final RegistryObject<Feature<?>> DIG_SITE_B = REGISTRY.register("dig_site_b", DigSiteBFeature::new);
	public static final RegistryObject<Feature<?>> DIG_SITE_C = REGISTRY.register("dig_site_c", DigSiteCFeature::new);
	public static final RegistryObject<Feature<?>> DIG_SITE_D = REGISTRY.register("dig_site_d", DigSiteDFeature::new);
	public static final RegistryObject<Feature<?>> GIANT_PUMPKIN = REGISTRY.register("giant_pumpkin", GiantPumpkinFeature::new);
	public static final RegistryObject<Feature<?>> GOAT_HEAD_SKULL = REGISTRY.register("goat_head_skull", GoatHeadSkullFeature::new);
	public static final RegistryObject<Feature<?>> MOSSYSTONEROCKS = REGISTRY.register("mossystonerocks", MossystonerocksFeature::new);
	public static final RegistryObject<Feature<?>> MOSSYSTONEL = REGISTRY.register("mossystonel", MossystonelFeature::new);
	public static final RegistryObject<Feature<?>> MOSSYSTONESPIKE = REGISTRY.register("mossystonespike", MossystonespikeFeature::new);
	public static final RegistryObject<Feature<?>> SNIFFER_FOSSIL = REGISTRY.register("sniffer_fossil", SnifferFossilFeature::new);
	public static final RegistryObject<Feature<?>> LARGE_RIBCAGE_FOSSIL = REGISTRY.register("large_ribcage_fossil", LargeRibcageFossilFeature::new);
	public static final RegistryObject<Feature<?>> RUIN_LARGE_HOUSE = REGISTRY.register("ruin_large_house", RuinLargeHouseFeature::new);
	public static final RegistryObject<Feature<?>> CAMPSITE = REGISTRY.register("campsite", CampsiteFeature::new);
}
