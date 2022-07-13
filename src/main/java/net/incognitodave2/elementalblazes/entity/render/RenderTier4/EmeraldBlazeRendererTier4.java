package net.incognitodave2.elementalblazes.entity.render.RenderTier4;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.EmeraldBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier4.EmeraldBlazeEntityTier4;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class EmeraldBlazeRendererTier4 extends MobRenderer<EmeraldBlazeEntityTier4, ElementalBlazeModel<EmeraldBlazeEntityTier4>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/emerald_blaze_tier_4.png");

    public EmeraldBlazeRendererTier4(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(EmeraldBlazeEntityTier4 entity) {
        return TEXTURE;
    }
}