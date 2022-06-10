package net.incognitodave2.elementalblazes.entity.render;


import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.RedstoneBlazeEntity;
import net.incognitodave2.elementalblazes.entity.model.ElementalBlazeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RedstoneBlazeRenderer extends MobRenderer<RedstoneBlazeEntity, ElementalBlazeModel<RedstoneBlazeEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/redstone_blaze.png");

    public RedstoneBlazeRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(RedstoneBlazeEntity entity) {
        return TEXTURE;
    }
}
