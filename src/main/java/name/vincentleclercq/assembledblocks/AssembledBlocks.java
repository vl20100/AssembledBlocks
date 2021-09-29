package name.vincentleclercq.assembledblocks;

import com.mojang.blaze3d.vertex.VertexFormat;
import name.vincentleclercq.assembledblocks.registration.AllRegistrations;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.ForgeRenderTypes;
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

        AllRegistrations.ITEMS.register(bus);
        AllRegistrations.BLOCKS.register(bus);
    }

    public void setup(FMLCommonSetupEvent e)
    {

    }

    public void clientSetup(FMLClientSetupEvent e)
    {
        ForgeRenderTypes.getEntityCutoutMipped(new ResourceLocation("block/overlays/assembled_stone"));
        AllRegistrations.setRenderLayer();
    }
}
