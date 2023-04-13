/*Bank Account: Create a class called BankAccount that has properties such as account number, balance, and account holder name. Create subclasses such as CheckingAccount, SavingAccount and CreditAccount that inherit from BankAccount and add additional properties
 such as interest rate or credit limit. Create methods to deposit and withdraw money, check the balance and return the account details in the parent class, and override them in the subclasses to implement specific behavior for each account type.*/
class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountDetails() {
        return "Account Number: " + accountNumber +
                "\nAccount Holder Name: " + accountHolderName +
                "\nBalance: " + balance;
    }
}

class CheckingAccount extends BankAccount {
    private double monthlyFee;

    public CheckingAccount(String accountNumber, double balance, String accountHolderName, double monthlyFee) {
        super(accountNumber, balance, accountHolderName);
        this.monthlyFee = monthlyFee;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= monthlyFee;
    }

    public String getAccountDetails() {
        return super.getAccountDetails() +
                "\nAccount Type: Checking" +
                "\nMonthly Fee: " + monthlyFee;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, String accountHolderName, double interestRate) {
        super(accountNumber, balance, accountHolderName);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += balance * interestRate;
    }

    public String getAccountDetails() {
        return super.getAccountDetails() +
                "\nAccount Type: Savings" +
                "\nInterest Rate: " + interestRate;
    }
}

class CreditAccount extends BankAccount {
    private double creditLimit;
    private double interestRate;

    public CreditAccount(String accountNumber, double balance, String accountHolderName, double creditLimit, double interestRate) {
        super(accountNumber, balance, accountHolderName);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + creditLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient credit limit.");
        }
    }

    public void addInterest() {
        balance += balance * interestRate;
    }

    public String getAccountDetails() {
        return super.getAccountDetails() +
                "\nAccount Type: Credit" +
                "\nCredit Limit: " + creditLimit +
                "\nInterest Rate: " + interestRate;
    }
}
class BankAcc{
  public static void main(String args[]){
    CheckingAccount ch=new CheckinAccount();
    ch.getAccountDetails();
  }
}
