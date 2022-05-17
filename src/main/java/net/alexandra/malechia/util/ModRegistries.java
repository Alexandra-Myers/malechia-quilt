package net.alexandra.malechia.util;

import net.alexandra.malechia.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.ETHEREAL_LOG, ModBlocks.STRIPPED_ETHEREAL_LOG);
        StrippableBlockRegistry.register(ModBlocks.ETHEREAL_WOOD, ModBlocks.STRIPPED_ETHEREAL_WOOD);
        StrippableBlockRegistry.register(ModBlocks.FIERY_ETHEREAL_LOG, ModBlocks.STRIPPED_FIERY_ETHEREAL_LOG);
        StrippableBlockRegistry.register(ModBlocks.FIERY_ETHEREAL_WOOD, ModBlocks.STRIPPED_FIERY_ETHEREAL_WOOD);
        StrippableBlockRegistry.register(ModBlocks.INFINITY_ETHEREAL_LOG, ModBlocks.STRIPPED_INFINITY_ETHEREAL_LOG);
        StrippableBlockRegistry.register(ModBlocks.INFINITY_ETHEREAL_WOOD, ModBlocks.STRIPPED_INFINITY_ETHEREAL_WOOD);
    }
}