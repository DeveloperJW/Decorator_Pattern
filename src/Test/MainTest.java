package Test;

import Cup.Large;
import Cup.Small;
import Decorator.Bubble;
import Decorator.HerbalJelly;
import Decorator.Mocha;
import Decorator.RedBean;
import FoundationDrink.BlackTea;
import FoundationDrink.Drink;
import FoundationDrink.OolongTea;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void main() {
        Drink drink=new BlackTea(new Small());
        drink=new Bubble(drink);
        drink=new RedBean(drink);
        assertEquals(drink.cost(),(1.99+1+0.5+0.75));
    }
    @org.junit.jupiter.api.Test
    void secondDrinkPrice() {
        Drink drink1=new OolongTea(new Large());
        drink1=new HerbalJelly(drink1);
        drink1=new Mocha(drink1);
        assertEquals(drink1.cost(),2.99+2.5+0.5+1);

    }

}