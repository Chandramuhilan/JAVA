 class BankAccount {
  private int accountNumber;
  private String accountHolderName;
  private double balance;

  public BankAccount(int accountNumber, String accountHolderName) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = 0.0;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("Insufficient balance");
    }
  }

  public void displayAccountDetails() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Holder Name: " + accountHolderName);
    System.out.println("Balance: " + balance);
  }
}

public class Bank_Account {
  public static void main(String[] args) {
    BankAccount account1 = new BankAccount(12345, "Alice");
    account1.deposit(1000);
    account1.withdraw(500);
    account1.displayAccountDetails();

    BankAccount account2 = new BankAccount(54321, "Bob");
    account2.deposit(2000);
    account2.withdraw(1000);
    account2.displayAccountDetails();
  }
}
