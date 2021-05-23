package app;

import app.fruit.*;
import app.vegetables.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class KartTest {
    @Test
    void createMyShoppingKart() {
        ShoppingKart shoppingkart = new Price();
        shoppingkart = new Pear(shoppingkart);
        shoppingkart = new Pineapple(shoppingkart);
        shoppingkart = new Tomato(shoppingkart);
        shoppingkart = new BrusselsSprout(shoppingkart);
        shoppingkart = new GreenPepper(shoppingkart);
        System.out.println(shoppingkart.getNameproduct() + " $ " + Math.round(shoppingkart.cost() * 100.0) / 100.0);
    }
}