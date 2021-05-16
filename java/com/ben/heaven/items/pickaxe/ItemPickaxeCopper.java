package com.ben.heaven.items.pickaxe;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeCopper extends ItemPickaxe
{
	public ItemPickaxeCopper(ToolMaterial copper_ingot, String name) {
		super(copper_ingot);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
