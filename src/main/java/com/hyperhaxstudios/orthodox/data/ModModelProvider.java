package com.hyperhaxstudios.orthodox.data;

import com.hyperhaxstudios.orthodox.block.ModBlocks;
import com.hyperhaxstudios.orthodox.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HYPER_IRON_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HYPER_IRON_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_HYPER_IRON_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_HYPER_IRON, Models.GENERATED);
        itemModelGenerator.register(ModItems.RING, Models.GENERATED);
        itemModelGenerator.register(ModItems.HYPER_IRON_INGOT, Models.GENERATED);
    }
}
