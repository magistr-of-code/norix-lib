package maxmag_change.norix.lib.enchantment;


import maxmag_change.norix.lib.Norixlib;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    public static Enchantment register(String name, Enchantment enchantment){
        return Registry.register(Registries.ENCHANTMENT, new Identifier(Norixlib.MOD_ID,name),enchantment);
    }
}
