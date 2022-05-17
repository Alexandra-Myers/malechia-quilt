package net.alexandra.malechia.world.biome;

import net.alexandra.malechia.world.feature.ModTreePlacedFeatures;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStep;

public class EtherealBiomeCreator {
        private static Biome createEtherealBiome(GenerationSettings.Builder builder, Biome.Category category) {
            SpawnSettings.Builder builder2 = new SpawnSettings.Builder();
            return new Biome.Builder().precipitation(Biome.Precipitation.SNOW).category(category).temperature(0.5f).downfall(0.5f).effects(new BiomeEffects.Builder().waterColor(4159204).waterFogColor(329011).fogColor(0xA080A0).skyColor(0).moodSound(BiomeMoodSound.CAVE).build()).spawnSettings(builder2.build()).generationSettings(builder.build()).build();
        }

        public static Biome createEtherealCore() {
            GenerationSettings.Builder builder = new GenerationSettings.Builder().feature(GenerationStep.Feature.VEGETAL_DECORATION, ModTreePlacedFeatures.ETHEREAL_TREE_PLACED);
            return EtherealBiomeCreator.createEtherealBiome(builder, Biome.Category.THEEND);
        }

        public static Biome createAwakenedEtherealCore() {
            GenerationSettings.Builder builder = new GenerationSettings.Builder().feature(GenerationStep.Feature.VEGETAL_DECORATION, ModTreePlacedFeatures.ETHEREAL_TREE_PLACED);
            return EtherealBiomeCreator.createEtherealBiome(builder, Biome.Category.THEEND);
        }
}
