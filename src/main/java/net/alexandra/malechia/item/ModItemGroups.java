package net.alexandra.malechia.item;

import net.alexandra.malechia.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MALECHIA_MISC = FabricItemGroupBuilder.build(
        new Identifier("malechia", "misc"),
        () -> new ItemStack(ModItems.MALECHIA_INGOT));
    public static final ItemGroup MALECHIA_BLOCKS = FabricItemGroupBuilder.build(
            new Identifier("malechia", "blocks"),
            () -> new ItemStack(ModBlocks.MALECHIA_BLOCK));

    public static final ItemGroup MALECHIA_COMBAT = FabricItemGroupBuilder.create(
                    new Identifier("malechia", "combat"))
            .icon(() -> new ItemStack(ModItems.BOSS_ESSENCE_IRON_SWORD))
            .build();
    public static final ItemGroup MALECHIA_TOOLS = FabricItemGroupBuilder.create(
                    new Identifier("malechia", "tools"))
            .icon(() -> new ItemStack(ModItems.MALECHIA_AXE))
            .build();
    public static final ItemGroup MALECHIA_BREWING = FabricItemGroupBuilder.create(
                    new Identifier("malechia", "brewing"))
            .icon(() -> new ItemStack(ModItems.BOSS_ESSENCE))
            .build();
}
