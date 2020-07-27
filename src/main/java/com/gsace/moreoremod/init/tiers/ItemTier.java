package com.gsace.moreoremod.init.tiers;

import com.gsace.moreoremod.init.Items;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ItemTier implements IItemTier {

    TIN(2, 180, 4.0f, 1.5f, 7, () ->{
        return Ingredient.fromItems(Items.TinIngot.get());
    }),
    COPPER(2, 200, 5.0f, 2f, 9, () ->{
        return Ingredient.fromItems(Items.CopperIngot.get());
    }),
    COBALT(2, 500, 7.0f, 2.5f, 11, () ->{
        return Ingredient.fromItems(Items.CobaltIngot.get());
    }),
    SILVER(3, 1000, 9.0f, 3.5f, 50, () ->{
        return Ingredient.fromItems(Items.SilverIngot.get());
    }),
    MYTHRIL(3, 2500, 11.0f, 4.5f, 70, () ->{
        return Ingredient.fromItems(Items.MythrilIngot.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    ItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

}
