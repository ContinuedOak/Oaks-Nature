package net.mcreator.oaksnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.oaksnature.init.OaksNatureModBlocks;

public class WhiteDandelionOnBoneMealSuccessProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (OaksNatureModBlocks.WHITE_DANDELION.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(OaksNatureModBlocks.WHITE_DANDELION.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			return true;
		}
		return true;
	}
}
