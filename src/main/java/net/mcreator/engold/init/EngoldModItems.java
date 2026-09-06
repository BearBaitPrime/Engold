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
	public static Item CRYSTAL;
	public static Item MINERALIZED_DIAMOND_ORE;
	public static Item MINERALIZED_DIAMOND;
	public static Item TITANITE_ORE;
	public static Item TITANITE;
	public static Item WILLOW_TREE_LOG;
	public static Item WILLOW_TREE_LEAVES;
	public static Item ENVOX_SWORD;
	public static Item WAUDHYWHN_01DYNSORHTWMTQ;
	public static Item SOLAR_ORE;
	public static Item SOLAR_SOLID_FORM;
	public static Item LUNAR_ORE;
	public static Item LUNAR_SOLID_FORM;
	public static Item ECLIPSE_ORE;
	public static Item ECLIPSE_SOLID_FORM;
	public static Item MASS_COAL_CLUMP;
	public static Item CRYSTAL_DENSE_MASS;
	public static Item RED_WOOD_TREE_LOG;
	public static Item REDWOOD_LEAVES;
	public static Item MAPLE_TREE_LOG;
	public static Item MAPLE_TREE_LEAVES;
	public static Item WILLOW_PLANKS;
	public static Item WILLOW_STAIRS;
	public static Item WILLOW_SLAB;
	public static Item REDWOOD_PLANKS;
	public static Item REDWOOD_SLAB;
	public static Item REDWOOD_STAIRS;
	public static Item FLOODED_WORLD_DIMENSION;
	public static Item SAP_BLOCK;
	public static Item SAP;

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
		CRYSTAL = register("crystal", CrystalItem::new);
		MINERALIZED_DIAMOND_ORE = block(EngoldModBlocks.MINERALIZED_DIAMOND_ORE, "mineralized_diamond_ore", new Item.Properties().rarity(Rarity.UNCOMMON));
		MINERALIZED_DIAMOND = register("mineralized_diamond", MineralizedDiamondItem::new);
		TITANITE_ORE = block(EngoldModBlocks.TITANITE_ORE, "titanite_ore", new Item.Properties().rarity(Rarity.UNCOMMON));
		TITANITE = register("titanite", TitaniteItem::new);
		WILLOW_TREE_LOG = block(EngoldModBlocks.WILLOW_TREE_LOG, "willow_tree_log");
		WILLOW_TREE_LEAVES = block(EngoldModBlocks.WILLOW_TREE_LEAVES, "willow_tree_leaves");
		ENVOX_SWORD = register("envox_sword", EnvoxSwordItem::new);
		WAUDHYWHN_01DYNSORHTWMTQ = block(EngoldModBlocks.WAUDHYWHN_01DYNSORHTWMTQ, "waudhywhn_01dynsorhtwmtq");
		SOLAR_ORE = block(EngoldModBlocks.SOLAR_ORE, "solar_ore", new Item.Properties().rarity(Rarity.EPIC));
		SOLAR_SOLID_FORM = register("solar_solid_form", SolarSolidFormItem::new);
		LUNAR_ORE = block(EngoldModBlocks.LUNAR_ORE, "lunar_ore", new Item.Properties().rarity(Rarity.EPIC));
		LUNAR_SOLID_FORM = register("lunar_solid_form", LunarSolidFormItem::new);
		ECLIPSE_ORE = block(EngoldModBlocks.ECLIPSE_ORE, "eclipse_ore", new Item.Properties().rarity(Rarity.EPIC));
		ECLIPSE_SOLID_FORM = register("eclipse_solid_form", EclipseSolidFormItem::new);
		MASS_COAL_CLUMP = block(EngoldModBlocks.MASS_COAL_CLUMP, "mass_coal_clump", new Item.Properties().rarity(Rarity.UNCOMMON));
		CRYSTAL_DENSE_MASS = block(EngoldModBlocks.CRYSTAL_DENSE_MASS, "crystal_dense_mass", new Item.Properties().rarity(Rarity.UNCOMMON));
		RED_WOOD_TREE_LOG = block(EngoldModBlocks.RED_WOOD_TREE_LOG, "red_wood_tree_log", new Item.Properties().fireResistant());
		REDWOOD_LEAVES = block(EngoldModBlocks.REDWOOD_LEAVES, "redwood_leaves");
		MAPLE_TREE_LOG = block(EngoldModBlocks.MAPLE_TREE_LOG, "maple_tree_log");
		MAPLE_TREE_LEAVES = block(EngoldModBlocks.MAPLE_TREE_LEAVES, "maple_tree_leaves");
		WILLOW_PLANKS = block(EngoldModBlocks.WILLOW_PLANKS, "willow_planks");
		WILLOW_STAIRS = block(EngoldModBlocks.WILLOW_STAIRS, "willow_stairs");
		WILLOW_SLAB = block(EngoldModBlocks.WILLOW_SLAB, "willow_slab");
		REDWOOD_PLANKS = block(EngoldModBlocks.REDWOOD_PLANKS, "redwood_planks");
		REDWOOD_SLAB = block(EngoldModBlocks.REDWOOD_SLAB, "redwood_slab");
		REDWOOD_STAIRS = block(EngoldModBlocks.REDWOOD_STAIRS, "redwood_stairs");
		FLOODED_WORLD_DIMENSION = register("flooded_world_dimension", FloodedWorldDimensionItem::new);
		SAP_BLOCK = block(EngoldModBlocks.SAP_BLOCK, "sap_block");
		SAP = register("sap", SapItem::new);
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