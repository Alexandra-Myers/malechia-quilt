package net.alexandra.malechia.item;

import net.minecraft.item.FoodComponent;

public class MalechiaFoodComponents {
    public static final FoodComponent BOSS_ESSENCE;
    static {
        BOSS_ESSENCE = (new FoodComponent.Builder()).hunger(6).saturationModifier(1F).build();
    }
}
