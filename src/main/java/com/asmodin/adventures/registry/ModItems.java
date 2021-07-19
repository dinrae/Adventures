package com.asmodin.adventures.registry;

import com.asmodin.adventures.Adventures;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // BLOCK ITEMS
    public static final BlockItem STONE_BRICKS_WEAVER = new BlockItem(ModBlocks.STONE_BRICKS_WEAVER, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));


    //ITEMS


    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier(Adventures.MOD_ID, "stone_bricks_weaver"), STONE_BRICKS_WEAVER);
    }
}
