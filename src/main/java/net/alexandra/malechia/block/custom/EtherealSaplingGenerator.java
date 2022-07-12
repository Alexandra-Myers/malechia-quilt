package net.alexandra.malechia.block.custom;

import net.alexandra.malechia.world.feature.ModTreeConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.Holder;
import net.minecraft.util.random.RandomGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class EtherealSaplingGenerator extends SaplingGenerator {
	@Nullable
	@Override
	protected Holder<? extends ConfiguredFeature<?, ?>> getTreeFeature(RandomGenerator random, boolean bees) {
		return ModTreeConfiguredFeatures.ETHEREAL_TREE;
	}
}
