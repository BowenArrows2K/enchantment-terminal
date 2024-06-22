package net.bowenarrrows.enchantmentterm.item;

import net.bowenarrrows.enchantmentterm.EnchantmentTerminal;
import net.bowenarrrows.enchantmentterm.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ENCHANT_TERM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EnchantmentTerminal.MOD_ID, "enchant-term"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.enchant_term"))
                    .icon(() -> new ItemStack(ModItems.PORTABLE_ENCHANT_TERM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PORTABLE_ENCHANT_TERM);
                        entries.add(ModBlocks.ENCHANT_TERM);
                    }).build());

    public static void  registerItemGroups() {
        EnchantmentTerminal.LOGGER.info("Registering Item Groups for " + EnchantmentTerminal.MOD_ID);
    }
}
