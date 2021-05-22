package app.fruit;
import app.AddTo;
import app.ShoppingKart;

public class Pineapple extends AddTo {
    public static String color="Yellow";
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