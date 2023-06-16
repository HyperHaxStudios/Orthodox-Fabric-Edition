package com.hyperhaxstudios.orthodox.data;

import com.hyperhaxstudios.orthodox.block.ModBlocks;
import com.hyperhaxstudios.orthodox.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.HYPER_IRON_BLOCK);

        oreDrops(ModBlocks.HYPER_IRON_ORE, ModItems.RAW_HYPER_IRON);
        oreDrops(ModBlocks.DEEPSLATE_HYPER_IRON_ORE, ModItems.RAW_HYPER_IRON);
    }
}
