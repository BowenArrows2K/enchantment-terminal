package net.bowenarrrows.enchantmentterm.item;

import net.bowenarrrows.enchantmentterm.EnchantmentTerminal;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PORTABLE_ENCHANT_TERM = registerItem("portable_enchant_term", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EnchantmentTerminal.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        EnchantmentTerminal.LOGGER.info("Registering Mod Items for " + EnchantmentTerminal.MOD_ID);
    }
}
