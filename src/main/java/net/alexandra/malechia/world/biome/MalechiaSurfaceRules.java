package net.alexandra.malechia.world.biome;

import com.google.common.collect.ImmutableList;
import net.alexandra.malechia.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.SurfaceRules;
import net.minecraft.world.gen.surfacebuilder.VanillaSurfaceRules;

public class MalechiaSurfaceRules {
    private static final SurfaceRules.MaterialRule ETHEREAL_DIRT = block(ModBlocks.ETHEREAL_DIRT.getDefaultState());
    private static final SurfaceRules.MaterialRule ETHEREAL_GRASS_BLOCK = block(ModBlocks.ETHEREAL_GRASS_BLOCK.getDefaultState());

    public static SurfaceRules.MaterialRule createDefaultRule() {
        SurfaceRules.MaterialRule materialRule = SurfaceRules.sequence(SurfaceRules.condition( SurfaceRules.biome(MalechiaBiomeKeys.ETHEREAL_CORE), ETHEREAL_GRASS_BLOCK), ETHEREAL_DIRT);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(materialRule);
        return SurfaceRules.sequence((SurfaceRules.MaterialRule[])builder.build().toArray(SurfaceRules.MaterialRule[]::new));
    }

    private static SurfaceRules.MaterialRule block(BlockState state) {
        return SurfaceRules.block(state);
    }
}
