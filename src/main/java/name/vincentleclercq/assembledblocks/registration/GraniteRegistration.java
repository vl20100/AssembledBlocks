package name.vincentleclercq.assembledblocks.registration;

import name.vincentleclercq.assembledblocks.blocks.granite_1_1.*;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class GraniteRegistration {
    private static float graniteDestroyTime = 1.5F;
    private static float graniteExplosionResistance = 6.0F;
    private static CreativeModeTab tab = CreativeModeTab.TAB_BUILDING_BLOCKS;

    public static RegistryObject<Block> registerAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 2;
        return blockDeferredRegister.register("1_1_granite/assembled_granite", () -> new AssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerDoubleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 4;
        return blockDeferredRegister.register("1_1_granite/double_assembled_granite", () -> new DoubleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerDoubleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/double_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerTripleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 8;
        return blockDeferredRegister.register("1_1_granite/triple_assembled_granite", () -> new TripleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerTripleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/triple_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerQuadrupleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 16;
        return blockDeferredRegister.register("1_1_granite/quadruple_assembled_granite", () -> new QuadrupleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerQuadrupleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/quadruple_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerQuintupleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 32;
        return blockDeferredRegister.register("1_1_granite/quintuple_assembled_granite", () -> new QintupleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerQuintupleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/quintuple_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerSextupleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 64;
        return blockDeferredRegister.register("1_1_granite/sextuple_assembled_granite", () -> new SextupleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerSextupleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/sextuple_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerSeptupleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 128;
        return blockDeferredRegister.register("1_1_granite/septuple_assembled_granite", () -> new SeptupleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerSeptupleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/septuple_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerOctupleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 256;
        return blockDeferredRegister.register("1_1_granite/octuple_assembled_granite", () -> new OctupleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerOctupleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/octuple_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerNonupleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 512;
        return blockDeferredRegister.register("1_1_granite/nonuple_assembled_granite", () -> new NonupleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerNonupleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/nonuple_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerDecupleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 1024;
        return blockDeferredRegister.register("1_1_granite/decuple_assembled_granite", () -> new DecupleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerDecupleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/decuple_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerUndecupleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 2048;
        return blockDeferredRegister.register("1_1_granite/undecuple_assembled_granite", () -> new UndecupleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerUndecupleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/undecuple_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerDuodecupleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 4096;
        return blockDeferredRegister.register("1_1_granite/duodecuple_assembled_granite", () -> new DuodecupleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerDuodecupleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/duodecuple_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerTredecupleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 8192;
        return blockDeferredRegister.register("1_1_granite/tredecuple_assembled_granite", () -> new TredecupleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerTredecupleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/tredecuple_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerQuatuordecupleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 16384;
        return blockDeferredRegister.register("1_1_granite/quatuordecuple_assembled_granite", () -> new QuatuordecupleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerQuatuordecupleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/quatuordecuple_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerQuindecupleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 32768;
        return blockDeferredRegister.register("1_1_granite/quindecuple_assembled_granite", () -> new QintupleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerQuindecupleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/quindecuple_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerSexdecupleAssembledGraniteBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int graniteMultiplicator = 65536;
        return blockDeferredRegister.register("1_1_granite/sexdecuple_assembled_granite", () -> new SexdecupleAssembledGranite(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(graniteDestroyTime * graniteMultiplicator, graniteExplosionResistance * graniteMultiplicator)));
    }

    public static RegistryObject<Item> registerSexdecupleAssembledGraniteBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_1_granite/sexdecuple_assembled_granite", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static void setRenderLayer()
    {
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_DOUBLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_TRIPLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_QUADRUPLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_QUINTUPLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_SEXTUPLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_SEPTUPLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_OCTUPLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_NONUPLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_DECUPLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_UNDECUPLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_DUODECUPLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_TREDECUPLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_QUATUORDECUPLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_QUINDECUPLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_SEXDECUPLE_ASSEMBLED_GRANITE.get(), RenderType.cutout());
    }
}
