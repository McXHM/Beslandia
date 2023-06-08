
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beslandia.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BeslandiaModTabs {
	public static CreativeModeTab TAB_BESLANDIA_CREATIVE_TAB;

	public static void load() {
		TAB_BESLANDIA_CREATIVE_TAB = new CreativeModeTab("tabbeslandia_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BeslandiaModBlocks.ORCHIUM_BLOCK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
