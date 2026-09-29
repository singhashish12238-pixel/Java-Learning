package oops;
//attributes and Methods
class BankAcc{
    private String name ; //Encapsulation
    private double balance ;
    
    public BankAcc(String name , double balance){
        this.name = name ;
        this.balance = balance;
    }
    //Setter 
    public void setname(String name){
        this.name = name ; 
    }
    //Getter
    public String getname(){
        return name ;
    }

    public double getbalance(){
        return balance ;
    }
    // Methods
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
        }
        else{
            System.out.println("Error cannot add negative amount");
        }
    }
    public boolean withdraw(double amount){
        if(amount>balance){
           System.out.println("Insufficient amount");
           return false ;
        }
        else{
            balance -= amount ;
            return true ;
        }
    }
}
public class Oops02_Methos {
    public static void main(String[] args) {
        BankAcc ac1 = new BankAcc("Ashish" , 1000);
        System.out.println(ac1.getname());
        System.out.println(ac1.getbalance());
        ac1.deposit(150000);
        ac1.withdraw(50000);
        System.out.println(ac1.getname() + " has " + ac1.getbalance());
    }
}
