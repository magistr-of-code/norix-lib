package maxmag_change.norix.lib.items;

import maxmag_change.norix.lib.Norixlib;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Norixlib.MOD_ID, name), item);
    }
}
