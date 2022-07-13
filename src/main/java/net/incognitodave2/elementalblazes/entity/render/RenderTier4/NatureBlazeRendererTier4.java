package net.incognitodave2.elementalblazes.entity.render.RenderTier4;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.NatureBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier4.NatureBlazeEntityTier4;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class NatureBlazeRendererTier4 extends MobRenderer<NatureBlazeEntityTier4, ElementalBlazeModel<NatureBlazeEntityTier4>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/nature_blaze_tier_4.png");

    public NatureBlazeRendererTier4(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(NatureBlazeEntityTier4 entity) {
        return TEXTURE;
    }
}

