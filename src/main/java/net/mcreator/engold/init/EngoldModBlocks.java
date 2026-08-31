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
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(EngoldMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}