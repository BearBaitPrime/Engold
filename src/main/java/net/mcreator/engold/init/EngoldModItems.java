/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.engold.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.engold.EngoldMod;

import java.util.function.Function;

public class EngoldModItems {
	public static Item GOLD_CLUMP;
	public static Item DIAMOND_CLUMP;
	public static Item EMERALD_CLUMP;
	public static Item IRONCLUMP;
	public static Item CALAMITY_CLUMP;

	public static void load() {
		GOLD_CLUMP = block(EngoldModBlocks.GOLD_CLUMP, "gold_clump", new Item.Properties().rarity(Rarity.UNCOMMON));
		DIAMOND_CLUMP = block(EngoldModBlocks.DIAMOND_CLUMP, "diamond_clump");
		EMERALD_CLUMP = block(EngoldModBlocks.EMERALD_CLUMP, "emerald_clump");
		IRONCLUMP = block(EngoldModBlocks.IRONCLUMP, "ironclump");
		CALAMITY_CLUMP = block(EngoldModBlocks.CALAMITY_CLUMP, "calamity_clump");
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(EngoldMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(EngoldMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}