package cyou.poplamina.pad2.data;

import cyou.poplamina.pad2.data.lang.ModEnLangProvider;
import cyou.poplamina.pad2.data.recipe.MainModRecipeProvider;
import cyou.poplamina.pad2.data.texture.ModBlockStateProvider;
import cyou.poplamina.pad2.data.texture.ModItemStateProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class DataGenerator {
    public static void gatherData(GatherDataEvent event) {
        try {
            net.minecraft.data.DataGenerator generator = event.getGenerator();
            PackOutput output = event.getGenerator().getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

            generator.addProvider(true, new ModEnLangProvider(output));
            generator.addProvider(true, new ModItemStateProvider(output, existingFileHelper));
            generator.addProvider(true, new ModBlockStateProvider(output, existingFileHelper));
            generator.addProvider(true, new MainModRecipeProvider(generator));
        //} catch (RuntimeException e) {
        //    pad2.logger.error("Failed to generate data", e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
