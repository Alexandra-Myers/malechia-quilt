package net.alexandra.malechia.item.custom;

import net.alexandra.malechia.effects.ModEffects;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.item.Items;

public class BOSS_ESSENCE extends Item {
    private static final int MAX_USE_TIME = 40;

    public BOSS_ESSENCE(FabricItemSettings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        if (user instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)user;
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }
        user.addStatusEffect(new StatusEffectInstance(ModEffects.BOSS_POWER, 200 * 2 * 10, 4));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 200 * 2 * 10, 100));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 200 * 2 * 10, 0));

        if (!world.isClient) {
            user.removeStatusEffect(StatusEffects.POISON);
            user.removeStatusEffect(StatusEffects.WITHER);
            user.removeStatusEffect(StatusEffects.HUNGER);
        }

        if (stack.isEmpty()) {
            return new ItemStack(net.minecraft.item.Items.GLASS_BOTTLE);
        } else {
            if (user instanceof PlayerEntity && !((PlayerEntity)user).getAbilities().creativeMode) {
                ItemStack itemStack = new ItemStack(Items.GLASS_BOTTLE);
                PlayerEntity playerEntity = (PlayerEntity)user;
                if (!playerEntity.getInventory().insertStack(itemStack)) {
                    playerEntity.dropItem(itemStack, false);
                }
            }
            return stack;
        }
    }

    public int getMaxUseTime(ItemStack stack) {
        return 40;
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    public SoundEvent getDrinkSound() {
        return SoundEvents.ITEM_HONEY_BOTTLE_DRINK;
    }

    public SoundEvent getEatSound() {
        return SoundEvents.ITEM_HONEY_BOTTLE_DRINK;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        super.onCraft(stack, world, player);
        stack.decrement(1);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
