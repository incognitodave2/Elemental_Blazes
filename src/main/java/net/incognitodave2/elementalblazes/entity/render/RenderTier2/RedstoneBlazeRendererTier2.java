package net.incognitodave2.elementalblazes.entity.render.RenderTier2;


import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.RedstoneBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier2.RedstoneBlazeEntityTier2;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RedstoneBlazeRendererTier2 extends MobRenderer<RedstoneBlazeEntityTier2, ElementalBlazeModel<RedstoneBlazeEntityTier2>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/redstone_blaze_tier_2.png");

    public RedstoneBlazeRendererTier2(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(RedstoneBlazeEntityTier2 entity) {
        return TEXTURE;
    }
}
