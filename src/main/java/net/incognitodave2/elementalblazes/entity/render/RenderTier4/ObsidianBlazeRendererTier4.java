package net.incognitodave2.elementalblazes.entity.render.RenderTier4;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.ObsidianBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier4.ObsidianBlazeEntityTier4;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ObsidianBlazeRendererTier4 extends MobRenderer<ObsidianBlazeEntityTier4, ElementalBlazeModel<ObsidianBlazeEntityTier4>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/obsidian_blaze_tier_4.png");

    public ObsidianBlazeRendererTier4(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(ObsidianBlazeEntityTier4 entity) {
        return TEXTURE;
    }
}
