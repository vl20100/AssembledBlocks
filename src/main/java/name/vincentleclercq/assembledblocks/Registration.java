package name.vincentleclercq.assembledblocks;

import name.vincentleclercq.assembledblocks.blocks.stone.AssembledStone;
import name.vincentleclercq.assembledblocks.items.Elastic;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {

    // region Init
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AssembledBlocks.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AssembledBlocks.MODID);
    // endregion Init

    // region Items
    public static final RegistryObject<Item> ITEM_ELASTIC = ITEMS.register("elastic", () -> new Elastic(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    // endregion Items

    // region Blocks
    // region 1_0_Stone
    public static final RegistryObject<Block> BLOCK_ASSEMBLED_STONE = BLOCKS.register("1_0_stone/assembled_stone", () -> new AssembledStone(BlockBehaviour.Properties
            .of(Material.STONE, MaterialColor.STONE)
            //.strength() // Récupérer la strength de la stone x2
            .explosionResistance(Blocks.STONE.getExplosionResistance() * 2)));
    // endregion 1_0_Stone
    // endregion Blocks

    // region BlocksItems
    // region 1_0_Stone
    public static final RegistryObject<Item> BLOCKITEM_ASSEMBLED_STONE = ITEMS.register("1_0_stone/assembled_stone", () -> new BlockItem(BLOCK_ASSEMBLED_STONE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    // endregion 1_0_Stone
    // endregion BlocksItems
}
