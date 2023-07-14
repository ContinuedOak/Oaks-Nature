
package net.mcreator.oaksnature.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class Disc15Item extends RecordItem {
	public Disc15Item() {
		super(2, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("oaks_nature:disc_15")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5800);
	}
}
