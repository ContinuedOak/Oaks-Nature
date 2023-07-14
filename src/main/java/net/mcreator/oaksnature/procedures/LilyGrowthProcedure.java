package net.mcreator.oaksnature.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LilyGrowthProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.WATER == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
			return true;
		}
		return false;
	}
}
