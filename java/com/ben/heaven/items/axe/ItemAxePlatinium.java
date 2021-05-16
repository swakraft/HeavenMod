package com.ben.heaven.items.axe;

import com.ben.heaven.init.ItemsMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemAxePlatinium extends ItemAxe
{
	 public ItemAxePlatinium(Item.ToolMaterial material, float damage, float speed, String name)
	 {
		super(material, damage, speed);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
