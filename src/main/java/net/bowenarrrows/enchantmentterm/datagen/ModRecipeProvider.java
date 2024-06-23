package net.bowenarrrows.enchantmentterm.datagen;

import net.bowenarrrows.enchantmentterm.block.ModBlocks;
import net.bowenarrrows.enchantmentterm.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PORTABLE_ENCHANT_TERM,1)
                .pattern("S")
                .pattern("E")
                .input('S', Items.STICK)
                .input('E', ModBlocks.ENCHANT_TERM)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModBlocks.ENCHANT_TERM), conditionsFromItem(ModBlocks.ENCHANT_TERM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PORTABLE_ENCHANT_TERM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ENCHANT_TERM,1)
                .pattern("SS")
                .pattern("SS")
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ENCHANT_TERM)));
    }
}
