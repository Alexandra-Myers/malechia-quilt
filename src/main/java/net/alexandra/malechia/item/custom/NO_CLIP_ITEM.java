package net.alexandra.malechia.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class NO_CLIP_ITEM extends ToolItem {
    public NO_CLIP_ITEM(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);


        return super.finishUsing(stack, world, user);
    }
}
