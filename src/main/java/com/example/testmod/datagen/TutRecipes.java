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

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.XXXXXXX_ITEMS),
                        Registration.XXXXXXX_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.XXXXXXX_ITEMS))
                .save(consumer, "xxxxxxx_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_XXXXXXX_CHUNK.get()),
                        Registration.XXXXXXX_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.RAW_XXXXXXX_CHUNK.get()))
                .save(consumer, "xxxxxxx_ingot2");
    }

}
