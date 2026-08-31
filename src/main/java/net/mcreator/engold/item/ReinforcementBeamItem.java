package net.mcreator.engold.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ReinforcementBeamItem extends Item {
	public ReinforcementBeamItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(32));
	}
}