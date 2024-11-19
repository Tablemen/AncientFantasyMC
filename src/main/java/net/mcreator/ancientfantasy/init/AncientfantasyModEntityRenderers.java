
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientfantasy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.ancientfantasy.client.renderer.TuffGolemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AncientfantasyModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AncientfantasyModEntities.TUFF_GOLEM.get(), TuffGolemRenderer::new);
	}
}
