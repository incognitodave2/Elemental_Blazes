package net.incognitodave2.elementalblazes.entity.render;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.CoalBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.DiamondBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.LapisBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.RedstoneBlazeEntity;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LapisBlazeRenderer extends MobRenderer<LapisBlazeEntity, ElementalBlazeModel<LapisBlazeEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/lapis_blaze.png");

    public LapisBlazeRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(LapisBlazeEntity entity) {
        return TEXTURE;
    }
}
