package com.ben.heaven.items.pickaxe;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeSilver extends ItemPickaxe
{
	public ItemPickaxeSilver(ToolMaterial silver_ingot, String name) {
		super(silver_ingot);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
