
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oaksnature.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.oaksnature.client.model.Modeltermite;
import net.mcreator.oaksnature.client.model.Modelfirfly;
import net.mcreator.oaksnature.client.model.ModelRosePinkSheep_skinned;
import net.mcreator.oaksnature.client.model.ModelRosePinkSheep;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class OaksNatureModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelRosePinkSheep_skinned.LAYER_LOCATION, ModelRosePinkSheep_skinned::createBodyLayer);
		event.registerLayerDefinition(ModelRosePinkSheep.LAYER_LOCATION, ModelRosePinkSheep::createBodyLayer);
		event.registerLayerDefinition(Modelfirfly.LAYER_LOCATION, Modelfirfly::createBodyLayer);
		event.registerLayerDefinition(Modeltermite.LAYER_LOCATION, Modeltermite::createBodyLayer);
	}
}
