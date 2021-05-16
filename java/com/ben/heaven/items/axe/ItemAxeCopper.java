package com.ben.heaven.items.axe;

import com.ben.heaven.init.ItemsMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemAxeCopper extends ItemAxe
{
	 public ItemAxeCopper(Item.ToolMaterial material, float damage, float speed, String name)
	 {
		super(material, damage, speed);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
