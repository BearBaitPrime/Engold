package net.mcreator.engold.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GrapheneItem extends Item {
	public GrapheneItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}