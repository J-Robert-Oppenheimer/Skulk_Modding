package net.mymil.skulkhorrormod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mymil.skulkhorrormod.SkulkHorrorMod;
import net.mymil.skulkhorrormod.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SkulkHorrorMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.VOIDSTONE.get(),
                    ModBlocks.SILENT_STEEL_ORE.get());
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
             .add(ModBlocks.ASH_BLOCK.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.VOIDSTONE.get());
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.SILENT_STEEL_ORE.get());

    }
}
