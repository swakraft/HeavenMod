package com.ben.heaven.items.food;

import net.minecraft.item.ItemFood;

public class ItemFoodMod extends ItemFood
{

	public ItemFoodMod(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setRegistryName(name);
		setUnlocalizedName(name);
		
	}
	
}