package citybuilder;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static Random r = new Random();
    public static int random = r.nextInt(100) + 0;
    public static void test(){
        if(1<2){
            System.out.println("cest plus petit");
        }
    }
    public static void main(String[] args){

        System.out.println("Hello");
        String invoer = in.nextLine();

        System.out.println(invoer);
        switch (invoer){
            case "salut":System.out.println("ca fonctionne");
        }
        if(1<2){
            System.out.println("oueouelarue");
        }
        Village village = new Village();
        System.out.println(village.name);
        village.printPopulation();
        System.out.println("population:" + random);

    }
}
