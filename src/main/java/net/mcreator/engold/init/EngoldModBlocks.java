/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.engold.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.engold.block.*;
import net.mcreator.engold.EngoldMod;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

import java.util.function.Function;

public class EngoldModBlocks {
	public static Block GOLD_CLUMP;
	public static Block DIAMOND_CLUMP;
	public static Block EMERALD_CLUMP;
	public static Block IRONCLUMP;
	public static Block CALAMITY_CLUMP;
	public static Block GRAPHENE_DEEPSLATE;
	public static Block ANCIENT_DEEPSLATE;
	public static Block MEGA_CLUMP_FLESH;
	public static Block NEPHERITE_JADE_ORE;
	public static Block MINERALIZED_DIAMOND_ORE;
	public static Block TITANITE_ORE;
	public static Block WILLOW_TREE_LOG;
	public static Block WILLOW_TREE_LEAVES;
	public static Block WAUDHYWHN_01DYNSORHTWMTQ;
	public static Block SOLAR_ORE;
	public static Block LUNAR_ORE;
	public static Block ECLIPSE_ORE;

	public static void load() {
		GOLD_CLUMP = register("gold_clump", GoldClumpBlock::new);
		DIAMOND_CLUMP = register("diamond_clump", DiamondClumpBlock::new);
		EMERALD_CLUMP = register("emerald_clump", EmeraldClumpBlock::new);
		IRONCLUMP = register("ironclump", IronclumpBlock::new);
		CALAMITY_CLUMP = register("calamity_clump", CalamityClumpBlock::new);
		GRAPHENE_DEEPSLATE = register("graphene_deepslate", GrapheneDeepslateBlock::new);
		ANCIENT_DEEPSLATE = register("ancient_deepslate", AncientDeepslateBlock::new);
		MEGA_CLUMP_FLESH = register("mega_clump_flesh", MegaClumpFleshBlock::new);
		NEPHERITE_JADE_ORE = register("nepherite_jade_ore", NepheriteJadeOreBlock::new);
		MINERALIZED_DIAMOND_ORE = register("mineralized_diamond_ore", MineralizedDiamondOreBlock::new);
		TITANITE_ORE = register("titanite_ore", TitaniteOreBlock::new);
		WILLOW_TREE_LOG = register("willow_tree_log", WillowTreeLogBlock::new);
		WILLOW_TREE_LEAVES = register("willow_tree_leaves", WillowTreeLeavesBlock::new);
		WAUDHYWHN_01DYNSORHTWMTQ = register("waudhywhn_01dynsorhtwmtq", Waudhywhn01dynsorhtwmtqBlock::new);
		SOLAR_ORE = register("solar_ore", SolarOreBlock::new);
		LUNAR_ORE = register("lunar_ore", LunarOreBlock::new);
		ECLIPSE_ORE = register("eclipse_ore", EclipseOreBlock::new);
		StrippableBlockRegistry.register(EngoldModBlocks.WILLOW_TREE_LOG, Blocks.OAK_PLANKS);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(EngoldMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}