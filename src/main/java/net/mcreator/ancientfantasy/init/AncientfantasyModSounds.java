
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientfantasy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AncientfantasyModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("ancientfantasy", "oldstonebreak"), new SoundEvent(new ResourceLocation("ancientfantasy", "oldstonebreak")));
		REGISTRY.put(new ResourceLocation("ancientfantasy", "oldstonestep"), new SoundEvent(new ResourceLocation("ancientfantasy", "oldstonestep")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
