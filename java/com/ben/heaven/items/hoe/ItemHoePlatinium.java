package com.ben.heaven.items.hoe;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ItemHoePlatinium extends ItemHoe
{
	public ItemHoePlatinium(ToolMaterial platinium_ingot, String name) {
		super(platinium_ingot);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
