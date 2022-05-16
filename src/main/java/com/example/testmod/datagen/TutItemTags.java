package com.example.testmod.datagen;

import com.example.testmod.TestMod;
import com.example.testmod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutItemTags extends ItemTagsProvider {

    public TutItemTags(DataGenerator gen, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(gen, blockTags, TestMod.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.TigCry_BLOCK_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(Registration.TigCry_CRYSTAL.get());
        tag(Registration.TigCrystal_ITEMS)
                .add(Registration.TigCry_BLOCK_ITEM.get());
    }

    @Override
    public String getName() {
        return "Test Tags";
    }

}
