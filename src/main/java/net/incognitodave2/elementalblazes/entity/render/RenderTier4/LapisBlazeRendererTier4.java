package net.incognitodave2.elementalblazes.entity.render.RenderTier4;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.LapisBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier4.LapisBlazeEntityTier4;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LapisBlazeRendererTier4 extends MobRenderer<LapisBlazeEntityTier4, ElementalBlazeModel<LapisBlazeEntityTier4>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/lapis_blaze_tier_4.png");

    public LapisBlazeRendererTier4(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(LapisBlazeEntityTier4 entity) {
        return TEXTURE;
    }
}
