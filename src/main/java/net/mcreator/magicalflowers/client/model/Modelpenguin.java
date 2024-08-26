package net.mcreator.magicalflowers.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelpenguin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("magical_flowers", "modelpenguin"), "main");
	public final ModelPart root;
	public final ModelPart head;
	public final ModelPart crown;
	public final ModelPart wings;
	public final ModelPart wingL;
	public final ModelPart wingR;
	public final ModelPart feet;
	public final ModelPart feetL;
	public final ModelPart feetR;
	public final ModelPart body;
	public final ModelPart tail;

	public Modelpenguin(ModelPart root) {
		this.root = root.getChild("root");
		this.head = root.getChild("head");
		this.crown = root.getChild("crown");
		this.wings = root.getChild("wings");
		this.wingL = root.getChild("wingL");
		this.wingR = root.getChild("wingR");
		this.feet = root.getChild("feet");
		this.feetL = root.getChild("feetL");
		this.feetR = root.getChild("feetR");
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 0.0F));
		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 15).addBox(-3.0F, -14.0F, -3.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 17).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -3.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition crown = head.addOrReplaceChild("crown",
				CubeListBuilder.create().texOffs(22, 4).addBox(-3.0F, -15.0F, 3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 5).addBox(-3.0F, -15.0F, -3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(18, 10)
						.addBox(-3.0F, -15.0F, -3.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 9).addBox(3.0F, -15.0F, -3.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition wings = root.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offset(4.0F, 3.0F, -1.0F));
		PartDefinition wingL = wings.addOrReplaceChild("wingL", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, 0.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 1.0F));
		PartDefinition wingR = wings.addOrReplaceChild("wingR", CubeListBuilder.create().texOffs(8, 22).addBox(0.0F, 0.0F, -1.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, -2.0F, 0.0F));
		PartDefinition feet = root.addOrReplaceChild("feet", CubeListBuilder.create(), PartPose.offset(-5.0F, 10.0F, -3.0F));
		PartDefinition feetL = feet.addOrReplaceChild("feetL", CubeListBuilder.create(), PartPose.offset(9.0F, -7.0F, 2.0F));
		PartDefinition cube_r2 = feetL.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 17).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 7.0F, -2.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition feetR = feet.addOrReplaceChild("feetR", CubeListBuilder.create(), PartPose.offset(9.0F, -7.0F, 2.0F));
		PartDefinition cube_r3 = feetR.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 7.0F, -2.0F, 0.0F, 0.2182F, 0.0F));
		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 1.0F, -3.0F, 8.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 3.0F));
		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 21).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
