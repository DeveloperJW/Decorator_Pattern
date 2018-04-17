package FoundationDrink;

import Cup.*;

public abstract class Drink {
    public String drinkDetail="Undefined drink";
    public Cups cupSize;

    public String getDrinkDetail(){
        return drinkDetail;
    }

    public void setDrinkDetail(String drinkDetail) {
        this.drinkDetail = drinkDetail;
    }

    public Cups getCupSize() {
        return cupSize;
    }

    public void setCupSize(Cups cupSize) {
        this.cupSize = cupSize;
    }

    /**
     * get the price based on cup size
     * @return
     */
    public double getCupPrice(){
        return cupSize.price();
    }

    /**
     * get the string format of cup seiz
     * @return
     */
    public String getStrCupSize(){
        return cupSize.ChooseSize();
    }

    public abstract double cost();
}

