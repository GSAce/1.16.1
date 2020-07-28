package com.gsace.moreoremod.init.tiers;

import com.gsace.moreoremod.MoreOreMod;
import com.gsace.moreoremod.init.Items;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;
@SuppressWarnings("NullableProblems")
public enum ArmorTier implements IArmorMaterial {
    TIN(MoreOreMod.MODID + ":tin", 10, new int[]{1, 4, 5, 1}, 7, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0f, 0,  () ->{
        return Ingredient.fromItems(Items.TinIngot.get());
    }),
    COPPER(MoreOreMod.MODID + ":copper", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0f, 0, () ->{
        return Ingredient.fromItems(Items.CopperIngot.get());
    }),
    COBALT(MoreOreMod.MODID + ":cobalt", 20, new int[]{3, 6, 8, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f,0,  () ->{
        return Ingredient.fromItems(Items.CobaltIngot.get());
    }),
    SILVER(MoreOreMod.MODID +":silver", 25, new int[]{4, 7, 9, 4}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f,0.2f,  () ->{
        return Ingredient.fromItems(Items.SilverIngot.get());
    }),
    MYTHRIL(MoreOreMod.MODID + ":mythril", 30, new int[]{5, 8, 10, 5}, 70, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f, 0.5f, () ->{
        return Ingredient.fromItems(Items.MythrilIngot.get());
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactory;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockback;
    private final LazyValue<Ingredient> repairMaterial;

    ArmorTier(String nameIn, int maxDamageFactoryIn, int[] damageReductionAmountArrayIn, int enchantabilityIn, SoundEvent soundEventIn, float toughness, float knockback, Supplier<Ingredient> repairMaterialIn){
        this.name = nameIn;
        this.maxDamageFactory = maxDamageFactoryIn;
        this.damageReductionAmountArray = damageReductionAmountArrayIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = soundEventIn;
        this.toughness = toughness;
        this.knockback = knockback;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactory;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockback;
    }

}
