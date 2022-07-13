package net.incognitodave2.elementalblazes.entity.render.RenderTier4;


import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.RedstoneBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier4.RedstoneBlazeEntityTier4;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RedstoneBlazeRendererTier4 extends MobRenderer<RedstoneBlazeEntityTier4, ElementalBlazeModel<RedstoneBlazeEntityTier4>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/redstone_blaze_tier_4.png");

    public RedstoneBlazeRendererTier4(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(RedstoneBlazeEntityTier4 entity) {
        return TEXTURE;
    }
}
