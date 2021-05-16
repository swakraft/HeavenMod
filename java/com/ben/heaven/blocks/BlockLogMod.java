package com.ben.heaven.blocks;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;

public class BlockLogMod extends BlockRotatedPillar
{
	public BlockLogMod(String name, Material materialIn) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
