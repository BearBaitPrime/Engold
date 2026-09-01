package net.mcreator.engold.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class WillowTreeLogBlock extends Block {
	public WillowTreeLogBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1.3f, 10f).ignitedByLava());
	}
}