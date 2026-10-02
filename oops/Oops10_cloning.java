package oops;
//Cloning 

//shallow Cloning :- only field member clone not refrence
class Passport implements Cloneable{
    String passportNumber ;
    Passport(String passportNumber){
        this.passportNumber = passportNumber ;
    }
    @Override 
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Student implements  Cloneable{
    String name ; 
    Passport passport ;

    Student(String name , Passport passport){
        this.name = name ;
        this.passport = passport;
    }

    @Override 
    protected Object clone() throws CloneNotSupportedException{
        //Deep Cloning :- everything clone 
        Student student = (Student) super.clone();
        student.passport = (Passport) passport.clone();
        return student ;
    }
}
public class Oops10_cloning {
    public static void main(String[] args) throws CloneNotSupportedException{
        Passport passport = new Passport("1283y1");
        Student student = new Student("Ashish", passport);

        Student clonedStudent = (Student) student.clone();

        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        
        System.out.println(clonedStudent.name);
        System.out.println(clonedStudent.passport.passportNumber);

        System.out.println();

        //modify
        clonedStudent.name = "Ravi";
        clonedStudent.passport.passportNumber = "846628";

        System.out.println(student.name);
        System.out.println(student.passport.passportNumber);
        
        System.out.println(clonedStudent.name);
        System.out.println(clonedStudent.passport.passportNumber);
    }
}
