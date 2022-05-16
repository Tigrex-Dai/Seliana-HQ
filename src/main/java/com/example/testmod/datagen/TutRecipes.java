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
    }

}
