package com.ben.heaven.items.pickaxe;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeCarbon extends ItemPickaxe
{
	public ItemPickaxeCarbon(ToolMaterial carbon_shard, String name) {
		super(carbon_shard);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
