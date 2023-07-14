
package net.mcreator.oaksnature.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class NetherriteShearsItem extends ShearsItem {
	public NetherriteShearsItem() {
		super(new Item.Properties().durability(1051));
	}

	@Override
	public int getEnchantmentValue() {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 6f;
	}
}
