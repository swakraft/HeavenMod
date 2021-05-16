package com.ben.heaven.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockPlankMod extends Block{
	
	public BlockPlankMod(String name, Material materialIn) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
	    this.setSoundType(SoundType.WOOD);
	}

}
