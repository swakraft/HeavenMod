package com.ben.heaven.init;

import com.ben.heaven.Heaven;
import com.ben.heaven.References;
import com.ben.heaven.entity.EntityNain;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("Nain", EntityNain.class, References.ENTITY_NAIN, 50, 14495768, 00000000);
	}
	
	private static void registerEntity(String name, Class <? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(References.MODID + ":" + name), entity, name, id, Heaven.instance, range, 1, true, color1, color2);
	}
}
