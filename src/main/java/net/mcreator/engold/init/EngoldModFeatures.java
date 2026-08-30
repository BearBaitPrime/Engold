/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.engold.init;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.engold.block.IronclumpBlock;
import net.mcreator.engold.block.GoldClumpBlock;
import net.mcreator.engold.block.EmeraldClumpBlock;
import net.mcreator.engold.block.DiamondClumpBlock;
import net.mcreator.engold.block.CalamityClumpBlock;
import net.mcreator.engold.EngoldMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class EngoldModFeatures {
	public static void load() {
		register("gold_clump", new OreFeature(OreConfiguration.CODEC), GoldClumpBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("diamond_clump", new OreFeature(OreConfiguration.CODEC), DiamondClumpBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("emerald_clump", new OreFeature(OreConfiguration.CODEC), EmeraldClumpBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("ironclump", new OreFeature(OreConfiguration.CODEC), IronclumpBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("calamity_clump", new OreFeature(OreConfiguration.CODEC), CalamityClumpBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryname, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration stage) {
		register(registryname, feature);
		BiomeModifications.addFeature(biomes, stage, ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(EngoldMod.MODID, registryname)));
	}

	private static void register(String registryname, Feature feature) {
		Registry.register(BuiltInRegistries.FEATURE, Identifier.fromNamespaceAndPath(EngoldMod.MODID, registryname), feature);
	}
}