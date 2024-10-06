package net.monkeychex3.arsilent_gear.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.monkeychex3.arsilent_gear.ArsilentGear;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArsilentGear.MOD_ID);

    public static final RegistryObject<Item> BLAZE_FIBER = ITEMS.register("blaze_fiber",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> END_FIBER = ITEMS.register("end_fiber",
            () -> new Item(new Item.Properties())
    );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
