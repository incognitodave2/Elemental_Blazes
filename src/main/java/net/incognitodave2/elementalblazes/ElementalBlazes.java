package net.incognitodave2.elementalblazes;

import net.incognitodave2.elementalblazes.entity.ModEntityTypes;
import net.incognitodave2.elementalblazes.entity.custom.TIer1.ObsidianBlazeEntity;
import net.incognitodave2.elementalblazes.entity.render.RenderTier1.*;
import net.incognitodave2.elementalblazes.entity.render.RenderTier2.*;
import net.incognitodave2.elementalblazes.entity.render.RenderTier3.*;
import net.incognitodave2.elementalblazes.entity.render.RenderTier4.*;
import net.incognitodave2.elementalblazes.entity.render.RenderTier5.*;
import net.incognitodave2.elementalblazes.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ElementalBlazes.MOD_ID)
public class ElementalBlazes
{
    public static final String MOD_ID = "elementalblazes";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public ElementalBlazes() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModEntityTypes.register(eventBus);

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
        });
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.REDSTONE_BLAZE.get(), RedstoneBlazeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DIAMOND_BLAZE.get(), DiamondBlazeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.EMERALD_BLAZE.get(), EmeraldBlazeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.IRON_BLAZE.get(), IronBlazeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.NETHERITE_BLAZE.get(), NetheriteBlazeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.COAL_BLAZE.get(), CoalBlazeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.LAPIS_BLAZE.get(), LapisBlazeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.OBSIDIAN_BLAZE.get(), ObsidianBlazeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.QUARTZ_BLAZE.get(), QuartzBlazeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GOLD_BLAZE.get(), GoldBlazeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.COBBLESTONE_BLAZE.get(), CobblestoneBlazeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.NATURE_BLAZE.get(), NatureBlazeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CLAY_BLAZE.get(), ClayBlazeRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.REDSTONE_BLAZE_TIER_2.get(), RedstoneBlazeRendererTier2::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DIAMOND_BLAZE_TIER_2.get(), DiamondBlazeRendererTier2::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.EMERALD_BLAZE_TIER_2.get(), EmeraldBlazeRendererTier2::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.IRON_BLAZE_TIER_2.get(), IronBlazeRendererTier2::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.NETHERITE_BLAZE_TIER_2.get(), NetheriteBlazeRendererTier2::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.COAL_BLAZE_TIER_2.get(), CoalBlazeRendererTier2::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.LAPIS_BLAZE_TIER_2.get(), LapisBlazeRendererTier2::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.OBSIDIAN_BLAZE_TIER_2.get(), ObsidianBlazeRendererTier2::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.QUARTZ_BLAZE_TIER_2.get(), QuartzBlazeRendererTier2::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GOLD_BLAZE_TIER_2.get(), GoldBlazeRendererTier2::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.COBBLESTONE_BLAZE_TIER_2.get(), CobblestoneBlazeRendererTier2::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.NATURE_BLAZE_TIER_2.get(), NatureBlazeRendererTier2::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CLAY_BLAZE_TIER_2.get(), ClayBlazeRendererTier2::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.REDSTONE_BLAZE_TIER_3.get(), RedstoneBlazeRendererTier3::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DIAMOND_BLAZE_TIER_3.get(), DiamondBlazeRendererTier3::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.EMERALD_BLAZE_TIER_3.get(), EmeraldBlazeRendererTier3::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.IRON_BLAZE_TIER_3.get(), IronBlazeRendererTier3::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.NETHERITE_BLAZE_TIER_3.get(), NetheriteBlazeRendererTier3::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.COAL_BLAZE_TIER_3.get(), CoalBlazeRendererTier3::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.LAPIS_BLAZE_TIER_3.get(), LapisBlazeRendererTier3::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.OBSIDIAN_BLAZE_TIER_3.get(), ObsidianBlazeRendererTier3::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.QUARTZ_BLAZE_TIER_3.get(), QuartzBlazeRendererTier3::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GOLD_BLAZE_TIER_3.get(), GoldBlazeRendererTier3::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.COBBLESTONE_BLAZE_TIER_3.get(), CobblestoneBlazeRendererTier3::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.NATURE_BLAZE_TIER_3.get(), NatureBlazeRendererTier3::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CLAY_BLAZE_TIER_3.get(), ClayBlazeRendererTier3::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.REDSTONE_BLAZE_TIER_4.get(), RedstoneBlazeRendererTier4::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DIAMOND_BLAZE_TIER_4.get(), DiamondBlazeRendererTier4::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.EMERALD_BLAZE_TIER_4.get(), EmeraldBlazeRendererTier4::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.IRON_BLAZE_TIER_4.get(), IronBlazeRendererTier4::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.NETHERITE_BLAZE_TIER_4.get(), NetheriteBlazeRendererTier4::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.COAL_BLAZE_TIER_4.get(), CoalBlazeRendererTier4::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.LAPIS_BLAZE_TIER_4.get(), LapisBlazeRendererTier4::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.OBSIDIAN_BLAZE_TIER_4.get(), ObsidianBlazeRendererTier4::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.QUARTZ_BLAZE_TIER_4.get(), QuartzBlazeRendererTier4::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GOLD_BLAZE_TIER_4.get(), GoldBlazeRendererTier4::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.COBBLESTONE_BLAZE_TIER_4.get(), CobblestoneBlazeRendererTier4::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.NATURE_BLAZE_TIER_4.get(), NatureBlazeRendererTier4::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CLAY_BLAZE_TIER_4.get(), ClayBlazeRendererTier4::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.REDSTONE_BLAZE_TIER_5.get(), RedstoneBlazeRendererTier5::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DIAMOND_BLAZE_TIER_5.get(), DiamondBlazeRendererTier5::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.EMERALD_BLAZE_TIER_5.get(), EmeraldBlazeRendererTier5::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.IRON_BLAZE_TIER_5.get(), IronBlazeRendererTier5::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.NETHERITE_BLAZE_TIER_5.get(), NetheriteBlazeRendererTier5::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.COAL_BLAZE_TIER_5.get(), CoalBlazeRendererTier5::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.LAPIS_BLAZE_TIER_5.get(), LapisBlazeRendererTier5::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.OBSIDIAN_BLAZE_TIER_5.get(), ObsidianBlazeRendererTier5::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.QUARTZ_BLAZE_TIER_5.get(), QuartzBlazeRendererTier5::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GOLD_BLAZE_TIER_5.get(), GoldBlazeRendererTier5::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.COBBLESTONE_BLAZE_TIER_5.get(), CobblestoneBlazeRendererTier5::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.NATURE_BLAZE_TIER_5.get(), NatureBlazeRendererTier5::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CLAY_BLAZE_TIER_5.get(), ClayBlazeRendererTier5::new);

    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
