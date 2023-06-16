package com.hyperhaxstudios.orthodox.data;

import com.hyperhaxstudios.orthodox.block.ModBlocks;
import com.hyperhaxstudios.orthodox.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_HYPER_IRON), RecipeCategory.MISC, ModItems.HYPER_IRON_INGOT,
                0.7f, 200,"hyper_iron_ingot");


        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.HYPER_IRON_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.HYPER_IRON_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HYPER_IRON_INGOT)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.HYPER_IRON_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.HYPER_IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.HYPER_IRON_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.HYPER_IRON_INGOT)));


    }
}
