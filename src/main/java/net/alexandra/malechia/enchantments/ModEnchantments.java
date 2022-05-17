package net.alexandra.malechia.enchantments;

import io.netty.buffer.Unpooled;
import net.alexandra.malechia.MalechiaMod;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments{

    public static final Enchantment HEROS_EDGE = registerEnchantment("heros_edge",
            new HerosEdge());
    public static final Enchantment AUTOSMELT = registerEnchantment("autosmelt",
            new AutoSmelt());


    private static Enchantment registerEnchantment(String path, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(MalechiaMod.MOD_ID, path), enchantment);
    }

    public static void registerModEnchantments() {
        MalechiaMod.LOGGER.info("registering mod enchantments for " + MalechiaMod.MOD_ID);
    }
}
