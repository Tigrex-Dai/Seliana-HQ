package com.example.testmod.datagen;

import com.example.testmod.TestMod;
import com.example.testmod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.loading.ModDirTransformerDiscoverer;

public class TutItemModels extends ItemModelProvider {

    public  TutItemModels(DataGenerator gen, ExistingFileHelper helper){ super(gen, TestMod.MODID, helper); }

    @Override
    protected void registerModels(){
        // modloc : ResourceLocation rl = new ResourceLocation(TestMod.MODID, "block/xxxxxxx");

        withExistingParent(Registration.XXXXXXX_ITEM.get().getRegistryName().getPath(), modLoc("block/xxxxxxx"));
        singleTexture(Registration.RAW_XXXXXXX_CHUNK.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_xxxxxxx_chunk"));
        singleTexture(Registration.XXXXXXX_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/xxxxxxx_ingot"));
    }

}
