package app.fruit;
import app.AddTo;
import app.Bio;
import app.ShoppingKart;

import java.util.ArrayList;
import java.util.Arrays;

public class Pear extends AddTo implements Bio {
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    public static void setColor(String color) {
        Pear.color = color;
    }
    public static String color="Green";
    public static String name="Pear";
    public Pear(ShoppingKart shoppingkart){
        super(shoppingkart);
        super.setNameproduct("Pear ");
        /*super.getListcolor().add(color);
        super.setListcolor(super.getListcolor());
        System.out.println(super.getListcolor()+ "ICI4");
        System.out.println(super.shoppingkart.getListcolor()+ "LA4");*/
    }


    @Override
    protected double cost() {
        return super.cost()+0.70;
    }
    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}
    /*public ArrayList<String> getListcolor(){
        super.shoppingkart.getListcolor().addAll(super.getListcolor());
        System.out.println(super.getListcolor()+ "ICI5");
        return super.getListcolor();

    };*/
}