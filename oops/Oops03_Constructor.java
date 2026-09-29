package oops;
// Constructors
class Employee{
   private int salary ; 
   public String employeename;
   //Constructors
    public Employee(int salary , String employeename){
          this.salary = salary ;
          this.employeename = employeename ;
    }
    public Employee(){
        this.salary = 10000;
        this.employeename =  "Ashish" ;
    }
    public void setSalary(int salary){
        this.salary = salary ;
    }
    public void setEmployeename(String employeename){
        this.employeename = employeename ;
    }
    public int getsalary(){
        return salary ;
    }
    public String getemployeename(){
        return employeename ;
    }

    // constructor overloading
    public Employee(String name){ //constructor with one parameter
        this.employeename = name ;
        this.salary = 0 ;  //in java deafult value is itself 0
    }

    //Copy constructor
    public Employee(Employee emp){  
        this.employeename = emp.employeename;
        this.salary = emp.salary;
    }

    // constructor with chaining
//  Employee(int n ){
//         this(n,0);
//     }
}
public class Oops03_Constructor {
    public static void main(String[]  args){
        // Creating an employee object with parameterized constructor
        Employee emp1 = new Employee(20000, "John");
        System.out.println("the salary of employee1 " + emp1.employeename + " is " + emp1.getsalary());
        // Creating another employee object with default constructor
        Employee emp2 = new Employee();
        System.out.println("The salary of employee2 " + emp2.employeename + " is " + emp2.getsalary());

        // Creating an employee object with constructor overloading
        Employee emp3 = new Employee("Raj");
        System.out.println("The salary of employee3 " + emp3.employeename + " is " + emp3.getsalary());

        // Creating an employee object with copy constructor        
        Employee emp4 = new Employee(emp1);
        System.out.println("The salary of employee4 " + emp4.employeename + " is " + emp4.getsalary());
    }
}
