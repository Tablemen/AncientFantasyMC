
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientfantasy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.ancientfantasy.block.TuffPillarsBlock;
import net.mcreator.ancientfantasy.block.PolishedTuffWallBlock;
import net.mcreator.ancientfantasy.block.PolishedTuffSlabBlock;
import net.mcreator.ancientfantasy.block.PolishedTuffPressurePlateBlock;
import net.mcreator.ancientfantasy.block.PolishedTuffBlock;
import net.mcreator.ancientfantasy.block.AshenCobblestoneBlock;
import net.mcreator.ancientfantasy.block.AncientoePortalBlock;
import net.mcreator.ancientfantasy.block.AncientWoodenStairsBlock;
import net.mcreator.ancientfantasy.block.AncientWoodenSlabBlock;
import net.mcreator.ancientfantasy.block.AncientWoodenPressurePlateBlock;
import net.mcreator.ancientfantasy.block.AncientWoodenFenceGateBlock;
import net.mcreator.ancientfantasy.block.AncientWoodenFenceBlock;
import net.mcreator.ancientfantasy.block.AncientWoodenButtonBlock;
import net.mcreator.ancientfantasy.block.AncientWoodPlanksBlock;
import net.mcreator.ancientfantasy.block.AncientWoodBlock;
import net.mcreator.ancientfantasy.block.AncientTrapdoorBlock;
import net.mcreator.ancientfantasy.block.AncientLogBlock;
import net.mcreator.ancientfantasy.block.AncientLeavesBlock;
import net.mcreator.ancientfantasy.block.AncientDoorBlock;
import net.mcreator.ancientfantasy.AncientfantasyMod;

public class AncientfantasyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AncientfantasyMod.MODID);
	public static final RegistryObject<Block> TUFF_PILLARS = REGISTRY.register("tuff_pillars", () -> new TuffPillarsBlock());
	public static final RegistryObject<Block> POLISHED_TUFF = REGISTRY.register("polished_tuff", () -> new PolishedTuffBlock());
	public static final RegistryObject<Block> POLISHED_TUFF_SLAB = REGISTRY.register("polished_tuff_slab", () -> new PolishedTuffSlabBlock());
	public static final RegistryObject<Block> ANCIENT_WOOD_PLANKS = REGISTRY.register("ancient_wood_planks", () -> new AncientWoodPlanksBlock());
	public static final RegistryObject<Block> ANCIENT_WOODEN_SLAB = REGISTRY.register("ancient_wooden_slab", () -> new AncientWoodenSlabBlock());
	public static final RegistryObject<Block> ANCIENT_LOG = REGISTRY.register("ancient_log", () -> new AncientLogBlock());
	public static final RegistryObject<Block> ANCIENT_WOODEN_STAIRS = REGISTRY.register("ancient_wooden_stairs", () -> new AncientWoodenStairsBlock());
	public static final RegistryObject<Block> ANCIENT_WOODEN_BUTTON = REGISTRY.register("ancient_wooden_button", () -> new AncientWoodenButtonBlock());
	public static final RegistryObject<Block> ANCIENT_WOODEN_FENCE = REGISTRY.register("ancient_wooden_fence", () -> new AncientWoodenFenceBlock());
	public static final RegistryObject<Block> ANCIENT_WOODEN_PRESSURE_PLATE = REGISTRY.register("ancient_wooden_pressure_plate", () -> new AncientWoodenPressurePlateBlock());
	public static final RegistryObject<Block> ANCIENT_WOODEN_FENCE_GATE = REGISTRY.register("ancient_wooden_fence_gate", () -> new AncientWoodenFenceGateBlock());
	public static final RegistryObject<Block> ANCIENT_DOOR = REGISTRY.register("ancient_door", () -> new AncientDoorBlock());
	public static final RegistryObject<Block> ANCIENT_TRAPDOOR = REGISTRY.register("ancient_trapdoor", () -> new AncientTrapdoorBlock());
	public static final RegistryObject<Block> POLISHED_TUFF_PRESSURE_PLATE = REGISTRY.register("polished_tuff_pressure_plate", () -> new PolishedTuffPressurePlateBlock());
	public static final RegistryObject<Block> ANCIENT_WOOD = REGISTRY.register("ancient_wood", () -> new AncientWoodBlock());
	public static final RegistryObject<Block> POLISHED_TUFF_WALL = REGISTRY.register("polished_tuff_wall", () -> new PolishedTuffWallBlock());
	public static final RegistryObject<Block> ANCIENTOE_PORTAL = REGISTRY.register("ancientoe_portal", () -> new AncientoePortalBlock());
	public static final RegistryObject<Block> ANCIENT_LEAVES = REGISTRY.register("ancient_leaves", () -> new AncientLeavesBlock());
	public static final RegistryObject<Block> ASHEN_COBBLESTONE = REGISTRY.register("ashen_cobblestone", () -> new AshenCobblestoneBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			TuffPillarsBlock.registerRenderLayer();
			PolishedTuffBlock.registerRenderLayer();
			PolishedTuffSlabBlock.registerRenderLayer();
			AncientDoorBlock.registerRenderLayer();
			AncientTrapdoorBlock.registerRenderLayer();
			PolishedTuffPressurePlateBlock.registerRenderLayer();
			PolishedTuffWallBlock.registerRenderLayer();
			AncientoePortalBlock.registerRenderLayer();
		}
	}
}
