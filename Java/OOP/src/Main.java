import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! Bitch!\n");

        Car Auto1 = new Car();
        Car Auto2 = new Car();

        int number[] = new int[5];

        int[] number2 = new int[4];
        

        Auto1.id = 11296891;
        Auto1.license = "XOG162";
        Auto1.driver = "Armando Almarales";
        Auto1.Passenger = 4;

        Auto2.id = 95830022;
        Auto2.license = "AOR405";
        Auto2.driver = "Armando Jr";
        Auto2.Passenger = 4;


        Auto1.printDataCar();
        
        System.out.println();

        Auto2.printDataCar();


    }
}