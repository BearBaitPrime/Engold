package net.mcreator.engold.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.engold.init.EngoldModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements EngoldModBiomes.EngoldModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> engold_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.engold_dimensionTypeReference != null) {
			retval = EngoldModBiomes.adaptSurfaceRule(retval, this.engold_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setengoldDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.engold_dimensionTypeReference = dimensionType;
	}
}