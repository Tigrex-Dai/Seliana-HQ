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
        add(Registration.TigCry_BLOCK_DEEP.get(), "深层轰鸣矿晶");
        add(Registration.TigCry_SHARD.get(), "轰鸣碎晶");
        add(Registration.TigCry_CRYSTAL.get(), "轰鸣晶石");
        add(Registration.MizCry_BLOCK.get(), "湍流矿晶");
        add(Registration.MizCry_BLOCK_DEEP.get(), "深层湍流矿晶");
        add(Registration.MizCry_SHARD.get(), "湍流碎晶");
        add(Registration.MizCry_CRYSTAL.get(), "湍流晶石");
        add(Registration.ZinCry_BLOCK.get(), "闪雷矿晶");
        add(Registration.ZinCry_BLOCK_DEEP.get(), "深层闪雷矿晶");
        add(Registration.ZinCry_SHARD.get(), "闪雷碎晶");
        add(Registration.ZinCry_CRYSTAL.get(), "闪雷晶石");
        add(Registration.KusCry_BLOCK.get(), "暴风矿晶");
        add(Registration.KusCry_BLOCK_DEEP.get(), "深层暴风矿晶");
        add(Registration.KusCry_SHARD.get(), "暴风碎晶");
        add(Registration.KusCry_CRYSTAL.get(), "暴风晶石");
        add(Registration.PukCry_BLOCK.get(), "狡毒矿晶");
        add(Registration.PukCry_BLOCK_DEEP.get(), "深层狡毒矿晶");
        add(Registration.PukCry_SHARD.get(), "狡毒碎晶");
        add(Registration.PukCry_CRYSTAL.get(), "狡毒晶石");
    }

}
