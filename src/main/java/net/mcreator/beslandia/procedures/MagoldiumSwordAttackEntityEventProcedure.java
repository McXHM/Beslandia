package net.mcreator.beslandia.procedures;

import net.minecraft.world.entity.Entity;

public class MagoldiumSwordAttackEntityEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
	}
}
