package net.mattmolten.cybernetic_enhancements.item;

import net.mattmolten.cybernetic_enhancements.CyberneticEnhancements;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final
    DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CyberneticEnhancements.MOD_ID);
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CYBERNETIC_ENHANCEMENTS_TAB)));
    public static final RegistryObject<Item> NIGHT_VISION_LENS = ITEMS.register("night_vision_lens",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CYBERNETIC_ENHANCEMENTS_TAB)
                    .stacksTo(1)));
    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
