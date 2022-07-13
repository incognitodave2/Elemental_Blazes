package net.incognitodave2.elementalblazes.entity.render.RenderTier3;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.ClayBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier3.ClayBlazeEntityTier3;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ClayBlazeRendererTier3 extends MobRenderer<ClayBlazeEntityTier3, ElementalBlazeModel<ClayBlazeEntityTier3>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/clay_blaze_tier_3.png");

    public ClayBlazeRendererTier3(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(ClayBlazeEntityTier3 entity) {
        return TEXTURE;
    }
}
