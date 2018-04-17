package Decorator;
import FoundationDrink.Drink;


public class HerbalJelly extends CondimentDecorator {
    Drink drink;
    public HerbalJelly(Drink drink){
        this.drink=drink;
    }

    @Override
    public String getDrinkDetail(){
        return drink.getDrinkDetail()+", Herbal Jelly";
    }

    @Override
    public String getStrCupSize() {
        return drink.getStrCupSize();
    }

    /**
     * Assume adding Herbal Jelly to blacktea or Oolong Tea is 0.5 dollar extra
     * @return
     */
    @Override
    public double cost() {
        return 0.5+drink.cost();
    }
}