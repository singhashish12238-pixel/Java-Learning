package oops;
import java.util.*;
//Generics

//Generic class
class ExampleGenerics<T> {
    private List<T> list = new ArrayList<>();

    public void add(T value){
        list.add(value);
    }
    public T getelement(int index){
        return list.get(index);
    }
    public void removelast(){
        if(list.isEmpty()){
            System.out.println("List is empty");
        } else {
            list.remove(list.size() - 1);
        }
    }
    public void display(){
        for(T el : list){
            System.out.println("Element : "+ el);
        }
    }
}

//Generic method
class Genericmethod{   
    public <T> void display(T[] arr){ //we can define generic method in a non-generic class
        for(T el : arr){
            System.out.println("ELement : " + el);
        }
    }
}

//bounded type parameter
class Calculator<T extends Number>{
    public double add(T a ,T b){
        return a.doubleValue() + b.doubleValue();
    }
}

//type eraser
class TypeEraser<T extends Number>{  //upperbound the type parameter
    public void display(T value){
        System.out.println("Value : " + value);
    }

    public T getValue(T val){
        return val; 
    }
}

public class Oops12_Generics {
    //lower bound typr parameter : only read not write (but write null)
    public static<T> void printArray(List<? extends T> List){  //also we extends to OBject class (Number , String) ex : public static void printArray(List<? extends Number>List){  //main code ; }
        for(T el : List){
            System.out.println("ELEMENT : " + el);
        }
    }

    //upper bound type parameter : only write not read (read is in object class)
    public static void writeArray(List<? super Integer> ls) {
        ls.add(10);
        // ls.get(0); error
        System.out.println(ls.get(0));
    }
   public static void main(String[] args) { 
       ExampleGenerics<Integer>obj = new ExampleGenerics<>();
       obj.add(10);
       obj.add(20);
       obj.display();
       obj.removelast();
       obj.display();
       System.out.println();

       System.out.println("Generic Method");
       Genericmethod gm = new Genericmethod();
       String[] strArr = {"Hello", "World"};
       gm.display(strArr);
       System.out.println();
       
       System.out.println("Bounded Type Parameter");
       Calculator<Double> calc = new Calculator<>();
       System.out.println("Addition: " + calc.add(10.5, 20.3));
    //    Calculator<Integer> calc2 = new Calculator<>();
    //    System.out.println("Addition: " + calc2.add(10, 20));
       System.out.println();
       
       //Lower Bound Type parameter 
       List<Integer> intList = new ArrayList<>();
       intList.add(10);
       intList.add(20);
       printArray(intList);
       System.out.println();
       
       //Upper Bound type parameter
       List<Integer> ls = new ArrayList<>(); //any super class will work Number ,object
       writeArray(ls);
       System.out.println();

       //type eraser
         TypeEraser<Double> te = new TypeEraser<>();    
         te.getValue(10.5);
   }
}
