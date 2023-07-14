
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oaksnature.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.oaksnature.OaksNatureMod;

public class OaksNatureModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, OaksNatureMod.MODID);
	public static final RegistryObject<PaintingVariant> WORLDVIEW = REGISTRY.register("worldview", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> HELLSCAPE = REGISTRY.register("hellscape", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> HELLSCAPED_ESCAPE_FAILED = REGISTRY.register("hellscaped_escape_failed", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> BLOODMOON = REGISTRY.register("bloodmoon", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> REDWOOD_VALLEY_ART = REGISTRY.register("redwood_valley_art", () -> new PaintingVariant(48, 64));
	public static final RegistryObject<PaintingVariant> SITE_SEEING = REGISTRY.register("site_seeing", () -> new PaintingVariant(48, 64));
	public static final RegistryObject<PaintingVariant> BE_MY_FRIEND = REGISTRY.register("be_my_friend", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> NO_PLACE_LIKE_HOME = REGISTRY.register("no_place_like_home", () -> new PaintingVariant(48, 64));
	public static final RegistryObject<PaintingVariant> STARRY_NIGHT = REGISTRY.register("starry_night", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> MONA_LISA = REGISTRY.register("mona_lisa", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> UNDER_THE_SEA = REGISTRY.register("under_the_sea", () -> new PaintingVariant(32, 16));
}
