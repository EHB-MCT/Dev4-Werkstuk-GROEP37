package app;

public class Bag extends ShoppingKart {
    public Bag(){setNameproduct("Bag: ");}

    private static Bag bagInstance = new Bag();
    public static Bag getInstance()
    {
        return bagInstance;
    }
    @Override
    protected double cost(){return 0.00;}
}
