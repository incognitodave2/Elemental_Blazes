package net.incognitodave2.elementalblazes.entity.render.RenderTier4;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.QuartzBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier4.QuartzBlazeEntityTier4;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class QuartzBlazeRendererTier4 extends MobRenderer<QuartzBlazeEntityTier4, ElementalBlazeModel<QuartzBlazeEntityTier4>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/quartz_blaze_tier_4.png");

    public QuartzBlazeRendererTier4(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(QuartzBlazeEntityTier4 entity) {
        return TEXTURE;
    }
}
