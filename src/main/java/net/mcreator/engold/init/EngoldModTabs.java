/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.engold.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.engold.EngoldMod;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class EngoldModTabs {
	public static ResourceKey<CreativeModeTab> TAB_ENGOLD = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(EngoldMod.MODID, "engold"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_ENGOLD, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("item_group.engold.engold")).icon(() -> new ItemStack(EngoldModBlocks.DIAMOND_CLUMP))
				.type(CreativeModeTab.Type.SEARCH).backgroundTexture(Identifier.withDefaultNamespace("textures/gui/container/creative_inventory/tab_item_search.png")).displayItems((parameters, tabData) -> {
					tabData.accept(EngoldModBlocks.GOLD_CLUMP.asItem());
					tabData.accept(EngoldModBlocks.DIAMOND_CLUMP.asItem());
					tabData.accept(EngoldModBlocks.EMERALD_CLUMP.asItem());
					tabData.accept(EngoldModBlocks.IRONCLUMP.asItem());
					tabData.accept(EngoldModBlocks.CALAMITY_CLUMP.asItem());
					tabData.accept(EngoldModBlocks.GRAPHENE_DEEPSLATE.asItem());
					tabData.accept(EngoldModBlocks.ANCIENT_DEEPSLATE.asItem());
					tabData.accept(EngoldModItems.GRAPHENE);
					tabData.accept(EngoldModItems.GRAPHENE_PICKAXE);
					tabData.accept(EngoldModBlocks.MEGA_CLUMP_FLESH.asItem());
					tabData.accept(EngoldModItems.MINERALS);
					tabData.accept(EngoldModItems.STONE_RUBBLE);
					tabData.accept(EngoldModItems.REINFORCEMENT_BEAM);
					tabData.accept(EngoldModItems.REINFORCED_GRAPHENE_PICKAXE);
					tabData.accept(EngoldModBlocks.NEPHERITE_JADE_ORE.asItem());
					tabData.accept(EngoldModItems.NEPHERITE_JADE);
					tabData.accept(EngoldModBlocks.MINERALIZED_DIAMOND_ORE.asItem());
					tabData.accept(EngoldModItems.MINERALIZED_DIAMOND);
					tabData.accept(EngoldModBlocks.TITANITE_ORE.asItem());
					tabData.accept(EngoldModItems.TITANITE);
					tabData.accept(EngoldModBlocks.WILLOW_TREE_LOG.asItem());
					tabData.accept(EngoldModBlocks.WILLOW_TREE_LEAVES.asItem());
					tabData.accept(EngoldModItems.ENVOX_SWORD);
					tabData.accept(EngoldModBlocks.SOLAR_ORE.asItem());
					tabData.accept(EngoldModItems.SOLAR_SOLID_FORM);
					tabData.accept(EngoldModBlocks.LUNAR_ORE.asItem());
					tabData.accept(EngoldModItems.LUNAR_SOLID_FORM);
					tabData.accept(EngoldModBlocks.ECLIPSE_ORE.asItem());
					tabData.accept(EngoldModItems.ECLIPSE_SOLID_FORM);
					tabData.accept(EngoldModBlocks.MASS_COAL_CLUMP.asItem());
					tabData.accept(EngoldModBlocks.CRYSTAL_DENSE_MASS.asItem());
					tabData.accept(EngoldModBlocks.RED_WOOD_TREE_LOG.asItem());
					tabData.accept(EngoldModBlocks.REDWOOD_LEAVES.asItem());
					tabData.accept(EngoldModBlocks.MAPLE_TREE_LOG.asItem());
					tabData.accept(EngoldModBlocks.MAPLE_TREE_LEAVES.asItem());
					tabData.accept(EngoldModBlocks.WILLOW_PLANKS.asItem());
					tabData.accept(EngoldModBlocks.WILLOW_STAIRS.asItem());
					tabData.accept(EngoldModBlocks.WILLOW_SLAB.asItem());
					tabData.accept(EngoldModBlocks.REDWOOD_PLANKS.asItem());
					tabData.accept(EngoldModBlocks.REDWOOD_SLAB.asItem());
					tabData.accept(EngoldModBlocks.REDWOOD_STAIRS.asItem());
					tabData.accept(EngoldModItems.FLOODED_WORLD_DIMENSION);
					tabData.accept(EngoldModBlocks.SAP_BLOCK.asItem());
				}).build());
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(tabData -> {
			tabData.accept(EngoldModItems.GRAPHENE_PICKAXE);
			tabData.accept(EngoldModItems.REINFORCED_GRAPHENE_PICKAXE);
			tabData.accept(EngoldModItems.ENVOX_SWORD);
			tabData.accept(EngoldModItems.FLOODED_WORLD_DIMENSION);
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(tabData -> {
			tabData.accept(EngoldModItems.MINERALS);
			tabData.accept(EngoldModItems.STONE_RUBBLE);
		});
	}
}