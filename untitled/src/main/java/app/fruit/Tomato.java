package app.fruit;
import app.AddTo;
import app.ShoppingKart;

public class Tomato extends AddTo {
    public static String color="Red";
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