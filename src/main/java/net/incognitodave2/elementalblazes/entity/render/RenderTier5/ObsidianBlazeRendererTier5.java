package net.incognitodave2.elementalblazes.entity.render.RenderTier5;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.ObsidianBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier5.ObsidianBlazeEntityTier5;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ObsidianBlazeRendererTier5 extends MobRenderer<ObsidianBlazeEntityTier5, ElementalBlazeModel<ObsidianBlazeEntityTier5>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/obsidian_blaze_tier_5.png");

    public ObsidianBlazeRendererTier5(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(ObsidianBlazeEntityTier5 entity) {
        return TEXTURE;
    }
}
