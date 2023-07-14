package net.mcreator.oaksnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class CopperSwitchNeighbourBlockChangesProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level0 && _level0.hasNeighborSignal(BlockPos.containing(x, y, z)) && (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(BlockPos.containing(x, y, z), Direction.NORTH) : 0) == 15) {
			return 15;
		}
		return 1;
	}
}
