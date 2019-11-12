package main.pl.pawtel.drinks;

import java.util.Objects;

public class Drink {

    private Ingredient ingredientAAA;
    private Ingredient ingredientBBB;
    private Ingredient ingredientCCC;

    public Drink(Ingredient ingredientAAA, Ingredient ingredientBBB, Ingredient ingredientCCC) {
        this.ingredientAAA = ingredientAAA;
        this.ingredientBBB = ingredientBBB;
        this.ingredientCCC = ingredientCCC;
    }

    public Ingredient getIngredientAAA() {
        return ingredientAAA;
    }

    public void setIngredientAAA(Ingredient ingredientAAA) {
        this.ingredientAAA = ingredientAAA;
    }

    public Ingredient getIngredientBBB() {
        return ingredientBBB;
    }

    public void setIngredientBBB(Ingredient ingredientBBB) {
        this.ingredientBBB = ingredientBBB;
    }

    public Ingredient getIngredientCCC() {
        return ingredientCCC;
    }

    public void setIngredientCCC(Ingredient ingredientCCC) {
        this.ingredientCCC = ingredientCCC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drink)) return false;
        Drink drink = (Drink) o;
        return getIngredientAAA().equals(drink.getIngredientAAA()) &&
                getIngredientBBB().equals(drink.getIngredientBBB()) &&
                getIngredientCCC().equals(drink.getIngredientCCC());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIngredientAAA(), getIngredientBBB(), getIngredientCCC());
    }

    @Override
    public String toString() {
        return "Drink{" +
                "ingredientAAA=" + ingredientAAA +
                ", ingredientBBB=" + ingredientBBB +
                ", ingredientCCC=" + ingredientCCC +
                '}';
    }
}
