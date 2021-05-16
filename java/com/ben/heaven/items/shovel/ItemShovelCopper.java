package com.ben.heaven.items.shovel;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemShovelCopper extends ItemSpade
{
	public ItemShovelCopper(ToolMaterial copper_ingot, String name) {
		super(copper_ingot);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
