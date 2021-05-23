package app.fruit;
import app.AddTo;
import app.Bio;
import app.ShoppingKart;

public class Tomato extends AddTo implements Bio {
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }

    public static void setColor(String color) {
        Tomato.color = color;
    }
    public static String color="Red";
    public static String name="Tomato";
    public Tomato(ShoppingKart shoppingkart){
        super(shoppingkart);
        super.setNameproduct("Tomato ");
    }


    @Override
    protected double cost() {
        return super.cost()+0.50;
    }
    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}
}