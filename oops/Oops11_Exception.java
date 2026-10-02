package oops;
//Exception Handling

class InsufficientBalance extends Exception{
    InsufficientBalance(String message){
        super(message);
    }
}

class InvalidAmount extends Exception{
    InvalidAmount(String message){
        super(message);
    }
}

class BankBalance{
    private String name ; 
    private double amount ;

    BankBalance(String name  , double amount){
        this.name = name ;
        this.amount = amount;
    }

    public String getName(){
        return name ;
    }
    public double getAmount(){
        return amount;
    }
    
    public void addBalance(double val)throws InvalidAmount{
        if(val>0){
           amount += val;
        }
        else{
            throw new InvalidAmount("Cannot add negative amount ");
        }
    }

    public void withdrawBalance(double val)throws InsufficientBalance{
        if(val > amount){
            throw new InsufficientBalance("Amount available is " + amount) ;
        }
        amount -= val ;
        System.out.println("amount withdraw success");
    }
}
public class Oops11_Exception{
    public static void main(String[] args ){
        BankBalance obj = new BankBalance("Ashish", 110);
        try{
            obj.addBalance(-10);
        }
        catch(InvalidAmount e){
            System.out.println(e.getMessage());
        }
        try{
        obj.withdrawBalance(100);
        obj.withdrawBalance(100);
        }
        catch(InsufficientBalance e ){
            System.out.println(e.getMessage());
        }
    }
}