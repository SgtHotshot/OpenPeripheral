package ic2.api.recipe;

import java.util.Map;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Recipe manager interface for basic machines.
 * 
 * @author RichardG, Player
 */
public interface IMachineRecipeManager {
	/**
	 * Adds a recipe to the machine.
	 * 
	 * @param input Recipe input
	 * @param metadata meta data for additional recipe properties, may be null
	 * @param outputs Recipe outputs, zero or more depending on the machine
	 */
	public void addRecipe(IRecipeInput input, NBTTagCompound metadata, ItemStack... outputs);

	/**
	 * Gets the recipe output for the given input.
	 * 
	 * @param input Recipe input
	 * @return Recipe output, or null if none
	 */
	public RecipeOutput getOutputFor(ItemStack input, boolean adjustInput);

	/**
	 * Gets a list of recipes.
	 * 
	 * You're a mad evil scientist if you ever modify this.
	 * 
	 * @return List of recipes
	 */
	public Map<IRecipeInput, RecipeOutput> getRecipes();
}
