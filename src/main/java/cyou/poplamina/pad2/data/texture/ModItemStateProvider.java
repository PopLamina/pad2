package cyou.poplamina.pad2.data.texture;

import cyou.poplamina.pad2.core.init.ItemInit;
import cyou.poplamina.pad2.core.util.NameUtility;
import cyou.poplamina.pad2.pad2;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemStateProvider extends ItemModelProvider {

    public ModItemStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, pad2.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        item(ItemInit.POPLAMINA.get());
        item(ItemInit.EDIBLE_POPLAMINA.get());
    }

    private void item(Item item) {
        String name = NameUtility.getItemName(item);
        getBuilder(name)
                .parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", "item/" + name);
    }
}
