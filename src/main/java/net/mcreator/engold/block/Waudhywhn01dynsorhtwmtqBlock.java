package net.mcreator.engold.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class Waudhywhn01dynsorhtwmtqBlock extends Block {
	public Waudhywhn01dynsorhtwmtqBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(100f, 100000f).postProcess((bs, br, bp) -> bp).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 5;
	}
}