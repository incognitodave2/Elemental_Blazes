package net.incognitodave2.elementalblazes.entity.render.RenderTier5;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.GoldBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier5.GoldBlazeEntityTier5;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GoldBlazeRendererTier5 extends MobRenderer<GoldBlazeEntityTier5, ElementalBlazeModel<GoldBlazeEntityTier5>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/gold_blaze_tier_5.png");

    public GoldBlazeRendererTier5(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(GoldBlazeEntityTier5 entity) {
        return TEXTURE;
    }
}