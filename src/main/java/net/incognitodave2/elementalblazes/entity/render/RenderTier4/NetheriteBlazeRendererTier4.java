package net.incognitodave2.elementalblazes.entity.render.RenderTier4;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.NetheriteBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.Tier4.NetheriteBlazeEntityTier4;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class NetheriteBlazeRendererTier4 extends MobRenderer<NetheriteBlazeEntityTier4, ElementalBlazeModel<NetheriteBlazeEntityTier4>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/netherite_blaze_tier_4.png");

    public NetheriteBlazeRendererTier4(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(NetheriteBlazeEntityTier4 entity) {
        return TEXTURE;
    }
}
