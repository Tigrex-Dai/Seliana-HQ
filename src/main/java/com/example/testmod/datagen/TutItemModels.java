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
        withExistingParent(Registration.TigCry_BLOCK_DEEP_ITEM.get().getRegistryName().getPath(), modLoc("block/deepslate_fulmen_ore"));
        withExistingParent(Registration.MizCry_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/turbul_ore"));
        withExistingParent(Registration.MizCry_BLOCK_DEEP_ITEM.get().getRegistryName().getPath(), modLoc("block/deepslate_turbul_ore"));
        withExistingParent(Registration.ZinCry_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/thunde_ore"));
        withExistingParent(Registration.ZinCry_BLOCK_DEEP_ITEM.get().getRegistryName().getPath(), modLoc("block/deepslate_thunde_ore"));
        withExistingParent(Registration.KusCry_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/zephyr_ore"));
        withExistingParent(Registration.KusCry_BLOCK_DEEP_ITEM.get().getRegistryName().getPath(), modLoc("block/deepslate_zephyr_ore"));
        withExistingParent(Registration.PukCry_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/tricky_ore"));
        withExistingParent(Registration.PukCry_BLOCK_DEEP_ITEM.get().getRegistryName().getPath(), modLoc("block/deepslate_tricky_ore"));
        singleTexture(Registration.TigCry_SHARD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/fulmen_shard"));
        singleTexture(Registration.TigCry_CRYSTAL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/fulmen_crystal"));
        singleTexture(Registration.MizCry_SHARD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/turbul_shard"));
        singleTexture(Registration.MizCry_CRYSTAL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/turbul_crystal"));
        singleTexture(Registration.ZinCry_SHARD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/thunde_shard"));
        singleTexture(Registration.ZinCry_CRYSTAL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/thunde_crystal"));
        singleTexture(Registration.KusCry_SHARD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/zephyr_shard"));
        singleTexture(Registration.KusCry_CRYSTAL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/zephyr_crystal"));
        singleTexture(Registration.PukCry_SHARD.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/tricky_shard"));
        singleTexture(Registration.PukCry_CRYSTAL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/tricky_crystal"));
    }

}
