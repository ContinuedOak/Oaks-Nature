package net.mcreator.oaksnature.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.oaksnature.world.inventory.CraftingPage1Menu;
import net.mcreator.oaksnature.network.CraftingPage1ButtonMessage;
import net.mcreator.oaksnature.OaksNatureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CraftingPage1Screen extends AbstractContainerScreen<CraftingPage1Menu> {
	private final static HashMap<String, Object> guistate = CraftingPage1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrorw_left;

	public CraftingPage1Screen(CraftingPage1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 291;
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
		this.blit(ms, this.leftPos + 2, this.topPos + -8, 0, 0, 146, 180, 146, 180);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/page.png"));
		this.blit(ms, this.leftPos + 141, this.topPos + -8, 0, 0, 146, 180, 146, 180);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/coal2.png"));
		this.blit(ms, this.leftPos + 15, this.topPos + 77, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/limestone_dusticon.png"));
		this.blit(ms, this.leftPos + 31, this.topPos + 77, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/watericon.png"));
		this.blit(ms, this.leftPos + 22, this.topPos + 93, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/arrow_full.png"));
		this.blit(ms, this.leftPos + 48, this.topPos + 90, 0, 0, 12, 8, 12, 8);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/gunicon.png"));
		this.blit(ms, this.leftPos + 62, this.topPos + 86, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/granite_powdericon.png"));
		this.blit(ms, this.leftPos + 155, this.topPos + 19, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/limestone_dusticon.png"));
		this.blit(ms, this.leftPos + 171, this.topPos + 19, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/watericon.png"));
		this.blit(ms, this.leftPos + 164, this.topPos + 35, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/arrow_full.png"));
		this.blit(ms, this.leftPos + 187, this.topPos + 27, 0, 0, 12, 8, 12, 8);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/iromicon.png"));
		this.blit(ms, this.leftPos + 200, this.topPos + 24, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/leavesicon.png"));
		this.blit(ms, this.leftPos + 155, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/leavesicon.png"));
		this.blit(ms, this.leftPos + 171, this.topPos + 79, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/watericon.png"));
		this.blit(ms, this.leftPos + 163, this.topPos + 95, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/arrow_full.png"));
		this.blit(ms, this.leftPos + 187, this.topPos + 92, 0, 0, 12, 8, 12, 8);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/slimeicon.png"));
		this.blit(ms, this.leftPos + 199, this.topPos + 89, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.crafting_page_1.label_wood_bowl_crushing_crafting_reci"), 16, 6, -11513776);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.crafting_page_1.label_iron"), 154, 7, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.crafting_page_1.label_every_crafting_will_require_wate"), 16, 30, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.crafting_page_1.label_require_water"), 10, 42, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.crafting_page_1.label_gunpowder"), 16, 66, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.crafting_page_1.label_this_can_be_in_any_order"), 166, 54, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.crafting_page_1.label_slimeballs"), 155, 66, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.crafting_page_1.label_can_be_any_leaves"), 155, 115, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrorw_left = new ImageButton(this.leftPos + 17, this.topPos + 152, 18, 10, 0, 0, 10, new ResourceLocation("oaks_nature:textures/screens/atlas/imagebutton_arrorw_left.png"), 18, 20, e -> {
			if (true) {
				OaksNatureMod.PACKET_HANDLER.sendToServer(new CraftingPage1ButtonMessage(0, x, y, z));
				CraftingPage1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrorw_left", imagebutton_arrorw_left);
		this.addRenderableWidget(imagebutton_arrorw_left);
	}
}
