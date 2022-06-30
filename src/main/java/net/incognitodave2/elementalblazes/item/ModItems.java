package net.incognitodave2.elementalblazes.item;

import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.ModEntityTypes;
import net.incognitodave2.elementalblazes.item.custom.ModSpawnEggItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ElementalBlazes.MOD_ID);

    public static final RegistryObject<Item> REDSTONE_BLAZE_SPAWN_EGG = ITEMS.register("redstone_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.REDSTONE_BLAZE, 0x854386, 0x674789,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> DIAMOND_BLAZE_SPAWN_EGG = ITEMS.register("diamond_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.DIAMOND_BLAZE, 0x854386, 0x674789,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> EMERALD_BLAZE_SPAWN_EGG = ITEMS.register("emerald_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.EMERALD_BLAZE, 0x854386, 0x674789,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> IRON_BLAZE_SPAWN_EGG = ITEMS.register("iron_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.IRON_BLAZE, 0x854386, 0x674789,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> NETHERITE_BLAZE_SPAWN_EGG = ITEMS.register("netherite_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.NETHERITE_BLAZE, 0x854386, 0x674789,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> COAL_BLAZE_SPAWN_EGG = ITEMS.register("coal_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.COAL_BLAZE, 0x854386, 0x674789,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final RegistryObject<Item> LAPIS_BLAZE_SPAWN_EGG = ITEMS.register("lapis_blaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.LAPIS_BLAZE, 0x854386, 0x674789,
                    new Item.Properties().group(ModItemGroup.TUTORIAL_GROUP)));


    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}
}
