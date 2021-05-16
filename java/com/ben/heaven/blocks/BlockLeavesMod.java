package com.ben.heaven.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLeavesMod extends Block
{
	public BlockLeavesMod(String name, Material materialIn) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
	    this.setSoundType(SoundType.PLANT);
	    this.setLightLevel(1.0F);
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
	    
	    public int quantityDropped(Random random)
	    {
	        return random.nextInt(20) == 0 ? 1 : 0;
	    }
	    
	    public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return Item.getItemFromBlock(Blocks.SAPLING);
	    }
	    
	    protected int getSaplingDropChance(IBlockState state)
	    {
	        return 20;
	    }
	    
	    protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance)
	    {
	    }
	    
	    @Override
	    public void getDrops(net.minecraft.util.NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
	    {
	        Random rand = world instanceof World ? ((World)world).rand : new Random();
	        int chance = this.getSaplingDropChance(state);

	        if (fortune > 0)
	        {
	            chance -= 2 << fortune;
	            if (chance < 10) chance = 10;
	        }

	        if (rand.nextInt(chance) == 0)
	        {
	            ItemStack drop = new ItemStack(getItemDropped(state, rand, fortune), 1, damageDropped(state));
	            if (!drop.isEmpty())
	                drops.add(drop);
	        }

	        chance = 200;
	        if (fortune > 0)
	        {
	            chance -= 10 << fortune;
	            if (chance < 40) chance = 40;
	        }

	        this.captureDrops(true);
	        if (world instanceof World)
	            this.dropApple((World)world, pos, state, chance); // Dammet mojang
	        drops.addAll(this.captureDrops(false));
	    }
}
