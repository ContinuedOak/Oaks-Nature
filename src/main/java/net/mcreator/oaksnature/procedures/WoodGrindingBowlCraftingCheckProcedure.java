package net.mcreator.oaksnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

public class WoodGrindingBowlCraftingCheckProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Items.WATER_BUCKET == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem()) {
			WoodGrindingBowlSlotChangeProcedure.execute(entity);
			WoodGrindingBowlCrafting2Procedure.execute(entity);
			WoodGrindingBowlCrafting3Procedure.execute(entity);
			WoodGrindingBowlCrafting4Procedure.execute(entity);
			WoodGrindingBowlCrafting5Procedure.execute(entity);
			WoodGrindingBowlCrafting6Procedure.execute(entity);
			WoodGrindingBowlCrafting7Procedure.execute(entity);
			WoodGrindingBowlCrafting8Procedure.execute(entity);
			WoodGrindingBowlCrafting9Procedure.execute(entity);
			WoodGrindingBowlCrafting10Procedure.execute(entity);
			WoodGrindingBowlCrafting11Procedure.execute(entity);
			WoodGrindingBowlCrafting12Procedure.execute(entity);
		} else {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.AIR);
				_setstack.setCount(1);
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
