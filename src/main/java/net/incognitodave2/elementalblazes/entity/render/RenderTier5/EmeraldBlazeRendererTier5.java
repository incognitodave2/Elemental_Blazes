package net.incognitodave2.elementalblazes.entity.render.RenderTier5;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.EmeraldBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier5.EmeraldBlazeEntityTier5;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class EmeraldBlazeRendererTier5 extends MobRenderer<EmeraldBlazeEntityTier5, ElementalBlazeModel<EmeraldBlazeEntityTier5>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/emerald_blaze_tier_5.png");

    public EmeraldBlazeRendererTier5(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(EmeraldBlazeEntityTier5 entity) {
        return TEXTURE;
    }
}