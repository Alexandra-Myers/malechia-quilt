package net.alexandra.malechia.world.feature;

import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.InSquarePlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.feature.PlacementModifier;

import java.util.List;

public class ModOreFeatures {
    public static List<PlacementModifier> orePlacementModifiers(PlacementModifier firstModifier, PlacementModifier secondModifier) {
        return List.of(firstModifier, InSquarePlacementModifier.getInstance(), secondModifier, BiomePlacementModifier.getInstance());
    }

    public static List<PlacementModifier> commonOrePlacementModifiers(int count, PlacementModifier modifier) {
        return orePlacementModifiers(CountPlacementModifier.create(count), modifier);
    }

    public static List<PlacementModifier> rareOrePlacementModifiers(int chance, PlacementModifier modifier) {
        return orePlacementModifiers(RarityFilterPlacementModifier.create(chance), modifier);
    }
}
