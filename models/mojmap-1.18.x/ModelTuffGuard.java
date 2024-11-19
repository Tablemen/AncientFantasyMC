// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTuffGuard<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tuffguard"), "main");
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Head;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;

	public ModelTuffGuard(ModelPart root) {
		this.root = root.getChild("root");
		this.body = this.root.getChild("body");
		this.LeftArm = this.body.getChild("LeftArm");
		this.RightArm = this.body.getChild("RightArm");
		this.Head = this.body.getChild("Head");
		this.leftLeg = this.body.getChild("leftLeg");
		this.rightLeg = this.body.getChild("rightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F,
				-38.0F, -2.0F, 12.0F, 19.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftArm = body.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 41).addBox(-4.0F,
				-2.0F, -2.0F, 4.0F, 19.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -36.0F, 0.0F));

		PartDefinition RightArm = body.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(18, 48).addBox(
				0.0F, -2.0F, -2.0F, 4.0F, 19.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -36.0F, 0.0F));

		PartDefinition Head = body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 24).addBox(-4.0F,
				-9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -38.0F, 0.0F));

		PartDefinition leftLeg = body.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(32, 24)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 19.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -19.0F, 0.0F));

		PartDefinition rightLeg = body.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(34, 0).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 19.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -19.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}