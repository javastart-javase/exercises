package main.pl.pawtel.drinks;

public class Ingredient {

    private String ingredientName;
    private int volume;

    public Ingredient(String ingredientName, int volume) {
        this.ingredientName = ingredientName;
        this.volume = volume;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientName='" + ingredientName + '\'' +
                ", volume=" + volume +
                '}';
    }
}
