package app.fruit;
import app.AddTo;
import app.Bio;
import app.ShoppingKart;

public class Apple extends AddTo implements Bio {
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    public static void setColor(String color) {
        Apple.color = color;
    }

    public static String color="Red";
    public static String name="Apple";
    public Apple(ShoppingKart shoppingkart){
        super(shoppingkart);
        super.setNameproduct("Apple ");

    }

    @Override
    protected double cost() {
        return super.cost()+0.50;
    }

    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}

}
