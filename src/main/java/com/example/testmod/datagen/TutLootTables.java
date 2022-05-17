package com.example.testmod.datagen;

import com.example.testmod.setup.Registration;
import net.minecraft.data.DataGenerator;
public class TutLootTables extends BaseLootTableProvider{

    public TutLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {

        lootTables.put(Registration.TigCry_BLOCK.get(), createSilkTouchTable("fulmen_ore", Registration.TigCry_BLOCK.get(), Registration.TigCry_SHARD.get(), 1, 3));
        lootTables.put(Registration.MizCry_BLOCK.get(), createSilkTouchTable("turbul_ore", Registration.MizCry_BLOCK.get(), Registration.MizCry_SHARD.get(), 1, 3));
        lootTables.put(Registration.ZinCry_BLOCK.get(), createSilkTouchTable("thunde_ore", Registration.ZinCry_BLOCK.get(), Registration.ZinCry_SHARD.get(), 1, 3));
        lootTables.put(Registration.KusCry_BLOCK.get(), createSilkTouchTable("zephyr_ore", Registration.KusCry_BLOCK.get(), Registration.KusCry_SHARD.get(), 1, 3));
        lootTables.put(Registration.PukCry_BLOCK.get(), createSilkTouchTable("tricky_ore", Registration.PukCry_BLOCK.get(), Registration.PukCry_SHARD.get(), 1, 3));
    }

}
