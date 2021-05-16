package com.ben.heaven.items.sword;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemSwordLead extends ItemSword
{
	public ItemSwordLead(ToolMaterial lead_ingot, String name) 
	{
		super(lead_ingot);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
}
