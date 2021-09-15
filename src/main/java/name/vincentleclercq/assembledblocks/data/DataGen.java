package name.vincentleclercq.assembledblocks.data;

import com.google.common.collect.Sets;
import name.vincentleclercq.assembledblocks.AssembledBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import java.util.Collections;

@Mod.EventBusSubscriber(modid = AssembledBlocks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {

    public static final ExistingFileHelper IGNORING_FILES_EFH = new ExistingFileHelper(Collections.emptyList(), Sets.newConcurrentHashSet(), false, null, null);

    @SubscribeEvent
    public static void dataGen(GatherDataEvent e)
    {
        DataGenerator generator = e.getGenerator();

        if(e.includeClient())
        {

        }

        if(e.includeServer())
        {
            generator.addProvider(new RecipeGenerator(generator));
        }
    }
}
