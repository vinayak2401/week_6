/*1. ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called
 "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.*/

import java.util.Scanner;

class Account {
    Scanner sc = new Scanner(System.in);
    String accountHolderName;
    long accountNo;
    double accountBalance;

    void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    String getAccountHolderName() {
        return accountHolderName;
    }

    long getAccountNo() {
        return accountNo;
    }

    void getAccountBalance() {
        display();
    }

    double deposite(double accountBalance) {
        System.out.println("Enter the Deposite amount");
        double amount = sc.nextDouble();
        return accountBalance + amount;
    }

    double withdraw(double accountBalance) {
        System.out.println("Enter the Withdraw amount");
        double amount = sc.nextDouble();
        return accountBalance - amount;
    }

    void display() {
        System.out.println("Balance is " + accountBalance);
    }
}

 class ATMSimulator {
    Scanner sc = new Scanner(System.in);
    Account account[] = new Account[5];
    int noOfElements = 0;

    void addAccount() {
        Account acnt = new Account();
        System.out.println("Enter Account no : ");
        acnt.setAccountNo(sc.nextLong());
        System.out.println("Enter AccountHolder Name : ");
        sc.nextLine();
        acnt.setAccountHolderName(sc.nextLine());
        System.out.println("Enter balance : ");
        acnt.setAccountBalance(sc.nextDouble());
        account[noOfElements] = acnt;
        noOfElements++;
        System.out.println("add Account Success..");
    }

    void removeAccount() {
        int index = 0;
        System.out.println("Enter AccountNo to remove:");
        long accntNo = sc.nextLong();
        for (int i = 0; i < noOfElements; i++) {
            Account acnt = (Account) account[i];
            if (acnt.getAccountNo() == accntNo) {
                index = i;
            }
        }
        for (int i = index; i < noOfElements; i++) {
            account[i] = account[i + 1];
        }
        noOfElements--;
        System.out.println("Remove Account Success..");
    }

    void transact() {
        System.out.println("Enter AccountNo");
        long accntNo = sc.nextLong();
        for (int i = 0; i < noOfElements; i++) {
            Account acnt = (Account) account[i];
            if (acnt.getAccountNo() == accntNo) {
                double balance = 0;
                System.out.println("1.Withdraw\n2.Deposit\n3.Check balance\n4.Exit");
                System.out.println("please select..");
                int choice = sc.nextInt();
                if (choice == 4) {
                    break;
                }
                switch (choice) {
                    case 1:
                        balance = acnt.withdraw(acnt.accountBalance);
                        acnt.setAccountBalance(balance);
                        System.out.println("Withdraw Success..");
                        break;
                    case 2:
                        balance = acnt.deposite(acnt.accountBalance);
                        acnt.setAccountBalance(balance);
                        System.out.println("Deposit Success..");
                        break;
                    case 3:
                        acnt.getAccountBalance();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                break;
            }
        }
    }

    void displayAccounts() {
        for (int i = 0; i < noOfElements; i++) {
            Account acnt = (Account) account[i];
            System.out.println("Account no : " + acnt.getAccountNo());
            System.out.println("AccountHolder Name : " + acnt.getAccountHolderName());
            acnt.getAccountBalance();
        }
    }

    public static void main(String[] args) {
        ATMSimulator atmSimulator = new ATMSimulator();
        do {
            System.out.println("Enter 1.Add Account\n2.Remove Account\n3.Transact\n4.DisplayAccounts\n5.Exit");
            System.out.println("please select..");
            int choice = atmSimulator.sc.nextInt();
            if (choice == 5) {
                System.out.println("Thank you..");
                break;
            }
            switch (choice) {
                case 1:
                    atmSimulator.addAccount();
                    break;
                case 2:
                    atmSimulator.removeAccount();
                    break;
                case 3:
                    atmSimulator.transact();
                    break;
                case 4:
                    atmSimulator.displayAccounts();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (true);
    }
}