package FoundationDrink;


public class Americano extends Drink {
    public Americano(){
        drinkDetail="FoundationDrink.Americano";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
