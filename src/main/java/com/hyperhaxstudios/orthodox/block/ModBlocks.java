package com.hyperhaxstudios.orthodox.block;

import com.hyperhaxstudios.orthodox.Orthodox;
import com.hyperhaxstudios.orthodox.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block HYPER_IRON_BLOCK = registerBlock("hyper_iron_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ORTHODOX);

    public static final Block DEEPSLATE_HYPER_IRON_ORE = registerBlock("deepslate_hyper_iron_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.ORTHODOX);

    public static final Block HYPER_IRON_ORE = registerBlock("hyper_iron_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.ORTHODOX);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Orthodox.MOD_ID, name), block);
    }
private static Item registerBlockItem(String name, Block block, ItemGroup group) {
    Item item = Registry.register(Registries.ITEM, new Identifier(Orthodox.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));

    ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    return item;
}

    public static void registerModBlocks() {
        Orthodox.LOGGER.info("Registering ModBlocks for " + Orthodox.MOD_ID);
    }
}
