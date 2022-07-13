package net.incognitodave2.elementalblazes.entity.render.RenderTier1;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.CobblestoneBlazeEntity;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CobblestoneBlazeRenderer extends MobRenderer<CobblestoneBlazeEntity, ElementalBlazeModel<CobblestoneBlazeEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/cobblestone_blaze.png");

    public CobblestoneBlazeRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(CobblestoneBlazeEntity entity) {
        return TEXTURE;
    }
}
