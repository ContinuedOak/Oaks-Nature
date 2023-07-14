package net.mcreator.oaksnature.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.player.LocalPlayer;

import net.mcreator.oaksnature.init.OaksNatureModItems;
import net.mcreator.oaksnature.init.OaksNatureModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GiveLimestoneCraftingProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_LIMITED_CRAFTING) == false) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OaksNatureModBlocks.LIMESTONE.get())) : false) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("oaks_nature:limestone")});
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OaksNatureModBlocks.POLISHED_LIMESTONE.get())) : false) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("oaks_nature:limestone_brick")});
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OaksNatureModBlocks.LIMESTONE_BRICK.get())) : false) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("oaks_nature:cracked_limestone_brick_crafting")});
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.STONE)) : false) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("oaks_nature:stone_rocks")});
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.BOWL)) : false) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("oaks_nature:craft_haven")});
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(OaksNatureModItems.WOOD_GRINDING_BOWL.get())) : false) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("oaks_nature:craft_slime")});
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.GLASS)) : false) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("oaks_nature:empty_glass_jar")});
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.REDSTONE)) : false) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("oaks_nature:spike_trap")});
			}
			if (new Object() {
				public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
					if (_ent instanceof ServerPlayer _player)
						return _player.getRecipeBook().contains(recipe);
					else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
						return _player.getRecipeBook().contains(recipe);
					return false;
				}
			}.hasRecipe(entity, new ResourceLocation("oaks_nature:spike_trap")) == (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.FERMENTED_SPIDER_EYE)) : false)) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("oaks_nature:tipped_spike_trap")});
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.WHITE_DYE)) : false) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("oaks_nature:dyewhite")});
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.BAMBOO)) : false) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("oaks_nature:bamboo_crafting")});
			}
		}
	}
}
