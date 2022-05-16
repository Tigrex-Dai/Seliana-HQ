package com.example.testmod.datagen;

import com.example.testmod.TestMod;
import com.example.testmod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockStates extends BlockStateProvider {

    public  TutBlockStates(DataGenerator gen, ExistingFileHelper helper){ super(gen, TestMod.MODID, helper); }

    @Override
    protected void registerStatesAndModels(){
        simpleBlock(Registration.TigCry_BLOCK.get());
    }

}
