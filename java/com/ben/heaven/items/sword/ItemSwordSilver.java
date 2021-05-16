package com.ben.heaven.items.sword;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemSwordSilver extends ItemSword
{

	public ItemSwordSilver(ToolMaterial silver_ingot, String name) 
	{
		super(silver_ingot);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
}

