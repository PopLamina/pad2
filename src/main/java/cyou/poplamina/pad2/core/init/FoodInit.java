package cyou.poplamina.pad2.core.init;

import net.minecraft.world.food.FoodProperties;

public class FoodInit {
    public static final FoodProperties EDIBLE_POPLAMINA = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(6)
            .build();
}
