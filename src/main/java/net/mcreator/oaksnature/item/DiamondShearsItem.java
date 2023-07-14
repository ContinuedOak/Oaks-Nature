
package net.mcreator.oaksnature.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class DiamondShearsItem extends ShearsItem {
	public DiamondShearsItem() {
		super(new Item.Properties().durability(250));
	}

	@Override
	public int getEnchantmentValue() {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 9f;
	}
}
