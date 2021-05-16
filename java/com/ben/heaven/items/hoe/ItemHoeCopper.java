package com.ben.heaven.items.hoe;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ItemHoeCopper extends ItemHoe
{
	public ItemHoeCopper(ToolMaterial copper_ingot, String name) {
		super(copper_ingot);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
