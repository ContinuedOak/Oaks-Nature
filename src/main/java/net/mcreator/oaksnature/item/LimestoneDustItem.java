
package net.mcreator.oaksnature.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LimestoneDustItem extends Item {
	public LimestoneDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
