package net.incognitodave2.elementalblazes.entity.render.RenderTier2;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.IronBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier2.IronBlazeEntityTier2;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class IronBlazeRendererTier2 extends MobRenderer<IronBlazeEntityTier2, ElementalBlazeModel<IronBlazeEntityTier2>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/iron_blaze_tier_2.png");

    public IronBlazeRendererTier2(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(IronBlazeEntityTier2 entity) {
        return TEXTURE;
    }
}