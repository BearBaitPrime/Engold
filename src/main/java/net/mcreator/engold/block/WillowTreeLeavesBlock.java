package net.mcreator.engold.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ColorParticleOption;

public class WillowTreeLeavesBlock extends UntintedParticleLeavesBlock {
	public WillowTreeLeavesBlock(BlockBehaviour.Properties properties) {
		super(0.01f, ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, -10385579),
				properties.sound(SoundType.GRASS).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion().isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, br, bp) -> false));
	}
}