package oops;

import java.util.Scanner;

// Access specifiers
// Access ---> private, public, protected, package-private

public class Oops04_Acesspacifier {

    static class parent {

        public int publicvar = 10;
        private int privatevar = 20;
        protected int protectedvar = 30;
        int defaultvar = 40;

        public void showinsideClass() {
            System.out.println("Public " + publicvar);
            System.out.println("private " + privatevar);
            System.out.println("protected " + protectedvar);
            System.out.println("default " + defaultvar);
        }
    }

    static class Child extends parent {

        public void showinchild() {

            System.out.println("Public " + publicvar);
            // Cannot access private variable here
            // System.out.println("private " + privatevar);
            System.out.println("protected " + protectedvar);
            System.out.println("default " + defaultvar);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        parent obj = new parent();
        System.out.println("Public " + obj.publicvar);
        // Cannot access private variable here
        // System.out.println("private " + obj.privatevar);
        System.out.println("protected " + obj.protectedvar);
        System.out.println("default " + obj.defaultvar);
        obj.showinsideClass();
        Child child = new Child();
        child.showinchild();

        sc.close();
    }
}