package Decorator;

import FoundationDrink.Drink;

public class Mocha extends CondimentDecorator {
    Drink drink;
    public Mocha(Drink drink){
        this.drink=drink;
    }

    @Override
    public String getDrinkDetail(){
        return drink.getDrinkDetail()+", Decorator.Mocha";
    }

    @Override
    public String getStrCupSize() {
        return drink.getStrCupSize();
    }

    /**
     * Assume adding Decorator.Mocha to expresso is 1 dollar extra
     * @return
     */
    @Override
    public double cost() {
        return 1+drink.cost();
    }
}
