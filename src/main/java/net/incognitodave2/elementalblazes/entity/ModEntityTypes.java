package net.incognitodave2.elementalblazes.entity;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.DiamondBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.RedstoneBlazeEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, ElementalBlazes.MOD_ID);

    public static final RegistryObject<EntityType<RedstoneBlazeEntity>> REDSTONE_BLAZE =
            ENTITY_TYPES.register("redstone_blaze",
                    () -> EntityType.Builder.create(RedstoneBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 3f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "redstone_blaze").toString()));

    public static final RegistryObject<EntityType<DiamondBlazeEntity>> DIAMOND_BLAZE =
            ENTITY_TYPES.register("diamond_blaze",
                    () -> EntityType.Builder.create(DiamondBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 3f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "diamond_blaze").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
