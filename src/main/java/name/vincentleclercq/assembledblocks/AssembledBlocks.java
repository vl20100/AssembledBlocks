package name.vincentleclercq.assembledblocks;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AssembledBlocks.MODID)
public class AssembledBlocks {

    public static final String MODID = "assembledblocks";

    public AssembledBlocks()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);

        Registration.ITEMS.register(bus);
        Registration.BLOCKS.register(bus);
    }

    public void setup(FMLCommonSetupEvent e)
    {

    }

    public void clientSetup(FMLClientSetupEvent e)
    {

    }
}
