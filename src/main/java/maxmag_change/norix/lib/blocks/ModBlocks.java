package maxmag_change.norix.lib.blocks;

import maxmag_change.norix.lib.Norixlib;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static Block registerBlockOnly(String name, Block block){
        return Registry.register(Registries.BLOCK,new Identifier(Norixlib.MOD_ID, name),block);
    }

    public static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(Norixlib.MOD_ID, name),block);
    }

    public static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(Norixlib.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
    }
}
