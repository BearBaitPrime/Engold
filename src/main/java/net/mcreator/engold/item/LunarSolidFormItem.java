package net.mcreator.engold.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LunarSolidFormItem extends Item {
	public LunarSolidFormItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}