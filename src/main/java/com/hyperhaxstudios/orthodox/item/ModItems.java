package com.hyperhaxstudios.orthodox.item;

import com.hyperhaxstudios.orthodox.Orthodox;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RING = registerItem("ring",
            new Item(new FabricItemSettings()));
    public static final Item RAW_HYPER_IRON = registerItem("raw_hyper_iron",
            new Item(new FabricItemSettings()));
    public static final Item HYPER_IRON_INGOT = registerItem("hyper_iron_ingot",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Orthodox.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.NATURAL, RING);
        addToItemGroup(ItemGroups.NATURAL, RAW_HYPER_IRON);
        addToItemGroup(ItemGroups.NATURAL, HYPER_IRON_INGOT);

        addToItemGroup(ModItemGroup.ORTHODOX, RAW_HYPER_IRON);
        addToItemGroup(ModItemGroup.ORTHODOX, HYPER_IRON_INGOT);
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        Orthodox.LOGGER.info("Registering Mod Items for " + Orthodox.MOD_ID);

        addItemsToItemGroup();
    }
}
