import Cup.*;
import Decorator.Bubble;
import Decorator.HerbalJelly;
import Decorator.Mocha;
import Decorator.RedBean;
import FoundationDrink.BlackTea;
import FoundationDrink.Drink;
import FoundationDrink.OolongTea;

public class Main {

    public static void main(String[] args) {

        System.out.println("**************** Welcome to MeetFresh Loyola franchisee **************"+"\n");
        System.out.println("The first order is as following: ");
        Drink drink=new BlackTea(new Small());
        drink=new Bubble(drink);
        drink=new RedBean(drink);
        System.out.println("The drink you ordered is: "+drink.getDrinkDetail()
                +", and the price is $"+drink.cost()+"\n"
                +"The size of cup is: "+drink.getStrCupSize() +"\n");

        System.out.println("The second order is as following: ");
        Drink drink1=new OolongTea(new Large());
        drink1=new HerbalJelly(drink1);
        drink1=new Mocha(drink1);

        System.out.println("The drink you ordered is: "+drink.getDrinkDetail()
                +", and the price is $"+drink.cost()+"\n"
                +"The size of cup is: "+drink.getStrCupSize() +"\n");


    }
}
