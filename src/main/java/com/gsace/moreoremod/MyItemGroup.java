package com.gsace.moreoremod;

import com.gsace.moreoremod.init.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
// My item group tab
public class MyItemGroup extends ItemGroup {
    public static final MyItemGroup COMBAT = new MyItemGroup(ItemGroup.GROUPS.length, "mytab_combat");
    public static final MyItemGroup TOOLS = new MyItemGroup(ItemGroup.GROUPS.length, "mytab_tools");
    public static final MyItemGroup BUILDING_BLOCKS = new MyItemGroup(ItemGroup.GROUPS.length, "mytab_building_blocks");
    public static final MyItemGroup MATERIALS = new MyItemGroup(ItemGroup.GROUPS.length, "mytab_misc");

    private MyItemGroup(int index, String label) {
        super(index, label);
    }

    public static MyItemGroup getCOMBAT() {
        return COMBAT;
    }

    public static MyItemGroup getTOOLS() {
        return TOOLS;
    }

    public static MyItemGroup getBuildingBlocks() {
        return BUILDING_BLOCKS;
    }

    public static MyItemGroup getMATERIALS() {
        return MATERIALS;
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Blocks.TinOre.get());
    }
}