package net.mymil.skulkhorrormod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.mymil.skulkhorrormod.SkulkHorrorMod;
import net.mymil.skulkhorrormod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SkulkHorrorMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        BlockWithItem(ModBlocks.ASH_BLOCK);
        BlockWithItem(ModBlocks.VOIDSTONE);
        BlockWithItem(ModBlocks.SILENT_STEEL_ORE);
        BlockWithItem(ModBlocks.MOD_TELEPORTER);


    }
    private void BlockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
