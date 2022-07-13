package net.incognitodave2.elementalblazes.entity.render.RenderTier5;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.NetheriteBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier5.NetheriteBlazeEntityTier5;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class NetheriteBlazeRendererTier5 extends MobRenderer<NetheriteBlazeEntityTier5, ElementalBlazeModel<NetheriteBlazeEntityTier5>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/netherite_blaze_tier_5.png");

    public NetheriteBlazeRendererTier5(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(NetheriteBlazeEntityTier5 entity) {
        return TEXTURE;
    }
}
