package name.vincentleclercq.assembledblocks.data;

import name.vincentleclercq.assembledblocks.AssembledBlocks;
import name.vincentleclercq.assembledblocks.Registration;
import name.vincentleclercq.assembledblocks.items.Elastic;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        // region items
        // region Elastic
        ShapedRecipeBuilder.shaped(Registration.ITEM_ELASTIC.get(), 1)
                .define('s', Items.STRING)
                .pattern("sss")
                .pattern("s s")
                .pattern("sss")
                .group("item_elastic")
                .unlockedBy("unlock", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(Items.STRING).build()))
                .save(consumer, new ResourceLocation(AssembledBlocks.MODID, "elastic"));
        // endregion Elastic
        // endregion items

        // region blocks
        // region 1_0_stone
        ShapedRecipeBuilder.shaped(Registration.BLOCK_ASSEMBLED_STONE.get(), 1)
                .define('e', Registration.ITEM_ELASTIC.get())
                .define('s', Blocks.STONE)
                .pattern("sss")
                .pattern("ses")
                .pattern("sss")
                .group("block_assembled_stone")
                .unlockedBy("unlock", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(Registration.ITEM_ELASTIC.get()).build()))
                .save(consumer, new ResourceLocation(AssembledBlocks.MODID, "assembled_stone"));

        ShapelessRecipeBuilder.shapeless(Blocks.STONE, 8)
                .requires(Registration.BLOCK_ASSEMBLED_STONE.get())
                .group("block_stone")
                .unlockedBy("unlock", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(Registration.BLOCK_ASSEMBLED_STONE.get()).build()))
                .save(consumer, new ResourceLocation(AssembledBlocks.MODID, "dis_assembled_stone"));
        // endregion 1_0_stone
        // endregion
    }
}
