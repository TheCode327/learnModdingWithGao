package net.TheCode327.learn_modding.block;

import net.TheCode327.learn_modding.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.TheCode327.learn_modding.learnToMod;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;
import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> Blocks =
            DeferredRegister.create(ForgeRegistries.BLOCKS, learnToMod.MOD_ID);

    public static final RegistryObject<Block> THE_BLOCK = registerBlock("the_block",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = Blocks.register(name, block);
        registerBlockItem(name,toReturn);
        return toReturn;

    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        Blocks.register(eventBus);
    }
}
