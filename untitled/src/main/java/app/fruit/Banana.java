package app.fruit;
import app.AddTo;
import app.Bio;
import app.ShoppingKart;

public class Banana extends AddTo implements Bio {
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    public static void setColor(String color) {
        Banana.color = color;
    }
    public static String color="Yellow";
    public static String name="Banana";
    public Banana(ShoppingKart shoppingkart){
        super(shoppingkart);
        super.setNameproduct("Banana ");
    }


    @Override
    protected double cost() {
        return super.cost()+0.80;
    }
    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}

}