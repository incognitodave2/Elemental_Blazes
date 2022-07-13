package net.incognitodave2.elementalblazes.entity.render.RenderTier2;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.NatureBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier2.NatureBlazeEntityTier2;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class NatureBlazeRendererTier2 extends MobRenderer<NatureBlazeEntityTier2, ElementalBlazeModel<NatureBlazeEntityTier2>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/nature_blaze_tier_2.png");

    public NatureBlazeRendererTier2(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(NatureBlazeEntityTier2 entity) {
        return TEXTURE;
    }
}

