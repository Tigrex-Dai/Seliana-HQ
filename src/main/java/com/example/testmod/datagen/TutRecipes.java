package com.example.testmod.datagen;

import com.example.testmod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class TutRecipes extends RecipeProvider {

    public TutRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.TigCrystal_ITEMS),
                        Registration.TigCry_CRYSTAL.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.TigCrystal_ITEMS))
                .save(consumer, "fulmen_crystal1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.TigCry_SHARD.get()),
                        Registration.TigCry_CRYSTAL.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.TigCry_SHARD.get()))
                .save(consumer, "fulmen_crystal2");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.MizCrystal_ITEMS),
                        Registration.MizCry_CRYSTAL.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.MizCrystal_ITEMS))
                .save(consumer, "turbul_crystal1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.MizCry_SHARD.get()),
                        Registration.MizCry_CRYSTAL.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.MizCry_SHARD.get()))
                .save(consumer, "turbul_crystal2");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.ZinCrystal_ITEMS),
                        Registration.ZinCry_CRYSTAL.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.ZinCrystal_ITEMS))
                .save(consumer, "thunde_crystal1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.ZinCry_SHARD.get()),
                        Registration.ZinCry_CRYSTAL.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.ZinCry_SHARD.get()))
                .save(consumer, "thunde_crystal2");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.KusCrystal_ITEMS),
                        Registration.KusCry_CRYSTAL.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.KusCrystal_ITEMS))
                .save(consumer, "zephyr_crystal1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.KusCry_SHARD.get()),
                        Registration.KusCry_CRYSTAL.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.KusCry_SHARD.get()))
                .save(consumer, "zephyr_crystal2");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.PukCrystal_ITEMS),
                        Registration.PukCry_CRYSTAL.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.PukCrystal_ITEMS))
                .save(consumer, "tricky_crystal1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.PukCry_SHARD.get()),
                        Registration.PukCry_CRYSTAL.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.PukCry_SHARD.get()))
                .save(consumer, "tricky_crystal2");
    }

}
