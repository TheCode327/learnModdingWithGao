package net.TheCode327.learn_modding.block;

import net.TheCode327.learn_modding.item.ModItems;
import net.TheCode327.learn_modding.learnToMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, learnToMod.MOD_ID);

    public static final RegistryObject<Block> CobbledSandstone = registerBlock("cobbled_sandstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE))); //.sound(soundType.AMYTHEST)

    public static final RegistryObject<Block> Codium = registerBlock("codium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)));

    public static final RegistryObject<Block> Daniel = registerBlock("daniel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)));
//WARPED_WART_BLOCK



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}
