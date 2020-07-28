package com.gsace.moreoremod;

import com.gsace.moreoremod.init.Blocks;
import com.gsace.moreoremod.init.Tools;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
// My item group tab
public class MyItemGroup extends ItemGroup {
    public static final MyItemGroup instance = new MyItemGroup(ItemGroup.GROUPS.length, "mytab");

    private MyItemGroup(int index, String label) {
        super(index, label);
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Blocks.TinOre.get());
    }
}