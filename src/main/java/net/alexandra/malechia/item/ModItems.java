package net.alexandra.malechia.item;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.alexandra.malechia.MalechiaMod;
import net.alexandra.malechia.item.custom.BOSS_ESSENCE;
import net.alexandra.malechia.item.custom.EmpoweredStickItem;
import net.alexandra.malechia.item.custom.MalechiaArmorItem;
import net.alexandra.malechialib.item.AxeItem;
import net.alexandra.malechialib.item.HoeItem;
import net.alexandra.malechialib.item.PickaxeItem;
import net.alexandra.malechialib.item.ShovelItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item NETHERITE_SHIELD = registerItem("netherite_shield",
            new FabricShieldItem(new FabricItemSettings().maxDamage(2500).group(ItemGroup.COMBAT).fireproof(), 10, 13, ModItems.NETHERITE_NUGGET));
    public static final Item BOSS_ESSENCE = registerItem("boss_essence",
            new BOSS_ESSENCE(new FabricItemSettings().rarity(Rarity.EPIC).food(MalechiaFoodComponents.BOSS_ESSENCE).maxCount(1).group(ModItemGroups.MALECHIA_BREWING)));
    public static final Item QUARITE = registerItem("quarite",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item MYCRONIUM_ORB = registerItem("mycronium_orb",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item MYCRONITE_INGOT = registerItem("mycronite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item AURAUM_CRYSTAL = registerItem("auraum_crystal",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item LOCRONITE_DUST = registerItem("locronite_dust",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item LOCRONITE_INGOT = registerItem("locronite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item ALOTIC_CRYSTAL = registerItem("alotic_crystal",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item RAW_ERETH = registerItem("raw_ereth",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item ERETH_INGOT = registerItem("ereth_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item CHRYON = registerItem("chryon",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item HALORIUM = registerItem("halorium",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item HALOTIC_INGOT = registerItem("halotic_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item LITRIUM_DUST = registerItem("litrium_dust",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item LITRIUM_INGOT = registerItem("litrium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item RAW_ALLIA = registerItem("raw_allia",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item ALLIAN_INGOT = registerItem("allian_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item MALECHIA_INGOT = registerItem("malechia_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item BOSS_ESSENCE_IRON_INGOT = registerItem("boss_essence_iron_ingot",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroups.MALECHIA_MISC)));
    public static final ToolItem BOSS_ESSENCE_IRON_SWORD = registerToolItem("boss_essence_iron_sword",
            new SwordItem(MalechiaToolMaterials.BOSS, 3, -2.4F, new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().group(ModItemGroups.MALECHIA_COMBAT)));
    public static final ToolItem BOSS_ESSENCE_IRON_SHOVEL = registerToolItem("boss_essence_iron_shovel",
            new ShovelItem(MalechiaToolMaterials.BOSS, 2.5F, -2.5F, new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().group(ModItemGroups.MALECHIA_TOOLS)));
    public static final ToolItem BOSS_ESSENCE_IRON_PICKAXE = registerToolItem("boss_essence_iron_pickaxe",
            new PickaxeItem(MalechiaToolMaterials.BOSS, 2, -2.3F, new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().group(ModItemGroups.MALECHIA_TOOLS)));
    public static final ToolItem BOSS_ESSENCE_IRON_AXE = registerToolItem("boss_essence_iron_axe",
            new AxeItem(4, -3.0F,MalechiaToolMaterials.BOSS,  new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().group(ModItemGroups.MALECHIA_TOOLS)));
    public static final ToolItem BOSS_ESSENCE_IRON_HOE = registerToolItem("boss_essence_iron_hoe",
            new HoeItem(MalechiaToolMaterials.BOSS, 1, 0F, new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().group(ModItemGroups.MALECHIA_TOOLS)));
    public static final Item BOSS_ESSENCE_NETHER_STAR = registerItem("boss_essence_nether_star",
            new NetherStarItem(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroups.MALECHIA_MISC)));
    public static final Item NETHERITE_SCRAP_NUGGET = registerItem("netherite_scrap_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item NETHERITE_NUGGET = registerItem("netherite_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.MALECHIA_MISC)));
    public static final Item UNIFIER = registerItem("unifier",
            new NetherStarItem(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroups.MALECHIA_MISC)));
    public static final Item COMBINER = registerItem("combiner",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroups.MALECHIA_MISC)));
    public static final ToolItem MALECHIA_SWORD = registerToolItem("malechia_sword",
            new SwordItem(MalechiaToolMaterials.MALECHIA, 3, -2F, new Item.Settings().rarity(Rarity.RARE).fireproof().group(ModItemGroups.MALECHIA_COMBAT)));
    public static final ToolItem MALECHIA_SHOVEL = registerToolItem("malechia_shovel",
            new ShovelItem(MalechiaToolMaterials.MALECHIA, 2.5F, -2.5F, new Item.Settings().rarity(Rarity.RARE).fireproof().group(ModItemGroups.MALECHIA_TOOLS)));
    public static final ToolItem MALECHIA_PICKAXE = registerToolItem("malechia_pickaxe",
            new PickaxeItem(MalechiaToolMaterials.MALECHIA, 2, -2.3F, new Item.Settings().rarity(Rarity.RARE).fireproof().group(ModItemGroups.MALECHIA_TOOLS)));
    public static final ToolItem MALECHIA_AXE = registerToolItem("malechia_axe",
            new AxeItem(4, -2.7F,MalechiaToolMaterials.MALECHIA,  new Item.Settings().rarity(Rarity.RARE).fireproof().group(ModItemGroups.MALECHIA_TOOLS)));
    public static final ToolItem MALECHIA_HOE = registerToolItem("malechia_hoe",
            new HoeItem(MalechiaToolMaterials.MALECHIA, 1, 1F, new Item.Settings().rarity(Rarity.RARE).fireproof().group(ModItemGroups.MALECHIA_TOOLS)));
    public static final ArmorItem MALECHIA_HELMET = registerArmorItem("malechia_helmet",
            new MalechiaArmorItem(MalechiaArmorMaterials.MALECHIA, EquipmentSlot.HEAD, new Item.Settings().rarity(Rarity.RARE).fireproof().group(ModItemGroups.MALECHIA_COMBAT)));
    public static final ArmorItem MALECHIA_CHESTPLATE = registerArmorItem("malechia_chestplate",
            new ArmorItem(MalechiaArmorMaterials.MALECHIA, EquipmentSlot.CHEST, new Item.Settings().rarity(Rarity.RARE).fireproof().group(ModItemGroups.MALECHIA_COMBAT)));
    public static final ArmorItem MALECHIA_LEGGINGS = registerArmorItem("malechia_leggings",
            new ArmorItem(MalechiaArmorMaterials.MALECHIA, EquipmentSlot.LEGS, new Item.Settings().rarity(Rarity.RARE).fireproof().group(ModItemGroups.MALECHIA_COMBAT)));
    public static final ArmorItem MALECHIA_BOOTS = registerArmorItem("malechia_boots",
            new ArmorItem(MalechiaArmorMaterials.MALECHIA, EquipmentSlot.FEET, new Item.Settings().rarity(Rarity.RARE).fireproof().group(ModItemGroups.MALECHIA_COMBAT)));
    public static final MalechiaBowItem MALECHIA_BOW = registerMalechiaBowItem("malechia_bow",
            new MalechiaBowItem(new FabricItemSettings().group(ModItemGroups.MALECHIA_COMBAT).rarity(Rarity.RARE).maxDamage(5000)));
    public static final Item MALECHIA_SHIELD = registerItem("malechia_shield",
            new FabricShieldItem(new FabricItemSettings().maxDamage(5000).group(ModItemGroups.MALECHIA_COMBAT).fireproof(), 5, 20, ModItems.UNIFIER));
    public static final Item EMPOWERED_STICK = registerItem("empowered_stick",
            new EmpoweredStickItem(new FabricItemSettings().fireproof().rarity(Rarity.EPIC).group(ModItemGroups.MALECHIA_TOOLS)));
    public static final ToolItem SPRUCE_SWORD = registerToolItem("spruce_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final ToolItem BIRCH_SWORD = registerToolItem("birch_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final ToolItem JUNGLE_SWORD = registerToolItem("jungle_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final ToolItem ACACIA_SWORD = registerToolItem("acacia_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final ToolItem DARK_OAK_SWORD = registerToolItem("dark_oak_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final ToolItem CRIMSON_SWORD = registerToolItem("crimson_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));
    public static final ToolItem WARPED_SWORD = registerToolItem("warped_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));
    public static final ToolItem SPRUCE_SHOVEL = registerToolItem("spruce_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS)));
    public static final ToolItem BIRCH_SHOVEL = registerToolItem("birch_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS)));
    public static final ToolItem JUNGLE_SHOVEL = registerToolItem("jungle_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS)));
    public static final ToolItem SPRUCE_PICKAXE = registerToolItem("spruce_pickaxe",
            new PickaxeItem(ToolMaterials.WOOD, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS)));
    public static final ToolItem BIRCH_PICKAXE = registerToolItem("birch_pickaxe",
            new PickaxeItem(ToolMaterials.WOOD, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS)));
    public static final ToolItem JUNGLE_PICKAXE = registerToolItem("jungle_pickaxe",
            new PickaxeItem(ToolMaterials.WOOD, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS)));
    public static final ToolItem SPRUCE_AXE = registerToolItem("spruce_axe",
            new AxeItem( 6, 6.0F, ToolMaterials.WOOD, (new Item.Settings()).group(ItemGroup.TOOLS)));
    public static final ToolItem BIRCH_AXE = registerToolItem("birch_axe",
            new AxeItem( 6, 6.0F, ToolMaterials.WOOD, (new Item.Settings()).group(ItemGroup.TOOLS)));
    public static final ToolItem JUNGLE_AXE = registerToolItem("jungle_axe",
            new AxeItem( 6, 6.0F, ToolMaterials.WOOD, (new Item.Settings()).group(ItemGroup.TOOLS)));
    public static final ToolItem SPRUCE_HOE = registerToolItem("spruce_hoe",
            new HoeItem(ToolMaterials.WOOD, 0, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS)));
    public static final ToolItem BIRCH_HOE = registerToolItem("birch_hoe",
            new HoeItem(ToolMaterials.WOOD, 0, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS)));
    public static final ToolItem JUNGLE_HOE = registerToolItem("jungle_hoe",
            new HoeItem(ToolMaterials.WOOD, 0, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS)));
//    public static final Item NO_CLIP_ITEM = registerItem("no_clip",
//            new NO_CLIP_ITEM(toolMaterialBoss.INSTANCE, new Item.Settings().rarity(Rarity.EPIC).fireproof().group(ItemGroup.TOOLS)));


    private static Item registerMinecraftItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("minecraft", name), item);
    }
    private static Item registerItem(String name, Item item) {
           return Registry.register(Registry.ITEM, new Identifier(MalechiaMod.MOD_ID, name), item);
    }
    private static ToolItem registerMinecraftToolItem(String name, Item item) {
        return (ToolItem) Registry.register(Registry.ITEM, new Identifier(MalechiaMod.MOD_ID, name), item);
    }
    private static ToolItem registerToolItem(String name, Item item) {
        return (ToolItem) Registry.register(Registry.ITEM, new Identifier(MalechiaMod.MOD_ID, name), item);
    }
    private static ArmorItem registerArmorItem(String name, Item item) {
        return (ArmorItem) Registry.register(Registry.ITEM, new Identifier(MalechiaMod.MOD_ID, name), item);
    }
    private static BowItem registerBowItem(String name, Item item) {
        return (BowItem) Registry.register(Registry.ITEM, new Identifier(MalechiaMod.MOD_ID, name), item);
    }
    private static MalechiaBowItem registerMalechiaBowItem(String name, Item item) {
        return (MalechiaBowItem) Registry.register(Registry.ITEM, new Identifier(MalechiaMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MalechiaMod.LOGGER.info("registering mod items for " + MalechiaMod.MOD_ID);
    }

}
