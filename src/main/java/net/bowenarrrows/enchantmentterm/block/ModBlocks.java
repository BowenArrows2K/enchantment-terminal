package net.bowenarrrows.enchantmentterm.block;

import net.bowenarrrows.enchantmentterm.EnchantmentTerminal;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LecternBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ENCHANT_TERM = registerBlock("enchant_term",
            new LecternBlock(FabricBlockSettings.copyOf(Blocks.LECTERN)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EnchantmentTerminal.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(EnchantmentTerminal.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        EnchantmentTerminal.LOGGER.info("Registring ModBlocks for "+ EnchantmentTerminal.MOD_ID);
    }
}
