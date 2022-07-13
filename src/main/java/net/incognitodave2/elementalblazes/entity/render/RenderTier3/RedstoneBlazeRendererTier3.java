package net.incognitodave2.elementalblazes.entity.render.RenderTier3;


import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.RedstoneBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier3.RedstoneBlazeEntityTier3;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RedstoneBlazeRendererTier3 extends MobRenderer<RedstoneBlazeEntityTier3, ElementalBlazeModel<RedstoneBlazeEntityTier3>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/redstone_blaze_tier_3.png");

    public RedstoneBlazeRendererTier3(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(RedstoneBlazeEntityTier3 entity) {
        return TEXTURE;
    }
}
