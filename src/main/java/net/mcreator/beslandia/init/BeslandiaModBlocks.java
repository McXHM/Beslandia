
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beslandia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.beslandia.block.OrchiumOreBlock;
import net.mcreator.beslandia.block.OrchiumBlockBlock;
import net.mcreator.beslandia.block.MagoldiumOreBlock;
import net.mcreator.beslandia.block.MagoldiumBlockBlock;
import net.mcreator.beslandia.block.ErroriumOreBlock;
import net.mcreator.beslandia.block.ErroriumBlockBlock;
import net.mcreator.beslandia.block.AncientHardIceBlock;
import net.mcreator.beslandia.BeslandiaMod;

public class BeslandiaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BeslandiaMod.MODID);
	public static final RegistryObject<Block> ERRORIUM_ORE = REGISTRY.register("errorium_ore", () -> new ErroriumOreBlock());
	public static final RegistryObject<Block> ERRORIUM_BLOCK = REGISTRY.register("errorium_block", () -> new ErroriumBlockBlock());
	public static final RegistryObject<Block> ORCHIUM_ORE = REGISTRY.register("orchium_ore", () -> new OrchiumOreBlock());
	public static final RegistryObject<Block> ORCHIUM_BLOCK = REGISTRY.register("orchium_block", () -> new OrchiumBlockBlock());
	public static final RegistryObject<Block> MAGOLDIUM_ORE = REGISTRY.register("magoldium_ore", () -> new MagoldiumOreBlock());
	public static final RegistryObject<Block> MAGOLDIUM_BLOCK = REGISTRY.register("magoldium_block", () -> new MagoldiumBlockBlock());
	public static final RegistryObject<Block> ANCIENT_HARD_ICE = REGISTRY.register("ancient_hard_ice", () -> new AncientHardIceBlock());
}
