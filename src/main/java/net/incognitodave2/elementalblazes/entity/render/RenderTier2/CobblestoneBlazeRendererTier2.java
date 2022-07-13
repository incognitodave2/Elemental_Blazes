package net.incognitodave2.elementalblazes.entity.render.RenderTier2;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.CobblestoneBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier2.CobblestoneBlazeEntityTier2;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CobblestoneBlazeRendererTier2 extends MobRenderer<CobblestoneBlazeEntityTier2, ElementalBlazeModel<CobblestoneBlazeEntityTier2>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/cobblestone_blaze_tier_2.png");

    public CobblestoneBlazeRendererTier2(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(CobblestoneBlazeEntityTier2 entity) {
        return TEXTURE;
    }
}
