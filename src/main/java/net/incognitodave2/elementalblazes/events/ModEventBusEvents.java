package net.incognitodave2.elementalblazes.events;

import net.incognitodave2.elementalblazes.entity.ModEntityTypes;
import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.*;
import net.incognitodave2.elementalblazes.entity.custom.Tier3.*;
import net.incognitodave2.elementalblazes.item.custom.ModSpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = ElementalBlazes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.REDSTONE_BLAZE.get(), RedstoneBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.DIAMOND_BLAZE.get(), DiamondBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.EMERALD_BLAZE.get(), EmeraldBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.IRON_BLAZE.get(), IronBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.NETHERITE_BLAZE.get(), NetheriteBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.COAL_BLAZE.get(), CoalBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.LAPIS_BLAZE.get(), LapisBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.OBSIDIAN_BLAZE.get(), ObsidianBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.QUARTZ_BLAZE.get(), QuartzBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.GOLD_BLAZE.get(), GoldBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.COBBLESTONE_BLAZE.get(), CobblestoneBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.NATURE_BLAZE.get(), NatureBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.CLAY_BLAZE.get(), ClayBlazeEntity.setCustomAttributes().create());

        event.put(ModEntityTypes.REDSTONE_BLAZE_TIER_2.get(), RedstoneBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.DIAMOND_BLAZE_TIER_2.get(), DiamondBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.EMERALD_BLAZE_TIER_2.get(), EmeraldBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.IRON_BLAZE_TIER_2.get(), IronBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.NETHERITE_BLAZE_TIER_2.get(), NetheriteBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.COAL_BLAZE_TIER_2.get(), CoalBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.LAPIS_BLAZE_TIER_2.get(), LapisBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.OBSIDIAN_BLAZE_TIER_2.get(), ObsidianBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.QUARTZ_BLAZE_TIER_2.get(), QuartzBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.GOLD_BLAZE_TIER_2.get(), GoldBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.COBBLESTONE_BLAZE_TIER_2.get(), CobblestoneBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.NATURE_BLAZE_TIER_2.get(), NatureBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.CLAY_BLAZE_TIER_2.get(), ClayBlazeEntity.setCustomAttributes().create());

        event.put(ModEntityTypes.REDSTONE_BLAZE_TIER_3.get(), RedstoneBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.DIAMOND_BLAZE_TIER_3.get(), DiamondBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.EMERALD_BLAZE_TIER_3.get(), EmeraldBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.IRON_BLAZE_TIER_3.get(), IronBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.NETHERITE_BLAZE_TIER_3.get(), NetheriteBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.COAL_BLAZE_TIER_3.get(), CoalBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.LAPIS_BLAZE_TIER_3.get(), LapisBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.OBSIDIAN_BLAZE_TIER_3.get(), ObsidianBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.QUARTZ_BLAZE_TIER_3.get(), QuartzBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.GOLD_BLAZE_TIER_3.get(), GoldBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.COBBLESTONE_BLAZE_TIER_3.get(), CobblestoneBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.NATURE_BLAZE_TIER_3.get(), NatureBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.CLAY_BLAZE_TIER_3.get(), ClayBlazeEntity.setCustomAttributes().create());

        event.put(ModEntityTypes.REDSTONE_BLAZE_TIER_4.get(), RedstoneBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.DIAMOND_BLAZE_TIER_4.get(), DiamondBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.EMERALD_BLAZE_TIER_4.get(), EmeraldBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.IRON_BLAZE_TIER_4.get(), IronBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.NETHERITE_BLAZE_TIER_4.get(), NetheriteBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.COAL_BLAZE_TIER_4.get(), CoalBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.LAPIS_BLAZE_TIER_4.get(), LapisBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.OBSIDIAN_BLAZE_TIER_4.get(), ObsidianBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.QUARTZ_BLAZE_TIER_4.get(), QuartzBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.GOLD_BLAZE_TIER_4.get(), GoldBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.COBBLESTONE_BLAZE_TIER_4.get(), CobblestoneBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.NATURE_BLAZE_TIER_4.get(), NatureBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.CLAY_BLAZE_TIER_4.get(), ClayBlazeEntity.setCustomAttributes().create());

        event.put(ModEntityTypes.REDSTONE_BLAZE_TIER_5.get(), RedstoneBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.DIAMOND_BLAZE_TIER_5.get(), DiamondBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.EMERALD_BLAZE_TIER_5.get(), EmeraldBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.IRON_BLAZE_TIER_5.get(), IronBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.NETHERITE_BLAZE_TIER_5.get(), NetheriteBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.COAL_BLAZE_TIER_5.get(), CoalBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.LAPIS_BLAZE_TIER_5.get(), LapisBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.OBSIDIAN_BLAZE_TIER_5.get(), ObsidianBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.QUARTZ_BLAZE_TIER_5.get(), QuartzBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.GOLD_BLAZE_TIER_5.get(), GoldBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.COBBLESTONE_BLAZE_TIER_5.get(), CobblestoneBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.NATURE_BLAZE_TIER_5.get(), NatureBlazeEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.CLAY_BLAZE_TIER_5.get(), ClayBlazeEntity.setCustomAttributes().create());
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}

