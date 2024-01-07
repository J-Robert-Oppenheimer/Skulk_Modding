package net.mymil.skulkhorrormod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mymil.skulkhorrormod.SkulkHorrorMod;
import net.mymil.skulkhorrormod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SkulkHorrorMod.MODID);
    public static final RegistryObject<CreativeModeTab> SKULK_DIMENSION_TAB = CREATIVE_MODE_TABS.register("skulk_dimension_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.SILENT_STEEL.get()))
                    .title(Component.translatable("creativetab.skulk_dimension_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.DARKPORTALKEY.get());
                        pOutput.accept(Moditems.SILENT_STEEL.get());
                        pOutput.accept(Moditems.RAW_SILENT_STEEL.get());
                        pOutput.accept(ModBlocks.ASH_BLOCK.get());
                        pOutput.accept(ModBlocks.VOIDSTONE.get());
                        pOutput.accept(ModBlocks.SILENT_STEEL_ORE.get());
                        pOutput.accept(ModBlocks.MOD_TELEPORTER.get());

                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);

    }
}
