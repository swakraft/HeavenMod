package com.ben.heaven.items.hoe;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ItemHoeCarbon extends ItemHoe
{
	public ItemHoeCarbon(ToolMaterial carbon_shard, String name) {
		super(carbon_shard);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
