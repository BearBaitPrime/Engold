package net.mcreator.engold.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SolarSolidFormItem extends Item {
	public SolarSolidFormItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}