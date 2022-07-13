package net.incognitodave2.elementalblazes.entity.render.RenderTier5;


import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.RedstoneBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier5.RedstoneBlazeEntityTier5;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RedstoneBlazeRendererTier5 extends MobRenderer<RedstoneBlazeEntityTier5, ElementalBlazeModel<RedstoneBlazeEntityTier5>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/redstone_blaze_tier_5.png");

    public RedstoneBlazeRendererTier5(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(RedstoneBlazeEntityTier5 entity) {
        return TEXTURE;
    }
}
