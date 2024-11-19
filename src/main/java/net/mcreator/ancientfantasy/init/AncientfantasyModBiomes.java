
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientfantasy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.ancientfantasy.world.biome.AncientForestBiome;
import net.mcreator.ancientfantasy.AncientfantasyMod;

public class AncientfantasyModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, AncientfantasyMod.MODID);
	public static final RegistryObject<Biome> ANCIENT_FOREST = REGISTRY.register("ancient_forest", () -> AncientForestBiome.createBiome());
}
