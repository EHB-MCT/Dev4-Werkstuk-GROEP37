package app.vegetables;
import app.AddTo;
import app.ShoppingKart;

public class Radish extends AddTo {
    public static String color="Red";
    public Radish(ShoppingKart shoppingkart){
        super(shoppingkart);
        super.setNameproduct("Radish ");
    }


    @Override
    protected double cost() {
        return super.cost()+0.45;
    }
    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}
}