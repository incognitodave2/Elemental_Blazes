package net.incognitodave2.elementalblazes.entity.render.RenderTier5;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.QuartzBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier5.QuartzBlazeEntityTier5;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class QuartzBlazeRendererTier5 extends MobRenderer<QuartzBlazeEntityTier5, ElementalBlazeModel<QuartzBlazeEntityTier5>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/quartz_blaze_tier_5.png");

    public QuartzBlazeRendererTier5(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(QuartzBlazeEntityTier5 entity) {
        return TEXTURE;
    }
}
