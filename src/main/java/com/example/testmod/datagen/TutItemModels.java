package com.example.testmod.datagen;

import com.example.testmod.TestMod;
import com.example.testmod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutItemModels extends ItemModelProvider {

    public  TutItemModels(DataGenerator gen, ExistingFileHelper helper){ super(gen, TestMod.MODID, helper); }

    @Override
    protected void registerModels(){
        // modloc : ResourceLocation rl = new ResourceLocation(TestMod.MODID, "block/xxxxxxx");

        withExistingParent(Registration.TigCry_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/fulmen_ore"));
        singleTexture(Registration.TigCry_SHARD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/fulmen_shard"));
        singleTexture(Registration.TigCry_CRYSTAL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/fulmen_crystal"));
    }

}
