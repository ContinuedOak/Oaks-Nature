
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oaksnature.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.oaksnature.OaksNatureMod;

public class OaksNatureModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, OaksNatureMod.MODID);
	public static final RegistryObject<SoundEvent> DISC_15 = REGISTRY.register("disc_15", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("oaks_nature", "disc_15")));
}
