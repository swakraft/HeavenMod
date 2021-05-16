package com.ben.heaven.blocks;

import java.util.Random;

import com.ben.heaven.init.ItemsMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MagicBlockOre extends Block
{
	public MagicBlockOre(String name, Material materialIn, int level) {
		super(materialIn);
		this.setHarvestLevel("pickaxe", level);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	 public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return ItemsMod.magic_gem;
	    }

}
