package net.incognitodave2.elementalblazes.entity.render.RenderTier3;

import net.incognitodave2.elementalblazes.*;
import net.incognitodave2.elementalblazes.entity.custom.Tier2.*;
import net.incognitodave2.elementalblazes.entity.custom.Tier3.*;
import net.incognitodave2.elementalblazes.entity.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;

public class DiamondBlazeRendererTier3 extends MobRenderer<DiamondBlazeEntityTier3, ElementalBlazeModel<DiamondBlazeEntityTier3>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ElementalBlazes.MOD_ID, "textures/entity/diamond_blaze_tier_3.png");

    public DiamondBlazeRendererTier3(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ElementalBlazeModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(DiamondBlazeEntityTier3 entity) {
        return TEXTURE;
    }
}