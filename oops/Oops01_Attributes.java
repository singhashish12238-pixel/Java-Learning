package oops;
// import java.util.* ;
class Employee{
    //attributes(data members)
    private int  salary;
    public String employeeName ;

    //behaviour(methods)
    public void setName(String s ){
        employeeName = s ;
    }
    public void setSalary(int val ){
        salary = val ;
    }
    public int getSalary(){
        return salary ;
    }
}
public class Oops01_Attributes {
    public static void main(String[] args) {
        //object creation(instance of class)
        Employee obj1 = new Employee() ;
        //setting values to attributes
        obj1 .setName("Ashish");
        obj1.setSalary(2000000);

        Employee obj2 = new Employee();
        obj2.setName("Ravi");
        obj2.setSalary(1500000);

        System.err.println("Salary of "+ obj1.employeeName + " is " +obj1.getSalary());
        System.err.println("Salary of "+ obj2.employeeName + " is " +obj2.getSalary());
    }
}
