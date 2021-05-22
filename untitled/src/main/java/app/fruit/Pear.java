package app.fruit;
import app.AddTo;
import app.ShoppingKart;

public class Pear extends AddTo {
    public static String color="Green";
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