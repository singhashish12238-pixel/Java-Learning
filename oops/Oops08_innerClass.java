package oops;
//inner class
class Outerclass{
    static int val = 10 ; 
    String name  = "Outerclass";
    
    //i) Static inner class
    static class StaticInnerclass{ //only static members of outer class can be accessed in static inner class
        void display(){
            System.out.println("Static inner class");
            System.out.println("Static variable of outer class is " + val);
        }
    }
    public void display(){
        StaticInnerclass sinnerclass = new StaticInnerclass();
        sinnerclass.display();
    }

    // ii) Non-static inner class
    class NonStaticInnerclass{ //all members of outer class can be accessed in static inner class
    void display(){
        System.out.println("Non-Static inner class" + name);
        System.out.println("Non-Static inner class" + val);
    }
    }

    // iii) Method local inner class
    void methodlocalinnnerclass(){
        class Localinnerclass{
            void l_display(){
                int x = 10; //local variable of method "effectively final value"
                System.out.println("Method local inner class" + x);
                System.out.println("Method local inner class" + val);
            }
        }
        val += 10; //modifying static variable of outer class
        Localinnerclass localinnerclass = new Localinnerclass() ;
        localinnerclass.l_display();
    }
}

// iv) Anonymous inner class
interface AnonymousInterface{ // also can be abstract class "for contract functionality"
    void execute();
}


public class Oops08_innerClass {
    public static void main(String[] args){
  
        Outerclass.StaticInnerclass innerclass = new Outerclass.StaticInnerclass();
        innerclass.display();

        Outerclass outerclass = new Outerclass();
        outerclass.display();

        // non-static inner class object creation need instance of outer class
        Outerclass.NonStaticInnerclass nsiclass = outerclass.new NonStaticInnerclass();
        nsiclass.display();

        //local inner class object creation
        outerclass.methodlocalinnnerclass();
        
        //Anonymous inner class
        AnonymousInterface anonymousInterface = new AnonymousInterface(){
            public void execute(){
                System.out.println("Anonymous inner class");
            }
        };
        anonymousInterface.execute();
    }
}
