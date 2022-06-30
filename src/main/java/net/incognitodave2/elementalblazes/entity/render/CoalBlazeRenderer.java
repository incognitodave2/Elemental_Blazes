package net.incognitodave2.elementalblazes.entity.render;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.CoalBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.DiamondBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.RedstoneBlazeEntity;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CoalBlazeRenderer extends MobRenderer<CoalBlazeEntity, ElementalBlazeModel<CoalBlazeEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/coal_blaze.png");

    public CoalBlazeRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(CoalBlazeEntity entity) {
        return TEXTURE;
    }
}
