package app.fruit;
import app.AddTo;
import app.ShoppingKart;

public class Apple extends AddTo {
    public static String color="Red";
    public Apple(ShoppingKart shoppingkart){
        super(shoppingkart);
        super.setNameproduct("Apple");
    }

    @Override
    protected double cost() {
        return super.cost()+0.50;
    }
    public String getNameproduct(){return super.shoppingkart.getNameproduct() + super.getNameproduct();}
}
