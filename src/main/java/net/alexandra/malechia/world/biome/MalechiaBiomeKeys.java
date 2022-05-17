package net.alexandra.malechia.world.biome;

import net.alexandra.malechia.MalechiaMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

public class MalechiaBiomeKeys {
    public static final RegistryKey<Biome> ETHEREAL_CORE = register("the_core");
    public static final RegistryKey<Biome> ETHEREAL_CORE_AWAKENED = register("the_core_awakened");
    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(MalechiaMod.MOD_ID,name));
    }
}
