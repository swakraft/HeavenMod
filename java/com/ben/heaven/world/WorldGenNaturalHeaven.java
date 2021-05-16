package com.ben.heaven.world;

import java.util.Random;

import com.ben.heaven.init.BlocksMod;
import com.ben.heaven.world.biomes.MagicBiome;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.BlockLog.EnumAxis;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumFacing.Axis;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenNaturalHeaven implements IWorldGenerator 
	{	
	private WorldGenTrees pink_magic_tree = new WorldGenTrees(false, 8,
			BlocksMod.pink_magic_tree_trunk.getDefaultState(),BlocksMod.pink_magic_tree_leaves.getDefaultState(),false);
			WorldGenTrees cherry_tree = new WorldGenTrees(false, 8,
			BlocksMod.cherry_tree_trunk.getDefaultState(), BlocksMod.cherry_tree_leaves.getDefaultState(),false);
			
			 
			
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0:
			if (world.getBiomeForCoordsBody(new BlockPos(chunkX * 16, 70, chunkZ * 16)) instanceof MagicBiome)
				populate(pink_magic_tree, world, random, chunkX, chunkZ, 2, 3);
			if (world.getBiomeForCoordsBody(new BlockPos(chunkX * 16, 70, chunkZ * 16)) instanceof BiomeForest) 
				populate(cherry_tree, world, random, chunkX, chunkZ, 2, 3);
			break;
		case -1: 
			break;
		case 1:
			break;
		}
	}

	private void gen(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chancesToSpawn,
			int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunkX * 16 + random.nextInt(16);
			int y = minHeight + random.nextInt(heightDiff);
			int z = chunkZ * 16 + random.nextInt(16);
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}

	private void populate(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ,
			int amountPerChunk, int chancesToSpawn) {
		for (int i = 0; i < amountPerChunk; i++) {
			int x = chunkX * 16 + random.nextInt(16);
			int z = chunkZ * 16 + random.nextInt(16);
			int y = world.getChunkFromChunkCoords(x >> 4, z >> 4).getHeight(new BlockPos(x & 15, 0, z & 15)) - 1;
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}
}
