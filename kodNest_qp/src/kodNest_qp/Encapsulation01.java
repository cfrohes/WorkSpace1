package kodNest_qp;

public class Encapsulation01 {
	public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456", 1000);
        
        System.out.println("Initial balance: $" + myAccount.getBalance());
        
        myAccount.deposit(500);
        System.out.println("After deposit: $" + myAccount.getBalance());
        
        myAccount.withdraw(200);
        System.out.println("After withdrawal: $" + myAccount.getBalance());
        
        myAccount.withdraw(2000);  // This should fail
        
        System.out.println("Final balance: $" + myAccount.getBalance());
        System.out.println("Account number: " + myAccount.getAccountNumber());
    }

}

class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
