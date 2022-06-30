package net.incognitodave2.elementalblazes.entity.render;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.NetheriteBlazeEntity;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class NetheriteBlazeRenderer extends MobRenderer<NetheriteBlazeEntity, ElementalBlazeModel<NetheriteBlazeEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/netherite_blaze.png");

    public NetheriteBlazeRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(NetheriteBlazeEntity entity) {
        return TEXTURE;
    }
}
