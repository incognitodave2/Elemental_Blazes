package net.incognitodave2.elementalblazes.entity.render.RenderTier2;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.QuartzBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier2.QuartzBlazeEntityTier2;
import net.incognitodave2.elementalblazes.entity.custom.Tier5.QuartzBlazeEntityTier5;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class QuartzBlazeRendererTier2 extends MobRenderer<QuartzBlazeEntityTier2, ElementalBlazeModel<QuartzBlazeEntityTier2>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/quartz_blaze_tier_2.png");

    public QuartzBlazeRendererTier2(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(QuartzBlazeEntityTier2 entity) {
        return TEXTURE;
    }
}
