package com.ben.heaven.items.shovel;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemShovelPlatinium extends ItemSpade
{
	public ItemShovelPlatinium(ToolMaterial platinium_ingot, String name) {
		super(platinium_ingot);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
