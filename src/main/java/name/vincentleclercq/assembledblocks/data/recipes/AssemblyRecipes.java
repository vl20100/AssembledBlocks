package name.vincentleclercq.assembledblocks.data.recipes;

import name.vincentleclercq.assembledblocks.AssembledBlocks;
import name.vincentleclercq.assembledblocks.registration.AllRegistrations;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.function.Consumer;

public class AssemblyRecipes {

    public static void registerAssembly(Consumer<FinishedRecipe> consumer, ItemLike sourceBlock, ItemLike finalBlock, String localizedName) {
        ShapedRecipeBuilder.shaped(finalBlock, 1)
                .define('e', AllRegistrations.ITEM_ELASTIC.get())
                .define('s', sourceBlock)
                .pattern("sss")
                .pattern("ses")
                .pattern("sss")
                .group("block_" + localizedName)
                .unlockedBy("unlock", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(AllRegistrations.ITEM_ELASTIC.get()).of(sourceBlock).build()))
                .save(consumer, new ResourceLocation(AssembledBlocks.MODID, localizedName));
    }

    public static void registerDisassembly(Consumer<FinishedRecipe> consumer, ItemLike sourceBlock, ItemLike finalBlock, String sourceLocalizedName, String finalLocalizedName)
    {
        ShapelessRecipeBuilder.shapeless(finalBlock, 8)
                .requires(sourceBlock)
                .group("block_" + finalLocalizedName)
                .unlockedBy("unlock", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(AllRegistrations.BLOCK_DUODECUPLE_ASSEMBLED_STONE.get()).build()))
                .save(consumer, new ResourceLocation(AssembledBlocks.MODID, "dis_" + sourceLocalizedName));
    }
}
