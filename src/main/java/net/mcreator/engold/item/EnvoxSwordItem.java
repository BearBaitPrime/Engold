package net.mcreator.engold.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class EnvoxSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 100, 4.5f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("engold:envox_sword_repair_items")));

	public EnvoxSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 14f, -3f).rarity(Rarity.EPIC));
	}
}