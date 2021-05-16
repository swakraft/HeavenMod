package com.ben.heaven.util.handlers;

import com.ben.heaven.entity.EntityNain;
import com.ben.heaven.entity.render.RenderNain;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityNain.class, new IRenderFactory<EntityNain>() 
			{

				@Override
				public Render<? super EntityNain> createRenderFor(RenderManager manager) 
				{
					return new RenderNain(manager);
				}
				
			});
	}
}
