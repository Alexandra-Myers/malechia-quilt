package net.alexandra.malechia.world.biome;

import net.alexandra.malechia.MalechiaMod;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.*;

public class MalechiaBuiltinBiomes {
    private static void register(RegistryKey<Biome> key, Biome biome) {
        BuiltinRegistries.register(BuiltinRegistries.BIOME, key, biome);
    }

    static {
        MalechiaBuiltinBiomes.register(MalechiaBiomeKeys.ETHEREAL_CORE, EtherealBiomeCreator.createEtherealCore());
        MalechiaBuiltinBiomes.register(MalechiaBiomeKeys.ETHEREAL_CORE_AWAKENED, EtherealBiomeCreator.createAwakenedEtherealCore());
    }

    public static void registerModBiomes() {
        MalechiaMod.LOGGER.info("registering mod biomes for " + MalechiaMod.MOD_ID);
    }
}
