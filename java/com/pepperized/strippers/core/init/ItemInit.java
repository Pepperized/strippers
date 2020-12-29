package com.pepperized.strippers.core.init;

import com.pepperized.strippers.Strippers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Strippers.MOD_ID);

    public static final RegistryObject<Item> CHARCOAL_SHARDS = ITEMS.register("charcoal_shards", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
}
