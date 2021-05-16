package com.ben.heaven.world;

import java.util.Random;

import com.ben.heaven.init.BlocksMod;
import com.google.common.base.Predicate;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenMinableHeaven implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.getDimension())
		{
			case -1:
				generateNether(world, chunkX * 16, chunkZ * 16, random);
				break;
			
			case 0:
				generateOverWorld(world, chunkX * 16, chunkZ * 16, random);
				break;
				
			case 1:
				generateEnd(world, chunkX * 16, chunkZ * 16, random);
				break;
		}
	}
	
	private void addOre(IBlockState block, Predicate<IBlockState> blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int maxV, int spawnChance)
	{
		for(int i = 0; i < spawnChance; i++)
		{
			int chunckSize = 16;
			int Xpos = posX + random.nextInt(chunckSize);
			int Ypos = minY + random.nextInt(maxY - minY);
			int Zpos = posZ + random.nextInt(chunckSize);
			
			new WorldGenMinable(block, maxV, blockSpawn).generate(world, random, new BlockPos(Xpos, Ypos, Zpos));
		}
	}

	private void generateEnd(World world, int i, int j, Random random)
	{
		
	}

	private void generateOverWorld(World world, int i, int j, Random random)
	{
		addOre(BlocksMod.copper_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE), random, world, i, j, 30, 120, 13, 20);
		addOre(BlocksMod.silver_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE), random, world, i, j, 20, 100, 9, 10);
		addOre(BlocksMod.lead_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE), random, world, i, j, 20, 100, 9, 10);
		addOre(BlocksMod.tin_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE), random, world, i, j, 20, 100, 9, 10);
		addOre(BlocksMod.platinium_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE), random, world, i, j, 10, 100, 5, 5);
		addOre(BlocksMod.nickel_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE), random, world, i, j, 10, 100, 13, 8);
		addOre(BlocksMod.carbon_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE), random, world, i, j, 10, 100, 6, 5);
		addOre(BlocksMod.mercure_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE), random, world, i, j, 10, 100, 13, 1);
		addOre(BlocksMod.findium_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE), random, world, i, j, 10, 100, 4, 1);
		addOre(BlocksMod.cadmium_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE), random, world, i, j, 10, 30, 3, 1);
		addOre(BlocksMod.uranium_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE), random, world, i, j, 10, 30, 2, 1);
		addOre(BlocksMod.magic_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE), random, world, i, j, 10, 30, 2, 1);
		
	}

	private void generateNether(World world, int i, int j, Random random)
	{
		
	}
}