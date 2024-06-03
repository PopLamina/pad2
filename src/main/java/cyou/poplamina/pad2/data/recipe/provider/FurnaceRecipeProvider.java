package cyou.poplamina.pad2.data.recipe.provider;

import cyou.poplamina.pad2.core.init.ItemInit;
import cyou.poplamina.pad2.data.recipe.MainModRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

public class FurnaceRecipeProvider extends MainModRecipeProvider {
    private final RecipeOutput output;

    public FurnaceRecipeProvider(DataGenerator generator, RecipeOutput output) {
        super(generator);
        this.output = output;
    }

    public void build() {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemInit.POPLAMINA.get()), RecipeCategory.MISC, ItemInit.EDIBLE_POPLAMINA.get(), 0.6f, 300)
                .unlockedBy("has_item", has(ItemInit.POPLAMINA.get()))
                .save(output, getModId("poplamina_smelting"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ItemInit.POPLAMINA.get()), RecipeCategory.MISC, ItemInit.EDIBLE_POPLAMINA.get(), 0.3f, 300)
                .unlockedBy("has_item", has(ItemInit.POPLAMINA.get()))
                .save(output, getModId("poplamina_blasting"));
    }
}
