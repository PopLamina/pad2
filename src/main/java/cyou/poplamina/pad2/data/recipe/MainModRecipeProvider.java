package cyou.poplamina.pad2.data.recipe;

import cyou.poplamina.pad2.data.recipe.provider.FurnaceRecipeProvider;
import cyou.poplamina.pad2.pad2;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;

import java.util.concurrent.CompletableFuture;

public class MainModRecipeProvider extends RecipeProvider {
    protected final DataGenerator generator;

    private final CompletableFuture<HolderLookup.Provider> lookupProvider;

    public MainModRecipeProvider(DataGenerator generator, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(generator.getPackOutput(), lookupProvider);
        this.generator = generator;
        this.lookupProvider = lookupProvider;
    }


    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //new NormalCraftingTableRecipeProvider(generator, recipeOutput).build();
        new FurnaceRecipeProvider(generator, recipeOutput).build();
    }

    public ResourceLocation getModId(String path) {
        return new ResourceLocation(pad2.MODID, path);
    }
}
