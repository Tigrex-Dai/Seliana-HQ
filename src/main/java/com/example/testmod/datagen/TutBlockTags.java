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
                .add(Registration.TigCry_BLOCK.get())
                .add(Registration.TigCry_BLOCK_DEEP.get())
                .add(Registration.MizCry_BLOCK.get())
                .add(Registration.MizCry_BLOCK_DEEP.get())
                .add(Registration.ZinCry_BLOCK.get())
                .add(Registration.ZinCry_BLOCK_DEEP.get())
                .add(Registration.KusCry_BLOCK.get())
                .add(Registration.KusCry_BLOCK_DEEP.get())
                .add(Registration.PukCry_BLOCK.get())
                .add(Registration.PukCry_BLOCK_DEEP.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.TigCry_BLOCK.get())
                .add(Registration.TigCry_BLOCK_DEEP.get())
                .add(Registration.MizCry_BLOCK.get())
                .add(Registration.MizCry_BLOCK_DEEP.get())
                .add(Registration.ZinCry_BLOCK.get())
                .add(Registration.ZinCry_BLOCK_DEEP.get())
                .add(Registration.KusCry_BLOCK.get())
                .add(Registration.KusCry_BLOCK_DEEP.get())
                .add(Registration.PukCry_BLOCK.get())
                .add(Registration.PukCry_BLOCK_DEEP.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.TigCry_BLOCK.get())
                .add(Registration.TigCry_BLOCK_DEEP.get())
                .add(Registration.MizCry_BLOCK.get())
                .add(Registration.MizCry_BLOCK_DEEP.get())
                .add(Registration.ZinCry_BLOCK.get())
                .add(Registration.ZinCry_BLOCK_DEEP.get())
                .add(Registration.KusCry_BLOCK.get())
                .add(Registration.KusCry_BLOCK_DEEP.get())
                .add(Registration.PukCry_BLOCK.get())
                .add(Registration.PukCry_BLOCK_DEEP.get());
        tag(Registration.TigCrystal)
                .add(Registration.TigCry_BLOCK.get())
                .add(Registration.TigCry_BLOCK_DEEP.get());
        tag(Registration.MizCrystal)
                .add(Registration.MizCry_BLOCK.get())
                .add(Registration.MizCry_BLOCK_DEEP.get());
        tag(Registration.ZinCrystal)
                .add(Registration.ZinCry_BLOCK.get())
                .add(Registration.ZinCry_BLOCK_DEEP.get());
        tag(Registration.KusCrystal)
                .add(Registration.KusCry_BLOCK.get())
                .add(Registration.KusCry_BLOCK_DEEP.get());
        tag(Registration.PukCrystal)
                .add(Registration.PukCry_BLOCK.get())
                .add(Registration.PukCry_BLOCK_DEEP.get());
    }

    @Override
    public String getName() {
        return "Test Tags";
    }

}
