package net.alexandra.malechia.item.custom;

import net.minecraft.item.DebugStickItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class EmpoweredStickItem extends DebugStickItem {

    public EmpoweredStickItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return super.useOnBlock(context);
    }
}
