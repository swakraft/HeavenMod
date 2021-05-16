package com.ben.heaven.recipes;

import com.ben.heaven.init.BlocksMod;
import com.ben.heaven.init.ItemsMod;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipesMod 
{
	public static void init()
	{
		//blocks=>ingots
		GameRegistry.addSmelting(new ItemStack(BlocksMod.carbon_ore), new ItemStack(ItemsMod.carbon_shard), 1);
		GameRegistry.addSmelting(new ItemStack(BlocksMod.copper_ore), new ItemStack(ItemsMod.copper_ingot), 1);
		GameRegistry.addSmelting(new ItemStack(BlocksMod.lead_ore), new ItemStack(ItemsMod.lead_ingot), 1);
		GameRegistry.addSmelting(new ItemStack(BlocksMod.magnetite_ore), new ItemStack(ItemsMod.magnetite_ingot), 1);
		GameRegistry.addSmelting(new ItemStack(BlocksMod.mercure_ore), new ItemStack(ItemsMod.mercure_ingot), 1);
		GameRegistry.addSmelting(new ItemStack(BlocksMod.nickel_ore), new ItemStack(ItemsMod.nickel_ingot), 1);
		GameRegistry.addSmelting(new ItemStack(BlocksMod.shiny_ore), new ItemStack(ItemsMod.shiny_ingot), 1);
		GameRegistry.addSmelting(new ItemStack(BlocksMod.silver_ore), new ItemStack(ItemsMod.silver_ingot), 1);
		GameRegistry.addSmelting(new ItemStack(BlocksMod.tin_ore), new ItemStack(ItemsMod.tin_ingot), 1);
		}
}
