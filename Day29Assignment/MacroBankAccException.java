/*Bank Account: Create a class called BankAccount that simulates a bank account. The class should have methods to deposit, withdraw, and check the balance. You can also create a custom exception called InsufficientFundsException to throw when a withdrawal is attempted with insufficient funds.*/
import java.util.Scanner;
class InsufficientFundsException extends Exception{
  InsufficientFundsException(String str){
    super(str);
  }
}
class BankAccount{
  double balance=10000;
  void withdraw(int withdrawAmount) throws InsufficientFundsException{
    if(withdrawAmount>balance){
      throw new InsufficientFundsException("Insufficient Funds");
    }
    else if(withdrawAmount%100!=0){
      throw new InsufficientFundsException("Enter only multiples of 100");
    }
    else{
      balance=balance-withdrawAmount;
      System.out.println("Balance is: "+balance);
    }
  }
  void deposit(int deposit) throws InsufficientFundsException{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter amount to deposit");
    double depo=s.nextDouble();
    if(depo%100!=0){
      throw new InsufficientFundsException("Enter only multiples of 100");
    }
    else{
      balance=balance+depo;
      System.out.println("Balance is: "+balance);
    }
  }
}
class MacroBankAccException{
  public static void main(String args[]){
    BankAccount obj=new BankAccount();
    
    try{
      obj.withdraw(1000);
      obj.deposit(2000);
    }
    catch(InsufficientFundsException e){
      System.out.println(e);
    }
  }
}