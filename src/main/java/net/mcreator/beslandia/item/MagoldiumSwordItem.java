
package net.mcreator.beslandia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.beslandia.procedures.MagoldiumSwordInteractEntityProcedure;
import net.mcreator.beslandia.procedures.MagoldiumSwordAttackEntityEventProcedure;
import net.mcreator.beslandia.init.BeslandiaModTabs;
import net.mcreator.beslandia.init.BeslandiaModItems;

public class MagoldiumSwordItem extends SwordItem {
	public MagoldiumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 8192;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 13f;
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
		}, 3, -3f, new Item.Properties().tab(BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		MagoldiumSwordAttackEntityEventProcedure.execute(entity);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		MagoldiumSwordInteractEntityProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
