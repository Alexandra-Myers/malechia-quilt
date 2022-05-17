package net.alexandra.malechia.world.feature;

import net.minecraft.util.Holder;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil;

import static net.minecraft.world.gen.feature.VegetationPlacedFeatures.treePlacementModifiers;

public class ModTreePlacedFeatures {
    public static final Holder<PlacedFeature> ETHEREAL_TREE_PLACED = PlacedFeatureUtil.register(
            "ethereal_tree_placed", ModTreeConfiguredFeatures.ETHEREAL_TREES, treePlacementModifiers(PlacedFeatureUtil.createCountExtraModifier(1,0.5f, 2))
    );
}
