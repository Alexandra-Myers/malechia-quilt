package net.alexandra.malechia.mixin;

import net.alexandra.malechia.block.ModBlocks;
import net.alexandra.malechia.item.ModItems;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ComposterBlock.class)
public class ComposterBlockMixin {
    @Shadow
    private static void registerCompostableItem(float levelIncreaseChance, ItemConvertible item) {}
    @Inject(method = "registerDefaultCompostableItems", at = @At("HEAD"))
    private static void injectCompostableItems(CallbackInfo ci) {
        ComposterBlockMixin.registerCompostableItem(0.3f, ModBlocks.ETHEREAL_LEAVES);
        ComposterBlockMixin.registerCompostableItem(0.65f, ModBlocks.ETHEREAL_BUSH);
        ComposterBlockMixin.registerCompostableItem(1.0f, ModItems.BOSS_ESSENCE);
    }
}
