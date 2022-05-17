package net.alexandra.malechia.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;

public class BossPower extends StatusEffect {
    public BossPower() {
        super(StatusEffectType.BENEFICIAL, 0x98D982);
    }
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
    }
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        ((PlayerEntity) entity).addExperienceLevels(amplifier);
        super.onApplied(entity, attributes, amplifier);
    }
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        super.onRemoved(entity, attributes, amplifier);
        if (entity.getHealth() > entity.getMaxHealth()) {
            entity.setHealth(entity.getMaxHealth());
        }
    }
}
