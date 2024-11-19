
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientfantasy.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AncientfantasyModTabs {
	public static CreativeModeTab TAB_ANCIENT_FANTASY;

	public static void load() {
		TAB_ANCIENT_FANTASY = new CreativeModeTab("tabancient_fantasy") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AncientfantasyModItems.DEV_ITEM_0001.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
