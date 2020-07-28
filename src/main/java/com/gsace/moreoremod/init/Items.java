package com.gsace.moreoremod.init;

import com.gsace.moreoremod.MoreOreMod;
import com.gsace.moreoremod.MyItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreOreMod.MODID);

    public static final RegistryObject<Item> TinIngot = ITEMS.register("tin_ingot", () ->
            new Item(new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CopperIngot = ITEMS.register("copper_ingot", () ->
            new Item(new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CobaltIngot = ITEMS.register("cobalt_ingot", () ->
            new Item(new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> SilverIngot = ITEMS.register("silver_ingot", () ->
            new Item(new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> MythrilIngot = ITEMS.register("mythril_ingot", () ->
            new Item(new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> TinNugget = ITEMS.register("tin_nugget", () ->
            new Item(new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CopperNugget = ITEMS.register("copper_nugget", () ->
            new Item(new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> CobaltNugget = ITEMS.register("cobalt_nugget", () ->
            new Item(new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> SilverNugget = ITEMS.register("silver_nugget", () ->
            new Item(new Item.Properties().group(MyItemGroup.instance)));
    public static final RegistryObject<Item> MythrilNugget = ITEMS.register("mythril_nugget", () ->
            new Item(new Item.Properties().group(MyItemGroup.instance)));

}
