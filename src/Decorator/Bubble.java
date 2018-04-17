package Decorator;

import FoundationDrink.Drink;

public class Bubble extends CondimentDecorator {
    Drink drink;
    public Bubble(Drink drink){
        this.drink=drink;
    }

    @Override
    public String getDrinkDetail(){
        return drink.getDrinkDetail()+", Decorator.Bubble";
    }

    @Override
    public String getStrCupSize() {
        return drink.getStrCupSize();
    }

    /**
     * Assume adding Decorator.Bubble to blacktea or Oolong Tea is 0.5 dollar extra
     * @return
     */
    @Override
    public double cost() {
        return 0.5+drink.cost();
    }
}