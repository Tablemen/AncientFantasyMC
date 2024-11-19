
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientfantasy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ancientfantasy.item.DevItem0001Item;
import net.mcreator.ancientfantasy.item.AncientoeItem;
import net.mcreator.ancientfantasy.AncientfantasyMod;

public class AncientfantasyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AncientfantasyMod.MODID);
	public static final RegistryObject<Item> DEV_ITEM_0001 = REGISTRY.register("dev_item_0001", () -> new DevItem0001Item());
	public static final RegistryObject<Item> TUFF_PILLARS = block(AncientfantasyModBlocks.TUFF_PILLARS, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> POLISHED_TUFF = block(AncientfantasyModBlocks.POLISHED_TUFF, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> POLISHED_TUFF_SLAB = block(AncientfantasyModBlocks.POLISHED_TUFF_SLAB, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> ANCIENT_WOOD_PLANKS = block(AncientfantasyModBlocks.ANCIENT_WOOD_PLANKS, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> ANCIENT_WOODEN_SLAB = block(AncientfantasyModBlocks.ANCIENT_WOODEN_SLAB, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> TUFF_GOLEM_SPAWN_EGG = REGISTRY.register("tuff_golem_spawn_egg",
			() -> new ForgeSpawnEggItem(AncientfantasyModEntities.TUFF_GOLEM, -10066330, -13421773, new Item.Properties().tab(AncientfantasyModTabs.TAB_ANCIENT_FANTASY)));
	public static final RegistryObject<Item> ANCIENT_LOG = block(AncientfantasyModBlocks.ANCIENT_LOG, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> ANCIENT_WOODEN_STAIRS = block(AncientfantasyModBlocks.ANCIENT_WOODEN_STAIRS, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> ANCIENT_WOODEN_BUTTON = block(AncientfantasyModBlocks.ANCIENT_WOODEN_BUTTON, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> ANCIENT_WOODEN_FENCE = block(AncientfantasyModBlocks.ANCIENT_WOODEN_FENCE, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> ANCIENT_WOODEN_PRESSURE_PLATE = block(AncientfantasyModBlocks.ANCIENT_WOODEN_PRESSURE_PLATE, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> ANCIENT_WOODEN_FENCE_GATE = block(AncientfantasyModBlocks.ANCIENT_WOODEN_FENCE_GATE, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> ANCIENT_DOOR = doubleBlock(AncientfantasyModBlocks.ANCIENT_DOOR, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> ANCIENT_TRAPDOOR = block(AncientfantasyModBlocks.ANCIENT_TRAPDOOR, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> POLISHED_TUFF_PRESSURE_PLATE = block(AncientfantasyModBlocks.POLISHED_TUFF_PRESSURE_PLATE, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> ANCIENT_WOOD = block(AncientfantasyModBlocks.ANCIENT_WOOD, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> POLISHED_TUFF_WALL = block(AncientfantasyModBlocks.POLISHED_TUFF_WALL, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> ANCIENTOE = REGISTRY.register("ancientoe", () -> new AncientoeItem());
	public static final RegistryObject<Item> ANCIENT_LEAVES = block(AncientfantasyModBlocks.ANCIENT_LEAVES, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);
	public static final RegistryObject<Item> ASHEN_COBBLESTONE = block(AncientfantasyModBlocks.ASHEN_COBBLESTONE, AncientfantasyModTabs.TAB_ANCIENT_FANTASY);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
