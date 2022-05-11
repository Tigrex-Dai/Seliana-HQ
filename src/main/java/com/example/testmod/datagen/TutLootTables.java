package com.example.testmod.datagen;

import com.example.testmod.setup.Registration;
import net.minecraft.data.DataGenerator;
public class TutLootTables extends BaseLootTableProvider{

    public TutLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {

        lootTables.put(Registration.XXXXXXX.get(), createSilkTouchTable("xxxxxxx", Registration.XXXXXXX.get(), Registration.RAW_XXXXXXX_CHUNK.get(), 1, 3));
    }

}
