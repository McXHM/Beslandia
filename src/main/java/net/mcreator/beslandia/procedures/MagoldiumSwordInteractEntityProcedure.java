package net.mcreator.beslandia.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class MagoldiumSwordInteractEntityProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double effectTime = 0;
		effectTime = Mth.nextInt(RandomSource.create(), 60, 300);
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, (int) (effectTime * 20), 1));
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt((int) Math.round(effectTime / 60), RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
