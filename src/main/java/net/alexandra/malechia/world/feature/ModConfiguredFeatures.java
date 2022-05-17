package net.alexandra.malechia.world.feature;

import net.alexandra.malechia.MalechiaMod;
import net.alexandra.malechia.block.ModBlocks;
import net.minecraft.util.Holder;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.util.ConfiguredFeatureUtil;

import java.util.List;

import static net.minecraft.world.gen.feature.OreConfiguredFeatures.*;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> ALLIAN_ORES;
    public static final List<OreFeatureConfig.Target> ALOTIC_ORES;
    public static final List<OreFeatureConfig.Target> AURAUM_ORES;
    public static final List<OreFeatureConfig.Target> CHRYON_ORES;
    public static final List<OreFeatureConfig.Target> ERETH_ORES;
    public static final List<OreFeatureConfig.Target> HALORIUM_ORES;
    public static final List<OreFeatureConfig.Target> LITRIUM_ORES;
    public static final List<OreFeatureConfig.Target> LOCRONITE_ORES;
    public static final List<OreFeatureConfig.Target> MYCRONIUM_ORES;
    public static final List<OreFeatureConfig.Target> QUARITE_ORES;
    public static final Holder<ConfiguredFeature<OreFeatureConfig, ?>> ALLIAN_ORE;
    public static final Holder<ConfiguredFeature<OreFeatureConfig, ?>> ALOTIC_ORE;
    public static final Holder<ConfiguredFeature<OreFeatureConfig, ?>> AURAUM_ORE;
    public static final Holder<ConfiguredFeature<OreFeatureConfig, ?>> CHRYON_ORE;
    public static final Holder<ConfiguredFeature<OreFeatureConfig, ?>> ERETH_ORE;
    public static final Holder<ConfiguredFeature<OreFeatureConfig, ?>> HALORIUM_ORE;
    public static final Holder<ConfiguredFeature<OreFeatureConfig, ?>> LITRIUM_ORE;
    public static final Holder<ConfiguredFeature<OreFeatureConfig, ?>> LOCRONITE_ORE;
    public static final Holder<ConfiguredFeature<OreFeatureConfig, ?>> MYCRONIUM_ORE;
    public static final Holder<ConfiguredFeature<OreFeatureConfig, ?>> QUARITE_ORE;
    static{
        ALLIAN_ORES = List.of(OreFeatureConfig.createTarget(STONE_ORE_REPLACEABLES, ModBlocks.ALLIAN_ORE.getDefaultState()), OreFeatureConfig.createTarget(DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ALLIAN_ORE.getDefaultState()));
        ALLIAN_ORE = ConfiguredFeatureUtil.register( "ore_allian", Feature.ORE, new OreFeatureConfig(ALLIAN_ORES, 6, 0.6F));

        ALOTIC_ORES = List.of(OreFeatureConfig.createTarget(STONE_ORE_REPLACEABLES, ModBlocks.ALOTIC_ORE.getDefaultState()), OreFeatureConfig.createTarget(DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ALOTIC_ORE.getDefaultState()));
        ALOTIC_ORE = ConfiguredFeatureUtil.register("ore_alotic", Feature.ORE, new OreFeatureConfig(ALOTIC_ORES, 8));

        AURAUM_ORES = List.of(OreFeatureConfig.createTarget(STONE_ORE_REPLACEABLES, ModBlocks.AURAUM_ORE.getDefaultState()), OreFeatureConfig.createTarget(DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_AURAUM_ORE.getDefaultState()));
        AURAUM_ORE = ConfiguredFeatureUtil.register("ore_auraum", Feature.ORE, new OreFeatureConfig(AURAUM_ORES, 6));

        CHRYON_ORES = List.of(OreFeatureConfig.createTarget(STONE_ORE_REPLACEABLES, ModBlocks.CHRYON_ORE.getDefaultState()), OreFeatureConfig.createTarget(DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CHRYON_ORE.getDefaultState()));
        CHRYON_ORE = ConfiguredFeatureUtil.register("ore_chryon", Feature.ORE, new OreFeatureConfig(CHRYON_ORES, 8));

        ERETH_ORES = List.of(OreFeatureConfig.createTarget(STONE_ORE_REPLACEABLES, ModBlocks.ERETH_ORE.getDefaultState()), OreFeatureConfig.createTarget(DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ERETH_ORE.getDefaultState()));
        ERETH_ORE = ConfiguredFeatureUtil.register("ore_ereth", Feature.ORE, new OreFeatureConfig(ERETH_ORES, 8));

        HALORIUM_ORES = List.of(OreFeatureConfig.createTarget(STONE_ORE_REPLACEABLES, ModBlocks.HALORIUM_ORE.getDefaultState()), OreFeatureConfig.createTarget(DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_HALORIUM_ORE.getDefaultState()));
        HALORIUM_ORE = ConfiguredFeatureUtil.register("ore_halorium", Feature.ORE, new OreFeatureConfig(HALORIUM_ORES, 8));

        LITRIUM_ORES = List.of(OreFeatureConfig.createTarget(STONE_ORE_REPLACEABLES, ModBlocks.LITRIUM_ORE.getDefaultState()), OreFeatureConfig.createTarget(DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_LITRIUM_ORE.getDefaultState()));
        LITRIUM_ORE = ConfiguredFeatureUtil.register("ore_litrium", Feature.ORE, new OreFeatureConfig(LITRIUM_ORES, 8));

        LOCRONITE_ORES = List.of(OreFeatureConfig.createTarget(STONE_ORE_REPLACEABLES, ModBlocks.LOCRONITE_ORE.getDefaultState()), OreFeatureConfig.createTarget(DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_LOCRONITE_ORE.getDefaultState()));
        LOCRONITE_ORE = ConfiguredFeatureUtil.register("ore_locronite", Feature.ORE, new OreFeatureConfig(LOCRONITE_ORES, 4));

        MYCRONIUM_ORES = List.of(OreFeatureConfig.createTarget(STONE_ORE_REPLACEABLES, ModBlocks.MYCRONIUM_ORE.getDefaultState()), OreFeatureConfig.createTarget(DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MYCRONIUM_ORE.getDefaultState()));
        MYCRONIUM_ORE = ConfiguredFeatureUtil.register("ore_mycronium", Feature.ORE, new OreFeatureConfig(MYCRONIUM_ORES, 8));

        QUARITE_ORES = List.of(OreFeatureConfig.createTarget(STONE_ORE_REPLACEABLES, ModBlocks.QUARITE_ORE.getDefaultState()), OreFeatureConfig.createTarget(DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_QUARITE_ORE.getDefaultState()));
        QUARITE_ORE = ConfiguredFeatureUtil.register("ore_quarite", Feature.ORE, new OreFeatureConfig(QUARITE_ORES, 6));
    }


    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + MalechiaMod.MOD_ID);
    }
}
