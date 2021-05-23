package app.fruit;
import app.AddTo;
import app.Bio;
import app.ShoppingKart;

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
    }

    @Override
    protected double cost() {
        return super.cost()+0.70;
    }
    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}
}