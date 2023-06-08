
package net.mcreator.beslandia.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.beslandia.init.BeslandiaModTabs;

public class RawErroriumItem extends Item {
	public RawErroriumItem() {
		super(new Item.Properties().tab(BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
