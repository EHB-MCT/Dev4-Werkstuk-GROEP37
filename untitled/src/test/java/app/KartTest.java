package app;

import app.fruit.*;
import app.vegetables.*;
import org.junit.jupiter.api.Test;

public class KartTest {
    @Test
    void createMyShoppingKart() {
        ShoppingKart shoppingkart = new Bag();
        shoppingkart = new Pear(shoppingkart);
        shoppingkart = new Pineapple(shoppingkart);
        shoppingkart = new Tomato(shoppingkart);
        shoppingkart = new BrusselsSprout(shoppingkart);
        shoppingkart = new GreenPepper(shoppingkart);
        System.out.println(shoppingkart.getNameproduct() + " $ " + Math.round(shoppingkart.cost() * 100.0) / 100.0);
    }
}