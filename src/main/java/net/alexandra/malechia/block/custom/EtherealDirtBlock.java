package net.alexandra.malechia.block.custom;

import java.util.Random;

import net.alexandra.malechia.block.ModBlocks;
import net.alexandra.malechia.tag.MalechiaBlockTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class EtherealDirtBlock
extends Block
implements Fertilizable {
    public EtherealDirtBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        if (!world.getBlockState(pos.up()).isTranslucent(world, pos)) {
            return false;
        }
        for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
            if (!world.getBlockState(blockPos).isIn(MalechiaBlockTags.ETHEREAL_GRASS)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        boolean bl = false;
        for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isOf(ModBlocks.ETHEREAL_GRASS_BLOCK)) {
                bl = true;
            }
            if (!bl) continue;
            break;
        }
        if (bl) {
            world.setBlockState(pos, ModBlocks.ETHEREAL_GRASS_BLOCK.getDefaultState(), Block.NOTIFY_ALL);
        }
    }
}

