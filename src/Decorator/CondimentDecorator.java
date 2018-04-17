package Decorator;

import FoundationDrink.Drink;

public abstract class CondimentDecorator extends Drink {
    public abstract String getDrinkDetail();
    public abstract String getStrCupSize();
    public abstract double cost();
}
