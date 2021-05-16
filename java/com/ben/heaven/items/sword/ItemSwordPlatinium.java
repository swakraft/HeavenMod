package com.ben.heaven.items.sword;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemSwordPlatinium extends ItemSword
{
	public ItemSwordPlatinium(ToolMaterial platinium_ingot, String name) 
	{
		super(platinium_ingot);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
