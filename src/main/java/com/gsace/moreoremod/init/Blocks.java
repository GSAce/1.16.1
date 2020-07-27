package com.gsace.moreoremod.init;

import com.gsace.moreoremod.MoreOreMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class Blocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreOreMod.MODID);

    public static final RegistryObject<Block> TinOre = BLOCKS.register("tin_ore", () ->
            new OreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY).hardnessAndResistance(2.5F).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CopperOre = BLOCKS.register("copper_ore", () ->
            new OreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(3.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CobaltOre = BLOCKS.register("cobalt_ore", () ->
            new OreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(3.5F).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE)));
    public static final RegistryObject<Block> SilverOre = BLOCKS.register("silver_ore", () ->
            new OreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY).hardnessAndResistance(4.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE)));
    public static final RegistryObject<Block> MythrilOre = BLOCKS.register("mythril_ore", () ->
            new OreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(4.5F).harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE)));
    public static final RegistryObject<Block> TinBlock = BLOCKS.register("tin_block", () ->
            new OreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY).hardnessAndResistance(2.5F).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CopperBlock = BLOCKS.register("copper_block", () ->
            new OreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(3.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CobaltBlock = BLOCKS.register("cobalt_block", () ->
            new OreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE).hardnessAndResistance(3.5F).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE)));
    public static final RegistryObject<Block> SilverBlock = BLOCKS.register("silver_block", () ->
            new OreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.LIGHT_GRAY).hardnessAndResistance(4.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE)));
    public static final RegistryObject<Block> MythrilBlock = BLOCKS.register("mythril_block", () ->
            new OreBlock(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GREEN).hardnessAndResistance(4.5F).harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool().sound(SoundType.STONE)));

}
