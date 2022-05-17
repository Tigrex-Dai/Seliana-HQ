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
    public static final RegistryObject<Block> TigCry_BLOCK_DEEP = BLOCKS.register("deepslate_fulmen_ore", () -> new Block(OVERWORLD_ORE_PROPERTIES));
    public static final RegistryObject<Item> TigCry_BLOCK_DEEP_ITEM = fromBlock(TigCry_BLOCK_DEEP);
    
    public static final RegistryObject<Block> MizCry_BLOCK = BLOCKS.register("turbul_ore", () -> new Block(OVERWORLD_ORE_PROPERTIES));
    public static final RegistryObject<Item> MizCry_BLOCK_ITEM = fromBlock(MizCry_BLOCK);
    public static final RegistryObject<Block> MizCry_BLOCK_DEEP = BLOCKS.register("deepslate_turbul_ore", () -> new Block(OVERWORLD_ORE_PROPERTIES));
    public static final RegistryObject<Item> MizCry_BLOCK_DEEP_ITEM = fromBlock(MizCry_BLOCK_DEEP);
    
    public static final RegistryObject<Block> ZinCry_BLOCK = BLOCKS.register("thunde_ore", () -> new Block(OVERWORLD_ORE_PROPERTIES));
    public static final RegistryObject<Item> ZinCry_BLOCK_ITEM = fromBlock(ZinCry_BLOCK);
    public static final RegistryObject<Block> ZinCry_BLOCK_DEEP = BLOCKS.register("deepslate_thunde_ore", () -> new Block(OVERWORLD_ORE_PROPERTIES));
    public static final RegistryObject<Item> ZinCry_BLOCK_DEEP_ITEM = fromBlock(ZinCry_BLOCK_DEEP);
    
    public static final RegistryObject<Block> KusCry_BLOCK = BLOCKS.register("zephyr_ore", () -> new Block(OVERWORLD_ORE_PROPERTIES));
    public static final RegistryObject<Item> KusCry_BLOCK_ITEM = fromBlock(KusCry_BLOCK);
    public static final RegistryObject<Block> KusCry_BLOCK_DEEP = BLOCKS.register("deepslate_zephyr_ore", () -> new Block(OVERWORLD_ORE_PROPERTIES));
    public static final RegistryObject<Item> KusCry_BLOCK_DEEP_ITEM = fromBlock(KusCry_BLOCK_DEEP);
    
    public static final RegistryObject<Block> PukCry_BLOCK = BLOCKS.register("tricky_ore", () -> new Block(OVERWORLD_ORE_PROPERTIES));
    public static final RegistryObject<Item> PukCry_BLOCK_ITEM = fromBlock(PukCry_BLOCK);
    public static final RegistryObject<Block> PukCry_BLOCK_DEEP = BLOCKS.register("deepslate_tricky_ore", () -> new Block(OVERWORLD_ORE_PROPERTIES));
    public static final RegistryObject<Item> PukCry_BLOCK_DEEP_ITEM = fromBlock(PukCry_BLOCK_DEEP);

    public static final RegistryObject<Item> TigCry_SHARD = ITEMS.register("fulmen_shard", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> TigCry_CRYSTAL = ITEMS.register("fulmen_crystal", () -> new Item(ITEM_PROPERTIES));

    public static final RegistryObject<Item> MizCry_SHARD = ITEMS.register("turbul_shard", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> MizCry_CRYSTAL = ITEMS.register("turbul_crystal", () -> new Item(ITEM_PROPERTIES));

    public static final RegistryObject<Item> ZinCry_SHARD = ITEMS.register("thunde_shard", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ZinCry_CRYSTAL = ITEMS.register("thunde_crystal", () -> new Item(ITEM_PROPERTIES));

    public static final RegistryObject<Item> KusCry_SHARD = ITEMS.register("zephyr_shard", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> KusCry_CRYSTAL = ITEMS.register("zephyr_crystal", () -> new Item(ITEM_PROPERTIES));

    public static final RegistryObject<Item> PukCry_SHARD = ITEMS.register("tricky_shard", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PukCry_CRYSTAL = ITEMS.register("tricky_crystal", () -> new Item(ITEM_PROPERTIES));

    public static final Tags.IOptionalNamedTag<Block> TigCrystal = BlockTags.createOptional(new ResourceLocation(TestMod.MODID, "fulmen_ore"));
    public static final Tags.IOptionalNamedTag<Item> TigCrystal_ITEMS = ItemTags.createOptional(new ResourceLocation(TestMod.MODID, "fulmen_ore"));

    public static final Tags.IOptionalNamedTag<Block> MizCrystal = BlockTags.createOptional(new ResourceLocation(TestMod.MODID, "turbul_ore"));
    public static final Tags.IOptionalNamedTag<Item> MizCrystal_ITEMS = ItemTags.createOptional(new ResourceLocation(TestMod.MODID, "turbul_ore"));

    public static final Tags.IOptionalNamedTag<Block> ZinCrystal = BlockTags.createOptional(new ResourceLocation(TestMod.MODID, "thunde_ore"));
    public static final Tags.IOptionalNamedTag<Item> ZinCrystal_ITEMS = ItemTags.createOptional(new ResourceLocation(TestMod.MODID, "thunde_ore"));

    public static final Tags.IOptionalNamedTag<Block> KusCrystal = BlockTags.createOptional(new ResourceLocation(TestMod.MODID, "zephyr_ore"));
    public static final Tags.IOptionalNamedTag<Item> KusCrystal_ITEMS = ItemTags.createOptional(new ResourceLocation(TestMod.MODID, "zephyr_ore"));

    public static final Tags.IOptionalNamedTag<Block> PukCrystal = BlockTags.createOptional(new ResourceLocation(TestMod.MODID, "tricky_ore"));
    public static final Tags.IOptionalNamedTag<Item> PukCrystal_ITEMS = ItemTags.createOptional(new ResourceLocation(TestMod.MODID, "tricky_ore"));

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block){
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
