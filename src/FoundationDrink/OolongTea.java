package FoundationDrink;

import Cup.Cups;

public class OolongTea extends Drink {
    public OolongTea(Cups cups){
        drinkDetail="Oolong Tea";
        cupSize=cups;
    }

    @Override
    public double cost() {
        //return 2.99;
        return cupSize.price()+2.99;
    }
}
