package net.mcreator.oaksnature.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;

import net.mcreator.oaksnature.world.inventory.OaksNatureGuideHomeMenu;
import net.mcreator.oaksnature.network.OaksNatureGuideHomeButtonMessage;
import net.mcreator.oaksnature.OaksNatureMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class OaksNatureGuideHomeScreen extends AbstractContainerScreen<OaksNatureGuideHomeMenu> {
	private final static HashMap<String, Object> guistate = OaksNatureGuideHomeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_crafting;
	Button button_biomes;
	ImageButton imagebutton_arrorw_left;
	ImageButton imagebutton_arrorw_right;

	public OaksNatureGuideHomeScreen(OaksNatureGuideHomeMenu container, Inventory inventory, Component text) {
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
		this.blit(ms, this.leftPos + -70, this.topPos + -8, 0, 0, 146, 180, 146, 180);

		RenderSystem.setShaderTexture(0, new ResourceLocation("oaks_nature:textures/screens/page.png"));
		this.blit(ms, this.leftPos + 64, this.topPos + -8, 0, 0, 146, 180, 146, 180);

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
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.oaks_nature_guide_home.label_oaks_nature"), -32, 7, -11513776);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.oaks_nature_guide_home.label_varversion"), 78, 140, -16711936);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.oaks_nature_guide_home.label_my_other_mods"), 104, 7, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.oaks_nature_guide_home.label_oaks_decor"), 79, 31, -11513776);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.oaks_nature_guide_home.label_oaks_enchantments"), 79, 43, -11513776);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.oaks_nature_guide_home.label_oaks_emote_indev"), 79, 54, -11513776);
		this.font.draw(poseStack, Component.translatable("gui.oaks_nature.oaks_nature_guide_home.label_content"), -56, 27, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_crafting = Button.builder(Component.translatable("gui.oaks_nature.oaks_nature_guide_home.button_crafting"), e -> {
			if (true) {
				OaksNatureMod.PACKET_HANDLER.sendToServer(new OaksNatureGuideHomeButtonMessage(0, x, y, z));
				OaksNatureGuideHomeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -56, this.topPos + 67, 67, 20).build();
		guistate.put("button:button_crafting", button_crafting);
		this.addRenderableWidget(button_crafting);
		button_biomes = Button.builder(Component.translatable("gui.oaks_nature.oaks_nature_guide_home.button_biomes"), e -> {
			if (true) {
				OaksNatureMod.PACKET_HANDLER.sendToServer(new OaksNatureGuideHomeButtonMessage(1, x, y, z));
				OaksNatureGuideHomeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -56, this.topPos + 43, 67, 20).build();
		guistate.put("button:button_biomes", button_biomes);
		this.addRenderableWidget(button_biomes);
		imagebutton_arrorw_left = new ImageButton(this.leftPos + -54, this.topPos + 150, 18, 10, 0, 0, 10, new ResourceLocation("oaks_nature:textures/screens/atlas/imagebutton_arrorw_left.png"), 18, 20, e -> {
		});
		guistate.put("button:imagebutton_arrorw_left", imagebutton_arrorw_left);
		this.addRenderableWidget(imagebutton_arrorw_left);
		imagebutton_arrorw_right = new ImageButton(this.leftPos + 177, this.topPos + 150, 18, 10, 0, 0, 10, new ResourceLocation("oaks_nature:textures/screens/atlas/imagebutton_arrorw_right.png"), 18, 20, e -> {
			if (true) {
				OaksNatureMod.PACKET_HANDLER.sendToServer(new OaksNatureGuideHomeButtonMessage(3, x, y, z));
				OaksNatureGuideHomeButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrorw_right", imagebutton_arrorw_right);
		this.addRenderableWidget(imagebutton_arrorw_right);
	}
}
