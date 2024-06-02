package cyou.poplamina.pad2.data;

import cyou.poplamina.pad2.data.lang.ModEnLangProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class DataGenerator {
    public static void gatherData(GatherDataEvent event) {
        try {
            net.minecraft.data.DataGenerator generator = event.getGenerator();
            PackOutput output = event.getGenerator().getPackOutput();

            generator.addProvider(true, new ModEnLangProvider(output));

        //} catch (RuntimeException e) {
        //    pad2.logger.error("Failed to generate data", e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
