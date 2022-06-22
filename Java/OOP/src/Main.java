import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! Bitch!\n");

        Car Auto1 = new Car("XOG1620", new Account("Armando Almarales", "11296891"));
        Car Auto2 = new Car("AOR405", new Account("Armando Jr", "95830022"));
    

        Auto1.printDataCar();
        
        System.out.println();

        Auto2.printDataCar();


    }
}