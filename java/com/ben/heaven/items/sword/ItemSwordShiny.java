package com.ben.heaven.items.sword;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemSwordShiny extends ItemSword 
{
	public ItemSwordShiny(ToolMaterial shiny_ingot, String name) 
	{
		super(shiny_ingot);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
}
