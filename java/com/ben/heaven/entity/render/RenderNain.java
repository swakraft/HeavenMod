package com.ben.heaven.entity.render;

import com.ben.heaven.References;
import com.ben.heaven.entity.EntityNain;
import com.ben.heaven.entity.model.ModelNain;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNain extends RenderLiving<EntityNain>
{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(References.MODID + ":textures/entity/nain.png");

	public RenderNain(RenderManager manager) 
	{
		super(manager, new ModelNain(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityNain entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityNain entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
