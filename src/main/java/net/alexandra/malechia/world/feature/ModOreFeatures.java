package net.alexandra.malechia.world.feature;

import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.InSquarePlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.feature.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOreFeatures {
    public static List<PlacementModifier> orePlacementModifiers(PlacementModifier firstModifier, PlacementModifier secondModifier) {
        return List.of(firstModifier, InSquarePlacement.spread(), secondModifier, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacementModifiers(int count, PlacementModifier modifier) {
        return orePlacementModifiers(CountPlacement.of(count), modifier);
    }

    public static List<PlacementModifier> rareOrePlacementModifiers(int chance, PlacementModifier modifier) {
        return orePlacementModifiers(RarityFilter.onAverageOnceEvery(chance), modifier);
    }
}
