package com.example.testmod.datagen;

import com.example.testmod.TestMod;
import com.example.testmod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockTags extends BlockTagsProvider {

    public TutBlockTags(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, TestMod.MODID, helper);
    }

    @Override
    protected void addTags() {

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.TigCry_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.TigCry_BLOCK.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.TigCry_BLOCK.get());
        tag(Registration.TigCrystal)
                .add(Registration.TigCry_BLOCK.get());
    }

    @Override
    public String getName() {
        return "Test Tags";
    }

}
