
package net.mcreator.oaksnature.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WoodenShearPartsItem extends Item {
	public WoodenShearPartsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
