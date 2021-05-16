package com.ben.heaven.items.shovel;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemShovelCarbon extends ItemSpade
{
	public ItemShovelCarbon(ToolMaterial carbon_shard, String name) {
		super(carbon_shard);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
