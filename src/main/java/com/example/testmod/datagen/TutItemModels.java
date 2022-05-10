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
        withExistingParent(Registration.XXXXXXX_ITEM.get().getRegistryName().getPath(), modLoc("block/xxxxxxx"));
    }

}
