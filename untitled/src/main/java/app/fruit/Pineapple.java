package app.fruit;
import app.AddTo;
import app.Bio;
import app.ShoppingKart;

public class Pineapple extends AddTo implements Bio {
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    public static void setColor(String color) {
        Pineapple.color = color;
    }
    public static String color="Yellow";
    public static String name="Pineapple";
    public Pineapple(ShoppingKart shoppingkart){
        super(shoppingkart);
        super.setNameproduct("Pineapple ");
    }


    @Override
    protected double cost() {
        return super.cost()+1.00;
    }
    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}
}