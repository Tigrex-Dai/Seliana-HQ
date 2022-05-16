package com.example.testmod.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {

    public static final String TAB_NAME = "testmod";

    public static final CreativeModeTab TESTMOD_ITEMGROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public ItemStack makeIcon() { return new ItemStack(Items.NETHERITE_INGOT); }
    };

    public static void init(FMLCommonSetupEvent event){

    }
}
