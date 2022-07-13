package net.incognitodave2.elementalblazes.entity.render.RenderTier3;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.QuartzBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier3.QuartzBlazeEntityTier3;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class QuartzBlazeRendererTier3 extends MobRenderer<QuartzBlazeEntityTier3, ElementalBlazeModel<QuartzBlazeEntityTier3>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/quartz_blaze_tier_3.png");

    public QuartzBlazeRendererTier3(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(QuartzBlazeEntityTier3 entity) {
        return TEXTURE;
    }
}
