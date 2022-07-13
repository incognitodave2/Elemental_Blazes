package net.incognitodave2.elementalblazes.entity.render.RenderTier2;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.ObsidianBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier2.ObsidianBlazeEntityTier2;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ObsidianBlazeRendererTier2 extends MobRenderer<ObsidianBlazeEntityTier2, ElementalBlazeModel<ObsidianBlazeEntityTier2>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/obsidian_blaze_tier_2.png");

    public ObsidianBlazeRendererTier2(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(ObsidianBlazeEntityTier2 entity) {
        return TEXTURE;
    }
}
