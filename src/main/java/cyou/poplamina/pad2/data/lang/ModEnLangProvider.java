package cyou.poplamina.pad2.data.lang;

import cyou.poplamina.pad2.core.init.ItemInit;
import cyou.poplamina.pad2.pad2;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnLangProvider extends LanguageProvider {
    public ModEnLangProvider(PackOutput output) {
        super(output, pad2.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addItem(ItemInit.POPLAMINA, "Poplamina");
    }
}
