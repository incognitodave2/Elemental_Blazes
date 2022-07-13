package net.incognitodave2.elementalblazes.entity.render.RenderTier5;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.DiamondBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier5.DiamondBlazeEntityTier5;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DiamondBlazeRendererTier5 extends MobRenderer<DiamondBlazeEntityTier5, ElementalBlazeModel<DiamondBlazeEntityTier5>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/diamond_blaze_tier_5.png");

    public DiamondBlazeRendererTier5(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(DiamondBlazeEntityTier5 entity) {
        return TEXTURE;
    }
}