
package net.mcreator.oaksnature.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.oaksnature.world.inventory.WoodCutterUIMenu;
import net.mcreator.oaksnature.procedures.WoodcutterUse1Procedure;
import net.mcreator.oaksnature.OaksNatureMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WoodCutterUISlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public WoodCutterUISlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public WoodCutterUISlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(WoodCutterUISlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(WoodCutterUISlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slotID, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = WoodCutterUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slotID == 1 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 2 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 3 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 4 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 5 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 6 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 7 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 8 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 9 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 10 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 11 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 12 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 13 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 14 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 15 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 16 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 17 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 18 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 19 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 20 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
		if (slotID == 21 && changeType == 1) {

			WoodcutterUse1Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		OaksNatureMod.addNetworkMessage(WoodCutterUISlotMessage.class, WoodCutterUISlotMessage::buffer, WoodCutterUISlotMessage::new, WoodCutterUISlotMessage::handler);
	}
}
