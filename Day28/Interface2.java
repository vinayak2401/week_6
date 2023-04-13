import java.util.Scanner;

interface Atm {
  void withDraw();

  void deposit();

  void acc_balance();
}

class SbiAtm implements Atm {
  int balance = 10000;

  public void withDraw() {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter amount to withdraw:");
    int amount = s.nextInt();
    if (amount > balance) {
      System.out.println("Invalid amount");
    } else {
      System.out.println("Balance is: " + (balance = balance - amount));
    }

  }

  public void deposit() {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter amount to deposit");
    int amount1 = s.nextInt();
    System.out.println("Balance is: " + (balance = balance + amount1));
  }

  public void acc_balance() {

    System.out.println("Balance is: " + balance);
  }
}

class Interface2 {
  public static void main(String args[]) {
    Atm obj = new SbiAtm();
    obj.withDraw();
    obj.deposit();
    obj.acc_balance();

  }
}