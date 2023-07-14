package net.mcreator.oaksnature.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.oaksnature.world.inventory.BiomesPage1Menu;
import net.mcreator.oaksnature.network.BiomesPage1ButtonMessage;
import net.mcreator.oaksnature.OaksNatureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BiomesPage1Screen extends AbstractContainerScreen<BiomesPage1Menu> {
	private final static HashMap<String, Object> guistate = BiomesPage1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrorw_left;
	ImageButton imagebutton_arrorw_right;

	public BiomesPage1Screen(BiomesPage1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/page.png"));
		this.blit(ms, this.leftPos + -58, this.topPos + 1, 0, 0, 146, 180, 146, 180);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/page.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 0, 0, 0, 146, 180, 146, 180);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/biome_pumpforest.png"));
		this.blit(ms, this.leftPos + -44, this.topPos + 15, 0, 0, 118, 67, 118, 67);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/biome_limestonecaves.png"));
		this.blit(ms, this.leftPos + 92, this.topPos + 15, 0, 0, 118, 67, 118, 67);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.biomes_page_1.label_pumpkin_valley"), -19, 83, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.biomes_page_1.label_gaint_pumpkins"), -46, 99, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.biomes_page_1.label_limestone_caves"), 113, 82, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.biomes_page_1.label_added_in_v021"), 92, 98, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.biomes_page_1.label_located_deep_undergound"), 92, 112, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.biomes_page_1.label_in_similar_places_as"), -46, 112, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.biomes_page_1.label_an_acacia_biome"), -46, 125, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrorw_left = new ImageButton(this.leftPos + -44, this.topPos + 156, 18, 10, 0, 0, 10, new ResourceLocation("oaks_nature:textures/screens/atlas/imagebutton_arrorw_left.png"), 18, 20, e -> {
			if (true) {
				OaksNatureMod.PACKET_HANDLER.sendToServer(new BiomesPage1ButtonMessage(0, x, y, z));
				BiomesPage1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrorw_left", imagebutton_arrorw_left);
		this.addRenderableWidget(imagebutton_arrorw_left);
		imagebutton_arrorw_right = new ImageButton(this.leftPos + 192, this.topPos + 156, 18, 10, 0, 0, 10, new ResourceLocation("oaks_nature:textures/screens/atlas/imagebutton_arrorw_right.png"), 18, 20, e -> {
			if (true) {
				OaksNatureMod.PACKET_HANDLER.sendToServer(new BiomesPage1ButtonMessage(1, x, y, z));
				BiomesPage1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrorw_right", imagebutton_arrorw_right);
		this.addRenderableWidget(imagebutton_arrorw_right);
	}
}
