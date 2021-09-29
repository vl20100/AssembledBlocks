package name.vincentleclercq.assembledblocks.registration;

import name.vincentleclercq.assembledblocks.AssembledBlocks;
import name.vincentleclercq.assembledblocks.items.Elastic;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AllRegistrations {

    // region Init
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AssembledBlocks.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AssembledBlocks.MODID);
    // endregion Init

    // region Items
    public static final RegistryObject<Item> ITEM_ELASTIC = ITEMS.register("elastic", () -> new Elastic(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    // endregion Items

    // region Blocks
    // region Stone
    public static final RegistryObject<Block> BLOCK_ASSEMBLED_STONE = StoneRegistration.registerAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_DOUBLE_ASSEMBLED_STONE = StoneRegistration.registerDoubleAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_TRIPLE_ASSEMBLED_STONE = StoneRegistration.registerTripleAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_QUADRUPLE_ASSEMBLED_STONE = StoneRegistration.registerQuadrupleAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_QUINTUPLE_ASSEMBLED_STONE = StoneRegistration.registerQuintupleAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_SEXTUPLE_ASSEMBLED_STONE = StoneRegistration.registerSextupleAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_SEPTUPLE_ASSEMBLED_STONE = StoneRegistration.registerSeptupleAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_OCTUPLE_ASSEMBLED_STONE = StoneRegistration.registerOctupleAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_NONUPLE_ASSEMBLED_STONE = StoneRegistration.registerNonupleAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_DECUPLE_ASSEMBLED_STONE = StoneRegistration.registerDecupleAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_UNDECUPLE_ASSEMBLED_STONE = StoneRegistration.registerUndecupleAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_DUODECUPLE_ASSEMBLED_STONE = StoneRegistration.registerDuodecupleAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_TREDECUPLE_ASSEMBLED_STONE = StoneRegistration.registerTredecupleAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_QUATUORDECUPLE_ASSEMBLED_STONE = StoneRegistration.registerQuatuordecupleAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_QUINDECUPLE_ASSEMBLED_STONE = StoneRegistration.registerQuindecupleAssembledStoneBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_SEXDECUPLE_ASSEMBLED_STONE = StoneRegistration.registerSexdecupleAssembledStoneBlock(BLOCKS);
    // endregion Stone
    // region Granite
    public static final RegistryObject<Block> BLOCK_ASSEMBLED_GRANITE = GraniteRegistration.registerAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_DOUBLE_ASSEMBLED_GRANITE = GraniteRegistration.registerDoubleAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_TRIPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerTripleAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_QUADRUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerQuadrupleAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_QUINTUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerQuintupleAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_SEXTUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerSextupleAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_SEPTUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerSeptupleAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_OCTUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerOctupleAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_NONUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerNonupleAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_DECUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerDecupleAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_UNDECUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerUndecupleAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_DUODECUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerDuodecupleAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_TREDECUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerTredecupleAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_QUATUORDECUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerQuatuordecupleAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_QUINDECUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerQuindecupleAssembledGraniteBlock(BLOCKS);
    public static final RegistryObject<Block> BLOCK_SEXDECUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerSexdecupleAssembledGraniteBlock(BLOCKS);
    // endregion Granite
    // endregion Blocks

    // region BlocksItems
    // region Stone
    public static final RegistryObject<Item> BLOCKITEM_ASSEMBLED_STONE = StoneRegistration.registerAssembledStoneBlockItem(ITEMS, BLOCK_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_DOUBLE_ASSEMBLED_STONE = StoneRegistration.registerDoubleAssembledStoneBlockItem(ITEMS, BLOCK_DOUBLE_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_TRIPLE_ASSEMBLED_STONE = StoneRegistration.registerTripleAssembledStoneBlockItem(ITEMS, BLOCK_TRIPLE_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_QUADRUPLE_ASSEMBLED_STONE = StoneRegistration.registerQuadrupleAssembledStoneBlockItem(ITEMS, BLOCK_QUADRUPLE_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_QUINTUPLE_ASSEMBLED_STONE = StoneRegistration.registerQuintupleAssembledStoneBlockItem(ITEMS, BLOCK_QUINTUPLE_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_SEXTUPLE_ASSEMBLED_STONE = StoneRegistration.registerSextupleAssembledStoneBlockItem(ITEMS, BLOCK_SEXTUPLE_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_SEPTUPLE_ASSEMBLED_STONE = StoneRegistration.registerSeptupleAssembledStoneBlockItem(ITEMS, BLOCK_SEPTUPLE_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_OCTUPLE_ASSEMBLED_STONE = StoneRegistration.registerOctupleAssembledStoneBlockItem(ITEMS, BLOCK_OCTUPLE_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_NONUPLE_ASSEMBLED_STONE = StoneRegistration.registerNonupleAssembledStoneBlockItem(ITEMS, BLOCK_NONUPLE_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_DECUPLE_ASSEMBLED_STONE = StoneRegistration.registerDecupleAssembledStoneBlockItem(ITEMS, BLOCK_DECUPLE_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_UNDECUPLE_ASSEMBLED_STONE = StoneRegistration.registerUndecupleAssembledStoneBlockItem(ITEMS, BLOCK_UNDECUPLE_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_DUODECUPLE_ASSEMBLED_STONE = StoneRegistration.registerDuodecupleAssembledStoneBlockItem(ITEMS, BLOCK_DUODECUPLE_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_TREDECUPLE_ASSEMBLED_STONE = StoneRegistration.registerTredecupleAssembledStoneBlockItem(ITEMS, BLOCK_TREDECUPLE_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_QUATUORDECUPLE_ASSEMBLED_STONE = StoneRegistration.registerQuatuordecupleAssembledStoneBlockItem(ITEMS, BLOCK_QUATUORDECUPLE_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_QUINDECUPLE_ASSEMBLED_STONE = StoneRegistration.registerQuindecupleAssembledStoneBlockItem(ITEMS, BLOCK_QUINDECUPLE_ASSEMBLED_STONE);
    public static final RegistryObject<Item> BLOCKITEM_SEXDECUPLE_ASSEMBLED_STONE = StoneRegistration.registerSexdecupleAssembledStoneBlockItem(ITEMS, BLOCK_SEXDECUPLE_ASSEMBLED_STONE);
    // endregion Stone
    // region Granite
    public static final RegistryObject<Item> BLOCKITEM_ASSEMBLED_GRANITE = GraniteRegistration.registerAssembledGraniteBlockItem(ITEMS, BLOCK_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_DOUBLE_ASSEMBLED_GRANITE = GraniteRegistration.registerDoubleAssembledGraniteBlockItem(ITEMS, BLOCK_DOUBLE_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_TRIPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerTripleAssembledGraniteBlockItem(ITEMS, BLOCK_TRIPLE_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_QUADRUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerQuadrupleAssembledGraniteBlockItem(ITEMS, BLOCK_QUADRUPLE_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_QUINTUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerQuintupleAssembledGraniteBlockItem(ITEMS, BLOCK_QUINTUPLE_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_SEXTUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerSextupleAssembledGraniteBlockItem(ITEMS, BLOCK_SEXTUPLE_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_SEPTUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerSeptupleAssembledGraniteBlockItem(ITEMS, BLOCK_SEPTUPLE_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_OCTUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerOctupleAssembledGraniteBlockItem(ITEMS, BLOCK_OCTUPLE_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_NONUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerNonupleAssembledGraniteBlockItem(ITEMS, BLOCK_NONUPLE_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_DECUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerDecupleAssembledGraniteBlockItem(ITEMS, BLOCK_DECUPLE_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_UNDECUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerUndecupleAssembledGraniteBlockItem(ITEMS, BLOCK_UNDECUPLE_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_DUODECUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerDuodecupleAssembledGraniteBlockItem(ITEMS, BLOCK_DUODECUPLE_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_TREDECUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerTredecupleAssembledGraniteBlockItem(ITEMS, BLOCK_TREDECUPLE_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_QUATUORDECUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerQuatuordecupleAssembledGraniteBlockItem(ITEMS, BLOCK_QUATUORDECUPLE_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_QUINDECUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerQuindecupleAssembledGraniteBlockItem(ITEMS, BLOCK_QUINDECUPLE_ASSEMBLED_GRANITE);
    public static final RegistryObject<Item> BLOCKITEM_SEXDECUPLE_ASSEMBLED_GRANITE = GraniteRegistration.registerSexdecupleAssembledGraniteBlockItem(ITEMS, BLOCK_SEXDECUPLE_ASSEMBLED_GRANITE);
    // endregion Granite
    // endregion BlocksItems

    public static void setRenderLayer()
    {
        StoneRegistration.setRenderLayer();
        GraniteRegistration.setRenderLayer();
    }
}
