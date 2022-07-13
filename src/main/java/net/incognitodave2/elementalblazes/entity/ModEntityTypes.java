package net.incognitodave2.elementalblazes.entity;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.*;
import net.incognitodave2.elementalblazes.entity.custom.Tier2.*;
import net.incognitodave2.elementalblazes.entity.custom.Tier3.*;
import net.incognitodave2.elementalblazes.entity.custom.Tier4.*;
import net.incognitodave2.elementalblazes.entity.custom.Tier5.*;
import net.incognitodave2.elementalblazes.entity.render.RenderTier2.*;
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
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "redstone_blaze").toString()));

    public static final RegistryObject<EntityType<DiamondBlazeEntity>> DIAMOND_BLAZE =
            ENTITY_TYPES.register("diamond_blaze",
                    () -> EntityType.Builder.create(DiamondBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "diamond_blaze").toString()));

    public static final RegistryObject<EntityType<EmeraldBlazeEntity>> EMERALD_BLAZE =
            ENTITY_TYPES.register("emerald_blaze",
                    () -> EntityType.Builder.create(EmeraldBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "emerald_blaze").toString()));

    public static final RegistryObject<EntityType<IronBlazeEntity>> IRON_BLAZE =
            ENTITY_TYPES.register("iron_blaze",
                    () -> EntityType.Builder.create(IronBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "iron_blaze").toString()));

    public static final RegistryObject<EntityType<NetheriteBlazeEntity>> NETHERITE_BLAZE =
            ENTITY_TYPES.register("netherite_blaze",
                    () -> EntityType.Builder.create(NetheriteBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "netherite_blaze").toString()));

    public static final RegistryObject<EntityType<CoalBlazeEntity>> COAL_BLAZE =
            ENTITY_TYPES.register("coal_blaze",
                    () -> EntityType.Builder.create(CoalBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "coal_blaze").toString()));

    public static final RegistryObject<EntityType<LapisBlazeEntity>> LAPIS_BLAZE =
            ENTITY_TYPES.register("lapis_blaze",
                    () -> EntityType.Builder.create(LapisBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "lapis_blaze").toString()));

    public static final RegistryObject<EntityType<ObsidianBlazeEntity>> OBSIDIAN_BLAZE =
            ENTITY_TYPES.register("obsidian_blaze",
                    () -> EntityType.Builder.create(ObsidianBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "obsidian_blaze").toString()));

    public static final RegistryObject<EntityType<QuartzBlazeEntity>> QUARTZ_BLAZE =
            ENTITY_TYPES.register("quartz_blaze",
                    () -> EntityType.Builder.create(QuartzBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "quartz_blaze").toString()));

    public static final RegistryObject<EntityType<GoldBlazeEntity>> GOLD_BLAZE =
            ENTITY_TYPES.register("gold_blaze",
                    () -> EntityType.Builder.create(GoldBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "gold_blaze").toString()));

    public static final RegistryObject<EntityType<CobblestoneBlazeEntity>> COBBLESTONE_BLAZE =
            ENTITY_TYPES.register("cobblestone_blaze",
                    () -> EntityType.Builder.create(CobblestoneBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "cobblestone_blaze").toString()));

    public static final RegistryObject<EntityType<NatureBlazeEntity>> NATURE_BLAZE =
            ENTITY_TYPES.register("nature_blaze",
                    () -> EntityType.Builder.create(NatureBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "nature_blaze").toString()));

    public static final RegistryObject<EntityType<ClayBlazeEntity>> CLAY_BLAZE =
            ENTITY_TYPES.register("clay_blaze",
                    () -> EntityType.Builder.create(ClayBlazeEntity::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "clay_blaze").toString()));

    public static final RegistryObject<EntityType<RedstoneBlazeEntityTier2>> REDSTONE_BLAZE_TIER_2 =
            ENTITY_TYPES.register("redstone_blaze_tier_2",
                    () -> EntityType.Builder.create(RedstoneBlazeEntityTier2::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "redstone_blaze_tier_2").toString()));

    public static final RegistryObject<EntityType<DiamondBlazeEntityTier2>> DIAMOND_BLAZE_TIER_2 =
            ENTITY_TYPES.register("diamond_blaze_tier_2",
                    () -> EntityType.Builder.create(DiamondBlazeEntityTier2::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "diamond_blaze_tier_2").toString()));

    public static final RegistryObject<EntityType<EmeraldBlazeEntityTier2>> EMERALD_BLAZE_TIER_2 =
            ENTITY_TYPES.register("emerald_blaze_tier_2",
                    () -> EntityType.Builder.create(EmeraldBlazeEntityTier2::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "emerald_blaze_tier_2").toString()));

    public static final RegistryObject<EntityType<IronBlazeEntityTier2>> IRON_BLAZE_TIER_2 =
            ENTITY_TYPES.register("iron_blaze_tier_2",
                    () -> EntityType.Builder.create(IronBlazeEntityTier2::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "iron_blaze_tier_2").toString()));

    public static final RegistryObject<EntityType<NetheriteBlazeEntityTier2>> NETHERITE_BLAZE_TIER_2 =
            ENTITY_TYPES.register("netherite_blaze_tier_2",
                    () -> EntityType.Builder.create(NetheriteBlazeEntityTier2::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "netherite_blaze_tier_2").toString()));

    public static final RegistryObject<EntityType<CoalBlazeEntityTier2>> COAL_BLAZE_TIER_2 =
            ENTITY_TYPES.register("coal_blaze_tier_2",
                    () -> EntityType.Builder.create(CoalBlazeEntityTier2::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "coal_blaze_tier_2").toString()));

    public static final RegistryObject<EntityType<LapisBlazeEntityTier2>> LAPIS_BLAZE_TIER_2 =
            ENTITY_TYPES.register("lapis_blaze_tier_2",
                    () -> EntityType.Builder.create(LapisBlazeEntityTier2::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "lapis_blaze_tier_2").toString()));

    public static final RegistryObject<EntityType<ObsidianBlazeEntityTier2>> OBSIDIAN_BLAZE_TIER_2 =
            ENTITY_TYPES.register("obsidian_blaze_tier_2",
                    () -> EntityType.Builder.create(ObsidianBlazeEntityTier2::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "obsidian_blaze_tier_2").toString()));


    public static final RegistryObject<EntityType<QuartzBlazeEntityTier2>> QUARTZ_BLAZE_TIER_2 =
            ENTITY_TYPES.register("quartz_blaze_tier_2",
                    () -> EntityType.Builder.create(QuartzBlazeEntityTier2::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "quartz_blaze_tier_2").toString()));

    public static final RegistryObject<EntityType<GoldBlazeEntityTier2>> GOLD_BLAZE_TIER_2 =
            ENTITY_TYPES.register("gold_blaze_tier_2",
                    () -> EntityType.Builder.create(GoldBlazeEntityTier2::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "gold_blaze_tier_2").toString()));

    public static final RegistryObject<EntityType<CobblestoneBlazeEntityTier2>> COBBLESTONE_BLAZE_TIER_2 =
            ENTITY_TYPES.register("cobblestone_blaze_tier_2",
                    () -> EntityType.Builder.create(CobblestoneBlazeEntityTier2::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "cobblestone_blaze_tier_2").toString()));

    public static final RegistryObject<EntityType<NatureBlazeEntityTier2>> NATURE_BLAZE_TIER_2 =
            ENTITY_TYPES.register("nature_blaze_tier_2",
                    () -> EntityType.Builder.create(NatureBlazeEntityTier2::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "nature_blaze_tier_2").toString()));

    public static final RegistryObject<EntityType<ClayBlazeEntityTier2>> CLAY_BLAZE_TIER_2 =
            ENTITY_TYPES.register("clay_blaze_tier_2",
                    () -> EntityType.Builder.create(ClayBlazeEntityTier2::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "clay_blaze_tier_2").toString()));

    public static final RegistryObject<EntityType<RedstoneBlazeEntityTier3>> REDSTONE_BLAZE_TIER_3 =
            ENTITY_TYPES.register("redstone_blaze_tier_3",
                    () -> EntityType.Builder.create(RedstoneBlazeEntityTier3::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "redstone_blaze_tier_3").toString()));

    public static final RegistryObject<EntityType<DiamondBlazeEntityTier3>> DIAMOND_BLAZE_TIER_3 =
            ENTITY_TYPES.register("diamond_blaze_tier_3",
                    () -> EntityType.Builder.create(DiamondBlazeEntityTier3::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "diamond_blaze_tier_3").toString()));

    public static final RegistryObject<EntityType<EmeraldBlazeEntityTier3>> EMERALD_BLAZE_TIER_3 =
            ENTITY_TYPES.register("emerald_blaze_tier_3",
                    () -> EntityType.Builder.create(EmeraldBlazeEntityTier3::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "emerald_blaze_tier_3").toString()));

    public static final RegistryObject<EntityType<IronBlazeEntityTier3>> IRON_BLAZE_TIER_3 =
            ENTITY_TYPES.register("iron_blaze_tier_3",
                    () -> EntityType.Builder.create(IronBlazeEntityTier3::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "iron_blaze_tier_3").toString()));

    public static final RegistryObject<EntityType<NetheriteBlazeEntityTier3>> NETHERITE_BLAZE_TIER_3 =
            ENTITY_TYPES.register("netherite_blaze_tier_3",
                    () -> EntityType.Builder.create(NetheriteBlazeEntityTier3::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "netherite_blaze_tier_3").toString()));

    public static final RegistryObject<EntityType<CoalBlazeEntityTier3>> COAL_BLAZE_TIER_3 =
            ENTITY_TYPES.register("coal_blaze_tier_3",
                    () -> EntityType.Builder.create(CoalBlazeEntityTier3::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "coal_blaze_tier_3").toString()));

    public static final RegistryObject<EntityType<LapisBlazeEntityTier3>> LAPIS_BLAZE_TIER_3 =
            ENTITY_TYPES.register("lapis_blaze_tier_3",
                    () -> EntityType.Builder.create(LapisBlazeEntityTier3::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "lapis_blaze_tier_3").toString()));

    public static final RegistryObject<EntityType<ObsidianBlazeEntityTier3>> OBSIDIAN_BLAZE_TIER_3 =
            ENTITY_TYPES.register("obsidian_blaze_tier_3",
                    () -> EntityType.Builder.create(ObsidianBlazeEntityTier3::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "lapis_blaze_tier_3").toString()));

    public static final RegistryObject<EntityType<QuartzBlazeEntityTier3>> QUARTZ_BLAZE_TIER_3 =
            ENTITY_TYPES.register("quartz_blaze_tier_3",
                    () -> EntityType.Builder.create(QuartzBlazeEntityTier3::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "quartz_blaze_tier_3").toString()));

    public static final RegistryObject<EntityType<GoldBlazeEntityTier3>> GOLD_BLAZE_TIER_3 =
            ENTITY_TYPES.register("gold_blaze_tier_3",
                    () -> EntityType.Builder.create(GoldBlazeEntityTier3::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "gold_blaze_tier_3").toString()));

    public static final RegistryObject<EntityType<CobblestoneBlazeEntityTier3>> COBBLESTONE_BLAZE_TIER_3 =
            ENTITY_TYPES.register("cobblestone_blaze_tier_3",
                    () -> EntityType.Builder.create(CobblestoneBlazeEntityTier3::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "cobblestone_blaze_tier_3").toString()));

    public static final RegistryObject<EntityType<NatureBlazeEntityTier3>> NATURE_BLAZE_TIER_3 =
            ENTITY_TYPES.register("nature_blaze_tier_3",
                    () -> EntityType.Builder.create(NatureBlazeEntityTier3::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "nature_blaze_tier_3").toString()));

    public static final RegistryObject<EntityType<ClayBlazeEntityTier3>> CLAY_BLAZE_TIER_3 =
            ENTITY_TYPES.register("clay_blaze_tier_3",
                    () -> EntityType.Builder.create(ClayBlazeEntityTier3::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "clay_blaze_tier_3").toString()));

    public static final RegistryObject<EntityType<RedstoneBlazeEntityTier4>> REDSTONE_BLAZE_TIER_4 =
            ENTITY_TYPES.register("redstone_blaze_tier_4",
                    () -> EntityType.Builder.create(RedstoneBlazeEntityTier4::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "redstone_blaze_tier_4").toString()));

    public static final RegistryObject<EntityType<DiamondBlazeEntityTier4>> DIAMOND_BLAZE_TIER_4 =
            ENTITY_TYPES.register("diamond_blaze_tier_4",
                    () -> EntityType.Builder.create(DiamondBlazeEntityTier4::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "diamond_blaze_tier_4").toString()));

    public static final RegistryObject<EntityType<EmeraldBlazeEntityTier4>> EMERALD_BLAZE_TIER_4 =
            ENTITY_TYPES.register("emerald_blaze_tier_4",
                    () -> EntityType.Builder.create(EmeraldBlazeEntityTier4::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "emerald_blaze_tier_4").toString()));

    public static final RegistryObject<EntityType<IronBlazeEntityTier4>> IRON_BLAZE_TIER_4 =
            ENTITY_TYPES.register("iron_blaze_tier_4",
                    () -> EntityType.Builder.create(IronBlazeEntityTier4::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "iron_blaze_tier_4").toString()));

    public static final RegistryObject<EntityType<NetheriteBlazeEntityTier4>> NETHERITE_BLAZE_TIER_4 =
            ENTITY_TYPES.register("netherite_blaze_tier_4",
                    () -> EntityType.Builder.create(NetheriteBlazeEntityTier4::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "netherite_blaze_tier_4").toString()));

    public static final RegistryObject<EntityType<CoalBlazeEntityTier4>> COAL_BLAZE_TIER_4 =
            ENTITY_TYPES.register("coal_blaze_tier_4",
                    () -> EntityType.Builder.create(CoalBlazeEntityTier4::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "coal_blaze_tier_4").toString()));

    public static final RegistryObject<EntityType<LapisBlazeEntityTier4>> LAPIS_BLAZE_TIER_4 =
            ENTITY_TYPES.register("lapis_blaze_tier_4",
                    () -> EntityType.Builder.create(LapisBlazeEntityTier4::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "lapis_blaze_tier_4").toString()));

    public static final RegistryObject<EntityType<ObsidianBlazeEntityTier4>> OBSIDIAN_BLAZE_TIER_4 =
            ENTITY_TYPES.register("obsidian_blaze_tier_4",
                    () -> EntityType.Builder.create(ObsidianBlazeEntityTier4::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "lapis_blaze_tier_4").toString()));

    public static final RegistryObject<EntityType<QuartzBlazeEntityTier4>> QUARTZ_BLAZE_TIER_4 =
            ENTITY_TYPES.register("quartz_blaze_tier_4",
                    () -> EntityType.Builder.create(QuartzBlazeEntityTier4::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "quartz_blaze_tier_4").toString()));

    public static final RegistryObject<EntityType<GoldBlazeEntityTier4>> GOLD_BLAZE_TIER_4 =
            ENTITY_TYPES.register("gold_blaze_tier_4",
                    () -> EntityType.Builder.create(GoldBlazeEntityTier4::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "gold_blaze_tier_4").toString()));

    public static final RegistryObject<EntityType<CobblestoneBlazeEntityTier4>> COBBLESTONE_BLAZE_TIER_4 =
            ENTITY_TYPES.register("cobblestone_blaze_tier_4",
                    () -> EntityType.Builder.create(CobblestoneBlazeEntityTier4::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "cobblestone_blaze_tier_4").toString()));

    public static final RegistryObject<EntityType<NatureBlazeEntityTier4>> NATURE_BLAZE_TIER_4 =
            ENTITY_TYPES.register("nature_blaze_tier_4",
                    () -> EntityType.Builder.create(NatureBlazeEntityTier4::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "nature_blaze_tier_4").toString()));

    public static final RegistryObject<EntityType<ClayBlazeEntityTier4>> CLAY_BLAZE_TIER_4 =
            ENTITY_TYPES.register("clay_blaze_tier_4",
                    () -> EntityType.Builder.create(ClayBlazeEntityTier4::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "clay_blaze_tier_4").toString()));

    public static final RegistryObject<EntityType<RedstoneBlazeEntityTier5>> REDSTONE_BLAZE_TIER_5 =
            ENTITY_TYPES.register("redstone_blaze_tier_5",
                    () -> EntityType.Builder.create(RedstoneBlazeEntityTier5::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "redstone_blaze_tier_5").toString()));

    public static final RegistryObject<EntityType<DiamondBlazeEntityTier5>> DIAMOND_BLAZE_TIER_5 =
            ENTITY_TYPES.register("diamond_blaze_tier_5",
                    () -> EntityType.Builder.create(DiamondBlazeEntityTier5::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "diamond_blaze_tier_5").toString()));

    public static final RegistryObject<EntityType<EmeraldBlazeEntityTier5>> EMERALD_BLAZE_TIER_5 =
            ENTITY_TYPES.register("emerald_blaze_tier_5",
                    () -> EntityType.Builder.create(EmeraldBlazeEntityTier5::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "emerald_blaze_tier_5").toString()));

    public static final RegistryObject<EntityType<IronBlazeEntityTier5>> IRON_BLAZE_TIER_5 =
            ENTITY_TYPES.register("iron_blaze_tier_5",
                    () -> EntityType.Builder.create(IronBlazeEntityTier5::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "iron_blaze_tier_5").toString()));

    public static final RegistryObject<EntityType<NetheriteBlazeEntityTier5>> NETHERITE_BLAZE_TIER_5 =
            ENTITY_TYPES.register("netherite_blaze_tier_5",
                    () -> EntityType.Builder.create(NetheriteBlazeEntityTier5::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "netherite_blaze_tier_5").toString()));

    public static final RegistryObject<EntityType<CoalBlazeEntityTier5>> COAL_BLAZE_TIER_5 =
            ENTITY_TYPES.register("coal_blaze_tier_5",
                    () -> EntityType.Builder.create(CoalBlazeEntityTier5::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "coal_blaze_tier_5").toString()));

    public static final RegistryObject<EntityType<LapisBlazeEntityTier5>> LAPIS_BLAZE_TIER_5 =
            ENTITY_TYPES.register("lapis_blaze_tier_5",
                    () -> EntityType.Builder.create(LapisBlazeEntityTier5::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "lapis_blaze_tier_5").toString()));

    public static final RegistryObject<EntityType<ObsidianBlazeEntityTier5>> OBSIDIAN_BLAZE_TIER_5 =
            ENTITY_TYPES.register("obsidian_blaze_tier_5",
                    () -> EntityType.Builder.create(ObsidianBlazeEntityTier5::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "lapis_blaze_tier_5").toString()));

    public static final RegistryObject<EntityType<QuartzBlazeEntityTier5>> QUARTZ_BLAZE_TIER_5 =
            ENTITY_TYPES.register("quartz_blaze_tier_5",
                    () -> EntityType.Builder.create(QuartzBlazeEntityTier5::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "quartz_blaze_tier_5").toString()));

    public static final RegistryObject<EntityType<GoldBlazeEntityTier5>> GOLD_BLAZE_TIER_5 =
            ENTITY_TYPES.register("gold_blaze_tier_5",
                    () -> EntityType.Builder.create(GoldBlazeEntityTier5::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "gold_blaze_tier_5").toString()));

    public static final RegistryObject<EntityType<CobblestoneBlazeEntityTier5>> COBBLESTONE_BLAZE_TIER_5 =
            ENTITY_TYPES.register("cobblestone_blaze_tier_5",
                    () -> EntityType.Builder.create(CobblestoneBlazeEntityTier5::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "cobblestone_blaze_tier_5").toString()));

    public static final RegistryObject<EntityType<NatureBlazeEntityTier5>> NATURE_BLAZE_TIER_5 =
            ENTITY_TYPES.register("nature_blaze_tier_5",
                    () -> EntityType.Builder.create(NatureBlazeEntityTier5::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "nature_blaze_tier_5").toString()));

    public static final RegistryObject<EntityType<ClayBlazeEntityTier5>> CLAY_BLAZE_TIER_5 =
            ENTITY_TYPES.register("clay_blaze_tier_5",
                    () -> EntityType.Builder.create(ClayBlazeEntityTier5::new,
                                    EntityClassification.CREATURE).size(1f, 1.75f)
                            .build(new ResourceLocation(ElementalBlazes.MOD_ID, "clay_blaze_tier_5").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
