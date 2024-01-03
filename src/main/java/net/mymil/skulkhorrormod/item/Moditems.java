package net.mymil.skulkhorrormod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mymil.skulkhorrormod.SkulkHorrorMod;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SkulkHorrorMod.MODID);
    public static final RegistryObject<Item> DARKPORTALKEY = ITEMS.register("darkportalkey",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILENT_STEEL = ITEMS.register("raw_silent_steel",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILENT_STEEL = ITEMS.register("silent_steel",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
