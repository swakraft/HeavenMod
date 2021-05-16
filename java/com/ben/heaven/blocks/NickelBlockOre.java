package com.ben.heaven.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NickelBlockOre extends Block
{
	public NickelBlockOre(String name, Material materialIn, int level) {
		super(materialIn);
		this.setHarvestLevel("pickaxe", level);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
