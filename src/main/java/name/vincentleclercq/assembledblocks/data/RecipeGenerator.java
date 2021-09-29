package name.vincentleclercq.assembledblocks.data;

import name.vincentleclercq.assembledblocks.AssembledBlocks;
import name.vincentleclercq.assembledblocks.data.recipes.GraniteRecipes;
import name.vincentleclercq.assembledblocks.data.recipes.StoneRecipes;
import name.vincentleclercq.assembledblocks.registration.AllRegistrations;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        // region items
        // region Elastic
        ShapedRecipeBuilder.shaped(AllRegistrations.ITEM_ELASTIC.get(), 1)
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
        StoneRecipes.registerRecipes(consumer);
        GraniteRecipes.registerRecipes(consumer);
        // endregion
    }
}
