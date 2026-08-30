/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.engold.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.engold.EngoldMod;

public class EngoldModTabs {
	public static ResourceKey<CreativeModeTab> TAB_ENGOLD = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(EngoldMod.MODID, "engold"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_ENGOLD, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("item_group.engold.engold")).icon(() -> new ItemStack(EngoldModBlocks.DIAMOND_CLUMP))
				.type(CreativeModeTab.Type.SEARCH).backgroundTexture(Identifier.withDefaultNamespace("textures/gui/container/creative_inventory/tab_item_search.png")).displayItems((parameters, tabData) -> {
					tabData.accept(EngoldModBlocks.GOLD_CLUMP.asItem());
					tabData.accept(EngoldModBlocks.DIAMOND_CLUMP.asItem());
					tabData.accept(EngoldModBlocks.EMERALD_CLUMP.asItem());
					tabData.accept(EngoldModBlocks.IRONCLUMP.asItem());
				}).build());
	}
}