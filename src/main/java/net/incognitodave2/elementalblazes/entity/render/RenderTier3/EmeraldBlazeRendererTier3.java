package net.incognitodave2.elementalblazes.entity.render.RenderTier3;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.EmeraldBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier3.EmeraldBlazeEntityTier3;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class EmeraldBlazeRendererTier3 extends MobRenderer<EmeraldBlazeEntityTier3, ElementalBlazeModel<EmeraldBlazeEntityTier3>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/emerald_blaze_tier_3.png");

    public EmeraldBlazeRendererTier3(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(EmeraldBlazeEntityTier3 entity) {
        return TEXTURE;
    }
}