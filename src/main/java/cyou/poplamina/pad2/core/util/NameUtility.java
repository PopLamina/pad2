package cyou.poplamina.pad2.core.util;

import cyou.poplamina.pad2.pad2;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class NameUtility {
    public static String getItemName(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).toString().replace(pad2.MODID + ":", "" );
    }
}
