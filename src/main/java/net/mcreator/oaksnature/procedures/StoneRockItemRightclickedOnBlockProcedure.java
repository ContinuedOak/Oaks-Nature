package net.mcreator.oaksnature.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.oaksnature.init.OaksNatureModBlocks;

public class StoneRockItemRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(OaksNatureModBlocks.STONE_ROCK.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) || !(OaksNatureModBlocks.STONE_ROCK_3.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock())
				|| !(OaksNatureModBlocks.STONE_ROCK_2.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) || !(OaksNatureModBlocks.STONE_ROCK.get() == (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock())
				|| !(OaksNatureModBlocks.STONE_ROCK_3.get() == (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock()) || !(OaksNatureModBlocks.STONE_ROCK_2.get() == (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock())) {
			if (Math.random() < 0.6) {
				world.setBlock(BlockPos.containing(x, y + 1, z), OaksNatureModBlocks.STONE_ROCK.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			} else if (Math.random() < 0.4) {
				world.setBlock(BlockPos.containing(x, y + 1, z), OaksNatureModBlocks.STONE_ROCK_3.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			} else {
				world.setBlock(BlockPos.containing(x, y + 1, z), OaksNatureModBlocks.STONE_ROCK_2.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
			}
		}
	}
}
