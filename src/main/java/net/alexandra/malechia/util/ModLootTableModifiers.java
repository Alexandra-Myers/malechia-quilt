package net.alexandra.malechia.util;

import net.alexandra.malechia.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v2.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier BASTION_TREASURE_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_treasure");

    public static void modifyLootTables() {
		LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
		if(LootTables.BASTION_TREASURE_CHEST.compareTo(BASTION_TREASURE_CHEST_ID) == 0) {
				FabricLootTableBuilder poolBuilder = LootTable.builder()
						.pool(LootPool.builder()
								.rolls(ConstantLootNumberProvider.create(1))
								.conditionally(RandomChanceLootCondition.builder(0.1f))
								.with(ItemEntry.builder(ModItems.BOSS_ESSENCE))
								.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()));
                supplier.apply((LootFunction.Builder) poolBuilder);
        }}));
    }
}
