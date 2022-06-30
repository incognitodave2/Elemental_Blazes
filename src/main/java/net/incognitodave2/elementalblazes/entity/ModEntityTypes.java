package net.incognitodave2.elementalblazes.entity;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.*;
import net.incognitodave2.elementalblazes.entity.render.IronBlazeRenderer;
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

    public static final RegistryObject<EntityType<EmeraldBlazeEntity>> EMERALD_BLAZE =
            ENTITY_TYPES.register("emerald_blaze",
                    () -> EntityType.Builder.create(EmeraldBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 3f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "emerald_blaze").toString()));

    public static final RegistryObject<EntityType<IronBlazeEntity>> IRON_BLAZE =
            ENTITY_TYPES.register("iron_blaze",
                    () -> EntityType.Builder.create(IronBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 3f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "iron_blaze").toString()));

    public static final RegistryObject<EntityType<NetheriteBlazeEntity>> NETHERITE_BLAZE =
            ENTITY_TYPES.register("netherite_blaze",
                    () -> EntityType.Builder.create(NetheriteBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 3f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "netherite_blaze").toString()));

    public static final RegistryObject<EntityType<CoalBlazeEntity>> COAL_BLAZE =
            ENTITY_TYPES.register("coal_blaze",
                    () -> EntityType.Builder.create(CoalBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 3f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "coal_blaze").toString()));

    public static final RegistryObject<EntityType<LapisBlazeEntity>> LAPIS_BLAZE =
            ENTITY_TYPES.register("lapis_blaze",
                    () -> EntityType.Builder.create(LapisBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 3f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "lapis_blaze").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
