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

import net.mcreator.engold.item.*;
import net.mcreator.engold.EngoldMod;

import java.util.function.Function;

public class EngoldModItems {
	public static Item GOLD_CLUMP;
	public static Item DIAMOND_CLUMP;
	public static Item EMERALD_CLUMP;
	public static Item IRONCLUMP;
	public static Item CALAMITY_CLUMP;
	public static Item GRAPHENE_DEEPSLATE;
	public static Item ANCIENT_DEEPSLATE;
	public static Item GRAPHENE;
	public static Item GRAPHENE_PICKAXE;
	public static Item MEGA_CLUMP_FLESH;
	public static Item MINERALS;
	public static Item STONE_RUBBLE;
	public static Item REINFORCEMENT_BEAM;
	public static Item PURIFIED_GRAPHENE_ORE;
	public static Item REINFORCED_GRAPHENE_PICKAXE;
	public static Item NEPHERITE_JADE_ORE;
	public static Item NEPHERITE_JADE;

	public static void load() {
		GOLD_CLUMP = block(EngoldModBlocks.GOLD_CLUMP, "gold_clump", new Item.Properties().rarity(Rarity.UNCOMMON));
		DIAMOND_CLUMP = block(EngoldModBlocks.DIAMOND_CLUMP, "diamond_clump");
		EMERALD_CLUMP = block(EngoldModBlocks.EMERALD_CLUMP, "emerald_clump");
		IRONCLUMP = block(EngoldModBlocks.IRONCLUMP, "ironclump");
		CALAMITY_CLUMP = block(EngoldModBlocks.CALAMITY_CLUMP, "calamity_clump", new Item.Properties().rarity(Rarity.EPIC));
		GRAPHENE_DEEPSLATE = block(EngoldModBlocks.GRAPHENE_DEEPSLATE, "graphene_deepslate", new Item.Properties().rarity(Rarity.RARE));
		ANCIENT_DEEPSLATE = block(EngoldModBlocks.ANCIENT_DEEPSLATE, "ancient_deepslate");
		GRAPHENE = register("graphene", GrapheneItem::new);
		GRAPHENE_PICKAXE = register("graphene_pickaxe", GraphenePickaxeItem::new);
		MEGA_CLUMP_FLESH = block(EngoldModBlocks.MEGA_CLUMP_FLESH, "mega_clump_flesh", new Item.Properties().rarity(Rarity.UNCOMMON));
		MINERALS = register("minerals", MineralsItem::new);
		STONE_RUBBLE = register("stone_rubble", StoneRubbleItem::new);
		REINFORCEMENT_BEAM = register("reinforcement_beam", ReinforcementBeamItem::new);
		PURIFIED_GRAPHENE_ORE = register("purified_graphene_ore", PurifiedGrapheneOreItem::new);
		REINFORCED_GRAPHENE_PICKAXE = register("reinforced_graphene_pickaxe", ReinforcedGraphenePickaxeItem::new);
		NEPHERITE_JADE_ORE = block(EngoldModBlocks.NEPHERITE_JADE_ORE, "nepherite_jade_ore", new Item.Properties().rarity(Rarity.RARE));
		NEPHERITE_JADE = register("nepherite_jade", NepheriteJadeItem::new);
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