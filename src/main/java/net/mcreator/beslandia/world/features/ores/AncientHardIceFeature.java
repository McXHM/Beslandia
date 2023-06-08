
package net.mcreator.beslandia.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;

import net.mcreator.beslandia.init.BeslandiaModBlocks;

import java.util.Set;
import java.util.List;

public class AncientHardIceFeature extends OreFeature {
	public static AncientHardIceFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new AncientHardIceFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("beslandia:ancient_hard_ice", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.ICE.defaultBlockState()), BeslandiaModBlocks.ANCIENT_HARD_ICE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.PACKED_ICE.defaultBlockState()), BeslandiaModBlocks.ANCIENT_HARD_ICE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.FROSTED_ICE.defaultBlockState()), BeslandiaModBlocks.ANCIENT_HARD_ICE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.BLUE_ICE.defaultBlockState()), BeslandiaModBlocks.ANCIENT_HARD_ICE.get().defaultBlockState())), 16));
		PLACED_FEATURE = PlacementUtils.register("beslandia:ancient_hard_ice", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(10), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(48), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public AncientHardIceFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}