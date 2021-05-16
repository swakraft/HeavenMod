package com.ben.heaven.items.shovel;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemShovelSilver extends ItemSpade
{
	public ItemShovelSilver(ToolMaterial silver_ingot, String name) {
		super(silver_ingot);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
