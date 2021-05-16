package com.ben.heaven.items.sword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemSwordCopper extends ItemSword
{
	public ItemSwordCopper(ToolMaterial copper_ingot, String name) {
		super(copper_ingot);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
}


