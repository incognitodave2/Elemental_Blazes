package net.incognitodave2.elementalblazes.entity.render;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.DiamondBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.IronBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.RedstoneBlazeEntity;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class IronBlazeRenderer extends MobRenderer<IronBlazeEntity, ElementalBlazeModel<IronBlazeEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/iron_blaze.png");

    public IronBlazeRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(IronBlazeEntity entity) {
        return TEXTURE;
    }
}