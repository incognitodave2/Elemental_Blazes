package net.incognitodave2.elementalblazes.item;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.ModEntityTypes;
import net.incognitodave2.elementalblazes.item.custom.ModSpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ElementalBlazes.MOD_ID);

    public static final RegistryObject<Item> REDSTONE_BLAZE_SPAWN_EGG = ITEMS.register("redstone_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.REDSTONE_BLAZE, 0xAA0000, 0x181414,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> DIAMOND_BLAZE_SPAWN_EGG = ITEMS.register("diamond_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.DIAMOND_BLAZE, 0x5fcde4, 0x0a2f51,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> EMERALD_BLAZE_SPAWN_EGG = ITEMS.register("emerald_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.EMERALD_BLAZE, 0x28d14c, 0x0e511c,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> IRON_BLAZE_SPAWN_EGG = ITEMS.register("iron_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.IRON_BLAZE, 0xa8a8a8, 0xd8d8d8,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> NETHERITE_BLAZE_SPAWN_EGG = ITEMS.register("netherite_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.NETHERITE_BLAZE, 0x3c3232, 0x737173,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> COAL_BLAZE_SPAWN_EGG = ITEMS.register("coal_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.COAL_BLAZE, 0x000000, 0x5B615E,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> LAPIS_BLAZE_SPAWN_EGG = ITEMS.register("lapis_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.LAPIS_BLAZE, 0x2331C9, 0x000000,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> OBSIDIAN_BLAZE_SPAWN_EGG = ITEMS.register("obsidian_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.OBSIDIAN_BLAZE, 0x282B4C, 0x000000,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> QUARTZ_BLAZE_SPAWN_EGG = ITEMS.register("quartz_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.QUARTZ_BLAZE, 0xFFFFFF, 0xAEAEAF,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> GOLD_BLAZE_SPAWN_EGG = ITEMS.register("gold_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.GOLD_BLAZE, 0xD9DB20, 0xD3D4BC,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> COBBLESTONE_BLAZE_SPAWN_EGG = ITEMS.register("cobblestone_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.COBBLESTONE_BLAZE, 0x61615C, 0xB2B2B2,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> NATURE_BLAZE_SPAWN_EGG = ITEMS.register("nature_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.NATURE_BLAZE, 0x12361E, 0x3CD770,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> CLAY_BLAZE_SPAWN_EGG = ITEMS.register("clay_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.CLAY_BLAZE, 0xafb9d6, 0xa1a7b1,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> REDSTONE_BLAZE_SPAWN_EGG_TIER_2 = ITEMS.register("redstone_blaze_spawn_egg_tier_2",
            () -> new ModSpawnEggItem(ModEntityTypes.REDSTONE_BLAZE_TIER_2, 0xAA0000, 0x181414,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> DIAMOND_BLAZE_SPAWN_EGG_TIER_2 = ITEMS.register("diamond_blaze_spawn_egg_tier_2",
            () -> new ModSpawnEggItem(ModEntityTypes.DIAMOND_BLAZE_TIER_2, 0x5fcde4, 0x0a2f51,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> EMERALD_BLAZE_SPAWN_EGG_TIER_2 = ITEMS.register("emerald_blaze_spawn_egg_tier_2",
            () -> new ModSpawnEggItem(ModEntityTypes.EMERALD_BLAZE_TIER_2, 0x28d14c, 0x0e511c,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> IRON_BLAZE_SPAWN_EGG_TIER_2 = ITEMS.register("iron_blaze_spawn_egg_tier_2",
            () -> new ModSpawnEggItem(ModEntityTypes.IRON_BLAZE_TIER_2, 0xa8a8a8, 0xd8d8d8,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> NETHERITE_BLAZE_SPAWN_EGG_TIER_2 = ITEMS.register("netherite_blaze_spawn_egg_tier_2",
            () -> new ModSpawnEggItem(ModEntityTypes.NETHERITE_BLAZE_TIER_2, 0x3c3232, 0x737173,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> COAL_BLAZE_SPAWN_EGG_TIER_2 = ITEMS.register("coal_blaze_spawn_egg_tier_2",
            () -> new ModSpawnEggItem(ModEntityTypes.COAL_BLAZE_TIER_2, 0x000000, 0x5B615E,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> LAPIS_BLAZE_SPAWN_EGG_TIER_2 = ITEMS.register("lapis_blaze_spawn_egg_tier_2",
            () -> new ModSpawnEggItem(ModEntityTypes.LAPIS_BLAZE_TIER_2, 0x2331C9, 0x000000,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> OBSIDIAN_BLAZE_SPAWN_EGG_TIER_2 = ITEMS.register("obsidian_blaze_spawn_egg_tier_2",
            () -> new ModSpawnEggItem(ModEntityTypes.OBSIDIAN_BLAZE_TIER_2, 0x282B4C, 0x000000,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> QUARTZ_BLAZE_SPAWN_EGG_TIER_2 = ITEMS.register("quartz_blaze_spawn_egg_tier_2",
            () -> new ModSpawnEggItem(ModEntityTypes.QUARTZ_BLAZE_TIER_2, 0xFFFFFF, 0xAEAEAF,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> GOLD_BLAZE_SPAWN_EGG_TIER_2 = ITEMS.register("gold_blaze_spawn_egg_tier_2",
            () -> new ModSpawnEggItem(ModEntityTypes.GOLD_BLAZE_TIER_2, 0xD9DB20, 0xD3D4BC,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> COBBLESTONE_BLAZE_SPAWN_EGG_TIER_2 = ITEMS.register("cobblestone_blaze_spawn_egg_tier_2",
            () -> new ModSpawnEggItem(ModEntityTypes.COBBLESTONE_BLAZE_TIER_2, 0x61615C, 0xB2B2B2,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> NATURE_BLAZE_SPAWN_EGG_TIER_2 = ITEMS.register("nature_blaze_spawn_egg_tier_2",
            () -> new ModSpawnEggItem(ModEntityTypes.NATURE_BLAZE_TIER_2, 0x12361E, 0x3CD770,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> CLAY_BLAZE_SPAWN_EGG_TIER_2 = ITEMS.register("clay_blaze_spawn_egg_tier_2",
            () -> new ModSpawnEggItem(ModEntityTypes.CLAY_BLAZE_TIER_2, 0xafb9d6, 0xa1a7b1,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> REDSTONE_BLAZE_SPAWN_EGG_TIER_3 = ITEMS.register("redstone_blaze_spawn_egg_tier_3",
            () -> new ModSpawnEggItem(ModEntityTypes.REDSTONE_BLAZE_TIER_3, 0xAA0000, 0x181414,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> DIAMOND_BLAZE_SPAWN_EGG_TIER_3 = ITEMS.register("diamond_blaze_spawn_egg_tier_3",
            () -> new ModSpawnEggItem(ModEntityTypes.DIAMOND_BLAZE, 0x5fcde4, 0x0a2f51,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> EMERALD_BLAZE_SPAWN_EGG_TIER_3 = ITEMS.register("emerald_blaze_spawn_egg_tier_3",
            () -> new ModSpawnEggItem(ModEntityTypes.EMERALD_BLAZE_TIER_3, 0x28d14c, 0x0e511c,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> IRON_BLAZE_SPAWN_EGG_TIER_3 = ITEMS.register("iron_blaze_spawn_egg_tier_3",
            () -> new ModSpawnEggItem(ModEntityTypes.IRON_BLAZE_TIER_3, 0xa8a8a8, 0xd8d8d8,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> NETHERITE_BLAZE_SPAWN_EGG_TIER_3 = ITEMS.register("netherite_blaze_spawn_egg_tier_3",
            () -> new ModSpawnEggItem(ModEntityTypes.NETHERITE_BLAZE_TIER_3, 0x3c3232, 0x737173,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> COAL_BLAZE_SPAWN_EGG_TIER_3 = ITEMS.register("coal_blaze_spawn_egg_tier_3",
            () -> new ModSpawnEggItem(ModEntityTypes.COAL_BLAZE_TIER_3, 0x000000, 0x5B615E,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> LAPIS_BLAZE_SPAWN_EGG_TIER_3 = ITEMS.register("lapis_blaze_spawn_egg_tier_3",
            () -> new ModSpawnEggItem(ModEntityTypes.LAPIS_BLAZE_TIER_3, 0x2331C9, 0x000000,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> OBSIDIAN_BLAZE_SPAWN_EGG_TIER_3 = ITEMS.register("obsidian_blaze_spawn_egg_tier_3",
            () -> new ModSpawnEggItem(ModEntityTypes.OBSIDIAN_BLAZE_TIER_3, 0x282B4C, 0x000000,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> QUARTZ_BLAZE_SPAWN_EGG_TIER_3 = ITEMS.register("quartz_blaze_spawn_egg_tier_3",
            () -> new ModSpawnEggItem(ModEntityTypes.QUARTZ_BLAZE_TIER_3, 0xFFFFFF, 0xAEAEAF,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> GOLD_BLAZE_SPAWN_EGG_TIER_3= ITEMS.register("gold_blaze_spawn_egg_tier_3",
            () -> new ModSpawnEggItem(ModEntityTypes.GOLD_BLAZE_TIER_3, 0xD9DB20, 0xD3D4BC,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> COBBLESTONE_BLAZE_SPAWN_EGG_TIER_3 = ITEMS.register("cobblestone_blaze_spawn_egg_tier_3",
            () -> new ModSpawnEggItem(ModEntityTypes.COBBLESTONE_BLAZE_TIER_3, 0x61615C, 0xB2B2B2,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> NATURE_BLAZE_SPAWN_EGG_TIER_3 = ITEMS.register("nature_blaze_spawn_egg_tier_3",
            () -> new ModSpawnEggItem(ModEntityTypes.NATURE_BLAZE_TIER_3, 0x12361E, 0x3CD770,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> CLAY_BLAZE_SPAWN_EGG_TIER_3 = ITEMS.register("clay_blaze_spawn_egg_tier_3",
            () -> new ModSpawnEggItem(ModEntityTypes.CLAY_BLAZE_TIER_3, 0xafb9d6, 0xa1a7b1,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> REDSTONE_BLAZE_SPAWN_EGG_TIER_4 = ITEMS.register("redstone_blaze_spawn_egg_tier_4",
            () -> new ModSpawnEggItem(ModEntityTypes.REDSTONE_BLAZE_TIER_4, 0xAA0000, 0x181414,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> DIAMOND_BLAZE_SPAWN_EGG_TIER_4 = ITEMS.register("diamond_blaze_spawn_egg_tier_4",
            () -> new ModSpawnEggItem(ModEntityTypes.DIAMOND_BLAZE_TIER_4, 0x5fcde4, 0x0a2f51,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> EMERALD_BLAZE_SPAWN_EGG_TIER_4 = ITEMS.register("emerald_blaze_spawn_egg_tier_4",
            () -> new ModSpawnEggItem(ModEntityTypes.EMERALD_BLAZE_TIER_4, 0x28d14c, 0x0e511c,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> IRON_BLAZE_SPAWN_EGG_TIER_4 = ITEMS.register("iron_blaze_spawn_egg_tier_4",
            () -> new ModSpawnEggItem(ModEntityTypes.IRON_BLAZE_TIER_4, 0xa8a8a8, 0xd8d8d8,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> NETHERITE_BLAZE_SPAWN_EGG_TIER_4 = ITEMS.register("netherite_blaze_spawn_egg_tier_4",
            () -> new ModSpawnEggItem(ModEntityTypes.NETHERITE_BLAZE_TIER_4, 0x3c3232, 0x737173,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> COAL_BLAZE_SPAWN_EGG_TIER_4 = ITEMS.register("coal_blaze_spawn_egg_tier_4",
            () -> new ModSpawnEggItem(ModEntityTypes.COAL_BLAZE_TIER_4, 0x000000, 0x5B615E,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> LAPIS_BLAZE_SPAWN_EGG_TIER_4 = ITEMS.register("lapis_blaze_spawn_egg_tier_4",
            () -> new ModSpawnEggItem(ModEntityTypes.LAPIS_BLAZE_TIER_4, 0x2331C9, 0x000000,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> OBSIDIAN_BLAZE_SPAWN_EGG_TIER_4 = ITEMS.register("obsidian_blaze_spawn_egg_tier_4",
            () -> new ModSpawnEggItem(ModEntityTypes.OBSIDIAN_BLAZE_TIER_4, 0x282B4C, 0x000000,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> QUARTZ_BLAZE_SPAWN_EGG_TIER_4 = ITEMS.register("quartz_blaze_spawn_egg_tier_4",
            () -> new ModSpawnEggItem(ModEntityTypes.QUARTZ_BLAZE_TIER_4, 0xFFFFFF, 0xAEAEAF,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> GOLD_BLAZE_SPAWN_EGG_TIER_4 = ITEMS.register("gold_blaze_spawn_egg_tier_4",
            () -> new ModSpawnEggItem(ModEntityTypes.GOLD_BLAZE_TIER_4, 0xD9DB20, 0xD3D4BC,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> COBBLESTONE_BLAZE_SPAWN_EGG_TIER_4 = ITEMS.register("cobblestone_blaze_spawn_egg_tier_4",
            () -> new ModSpawnEggItem(ModEntityTypes.COBBLESTONE_BLAZE_TIER_4, 0x61615C, 0xB2B2B2,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> NATURE_BLAZE_SPAWN_EGG_TIER_4 = ITEMS.register("nature_blaze_spawn_egg_tier_4",
            () -> new ModSpawnEggItem(ModEntityTypes.NATURE_BLAZE_TIER_4, 0x12361E, 0x3CD770,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> CLAY_BLAZE_SPAWN_EGG_TIER_4 = ITEMS.register("clay_blaze_spawn_egg_tier_4",
            () -> new ModSpawnEggItem(ModEntityTypes.CLAY_BLAZE_TIER_4, 0xafb9d6, 0xa1a7b1,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> REDSTONE_BLAZE_SPAWN_EGG_TIER_5 = ITEMS.register("redstone_blaze_spawn_egg_tier_5",
            () -> new ModSpawnEggItem(ModEntityTypes.REDSTONE_BLAZE_TIER_5, 0xAA0000, 0x181414,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> DIAMOND_BLAZE_SPAWN_EGG_TIER_5 = ITEMS.register("diamond_blaze_spawn_egg_tier_5",
            () -> new ModSpawnEggItem(ModEntityTypes.DIAMOND_BLAZE_TIER_5, 0x5fcde4, 0x0a2f51,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> EMERALD_BLAZE_SPAWN_EGG_TIER_5 = ITEMS.register("emerald_blaze_spawn_egg_tier_5",
            () -> new ModSpawnEggItem(ModEntityTypes.EMERALD_BLAZE_TIER_5, 0x28d14c, 0x0e511c,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> IRON_BLAZE_SPAWN_EGG_TIER_5 = ITEMS.register("iron_blaze_spawn_egg_tier_5",
            () -> new ModSpawnEggItem(ModEntityTypes.IRON_BLAZE_TIER_5, 0xa8a8a8, 0xd8d8d8,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> NETHERITE_BLAZE_SPAWN_EGG_TIER_5 = ITEMS.register("netherite_blaze_spawn_egg_tier_5",
            () -> new ModSpawnEggItem(ModEntityTypes.NETHERITE_BLAZE_TIER_5, 0x3c3232, 0x737173,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> COAL_BLAZE_SPAWN_EGG_TIER_5 = ITEMS.register("coal_blaze_spawn_egg_tier_5",
            () -> new ModSpawnEggItem(ModEntityTypes.COAL_BLAZE_TIER_5, 0x000000, 0x5B615E,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> LAPIS_BLAZE_SPAWN_EGG_TIER_5 = ITEMS.register("lapis_blaze_spawn_egg_tier_5",
            () -> new ModSpawnEggItem(ModEntityTypes.LAPIS_BLAZE_TIER_5, 0x2331C9, 0x000000,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> OBSIDIAN_BLAZE_SPAWN_EGG_TIER_5 = ITEMS.register("obsidian_blaze_spawn_egg_tier_5",
            () -> new ModSpawnEggItem(ModEntityTypes.OBSIDIAN_BLAZE_TIER_5, 0x282B4C, 0x000000,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> QUARTZ_BLAZE_SPAWN_EGG_TIER_5 = ITEMS.register("quartz_blaze_spawn_egg_tier_5",
            () -> new ModSpawnEggItem(ModEntityTypes.QUARTZ_BLAZE_TIER_5, 0xFFFFFF, 0xAEAEAF,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> GOLD_BLAZE_SPAWN_EGG_TIER_5 = ITEMS.register("gold_blaze_spawn_egg_tier_5",
            () -> new ModSpawnEggItem(ModEntityTypes.GOLD_BLAZE_TIER_5, 0xD9DB20, 0xD3D4BC,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> COBBLESTONE_BLAZE_SPAWN_EGG_TIER_5 = ITEMS.register("cobblestone_blaze_spawn_egg_tier_5",
            () -> new ModSpawnEggItem(ModEntityTypes.COBBLESTONE_BLAZE_TIER_5, 0x61615C, 0xB2B2B2,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> NATURE_BLAZE_SPAWN_EGG_TIER_5 = ITEMS.register("nature_blaze_spawn_egg_tier_5",
            () -> new ModSpawnEggItem(ModEntityTypes.NATURE_BLAZE_TIER_5, 0x12361E, 0x3CD770,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> CLAY_BLAZE_SPAWN_EGG_TIER_5 = ITEMS.register("clay_blaze_spawn_egg_tier_5",
            () -> new ModSpawnEggItem(ModEntityTypes.CLAY_BLAZE_TIER_5, 0xafb9d6, 0xa1a7b1,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> NATURE_ROD = ITEMS.register("nature_rod",
            ()-> new Item(new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));


    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}
}
