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
    public static final BlockBehaviour.Properties ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    public static final RegistryObject<Block> XXXXXXX = BLOCKS.register("xxxxxxx", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> XXXXXXX_ITEM = fromBlock(XXXXXXX);

    public static final RegistryObject<Item> RAW_XXXXXXX_CHUNK = ITEMS.register("raw_xxxxxxx_chunk", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> XXXXXXX_INGOT = ITEMS.register("xxxxxxx_ingot", () -> new Item(ITEM_PROPERTIES));

    public static final Tags.IOptionalNamedTag<Block> XXXXXXX_ORES = BlockTags.createOptional(new ResourceLocation(TestMod.MODID, "xxxxxxx_ore"));
    public static final Tags.IOptionalNamedTag<Item> XXXXXXX_ITEMS = ItemTags.createOptional(new ResourceLocation(TestMod.MODID, "xxxxxxx_ore"));

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block){
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
