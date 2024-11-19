
package net.mcreator.ancientfantasy.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ancientfantasy.entity.TuffGolemEntity;
import net.mcreator.ancientfantasy.client.model.ModelTuffGuard;

public class TuffGolemRenderer extends MobRenderer<TuffGolemEntity, ModelTuffGuard<TuffGolemEntity>> {
	public TuffGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTuffGuard(context.bakeLayer(ModelTuffGuard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TuffGolemEntity entity) {
		return new ResourceLocation("ancientfantasy:textures/entities/pixil-frame-0_-_2024-11-14t164834.414_2.png");
	}
}
