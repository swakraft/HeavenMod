package com.ben.heaven.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFurniture extends Block
{
	public BlockFurniture(String name, Material materialIn) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
	    this.setSoundType(SoundType.WOOD);
	}
	
	 @SideOnly(Side.CLIENT)
	    public BlockRenderLayer getBlockLayer()
	    {
	        return BlockRenderLayer.CUTOUT;
	    }

	    public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

	    protected boolean canSilkHarvest()
	    {
	        return true;
	    }
	    
	    public boolean isOpaqueCube(IBlockState state)
	    {
	        return false;
	    }
}