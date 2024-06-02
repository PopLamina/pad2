package cyou.poplamina.pad2.core.init;

import cyou.poplamina.pad2.pad2;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(pad2.MODID);

    public static final DeferredItem<Item> POPLAMINA = ITEMS.register("poplamina", () -> new Item(new Item.Properties()));
}
