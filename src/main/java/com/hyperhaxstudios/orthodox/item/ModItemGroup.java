package com.hyperhaxstudios.orthodox.item;

import com.hyperhaxstudios.orthodox.Orthodox;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup ORTHODOX;

    public static void registerItemGroups() {
        ORTHODOX = FabricItemGroup.builder(new Identifier(Orthodox.MOD_ID, "orthodox"))
                .displayName(Text.literal("Orthodox"))
                .icon(() -> new ItemStack(ModItems.HYPER_IRON_INGOT)).build();
    }
}
