package net.incognitodave2.elementalblazes.entity.render.RenderTier5;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.CobblestoneBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier5.CobblestoneBlazeEntityTier5;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CobblestoneBlazeRendererTier5 extends MobRenderer<CobblestoneBlazeEntityTier5, ElementalBlazeModel<CobblestoneBlazeEntityTier5>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/cobblestone_blaze_tier_5.png");

    public CobblestoneBlazeRendererTier5(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(CobblestoneBlazeEntityTier5 entity) {
        return TEXTURE;
    }
}
