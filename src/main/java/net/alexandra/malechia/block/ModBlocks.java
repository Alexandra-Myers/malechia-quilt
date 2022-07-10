package net.alexandra.malechia.block;

import net.alexandra.malechia.MalechiaMod;
import net.alexandra.malechia.block.custom.BushBlock;
import net.alexandra.malechia.block.custom.EtherealDirtBlock;
import net.alexandra.malechia.block.custom.EtherealGrassBlock;
import net.alexandra.malechia.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

public class ModBlocks {

    public static final Block INFINITY_STAINED_GLASS = registerBlock("infinity_stained_glass",
            new StainedGlassBlock(DyeColor.CYAN, QuiltBlockSettings.copy(Blocks.GLASS).strength(3.0f).nonOpaque()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block PURE_ETHEREAL_CRYSTAL_BLOCK = registerBlock("pure_ethereal_crystal_block",
            new StainedGlassBlock(DyeColor.WHITE,QuiltBlockSettings.copy(Blocks.BEDROCK).strength(-1.0f).nonOpaque().sounds(BlockSoundGroup.AMETHYST_BLOCK)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ETHEREAL_DIRT = registerBlock("ethereal_dirt",
            new EtherealDirtBlock(QuiltBlockSettings.copy(Blocks.DIRT).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ETHEREAL_GRASS_BLOCK = registerBlock("ethereal_grass_block",
            new EtherealGrassBlock(QuiltBlockSettings.copy(Blocks.GRASS_BLOCK).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ETHEREAL_STONE = registerBlock("ethereal_stone",
            new Block(QuiltBlockSettings.copy(Blocks.DEEPSLATE).strength(8.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ETHEREAL_BUSH = registerBlock("ethereal_bush",
            new BushBlock(QuiltBlockSettings.copy(Blocks.AZALEA).nonOpaque()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ETHEREAL_LEAVES = registerBlock("ethereal_leaves",
            new LeavesBlock(QuiltBlockSettings.copy(Blocks.AZALEA_LEAVES).nonOpaque()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ETHEREAL_LOG = registerBlock("ethereal_log",
            new PillarBlock(QuiltBlockSettings.copy(Blocks.CRIMSON_STEM).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ETHEREAL_WOOD = registerBlock("ethereal_wood",
            new PillarBlock(QuiltBlockSettings.copy(Blocks.CRIMSON_HYPHAE).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ETHEREAL_PLANKS = registerBlock("ethereal_planks",
            new Block(QuiltBlockSettings.copy(Blocks.CRIMSON_PLANKS).strength(6.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block STRIPPED_ETHEREAL_LOG = registerBlock("stripped_ethereal_log",
            new PillarBlock(QuiltBlockSettings.copy(Blocks.STRIPPED_CRIMSON_STEM).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block STRIPPED_ETHEREAL_WOOD = registerBlock("stripped_ethereal_wood",
            new PillarBlock(QuiltBlockSettings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block FIERY_ETHEREAL_LOG = registerBlock("fiery_ethereal_log",
            new PillarBlock(QuiltBlockSettings.copy(Blocks.CRIMSON_STEM).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block FIERY_ETHEREAL_WOOD = registerBlock("fiery_ethereal_wood",
            new PillarBlock(QuiltBlockSettings.copy(Blocks.CRIMSON_HYPHAE).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block FIERY_ETHEREAL_PLANKS = registerBlock("fiery_ethereal_planks",
            new Block(QuiltBlockSettings.copy(Blocks.CRIMSON_PLANKS).strength(6.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block STRIPPED_FIERY_ETHEREAL_LOG = registerBlock("stripped_fiery_ethereal_log",
            new PillarBlock(QuiltBlockSettings.copy(Blocks.STRIPPED_CRIMSON_STEM).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block STRIPPED_FIERY_ETHEREAL_WOOD = registerBlock("stripped_fiery_ethereal_wood",
            new PillarBlock(QuiltBlockSettings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block INFINITY_ETHEREAL_LOG = registerBlock("infinity_ethereal_log",
            new PillarBlock(QuiltBlockSettings.copy(Blocks.CRIMSON_STEM).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block INFINITY_ETHEREAL_WOOD = registerBlock("infinity_ethereal_wood",
            new PillarBlock(QuiltBlockSettings.copy(Blocks.CRIMSON_HYPHAE).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block INFINITY_ETHEREAL_PLANKS = registerBlock("infinity_ethereal_planks",
            new Block(QuiltBlockSettings.copy(Blocks.CRIMSON_PLANKS).strength(6.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block STRIPPED_INFINITY_ETHEREAL_LOG = registerBlock("stripped_infinity_ethereal_log",
            new PillarBlock(QuiltBlockSettings.copy(Blocks.STRIPPED_CRIMSON_STEM).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block STRIPPED_INFINITY_ETHEREAL_WOOD = registerBlock("stripped_infinity_ethereal_wood",
            new PillarBlock(QuiltBlockSettings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).strength(4.0f).requiresTool()), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block QUARITE_ORE = registerBlock("quarite_ore",
			new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
					UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_QUARITE_ORE = registerBlock("deepslate_quarite_ore",
			new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
					UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block MYCRONIUM_ORE = registerBlock("mycronium_ore",
			new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
					UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);;
    public static final Block DEEPSLATE_MYCRONIUM_ORE = registerBlock("deepslate_mycronium_ore",
			new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
					UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block AURAUM_ORE = registerBlock("auraum_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_AURAUM_ORE = registerBlock("deepslate_auraum_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block LOCRONITE_ORE = registerBlock("locronite_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_LOCRONITE_ORE = registerBlock("deepslate_locronite_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ALOTIC_ORE = registerBlock("alotic_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_ALOTIC_ORE = registerBlock("deepslate_alotic_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ERETH_ORE = registerBlock("ereth_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_ERETH_ORE = registerBlock("deepslate_ereth_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block CHRYON_ORE = registerBlock("chryon_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_CHRYON_ORE = registerBlock("deepslate_chryon_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block HALORIUM_ORE = registerBlock("halorium_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_HALORIUM_ORE = registerBlock("deepslate_halorium_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block LITRIUM_ORE = registerBlock("litrium_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block DEEPSLATE_LITRIUM_ORE = registerBlock("deepslate_litrium_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(30f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block ALLIAN_ORE = registerBlock("allian_ore",
            new ExperienceDroppingBlock(QuiltBlockSettings.of(Material.STONE).strength(20f).requiresTool(),
                    UniformIntProvider.create(6, 10)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block MALECHIA_BLOCK = registerBlock("malechia_block",
            new Block(QuiltBlockSettings.of(Material.METAL).strength(100f).requiresTool().luminance(15)), ModItemGroups.MALECHIA_BLOCKS);
    public static final Block BOSS_ESSENCE_IRON_BLOCK = registerBlock("boss_essence_iron_block",
            new Block(QuiltBlockSettings.of(Material.METAL).strength(50f).requiresTool().luminance(4)), ModItemGroups.MALECHIA_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MalechiaMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MalechiaMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        MalechiaMod.LOGGER.info("registering mod blocks for " + MalechiaMod.MOD_ID);
    }

}
