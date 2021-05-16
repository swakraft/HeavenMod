package com.ben.heaven.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MagnetiteBlockOre extends Block
{
	public MagnetiteBlockOre(String name, Material materialIn, int level) {
		super(materialIn);
		this.setHarvestLevel("pickaxe", level);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
