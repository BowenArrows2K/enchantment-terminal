package net.bowenarrrows.enchantmentterm.datagen;

import net.bowenarrrows.enchantmentterm.block.ModBlocks;
import net.bowenarrrows.enchantmentterm.item.ModItems;
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
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENCHANT_TERM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ENCHANT_TERM);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PORTABLE_ENCHANT_TERM, Models.GENERATED);
    }
}
