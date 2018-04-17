package FoundationDrink;

import Cup.*;

public class BlackTea extends Drink {
    public BlackTea(Cups cups){
        drinkDetail="Black Tea";
        cupSize=cups;
    }

    @Override
    public double cost() {
        return cupSize.price()+1.99;
    }
}
