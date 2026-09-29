package oops;
// import java.util.*;
//abstract class
abstract class Car{  //parent class 
    Car(){  //constructor
        System.out.println("Car Constructor");
    }
    abstract public void start();    // abstract method 
    public void noise(){  //abstract class can have concrete methods
        System.out.println("Noise....");
    }
}
abstract class Dealer extends Car{ //intermediate class
    Dealer(){  //constructor
        System.out.println("Dealer Constructor");
    }
    Dealer(int caravailable){  //constructor
        System.out.println("Dealer Constructor with car available: "+caravailable);
    }
   public void caravailable(){   //abstract class extend class does not need to implement abstract methods of parent class
    System.out.println("Car Available");
   }  
}

class Manualcar extends Dealer{   //child class
    public void start(){    //implementing abstract method
        System.out.println("Manual Car Started");
    }
    Manualcar(int caravailable){  //constructor
        super(caravailable);  //calling parent class constructor with parameter
        System.out.println("Manual Car Constructor");
    }
}

class Automaticcar extends Car{
    public void start(){
        System.out.println("Automatic Car Started");
    }
}

public class Oops06_abstract {
    public static void main (String[] args){
        Car manualcar = new Manualcar(12);
        manualcar.start();
        manualcar.noise();

        Car automaticcar  = new Automaticcar();
        automaticcar.start();
        automaticcar.noise();
        // automaticcar.caravailable();  //error because caravailable() is not present in Car class
    }
}
