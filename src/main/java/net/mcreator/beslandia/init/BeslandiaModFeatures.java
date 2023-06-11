
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beslandia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.beslandia.world.features.ores.OrchiumOreFeature;
import net.mcreator.beslandia.world.features.ores.MagoldiumOreFeature;
import net.mcreator.beslandia.world.features.ores.ErroriumOreFeature;
import net.mcreator.beslandia.world.features.ores.AncientHardIceFeature;
import net.mcreator.beslandia.BeslandiaMod;

@Mod.EventBusSubscriber
public class BeslandiaModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BeslandiaMod.MODID);
	public static final RegistryObject<Feature<?>> ERRORIUM_ORE = REGISTRY.register("errorium_ore", ErroriumOreFeature::feature);
	public static final RegistryObject<Feature<?>> ORCHIUM_ORE = REGISTRY.register("orchium_ore", OrchiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> MAGOLDIUM_ORE = REGISTRY.register("magoldium_ore", MagoldiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> ANCIENT_HARD_ICE = REGISTRY.register("ancient_hard_ice", AncientHardIceFeature::feature);
}
