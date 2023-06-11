
package net.mcreator.beslandia.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.beslandia.init.BeslandiaModTabs;

public class AncientIceHandleItem extends Item {
	public AncientIceHandleItem() {
		super(new Item.Properties().tab(BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
