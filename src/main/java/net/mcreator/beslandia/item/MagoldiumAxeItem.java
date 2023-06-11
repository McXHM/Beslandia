
package net.mcreator.beslandia.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.beslandia.init.BeslandiaModTabs;
import net.mcreator.beslandia.init.BeslandiaModItems;

public class MagoldiumAxeItem extends PickaxeItem {
	public MagoldiumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 8192;
			}

			public float getSpeed() {
				return 25f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BeslandiaModItems.MAGOLDIUM_INGOT.get()));
			}
		}, 1, -2.6f, new Item.Properties().tab(BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB).fireResistant());
	}
}
