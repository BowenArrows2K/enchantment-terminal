package net.bowenarrrows.enchantmentterm;

import net.bowenarrrows.enchantmentterm.block.ModBlocks;
import net.bowenarrrows.enchantmentterm.item.ModItemGroups;
import net.bowenarrrows.enchantmentterm.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnchantmentTerminal implements ModInitializer {
	public static final String MOD_ID = "enchantment_terminal";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}