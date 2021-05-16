package com.ben.heaven.items.pickaxe;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemPickaxePlatinium extends ItemPickaxe
{
	public ItemPickaxePlatinium(ToolMaterial platinium_ingot, String name) {
		super(platinium_ingot);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
