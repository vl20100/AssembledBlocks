package name.vincentleclercq.assembledblocks.data.recipes;

import name.vincentleclercq.assembledblocks.registration.AllRegistrations;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.function.Consumer;

public class GraniteRecipes {

    public static void registerRecipes(Consumer<FinishedRecipe> consumer)
    {
        ArrayList<BlockRecipeProperties> blocks = new ArrayList<>();

        blocks.add((new BlockRecipeProperties()).setBlock(Blocks.GRANITE).setLocalized("stone"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_ASSEMBLED_GRANITE.get()).setLocalized("assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_DOUBLE_ASSEMBLED_GRANITE.get()).setLocalized("double_assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_TRIPLE_ASSEMBLED_GRANITE.get()).setLocalized("triple_assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_QUADRUPLE_ASSEMBLED_GRANITE.get()).setLocalized("quadruple_assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_QUINTUPLE_ASSEMBLED_GRANITE.get()).setLocalized("quintuple_assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_SEXTUPLE_ASSEMBLED_GRANITE.get()).setLocalized("sextuple_assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_SEPTUPLE_ASSEMBLED_GRANITE.get()).setLocalized("septuple_assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_OCTUPLE_ASSEMBLED_GRANITE.get()).setLocalized("octuple_assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_NONUPLE_ASSEMBLED_GRANITE.get()).setLocalized("nonuple_assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_DECUPLE_ASSEMBLED_GRANITE.get()).setLocalized("decuple_assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_UNDECUPLE_ASSEMBLED_GRANITE.get()).setLocalized("undecuple_assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_DUODECUPLE_ASSEMBLED_GRANITE.get()).setLocalized("duodecuple_assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_TREDECUPLE_ASSEMBLED_GRANITE.get()).setLocalized("tredecuple_assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_QUATUORDECUPLE_ASSEMBLED_GRANITE.get()).setLocalized("quatuordecuple_assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_QUINDECUPLE_ASSEMBLED_GRANITE.get()).setLocalized("quindecuple_assembled_granite"));
        blocks.add((new BlockRecipeProperties()).setBlock(AllRegistrations.BLOCK_SEXDECUPLE_ASSEMBLED_GRANITE.get()).setLocalized("sexdecuple_assembled_granite"));

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
