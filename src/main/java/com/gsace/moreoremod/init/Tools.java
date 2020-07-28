package com.gsace.moreoremod.init;

import com.gsace.moreoremod.MoreOreMod;
import com.gsace.moreoremod.MyItemGroup;
import com.gsace.moreoremod.init.tiers.ItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class Tools {

    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreOreMod.MODID);

    // Tin
    public static final RegistryObject<Item> TinSword = TOOLS.register("tin_sword", () -> new SwordItem(ItemTier.TIN, (int)3.5, -2.4f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> TinPickaxe = TOOLS.register("tin_pickaxe", () -> new PickaxeItem(ItemTier.TIN, (int)0.5, -2.8f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> TinShovel = TOOLS.register("tin_shovel", () -> new ShovelItem(ItemTier.TIN, (int)1.5, -3.0f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> TinAxe = TOOLS.register("tin_axe", () -> new AxeItem(ItemTier.TIN, (int)7.5, -3.2f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> TinHoe = TOOLS.register("tin_hoe", () -> new HoeItem(ItemTier.TIN, (int)1.5, -2.0f, new Item.Properties().group(MyItemGroup.instance)));

    // Copper
    public static final RegistryObject<Item> CopperSword = TOOLS.register("copper_sword", () -> new SwordItem(ItemTier.COPPER, 3, -2.4f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CopperPickaxe = TOOLS.register("copper_pickaxe", () -> new PickaxeItem(ItemTier.COPPER, 1, -2.8f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CopperShovel = TOOLS.register("copper_shovel", () -> new ShovelItem(ItemTier.COPPER, (int)1.5, -3.0f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CopperAxe = TOOLS.register("copper_axe", () -> new AxeItem(ItemTier.COPPER, (int)6.5, -3.2f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CopperHoe = TOOLS.register("copper_hoe", () -> new HoeItem(ItemTier.COPPER, (int)1.5, -2.0f, new Item.Properties().group(MyItemGroup.instance)));

    // Cobalt
    public static final RegistryObject<Item> CobaltSword = TOOLS.register("cobalt_sword", () -> new SwordItem(ItemTier.COBALT, 3, -2.4f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CobaltPickaxe = TOOLS.register("cobalt_pickaxe", () -> new PickaxeItem(ItemTier.COBALT, 1, -2.8f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CobaltShovel = TOOLS.register("cobalt_shovel", () -> new ShovelItem(ItemTier.COBALT, (int)1.5, -3.0f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CobaltAxe = TOOLS.register("cobalt_axe", () -> new AxeItem(ItemTier.COBALT, (int)5.5, -3.2f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CobaltHoe = TOOLS.register("cobalt_hoe", () -> new HoeItem(ItemTier.COBALT, (int)1.5, -2.0f, new Item.Properties().group(MyItemGroup.instance)));

    // Silver
    public static final RegistryObject<Item> SilverSword = TOOLS.register("silver_sword", () -> new SwordItem(ItemTier.SILVER, 3, -2.4f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> SilverPickaxe = TOOLS.register("silver_pickaxe", () -> new PickaxeItem(ItemTier.SILVER, 1, -2.8f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> SilverShovel = TOOLS.register("silver_shovel", () -> new ShovelItem(ItemTier.SILVER, (int)1.5, -3.0f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> SilverAxe = TOOLS.register("silver_axe", () -> new AxeItem(ItemTier.SILVER, 5, -3.2f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> SilverHoe = TOOLS.register("silver_hoe", () -> new HoeItem(ItemTier.SILVER, (int)1.5, -2.0f, new Item.Properties().group(MyItemGroup.instance)));

    // Mythril
    public static final RegistryObject<Item> MythrilSword = TOOLS.register("mythril_sword", () -> new SwordItem(ItemTier.MYTHRIL, 3, -2.4f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> MythrilPickaxe = TOOLS.register("mythril_pickaxe", () -> new PickaxeItem(ItemTier.MYTHRIL, 1, -2.8f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> MythrilShovel = TOOLS.register("mythril_shovel", () -> new ShovelItem(ItemTier.MYTHRIL, (int)1.5, -3.0f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> MythrilAxe = TOOLS.register("mythril_axe", () -> new AxeItem(ItemTier.MYTHRIL, 4, -3.2f, new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> MythrilHoe = TOOLS.register("mythril_hoe", () -> new HoeItem(ItemTier.MYTHRIL, (int)1.5, -2.0f, new Item.Properties().group(MyItemGroup.instance)));

}
