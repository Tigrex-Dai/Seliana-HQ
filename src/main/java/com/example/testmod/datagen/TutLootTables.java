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
    }

}
