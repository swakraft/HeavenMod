package com.ben.heaven.items.sword;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemSwordCarbon extends ItemSword
{
	public ItemSwordCarbon(ToolMaterial carbon_shard, String name) {
		super(carbon_shard);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
