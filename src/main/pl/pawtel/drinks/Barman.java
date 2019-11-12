package main.pl.pawtel.drinks;

public class Barman {

    public Drink createDrink(Ingredient ingredientAAA, Ingredient ingredientBBB, Ingredient ingredientCCC){
        return new Drink(ingredientAAA, ingredientBBB, ingredientCCC);
    }

    public void printDrink(Drink drink){
        System.out.println(drink);
    }
}
