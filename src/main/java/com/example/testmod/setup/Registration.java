package com.example.testmod.setup;

import com.example.testmod.TestMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.example.testmod.TestMod.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);

    }

    // properties for blocks and items
    public static final BlockBehaviour.Properties OVERWORLD_ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.TESTMOD_ITEMGROUP);

    public static final RegistryObject<Block> TigCry_BLOCK = BLOCKS.register("fulmen_ore", () -> new Block(OVERWORLD_ORE_PROPERTIES));
    public static final RegistryObject<Item> TigCry_BLOCK_ITEM = fromBlock(TigCry_BLOCK);

    public static final RegistryObject<Item> TigCry_SHARD = ITEMS.register("fulmen_shard", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> TigCry_CRYSTAL = ITEMS.register("fulmen_crystal", () -> new Item(ITEM_PROPERTIES));

    public static final Tags.IOptionalNamedTag<Block> TigCrystal = BlockTags.createOptional(new ResourceLocation(TestMod.MODID, "fulmen_ore"));
    public static final Tags.IOptionalNamedTag<Item> TigCrystal_ITEMS = ItemTags.createOptional(new ResourceLocation(TestMod.MODID, "fulmen_ore"));

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block){
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
