package net.mcreator.engold.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;

public class LunarOreBlock extends Block {
	public LunarOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(3f, 10f).requiresCorrectToolForDrops());
	}

	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.all();
}