package net.incognitodave2.elementalblazes.entity.render.RenderTier4;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.CobblestoneBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier4.CobblestoneBlazeEntityTier4;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CobblestoneBlazeRendererTier4 extends MobRenderer<CobblestoneBlazeEntityTier4, ElementalBlazeModel<CobblestoneBlazeEntityTier4>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/cobblestone_blaze_tier_4.png");

    public CobblestoneBlazeRendererTier4(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(CobblestoneBlazeEntityTier4 entity) {
        return TEXTURE;
    }
}
