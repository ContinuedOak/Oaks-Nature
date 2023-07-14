package net.mcreator.oaksnature.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.oaksnature.init.OaksNatureModBlocks;
import net.mcreator.oaksnature.OaksNatureMod;

import java.util.Map;

public class VaseClayUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.CAMPFIRE == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() || Blocks.SOUL_CAMPFIRE == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
			OaksNatureMod.queueServerWork(6000, () -> {
				if (OaksNatureModBlocks.VASE.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = OaksNatureModBlocks.VASE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
				}
			});
		}
		if (Blocks.FIRE == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() || Blocks.SOUL_FIRE == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
			OaksNatureMod.queueServerWork(450, () -> {
				if (OaksNatureModBlocks.VASE.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = OaksNatureModBlocks.VASE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
				}
			});
		}
		if (Blocks.LAVA == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() || Blocks.LAVA_CAULDRON == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()
				|| Blocks.LAVA == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
			OaksNatureMod.queueServerWork(240, () -> {
				if (OaksNatureModBlocks.VASE.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = OaksNatureModBlocks.VASE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
				}
			});
		}
		if (Blocks.MAGMA_BLOCK == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
			OaksNatureMod.queueServerWork(12000, () -> {
				if (OaksNatureModBlocks.VASE.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = OaksNatureModBlocks.VASE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
				}
			});
		}
	}
}
