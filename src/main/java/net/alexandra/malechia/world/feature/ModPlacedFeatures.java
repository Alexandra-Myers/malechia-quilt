package net.alexandra.malechia.world.feature;

import net.minecraft.util.Holder;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil;

import static net.alexandra.malechia.world.feature.ModOreFeatures.commonOrePlacementModifiers;
import static net.alexandra.malechia.world.feature.ModOreFeatures.rareOrePlacementModifiers;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> ALLIAN_ORE_PLACED;
    public static final Holder<PlacedFeature> LITRIUM_ORE_PLACED;
    public static final Holder<PlacedFeature> ALOTIC_ORE_PLACED = PlacedFeatureUtil.register(
			"alotic_ore_placed",
            ModConfiguredFeatures.ALOTIC_ORE,
			commonOrePlacementModifiers(6, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(80))));
    public static final Holder<PlacedFeature> HALORIUM_ORE_PLACED = PlacedFeatureUtil.register("halorium_ore_placed",
            ModConfiguredFeatures.HALORIUM_ORE, commonOrePlacementModifiers(8,
                    HeightRangePlacementModifier.createUniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(64))));
    public static final Holder<PlacedFeature> QUARITE_ORE_PLACED = PlacedFeatureUtil.register("quarite_ore_placed",
            ModConfiguredFeatures.QUARITE_ORE, commonOrePlacementModifiers(8,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(80))));
    public static final Holder<PlacedFeature> LOCRONITE_ORE_PLACED = PlacedFeatureUtil.register("locronite_ore_placed",
            ModConfiguredFeatures.LOCRONITE_ORE, commonOrePlacementModifiers(6,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-48), YOffset.aboveBottom(64))));
    public static final Holder<PlacedFeature> MYCRONIUM_ORE_PLACED = PlacedFeatureUtil.register("mycronium_ore_placed",
            ModConfiguredFeatures.MYCRONIUM_ORE, commonOrePlacementModifiers(8,
                    HeightRangePlacementModifier.createUniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(64))));
    public static final Holder<PlacedFeature> AURAUM_ORE_PLACED = PlacedFeatureUtil.register("auraum_ore_placed",
            ModConfiguredFeatures.AURAUM_ORE, commonOrePlacementModifiers(6,
                    HeightRangePlacementModifier.createUniform(YOffset.aboveBottom(-16), YOffset.aboveBottom(60))));
    public static final Holder<PlacedFeature> CHRYON_ORE_PLACED = PlacedFeatureUtil.register("chryon_ore_placed",
            ModConfiguredFeatures.CHRYON_ORE, commonOrePlacementModifiers(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(80))));
    public static final Holder<PlacedFeature> ERETH_ORE_PLACED = PlacedFeatureUtil.register("ereth_ore_placed",
            ModConfiguredFeatures.ERETH_ORE, commonOrePlacementModifiers(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-48), YOffset.aboveBottom(60))));
    static {
        ALLIAN_ORE_PLACED = PlacedFeatureUtil.register("ore_allian", ModConfiguredFeatures.ALLIAN_ORE, rareOrePlacementModifiers(6, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(100))));
        LITRIUM_ORE_PLACED = PlacedFeatureUtil.register("ore_litrium", ModConfiguredFeatures.LITRIUM_ORE, commonOrePlacementModifiers(6, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(80))));
    }
}
