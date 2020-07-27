package com.gsace.moreoremod.world.gen;

import com.gsace.moreoremod.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("all")
public class OreGen {

    public static void generateOre() {
        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.PLAINS) {
                ConfiguredPlacement<CountRangeConfig> TinOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 64));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                Blocks.TinOre.get().getDefaultState(), 9)).withPlacement(TinOreConfig));
                ConfiguredPlacement<CountRangeConfig> CopperOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 64));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                Blocks.CopperOre.get().getDefaultState(), 9)).withPlacement(CopperOreConfig));
                ConfiguredPlacement<CountRangeConfig> CobaltOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(2, 0, 0, 32));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                Blocks.CobaltOre.get().getDefaultState(), 9)).withPlacement(CobaltOreConfig));
                ConfiguredPlacement<CountRangeConfig> SilverOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 16));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                Blocks.SilverOre.get().getDefaultState(), 8)).withPlacement(SilverOreConfig));
                ConfiguredPlacement<CountRangeConfig> MythrilOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 16));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                Blocks.MythrilOre.get().getDefaultState(), 8)).withPlacement(MythrilOreConfig));

            }
//            else {
//                ConfiguredPlacement<CountRangeConfig> TinOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 64));
//                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
//                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                                Blocks.TinOre.get().getDefaultState(), 9)).withPlacement(TinOreConfig));
//                ConfiguredPlacement<CountRangeConfig> CopperOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 64));
//                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
//                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                                Blocks.CopperOre.get().getDefaultState(), 9)).withPlacement(CopperOreConfig));
//                ConfiguredPlacement<CountRangeConfig> CobaltOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(2, 0, 0, 32));
//                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
//                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                                Blocks.CobaltOre.get().getDefaultState(), 9)).withPlacement(CobaltOreConfig));
//                ConfiguredPlacement<CountRangeConfig> SilverOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 16));
//                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
//                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                                Blocks.SilverOre.get().getDefaultState(), 8)).withPlacement(SilverOreConfig));
//                ConfiguredPlacement<CountRangeConfig> MythrilOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 16));
//                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
//                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
//                                Blocks.MythrilOre.get().getDefaultState(), 8)).withPlacement(MythrilOreConfig));
//
//            }
        }
    }
}
