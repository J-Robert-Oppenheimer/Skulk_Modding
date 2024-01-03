package net.mymil.skulkhorrormod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mymil.skulkhorrormod.SkulkHorrorMod;
import net.mymil.skulkhorrormod.item.Moditems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SkulkHorrorMod.MODID);

    public static final RegistryObject<Block> ASH_BLOCK = registerBlock("ash_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> VOIDSTONE = registerBlock("voidstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
    public static final RegistryObject<Block> SILENT_STEEL_ORE = registerBlock("silent_steel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).requiresCorrectToolForDrops(), UniformInt.of(7,10)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
//hello
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return Moditems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));

    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
