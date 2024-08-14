package net.TheCode327.learn_modding.item;

import net.TheCode327.learn_modding.learnToMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, learnToMod.MOD_ID);

    public static final RegistryObject<Item> ChoateDiploma = ITEMS.register("choate_diploma",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Danny = ITEMS.register("danny",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MiniCode = ITEMS.register("mini_code",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SoAnywayIStartedBlasting = ITEMS.register("so_anyway_i_started_blasting",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
