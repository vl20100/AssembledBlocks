package name.vincentleclercq.assembledblocks.data.recipes;

import name.vincentleclercq.assembledblocks.registration.AllRegistrations;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.function.Consumer;

public class StoneRecipes {

    public static void registerRecipes(Consumer<FinishedRecipe> consumer)
    {
        ArrayList<BlockRecipeProperties> blocks = new ArrayList<>();

        blocks.add((new BlockRecipeProperties()).setBlock(Blocks.STONE).setLocalized("stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_ASSEMBLED_STONE.get()).setLocalized("assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_DOUBLE_ASSEMBLED_STONE.get()).setLocalized("double_assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_TRIPLE_ASSEMBLED_STONE.get()).setLocalized("triple_assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_QUADRUPLE_ASSEMBLED_STONE.get()).setLocalized("quadruple_assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_QUINTUPLE_ASSEMBLED_STONE.get()).setLocalized("quintuple_assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_SEXTUPLE_ASSEMBLED_STONE.get()).setLocalized("sextuple_assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_SEPTUPLE_ASSEMBLED_STONE.get()).setLocalized("septuple_assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_OCTUPLE_ASSEMBLED_STONE.get()).setLocalized("octuple_assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_NONUPLE_ASSEMBLED_STONE.get()).setLocalized("nonuple_assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_DECUPLE_ASSEMBLED_STONE.get()).setLocalized("decuple_assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_UNDECUPLE_ASSEMBLED_STONE.get()).setLocalized("undecuple_assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_DUODECUPLE_ASSEMBLED_STONE.get()).setLocalized("duodecuple_assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_TREDECUPLE_ASSEMBLED_STONE.get()).setLocalized("tredecuple_assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_QUATUORDECUPLE_ASSEMBLED_STONE.get()).setLocalized("quatuordecuple_assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_QUINDECUPLE_ASSEMBLED_STONE.get()).setLocalized("quindecuple_assembled_stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_SEXDECUPLE_ASSEMBLED_STONE.get()).setLocalized("sexdecuple_assembled_stone"));

        BlockRecipeProperties blockMinus;
        BlockRecipeProperties currentBlock;

        for(int i = 1; i < blocks.size(); i++)
        {
            blockMinus = blocks.get(i - 1);
            currentBlock = blocks.get(i);
            AssemblyRecipes.registerAssembly(consumer, blockMinus.getBlock(), currentBlock.getBlock(), currentBlock.getLocalized());
            AssemblyRecipes.registerDisassembly(consumer, currentBlock.getBlock(), blockMinus.getBlock(), currentBlock.getLocalized(), blockMinus.getLocalized());
        }
    }
}
