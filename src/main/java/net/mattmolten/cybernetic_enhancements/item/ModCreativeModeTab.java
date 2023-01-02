package net.mattmolten.cybernetic_enhancements.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CYBERNETIC_ENHANCEMENTS_TAB = new CreativeModeTab("Cybernetic Enhancements") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NIGHT_VISION_LENS.get());
        }
    };
}
