package com.ben.heaven.items.hoe;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ItemHoeSilver extends ItemHoe
{
	public ItemHoeSilver(ToolMaterial silver_ingot, String name) {
		super(silver_ingot);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
