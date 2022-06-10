package net.incognitodave2.elementalblazes.events;

import net.incognitodave2.elementalblazes.entity.ModEntityTypes;
import net.incognitodave2.elementalblazes.ElementalBlazes;
import net.incognitodave2.elementalblazes.entity.custom.DiamondBlazeEntity;
import net.incognitodave2.elementalblazes.entity.custom.RedstoneBlazeEntity;
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

    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}

