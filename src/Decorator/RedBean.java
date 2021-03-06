package Decorator;

import FoundationDrink.Drink;

public class RedBean extends CondimentDecorator {
    Drink drink;
    public RedBean(Drink drink){
        this.drink=drink;
    }

    @Override
    public String getDrinkDetail(){
        return drink.getDrinkDetail()+", Red Bean";
    }

    @Override
    public String getStrCupSize() {
        return drink.getStrCupSize();
    }

    /**
     * Assume adding Redbean to blacktea or Oolong Tea is 0.75 dollar extra
     * @return
     */
    @Override
    public double cost() {
        return 0.75+drink.cost();
    }
}