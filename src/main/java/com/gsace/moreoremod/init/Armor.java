package com.gsace.moreoremod.init;

import com.gsace.moreoremod.MoreOreMod;
import com.gsace.moreoremod.MyItemGroup;
import com.gsace.moreoremod.init.tiers.ArmorTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class Armor {

    public static final DeferredRegister<Item> ARMOR = DeferredRegister.create(ForgeRegistries.ITEMS, MoreOreMod.MODID);

    // Tin
    public static final RegistryObject<Item> TinHelmet = ARMOR.register("tin_helmet", () -> new ArmorItem(ArmorTier.TIN, EquipmentSlotType.HEAD, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> TinChestplate = ARMOR.register("tin_chestplate", () -> new ArmorItem(ArmorTier.TIN, EquipmentSlotType.CHEST, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> TinLeggings = ARMOR.register("tin_leggings", () -> new ArmorItem(ArmorTier.TIN, EquipmentSlotType.LEGS, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> TinBoots = ARMOR.register("tin_boots", () -> new ArmorItem(ArmorTier.TIN, EquipmentSlotType.FEET, new Item.Properties().group(MyItemGroup.instance)));

    // Copper
    public static final RegistryObject<Item> CopperHelmet = ARMOR.register("copper_helmet", () -> new ArmorItem(ArmorTier.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CopperChestplate = ARMOR.register("copper_chestplate", () -> new ArmorItem(ArmorTier.COPPER, EquipmentSlotType.CHEST, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CopperLeggings = ARMOR.register("copper_leggings", () -> new ArmorItem(ArmorTier.COPPER, EquipmentSlotType.LEGS, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CopperBoots = ARMOR.register("copper_boots", () -> new ArmorItem(ArmorTier.COPPER, EquipmentSlotType.FEET, new Item.Properties().group(MyItemGroup.instance)));

    // Cobalt
    public static final RegistryObject<Item> CobaltHelmet = ARMOR.register("cobalt_helmet", () -> new ArmorItem(ArmorTier.COBALT, EquipmentSlotType.HEAD, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CobaltChestplate = ARMOR.register("cobalt_chestplate", () -> new ArmorItem(ArmorTier.COBALT, EquipmentSlotType.CHEST, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CobaltLeggings = ARMOR.register("cobalt_leggings", () -> new ArmorItem(ArmorTier.COBALT, EquipmentSlotType.LEGS, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CobaltBoots = ARMOR.register("cobalt_boots", () -> new ArmorItem(ArmorTier.COBALT, EquipmentSlotType.FEET, new Item.Properties().group(MyItemGroup.instance)));

    // Silver
    public static final RegistryObject<Item> SilverHelmet = ARMOR.register("silver_helmet", () -> new ArmorItem(ArmorTier.SILVER, EquipmentSlotType.HEAD, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> SilverChestplate = ARMOR.register("silver_chestplate", () -> new ArmorItem(ArmorTier.SILVER, EquipmentSlotType.CHEST, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> SilverLeggings = ARMOR.register("silver_leggings", () -> new ArmorItem(ArmorTier.SILVER, EquipmentSlotType.LEGS, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> SilverBoots = ARMOR.register("silver_boots", () -> new ArmorItem(ArmorTier.SILVER, EquipmentSlotType.FEET, new Item.Properties().group(MyItemGroup.instance)));

    // Mythril
    public static final RegistryObject<Item> MythrilHelmet = ARMOR.register("mythril_helmet", () -> new ArmorItem(ArmorTier.MYTHRIL, EquipmentSlotType.HEAD, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> MythrilChestplate = ARMOR.register("mythril_chestplate", () -> new ArmorItem(ArmorTier.MYTHRIL, EquipmentSlotType.CHEST, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> MythrilLeggings = ARMOR.register("mythril_leggings", () -> new ArmorItem(ArmorTier.MYTHRIL, EquipmentSlotType.LEGS, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> MythrilBoots = ARMOR.register("mythril_boots", () -> new ArmorItem(ArmorTier.MYTHRIL, EquipmentSlotType.FEET, new Item.Properties().group(MyItemGroup.instance)));
}
