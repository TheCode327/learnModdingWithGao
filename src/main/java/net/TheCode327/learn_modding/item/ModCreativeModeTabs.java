package net.TheCode327.learn_modding.item;

import net.TheCode327.learn_modding.learnToMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, learnToMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COD_STUFF = CREATIVE_MODE_TABS.register("cod_stuff",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MiniCode.get()))
                    .title(Component.translatable("creativetab.cod_stuff"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ChoateDiploma.get());
                        pOutput.accept(ModItems.Danny.get());
                        pOutput.accept(ModItems.MiniCode.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
