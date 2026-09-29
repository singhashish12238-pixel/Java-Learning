package java_basic;
import java.util.Scanner;

public class JavaBasic02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.next();
        String lastname = scanner.next();
        System.out.println(firstname  + " " + lastname);
        scanner.close();
    }
}
// int --> double possible 
// double ---> int not possible as explicit 
// type cast 
// double x = 10.7
// int y = (int) x

// "final"  keyword means you cant change 