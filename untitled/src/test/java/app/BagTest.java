package app;
import org.junit.jupiter.api.Test;
public class BagTest {
    @Test
    public static void main(String[] args) {
        Bag bag = Bag.getInstance();
        System.out.println(bag.nameproduct);
    }
}
