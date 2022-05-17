package net.alexandra.malechia.tag;

import net.alexandra.malechia.MalechiaMod;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MalechiaBlockTags {
    public static final TagKey<Block> ETHEREAL_GRASS = MalechiaBlockTags.register("ethereal_grass");

    public MalechiaBlockTags() {
    }

    public static TagKey<Block> register(String id) {
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(id));
    }
    public static void registerModBlockTags() {
        MalechiaMod.LOGGER.info("registering mod block tags for " + MalechiaMod.MOD_ID);
    }
}
