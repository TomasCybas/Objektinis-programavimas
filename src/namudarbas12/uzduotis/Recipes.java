package namudarbas12.uzduotis;

import java.io.Serializable;
import java.util.Arrays;

public class Recipes implements Serializable {
    public Dish [] recipes;

    public Recipes() {
        this.recipes = new Dish[0];
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < this.recipes.length; i++){
            result = this.recipes[i].name;
        }
        return result;
    }

    public void addRecipe(Dish dish){
        this.recipes = Arrays.copyOf(recipes, this.recipes.length + 1);
        this.recipes[this.recipes.length - 1] = dish;
    }
}
