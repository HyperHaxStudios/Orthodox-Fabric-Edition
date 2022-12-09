package com.hyperhaxstudios.orthodox.item;

import net.fabricmc.api.client.itemgroup.FabricItemGroupBuilder;
import com.hyperhaxstudios.orthodox.Orthodox;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroupBuilder.Build(
        new Identifier(Orthodox.MOD_ID, "Orthodox"), () -> new ItemStack(ModItems.TANZANITE));
}