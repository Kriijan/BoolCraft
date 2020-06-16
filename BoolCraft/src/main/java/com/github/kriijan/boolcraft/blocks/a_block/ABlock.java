package com.github.kriijan.boolcraft.blocks.a_block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;

public class ABlock extends Block{
	public ABlock() {
		super(Block.Properties.create(Material.ROCK));
	}
	
	@Override
	public BlockRenderType getRenderType(BlockState blockState) {
		return BlockRenderType.MODEL;
	}
}
