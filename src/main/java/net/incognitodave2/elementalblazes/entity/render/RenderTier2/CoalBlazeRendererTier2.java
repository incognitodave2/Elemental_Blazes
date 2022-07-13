package net.incognitodave2.elementalblazes.entity.render.RenderTier2;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.CoalBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier2.CoalBlazeEntityTier2;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CoalBlazeRendererTier2 extends MobRenderer<CoalBlazeEntityTier2, ElementalBlazeModel<CoalBlazeEntityTier2>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/coal_blaze_tier_2.png");

    public CoalBlazeRendererTier2(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(CoalBlazeEntityTier2 entity) {
        return TEXTURE;
    }
}
