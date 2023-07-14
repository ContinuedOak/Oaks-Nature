
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oaksnature.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.oaksnature.block.entity.YellowVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.WoodcutterBlockEntity;
import net.mcreator.oaksnature.block.entity.WhiteVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.VaseBlockEntity;
import net.mcreator.oaksnature.block.entity.TealVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.RosePinkVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.RedVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.PurpleVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.PinkVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.OrangeVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.MagentaVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.LimeVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.LightGrayVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.LightBlueVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.GreenVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.GrayVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.CyanVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.BrownVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.BlueVaseBlockEntity;
import net.mcreator.oaksnature.block.entity.BlackVaseBlockEntity;
import net.mcreator.oaksnature.OaksNatureMod;

public class OaksNatureModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, OaksNatureMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> VASE = register("vase", OaksNatureModBlocks.VASE, VaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BLACK_VASE = register("black_vase", OaksNatureModBlocks.BLACK_VASE, BlackVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BLUE_VASE = register("blue_vase", OaksNatureModBlocks.BLUE_VASE, BlueVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BROWN_VASE = register("brown_vase", OaksNatureModBlocks.BROWN_VASE, BrownVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CYAN_VASE = register("cyan_vase", OaksNatureModBlocks.CYAN_VASE, CyanVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GRAY_VASE = register("gray_vase", OaksNatureModBlocks.GRAY_VASE, GrayVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GREEN_VASE = register("green_vase", OaksNatureModBlocks.GREEN_VASE, GreenVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LIGHT_BLUE_VASE = register("light_blue_vase", OaksNatureModBlocks.LIGHT_BLUE_VASE, LightBlueVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LIGHT_GRAY_VASE = register("light_gray_vase", OaksNatureModBlocks.LIGHT_GRAY_VASE, LightGrayVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LIME_VASE = register("lime_vase", OaksNatureModBlocks.LIME_VASE, LimeVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MAGENTA_VASE = register("magenta_vase", OaksNatureModBlocks.MAGENTA_VASE, MagentaVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ORANGE_VASE = register("orange_vase", OaksNatureModBlocks.ORANGE_VASE, OrangeVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PINK_VASE = register("pink_vase", OaksNatureModBlocks.PINK_VASE, PinkVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PURPLE_VASE = register("purple_vase", OaksNatureModBlocks.PURPLE_VASE, PurpleVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RED_VASE = register("red_vase", OaksNatureModBlocks.RED_VASE, RedVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> YELLOW_VASE = register("yellow_vase", OaksNatureModBlocks.YELLOW_VASE, YellowVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEAL_VASE = register("teal_vase", OaksNatureModBlocks.TEAL_VASE, TealVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROSE_PINK_VASE = register("rose_pink_vase", OaksNatureModBlocks.ROSE_PINK_VASE, RosePinkVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WHITE_VASE = register("white_vase", OaksNatureModBlocks.WHITE_VASE, WhiteVaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WOODCUTTER = register("woodcutter", OaksNatureModBlocks.WOODCUTTER, WoodcutterBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
