
package net.mcreator.beslandia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.beslandia.init.BeslandiaModTabs;

public class MagoldiumIngotItem extends Item {
	public MagoldiumIngotItem() {
		super(new Item.Properties().tab(BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB).stacksTo(64).fireResistant().rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(8).saturationMod(5f).alwaysEat()

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(Items.GOLD_INGOT);
		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
