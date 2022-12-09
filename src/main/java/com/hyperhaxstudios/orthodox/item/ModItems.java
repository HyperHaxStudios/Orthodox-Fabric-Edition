package com.hyperhaxstudios.orthodox.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import com.hyperhaxstudios.orthodox.Orthodox;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModItems {


    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite" ,
    new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Orthodox.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Orthodox.LOGGER.debug("Registring Items for " + Orthodox.MOD_ID);
    }
}