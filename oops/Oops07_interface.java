package oops;
//interface

interface CarInterface{  //interface
    static final int doors = 4 ;  // final variable cannot change it
    public void start();   //abstract method
    public void numberofGears();   //abstract method

    //default method
    default void airbags(){
        System.out.println("Airbags are present");
    }
    //static method
    static void Cartype(){
        System.out.println("Car type is Sedan");
    }
    }

interface Sunroof{
    public void sunroof();
}

interface fuel extends CarInterface{  //interface inheritance
    public void fuelType();
}

class ManualCar implements CarInterface , Sunroof {  //implementing interface
    public void start(){   //implementing abstract method
        // airbags();  //calling default method directly by class object
        System.out.println("Manual Car Started " + doors);
    }
    public void numberofGears(){  //implementing abstract method
        System.out.println("Manual Car has 5 gears");
    }

    @Override 
    public void airbags(){  //overriding default method
        System.out.println("Manual Car has 6 airbags");
    }
    
    public void sunroof(){
        System.out.println("it has a normal sunroof");
    }

    public void fuelType(){  //implementing abstract method
        System.out.println(" it run on petrol ");
    }
}
public class Oops07_interface {
    public static void main(String[] args){
        ManualCar manualcar = new ManualCar();
        manualcar.start();
        manualcar.numberofGears();
        manualcar.airbags();  //calling overridden default method
        CarInterface.Cartype();  //calling static method
        manualcar.sunroof();
        manualcar.fuelType();
    }
}
