package name.vincentleclercq.assembledblocks.data.recipes;

import net.minecraft.world.level.ItemLike;

public class BlockRecipeProperties {

    private ItemLike block;
    private String localized;

    public ItemLike getBlock() {
        return block;
    }

    public BlockRecipeProperties setBlock(ItemLike block) {
        this.block = block;
        return this;
    }

    public String getLocalized() {
        return localized;
    }

    public BlockRecipeProperties setLocalized(String localized) {
        this.localized = localized;
        return this;
    }
}
