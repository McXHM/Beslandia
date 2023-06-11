
package net.mcreator.beslandia.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.beslandia.init.BeslandiaModTabs;
import net.mcreator.beslandia.init.BeslandiaModItems;

public class ErroriumSwordItem extends SwordItem {
	public ErroriumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 32767;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 23f;
			}

			public int getLevel() {
				return 7;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BeslandiaModItems.ERRORIUM_INGOT.get()));
			}
		}, 3, -2f, new Item.Properties().tab(BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB).fireResistant());
	}
}
