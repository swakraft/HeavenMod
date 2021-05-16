package com.ben.heaven.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNain extends ModelBase {
	private final ModelRenderer leg;
	private final ModelRenderer body;
	private final ModelRenderer arm;
	private final ModelRenderer arm2;
	private final ModelRenderer hatpart;
	private final ModelRenderer bodypart;
	private final ModelRenderer head;
	private final ModelRenderer bodypart2;
	private final ModelRenderer shoulder;

	public ModelNain() {
		textureWidth = 64;
		textureHeight = 64;

		leg = new ModelRenderer(this);
		leg.setRotationPoint(-0.25F, 24.0F, 0.0F);
		leg.cubeList.add(new ModelBox(leg, 22, 29, 0.5F, -4.0F, -1.0F, 2, 4, 2, 0.0F, false));
		leg.cubeList.add(new ModelBox(leg, 0, 30, -2.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 7, -2.0F, -10.0F, -2.5F, 4, 6, 5, 0.0F, false));

		arm = new ModelRenderer(this);
		arm.setRotationPoint(-6.5F, 16.5F, 0.0F);
		setRotationAngle(arm, 0.0F, 0.0F, -75.0F);
		arm.cubeList.add(new ModelBox(arm, 26, 0, -1.6793F, 2.7337F, -1.5F, 5, 1, 2, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(6.5F, 16.5F, 0.0F);
		setRotationAngle(arm2, 0.0F, 0.0F, 75.0F);
		arm2.cubeList.add(new ModelBox(arm2, 24, 26, -3.3207F, 2.7337F, -1.5F, 5, 1, 2, 0.0F, false));

		hatpart = new ModelRenderer(this);
		hatpart.setRotationPoint(-2.5F, 6.5F, 2.5F);
		hatpart.cubeList.add(new ModelBox(hatpart, 24, 24, -1.0F, 3.5F, -6.5F, 7, 1, 1, 0.0F, false));
		hatpart.cubeList.add(new ModelBox(hatpart, 11, 11, 5.5F, 3.5F, -6.0F, 1, 1, 7, 0.0F, false));
		hatpart.cubeList.add(new ModelBox(hatpart, 17, 0, -1.5F, 3.5F, -6.0F, 1, 1, 7, 0.0F, false));
		hatpart.cubeList.add(new ModelBox(hatpart, 19, 19, 0.5F, 1.5F, -4.5F, 4, 1, 4, 0.0F, false));
		hatpart.cubeList.add(new ModelBox(hatpart, 13, 8, 1.5F, 0.5F, -3.5F, 2, 1, 2, 0.0F, false));
		hatpart.cubeList.add(new ModelBox(hatpart, 0, 0, -0.5F, 2.5F, -5.5F, 6, 1, 6, 0.0F, false));
		hatpart.cubeList.add(new ModelBox(hatpart, 20, 16, -1.0F, 3.5F, 0.5F, 7, 1, 1, 0.0F, false));
		hatpart.cubeList.add(new ModelBox(hatpart, 0, 7, 2.0F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));

		bodypart = new ModelRenderer(this);
		bodypart.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bodypart, 0.0F, 0.0F, 5.0F);
		bodypart.cubeList.add(new ModelBox(bodypart, 12, 19, -2.8639F, -9.7876F, -2.5F, 1, 7, 5, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 18, 0, -1.0F, -12.0F, 2.0F, 2, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 20, 8, -2.0F, -14.0F, -2.0F, 4, 4, 4, 0.0F, false));

		bodypart2 = new ModelRenderer(this);
		bodypart2.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bodypart2, 0.0F, 0.0F, -5.0F);
		bodypart2.cubeList.add(new ModelBox(bodypart2, 0, 18, 1.8639F, -9.7876F, -2.5F, 1, 7, 5, 0.0F, false));

		shoulder = new ModelRenderer(this);
		shoulder.setRotationPoint(-4.0F, 15.0F, -1.5F);
		shoulder.cubeList.add(new ModelBox(shoulder, 0, 0, 1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		shoulder.cubeList.add(new ModelBox(shoulder, 0, 3, 6.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		leg.render(f5);
		body.render(f5);
		arm.render(f5);
		arm2.render(f5);
		hatpart.render(f5);
		bodypart.render(f5);
		head.render(f5);
		bodypart2.render(f5);
		shoulder.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}