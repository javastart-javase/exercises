package main.pl.pawtel.drinks;

public class DrinkApp {
    public static void main(String[] args) {
        Ingredient ingredientA = new Ingredient("Sok ananasowy", 100);
        Ingredient ingredientB = new Ingredient("Likier Malibu", 50);
        Ingredient ingredientC = new Ingredient("Mleko kokosowe", 100);

        Barman barman = new Barman();
        barman.createDrink(ingredientA, ingredientB, ingredientC);

        Drink drink = new Drink(ingredientA, ingredientB, ingredientC);
        barman.printDrink(drink);
    }
}
