
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beslandia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.beslandia.item.RawErroriumItem;
import net.mcreator.beslandia.item.OrchiumTearItem;
import net.mcreator.beslandia.item.OrchiumSwordItem;
import net.mcreator.beslandia.item.OrchiumShovelItem;
import net.mcreator.beslandia.item.OrchiumPickaxeItem;
import net.mcreator.beslandia.item.OrchiumIngotItem;
import net.mcreator.beslandia.item.OrchiumAxeItem;
import net.mcreator.beslandia.item.MagoldiumSwordItem;
import net.mcreator.beslandia.item.MagoldiumShovelItem;
import net.mcreator.beslandia.item.MagoldiumPickaxeItem;
import net.mcreator.beslandia.item.MagoldiumIngotItem;
import net.mcreator.beslandia.item.MagoldiumAxeItem;
import net.mcreator.beslandia.item.ErroriumSwordItem;
import net.mcreator.beslandia.item.ErroriumShovelItem;
import net.mcreator.beslandia.item.ErroriumPickaxeItem;
import net.mcreator.beslandia.item.ErroriumIngotItem;
import net.mcreator.beslandia.item.ErroriumAxeItem;
import net.mcreator.beslandia.item.AncientIceHandleItem;
import net.mcreator.beslandia.BeslandiaMod;

public class BeslandiaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BeslandiaMod.MODID);
	public static final RegistryObject<Item> ERRORIUM_ORE = block(BeslandiaModBlocks.ERRORIUM_ORE, BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB);
	public static final RegistryObject<Item> RAW_ERRORIUM = REGISTRY.register("raw_errorium", () -> new RawErroriumItem());
	public static final RegistryObject<Item> ERRORIUM_INGOT = REGISTRY.register("errorium_ingot", () -> new ErroriumIngotItem());
	public static final RegistryObject<Item> ERRORIUM_BLOCK = block(BeslandiaModBlocks.ERRORIUM_BLOCK, BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB);
	public static final RegistryObject<Item> ERRORIUM_SWORD = REGISTRY.register("errorium_sword", () -> new ErroriumSwordItem());
	public static final RegistryObject<Item> ERRORIUM_PICKAXE = REGISTRY.register("errorium_pickaxe", () -> new ErroriumPickaxeItem());
	public static final RegistryObject<Item> ERRORIUM_AXE = REGISTRY.register("errorium_axe", () -> new ErroriumAxeItem());
	public static final RegistryObject<Item> ERRORIUM_SHOVEL = REGISTRY.register("errorium_shovel", () -> new ErroriumShovelItem());
	public static final RegistryObject<Item> ORCHIUM_ORE = block(BeslandiaModBlocks.ORCHIUM_ORE, BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB);
	public static final RegistryObject<Item> ORCHIUM_TEAR = REGISTRY.register("orchium_tear", () -> new OrchiumTearItem());
	public static final RegistryObject<Item> ORCHIUM_INGOT = REGISTRY.register("orchium_ingot", () -> new OrchiumIngotItem());
	public static final RegistryObject<Item> ORCHIUM_BLOCK = block(BeslandiaModBlocks.ORCHIUM_BLOCK, BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB);
	public static final RegistryObject<Item> ORCHIUM_SWORD = REGISTRY.register("orchium_sword", () -> new OrchiumSwordItem());
	public static final RegistryObject<Item> ORCHIUM_PICKAXE = REGISTRY.register("orchium_pickaxe", () -> new OrchiumPickaxeItem());
	public static final RegistryObject<Item> ORCHIUM_AXE = REGISTRY.register("orchium_axe", () -> new OrchiumAxeItem());
	public static final RegistryObject<Item> ORCHIUM_SHOVEL = REGISTRY.register("orchium_shovel", () -> new OrchiumShovelItem());
	public static final RegistryObject<Item> MAGOLDIUM_ORE = block(BeslandiaModBlocks.MAGOLDIUM_ORE, BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB);
	public static final RegistryObject<Item> MAGOLDIUM_INGOT = REGISTRY.register("magoldium_ingot", () -> new MagoldiumIngotItem());
	public static final RegistryObject<Item> MAGOLDIUM_BLOCK = block(BeslandiaModBlocks.MAGOLDIUM_BLOCK, BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB);
	public static final RegistryObject<Item> MAGOLDIUM_SWORD = REGISTRY.register("magoldium_sword", () -> new MagoldiumSwordItem());
	public static final RegistryObject<Item> MAGOLDIUM_PICKAXE = REGISTRY.register("magoldium_pickaxe", () -> new MagoldiumPickaxeItem());
	public static final RegistryObject<Item> MAGOLDIUM_AXE = REGISTRY.register("magoldium_axe", () -> new MagoldiumAxeItem());
	public static final RegistryObject<Item> MAGOLDIUM_SHOVEL = REGISTRY.register("magoldium_shovel", () -> new MagoldiumShovelItem());
	public static final RegistryObject<Item> ANCIENT_HARD_ICE = block(BeslandiaModBlocks.ANCIENT_HARD_ICE, BeslandiaModTabs.TAB_BESLANDIA_CREATIVE_TAB);
	public static final RegistryObject<Item> ANCIENT_ICE_HANDLE = REGISTRY.register("ancient_ice_handle", () -> new AncientIceHandleItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
