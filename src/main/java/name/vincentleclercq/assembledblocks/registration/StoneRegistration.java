package name.vincentleclercq.assembledblocks.registration;

import name.vincentleclercq.assembledblocks.blocks.stone_1_0.*;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.client.ForgeRenderTypes;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class StoneRegistration {
    private static float stoneDestroyTime = 1.5F;
    private static float stoneExplosionResistance = 6.0F;
    private static CreativeModeTab tab = CreativeModeTab.TAB_BUILDING_BLOCKS;

    public static RegistryObject<Block> registerAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 2;
        return blockDeferredRegister.register("1_0_stone/assembled_stone", () -> new AssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerDoubleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 4;
        return blockDeferredRegister.register("1_0_stone/double_assembled_stone", () -> new DoubleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerDoubleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/double_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerTripleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 8;
        return blockDeferredRegister.register("1_0_stone/triple_assembled_stone", () -> new TripleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerTripleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/triple_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerQuadrupleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 16;
        return blockDeferredRegister.register("1_0_stone/quadruple_assembled_stone", () -> new QuadrupleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerQuadrupleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/quadruple_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerQuintupleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 32;
        return blockDeferredRegister.register("1_0_stone/quintuple_assembled_stone", () -> new QintupleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerQuintupleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/quintuple_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerSextupleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 64;
        return blockDeferredRegister.register("1_0_stone/sextuple_assembled_stone", () -> new SextupleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerSextupleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/sextuple_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerSeptupleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 128;
        return blockDeferredRegister.register("1_0_stone/septuple_assembled_stone", () -> new SeptupleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerSeptupleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/septuple_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerOctupleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 256;
        return blockDeferredRegister.register("1_0_stone/octuple_assembled_stone", () -> new OctupleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerOctupleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/octuple_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerNonupleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 512;
        return blockDeferredRegister.register("1_0_stone/nonuple_assembled_stone", () -> new NonupleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerNonupleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/nonuple_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerDecupleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 1024;
        return blockDeferredRegister.register("1_0_stone/decuple_assembled_stone", () -> new DecupleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerDecupleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/decuple_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerUndecupleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 2048;
        return blockDeferredRegister.register("1_0_stone/undecuple_assembled_stone", () -> new UndecupleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerUndecupleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/undecuple_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerDuodecupleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 4096;
        return blockDeferredRegister.register("1_0_stone/duodecuple_assembled_stone", () -> new DuodecupleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerDuodecupleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/duodecuple_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerTredecupleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 8192;
        return blockDeferredRegister.register("1_0_stone/tredecuple_assembled_stone", () -> new TredecupleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerTredecupleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/tredecuple_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerQuatuordecupleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 16384;
        return blockDeferredRegister.register("1_0_stone/quatuordecuple_assembled_stone", () -> new QuatuordecupleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerQuatuordecupleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/quatuordecuple_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerQuindecupleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 32768;
        return blockDeferredRegister.register("1_0_stone/quindecuple_assembled_stone", () -> new QintupleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerQuindecupleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/quindecuple_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static RegistryObject<Block> registerSexdecupleAssembledStoneBlock(DeferredRegister<Block> blockDeferredRegister)
    {
        int stoneMultiplicator = 65536;
        return blockDeferredRegister.register("1_0_stone/sexdecuple_assembled_stone", () -> new SexdecupleAssembledStone(BlockBehaviour.Properties
                .of(Material.STONE, MaterialColor.STONE)
                .strength(stoneDestroyTime * stoneMultiplicator, stoneExplosionResistance * stoneMultiplicator)));
    }

    public static RegistryObject<Item> registerSexdecupleAssembledStoneBlockItem(DeferredRegister<Item> itemDeferredRegister, RegistryObject<Block> reference)
    {
        return itemDeferredRegister.register("1_0_stone/sexdecuple_assembled_stone", () -> new BlockItem(reference.get(), new Item.Properties().tab(tab)));
    }

    public static void setRenderLayer()
    {
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_DOUBLE_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_TRIPLE_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_QUADRUPLE_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_QUINTUPLE_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_SEXTUPLE_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_SEPTUPLE_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_OCTUPLE_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_NONUPLE_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_DECUPLE_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_UNDECUPLE_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_DUODECUPLE_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_TREDECUPLE_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_QUATUORDECUPLE_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_QUINDECUPLE_ASSEMBLED_STONE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(AllRegistrations.BLOCK_SEXDECUPLE_ASSEMBLED_STONE.get(), RenderType.cutout());
    }
}
