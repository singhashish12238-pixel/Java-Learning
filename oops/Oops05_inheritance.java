package oops;
import java.util.Scanner;
// Inheritance
    class School{ //parent class
        private String SchoolName;

        School(){
            SchoolName = "DPS";
        }
        public String getSchoolName() {
            return SchoolName;
        } 
        public void displayschoolDetails(){
            System.out.println("School Name: " + SchoolName);
        }
    }
    class Student extends School{ //child class
        private String StudentName;
        private int StudentId;

        Student(int StudentId, String StudentName){ //constructor
            super();    //calling parent class constructor
            this.StudentId = StudentId;
            this.StudentName = StudentName;
        }

        public String getStudentName() {
            return StudentName;
        }
        public int getStudentId() {
            return StudentId;
        }

        public void displayStudentDetails(){
            System.out.println("Student Name: " + StudentName);
            System.out.println("Student Id: " + StudentId);
            displayschoolDetails(); //calling parent class method
        }
    }
public class Oops05_inheritance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Student Id: ");
        int StudentId = sc.nextInt();
        sc.nextLine(); // consume the newline character
        // System.out.print("Enter Student Name: ");
        String StudentName = sc.nextLine();
        Student student = new Student(StudentId, StudentName);
        student.displayStudentDetails();
        sc.close();
    }
}
