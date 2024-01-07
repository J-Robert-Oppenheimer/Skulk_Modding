package net.mymil.skulkhorrormod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.mymil.skulkhorrormod.SkulkHorrorMod;
import net.mymil.skulkhorrormod.item.Moditems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SkulkHorrorMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleitem(Moditems.SILENT_STEEL);
        simpleitem(Moditems.RAW_SILENT_STEEL);
        simpleitem(Moditems.DARKPORTALKEY);

    }
    private ItemModelBuilder simpleitem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
            new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SkulkHorrorMod.MODID, "item/" + item.getId().getPath()));
    }
}
