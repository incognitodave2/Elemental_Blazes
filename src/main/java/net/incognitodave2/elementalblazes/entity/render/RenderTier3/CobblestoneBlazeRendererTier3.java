package net.incognitodave2.elementalblazes.entity.render.RenderTier3;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.CobblestoneBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier3.CobblestoneBlazeEntityTier3;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CobblestoneBlazeRendererTier3 extends MobRenderer<CobblestoneBlazeEntityTier3, ElementalBlazeModel<CobblestoneBlazeEntityTier3>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/cobblestone_blaze_tier_3.png");

    public CobblestoneBlazeRendererTier3(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(CobblestoneBlazeEntityTier3 entity) {
        return TEXTURE;
    }
}
