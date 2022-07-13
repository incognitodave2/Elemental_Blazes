package net.incognitodave2.elementalblazes.entity.render.RenderTier3;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.ObsidianBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier3.ObsidianBlazeEntityTier3;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ObsidianBlazeRendererTier3 extends MobRenderer<ObsidianBlazeEntityTier3, ElementalBlazeModel<ObsidianBlazeEntityTier3>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/obsidian_blaze_tier_3.png");

    public ObsidianBlazeRendererTier3(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(ObsidianBlazeEntityTier3 entity) {
        return TEXTURE;
    }
}
