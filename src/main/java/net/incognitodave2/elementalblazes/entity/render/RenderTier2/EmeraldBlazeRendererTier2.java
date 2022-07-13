package net.incognitodave2.elementalblazes.entity.render.RenderTier2;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.EmeraldBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier2.EmeraldBlazeEntityTier2;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class EmeraldBlazeRendererTier2 extends MobRenderer<EmeraldBlazeEntityTier2, ElementalBlazeModel<EmeraldBlazeEntityTier2>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/emerald_blaze_tier_2.png");

    public EmeraldBlazeRendererTier2(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(EmeraldBlazeEntityTier2 entity) {
        return TEXTURE;
    }
}