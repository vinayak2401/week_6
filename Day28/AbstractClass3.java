
/*Create an abstract class "BankAccount" with a non-abstract method "getAccountNumber()". Implement two subclasses "SavingsAccount" and "CheckingAccount" which implement the "getAccountNumber()" method and also override the "withdraw()" and "deposit()" methods according to their own rules.*/
import java.util.Scanner;

abstract class BankAccount {

  void getAccountNumber() {
    System.out.println("12308479");
  }
  void withDraw() {
    int balance = 10000;
    System.out.println("Balance is: " + balance);
  }

  void deposit() {
    Scanner s = new Scanner(System.in);
    int balance = 10000;
    System.out.println("Enter amount to deposit:");
    int amount = s.nextInt();
    System.out.println("Balance is: " + (amount + balance));

  }
}

class SavingsAccount extends BankAccount {
  void getAccountNumber() {
    System.out.println("Account no: 94933324");
  }

  void withDraw() {
    int balance = 10000;
    System.out.println("Balance is: " + balance);
  }

  void deposit() {
    Scanner s = new Scanner(System.in);
    int balance = 10000;
    System.out.println("Enter amount to deposit:");
    int amount = s.nextInt();
    System.out.println("Balance is: " + (amount + balance));

  }
}

class CheckingAccount extends BankAccount {
  void getAccountNumber() {
    System.out.println("Account no: 10367828");
  }
  void withDraw() {
    int balance = 10000;
    System.out.println("Balance is: " + balance);
  }

  void deposit() {
    Scanner s = new Scanner(System.in);
    int balance = 10000;
    System.out.println("Enter amount to deposit:");
    int amount = s.nextInt();
    System.out.println("Balance is: " + (amount + balance));

  }
}

class AbstractClass3 {
  public static void main(String args[]) {
    BankAccount obj = new SavingsAccount();
    obj.getAccountNumber();
    obj.withDraw();
    obj.deposit();
  }
}