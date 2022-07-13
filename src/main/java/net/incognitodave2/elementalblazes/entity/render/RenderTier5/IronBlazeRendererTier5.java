package net.incognitodave2.elementalblazes.entity.render.RenderTier5;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.IronBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier5.IronBlazeEntityTier5;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class IronBlazeRendererTier5 extends MobRenderer<IronBlazeEntityTier5, ElementalBlazeModel<IronBlazeEntityTier5>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/iron_blaze_tier_5.png");

    public IronBlazeRendererTier5(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(IronBlazeEntityTier5 entity) {
        return TEXTURE;
    }
}