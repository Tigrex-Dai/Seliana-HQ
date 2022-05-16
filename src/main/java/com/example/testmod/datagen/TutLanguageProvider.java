package com.example.testmod.datagen;

import com.example.testmod.TestMod;
import com.example.testmod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.example.testmod.setup.ModSetup.TAB_NAME;

public class TutLanguageProvider extends LanguageProvider {

    public TutLanguageProvider(DataGenerator gen, String locale) {
        super(gen, TestMod.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "TestItemGroup");
        add(Registration.TigCry_BLOCK.get(), "轰鸣矿晶");
        add(Registration.TigCry_SHARD.get(), "轰鸣碎晶");
        add(Registration.TigCry_CRYSTAL.get(), "轰鸣晶石");
    }

}
