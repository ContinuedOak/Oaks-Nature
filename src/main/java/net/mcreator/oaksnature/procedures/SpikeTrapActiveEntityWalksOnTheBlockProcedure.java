package net.mcreator.oaksnature.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

public class SpikeTrapActiveEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isInLava()) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource(_entity.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
					@Override
					public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
						return Component.translatable("death.attack." + "junglespike_lava");
					}
				}, (float) 2.25);
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("oaks_nature:pointy_floor"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		} else if (entity instanceof LivingEntity _livEnt ? _livEnt.isFallFlying() : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource(_entity.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
					@Override
					public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
						return Component.translatable("death.attack." + "junglespike_flying");
					}
				}, (float) 2.25);
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("oaks_nature:pointy_floor"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource(_entity.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
					@Override
					public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
						return Component.translatable("death.attack." + "junglespike");
					}
				}, (float) 2.25);
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("oaks_nature:pointy_floor"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
	}
}
