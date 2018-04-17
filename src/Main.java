import Cup.*;
import Decorator.Bubble;
import Decorator.RedBean;
import FoundationDrink.BlackTea;
import FoundationDrink.Drink;

public class Main {

    public static void main(String[] args) {

        System.out.println("**************** Welcome to MeetFresh Loyola franchisee **************"+"\n");
        Drink drink=new BlackTea(new Small());
        drink=new Bubble(drink);
        drink=new RedBean(drink);



        System.out.println("The drink you ordered is: "+drink.getDrinkDetail()
                +", and the price is $"+drink.cost()+"\n"
        +"The size of cup is: "+drink.getStrCupSize()
                +"\n");


    }
}
