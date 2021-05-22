package app.fruit;
import app.AddTo;
import app.ShoppingKart;

public class Banana extends AddTo {
    public static String color="Yellow";
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