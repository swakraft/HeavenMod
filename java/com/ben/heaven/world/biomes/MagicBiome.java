package com.ben.heaven.world.biomes;

import java.util.Random;

import com.ben.heaven.init.BlocksMod;
import com.ben.heaven.world.WorldGenNaturalHeaven;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.world.biome.Biome;

public class MagicBiome extends Biome 
{
	public static final WorldGenNaturalHeaven Tree = new WorldGenNaturalHeaven(); 
	
	public MagicBiome()
	{
		super(new BiomeProperties("Magic").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F).setRainDisabled().setWaterColor(61135));
		
		topBlock = BlocksMod.magic_grass.getDefaultState();
		fillerBlock = BlocksMod.magic_dirt.getDefaultState();
		
		
		this.decorator.treesPerChunk = 4;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityZombie.class, 10, 1, 1));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityZombieVillager.class, 10, 1, 1));
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySkeleton.class, 10, 1, 1));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityCreeper.class, 10, 1, 1));
		
	}
	
	public WorldGenNaturalHeaven getRandomFeature(Random random)
	{
		return Tree;
	}
}
