
package net.mcreator.beslandia.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.beslandia.init.BeslandiaModTabs;
import net.mcreator.beslandia.init.BeslandiaModItems;

public class OrchiumPickaxeItem extends PickaxeItem {
	public OrchiumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4096;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BeslandiaModItems.ORCHIUM_INGOT.get()));
			}
		}, 1, -2.5f, new Item.Properties().tab(BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB).fireResistant());
	}
}
