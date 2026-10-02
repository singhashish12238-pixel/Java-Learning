package oops;
import java.util.*;

//relationship
// i) Association 
// ii) Aggregation 
// iii) Composition

class Passport {
    private String passportNumber;

    Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
}

class People{
        private String people;
        private Passport passport;

        People(String people , Passport passport){
            this.people = people; 
            this.passport = passport;
        }

        public void displaypeople(){
            System.out.println("the " + people +" passport no. is "+ passport);
        }
    }

class Course {
    private String courseName;

    // Many students can take one course
    private List<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    public String getName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void displayStudents() {
       for(int i = 0 ; i < students.size() ;i++){
        System.out.println(students.get(i).getName());
       }
    }
}


class Student {
    private String name;
    private Passport passport;
    private int id;

    // Many courses can belong to one student
    private List<Course> courses = new ArrayList<>();

    // Constructor: name + passport + id
    Student(String name, String passportNumber, int id) {
        this.name = name;
        this.passport = new Passport(passportNumber);  // COMPOSITION relationship
        this.id = id;
    }

    // Constructor: name + id
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Constructor: name
    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student ID: " + id);
        System.out.print("passport " + passport.getPassportNumber());
    }

    // Add course to student
    public void addCourse(Course course) {
            courses.add(course);
            course.addStudent(this);
        
    }

    // Separate method to display student's courses
    public void displayCourses() {
       for(int i = 0 ; i <courses.size(); i++){
        System.out.println(courses.get(i).getName());
       }
    }
}

class College {
    private String collegeName;

    // One college can have many students
    private List<Student> students = new ArrayList<>();

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        for(int i = 0; i<students.size() ; i++){
            System.out.println(students.get(i).getName());
        }
    }
}

public class Oops09_relationship {
    public static void main(String[] args) {

        // Students
        Student student1 = new Student("Ashish", "P12345", 101);
        Student student2 = new Student("Ravi", 102);
        Student student3 = new Student("Mohit");

        // Courses
        Course java = new Course("Java");
        Course python = new Course("Python");
        Course cpp = new Course("C++");

        //one-to-one 
        Passport passport = new Passport("d1298ah4"); 
        // student1.display();
        // System.out.println();

        // Many-to-many relationship
        student1.addCourse(java);
        student1.addCourse(python);

        student2.addCourse(java);

        student3.addCourse(python);
        student3.addCourse(cpp);

        // Display student information
        //one-to-one
        student1.display();  
        System.out.println();

        // Display courses of students
        //many-to-many
        student1.displayCourses();
        student2.displayCourses();
        student3.displayCourses();

        System.out.println();

        // Display students of courses
        java.displayStudents();
        python.displayStudents();
        cpp.displayStudents();

        System.out.println();

        // College - one-to-many
        College college = new College("ABC University");

        college.addStudent(student1);
        college.addStudent(student2);
        college.addStudent(student3);

        college.displayStudents();
        System.out.println();
        
        //Aggregation
        People people = new People("Ashish" , passport);
        people.displaypeople();
    }
}