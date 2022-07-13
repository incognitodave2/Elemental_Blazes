package net.incognitodave2.elementalblazes.entity.render.RenderTier2;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.ClayBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier2.ClayBlazeEntityTier2;
import net.incognitodave2.elementalblazes.entity.custom.Tier3.ClayBlazeEntityTier3;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ClayBlazeRendererTier2 extends MobRenderer<ClayBlazeEntityTier2, ElementalBlazeModel<ClayBlazeEntityTier2>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/clay_blaze_tier_2.png");

    public ClayBlazeRendererTier2(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(ClayBlazeEntityTier2 entity) {
        return TEXTURE;
    }
}
