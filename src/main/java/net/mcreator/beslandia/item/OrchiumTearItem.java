
package net.mcreator.beslandia.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.beslandia.procedures.IceFromSolidifyingWaterProcedure;
import net.mcreator.beslandia.init.BeslandiaModTabs;

public class OrchiumTearItem extends Item {
	public OrchiumTearItem() {
		super(new Item.Properties().tab(BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		IceFromSolidifyingWaterProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
