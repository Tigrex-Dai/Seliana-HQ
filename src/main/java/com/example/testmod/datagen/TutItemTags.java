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
                .add(Registration.TigCry_BLOCK_ITEM.get())
                .add(Registration.TigCry_BLOCK_DEEP_ITEM.get())
                .add(Registration.MizCry_BLOCK_ITEM.get())
                .add(Registration.MizCry_BLOCK_DEEP_ITEM.get())
                .add(Registration.ZinCry_BLOCK_ITEM.get())
                .add(Registration.ZinCry_BLOCK_DEEP_ITEM.get())
                .add(Registration.KusCry_BLOCK_ITEM.get())
                .add(Registration.KusCry_BLOCK_DEEP_ITEM.get())
                .add(Registration.PukCry_BLOCK_ITEM.get())
                .add(Registration.PukCry_BLOCK_DEEP_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(Registration.TigCry_CRYSTAL.get())
                .add(Registration.MizCry_CRYSTAL.get())
                .add(Registration.ZinCry_CRYSTAL.get())
                .add(Registration.KusCry_CRYSTAL.get())
                .add(Registration.PukCry_CRYSTAL.get());
        tag(Registration.TigCrystal_ITEMS)
                .add(Registration.TigCry_BLOCK_ITEM.get())
                .add(Registration.TigCry_BLOCK_DEEP_ITEM.get());
        tag(Registration.MizCrystal_ITEMS)
                .add(Registration.MizCry_BLOCK_ITEM.get())
                .add(Registration.MizCry_BLOCK_DEEP_ITEM.get());
        tag(Registration.ZinCrystal_ITEMS)
                .add(Registration.ZinCry_BLOCK_ITEM.get())
                .add(Registration.ZinCry_BLOCK_DEEP_ITEM.get());
        tag(Registration.KusCrystal_ITEMS)
                .add(Registration.KusCry_BLOCK_ITEM.get())
                .add(Registration.KusCry_BLOCK_DEEP_ITEM.get());
        tag(Registration.PukCrystal_ITEMS)
                .add(Registration.PukCry_BLOCK_ITEM.get())
                .add(Registration.PukCry_BLOCK_DEEP_ITEM.get());
    }

    @Override
    public String getName() {
        return "Test Tags";
    }

}
