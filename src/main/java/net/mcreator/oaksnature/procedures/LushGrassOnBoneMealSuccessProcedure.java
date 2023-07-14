package net.mcreator.oaksnature.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.oaksnature.init.OaksNatureModBlocks;

public class LushGrassOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) <= 6) {
			if (Math.random() < 0.3) {
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("forge:lush_grass_growth")))) {
					world.setBlock(BlockPos.containing(x - 1, y, z), OaksNatureModBlocks.LUSH_GRASS.get().defaultBlockState(), 3);
				}
			}
			if (Math.random() < 0.3) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("forge:lush_grass_growth")))) {
					world.setBlock(BlockPos.containing(x + 1, y, z), OaksNatureModBlocks.LUSH_GRASS.get().defaultBlockState(), 3);
				}
			}
			if (Math.random() < 0.3) {
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("forge:lush_grass_growth")))) {
					world.setBlock(BlockPos.containing(x, y, z + 1), OaksNatureModBlocks.LUSH_GRASS.get().defaultBlockState(), 3);
				}
			}
			if (Math.random() < 0.3) {
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("forge:lush_grass_growth")))) {
					world.setBlock(BlockPos.containing(x, y, z - 1), OaksNatureModBlocks.LUSH_GRASS.get().defaultBlockState(), 3);
				}
			}
			if (Math.random() < 0.3) {
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("forge:lush_grass_growth")))) {
					world.setBlock(BlockPos.containing(x - 1, y, z - 1), OaksNatureModBlocks.LUSH_GRASS.get().defaultBlockState(), 3);
				}
			}
			if (Math.random() < 0.3) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("forge:lush_grass_growth")))) {
					world.setBlock(BlockPos.containing(x + 1, y, z - 1), OaksNatureModBlocks.LUSH_GRASS.get().defaultBlockState(), 3);
				}
			}
			if (Math.random() < 0.3) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).is(BlockTags.create(new ResourceLocation("forge:lush_grass_growth")))) {
					world.setBlock(BlockPos.containing(x + 1, y, z - 1), OaksNatureModBlocks.LUSH_GRASS.get().defaultBlockState(), 3);
				}
			}
			if (Math.random() < 0.3) {
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).is(BlockTags.create(new ResourceLocation("forge:lush_grass_growth")))) {
					world.setBlock(BlockPos.containing(x - 1, y, z + 1), OaksNatureModBlocks.LUSH_GRASS.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
