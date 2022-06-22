public class Car {
    String license;
    Account driver;
    Integer Passenger;


    //Integer id;
    //String name;
    //String document;
    //String email;
    //String password;


    public Car(String license, Account driver)
    {
        this.license = license;
        this.driver = driver;
    }


    void printDataCar(){
        System.out.println("Driver's Name: " + this.driver.name + "\nID: " + this.driver.document + "\n");
    }







}
