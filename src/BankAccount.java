public class BankAccount {
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(double balance, String accountHolderName) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to print account details
    public void printAccountDetails() {
        System.out.println(accountHolderName + "'s account balance: " + balance);
    }

    // Override toString method to print account details
    @Override
    public String toString() {
        return "Account Holder: " + accountHolderName + "\nBalance: " + balance;
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Instantiate two BankAccount objects
        BankAccount account1 = new BankAccount(5000, "Larry");
        BankAccount account2 = new BankAccount(300, "Mary");

        // Withdraw 100 dollars from the first account
        account1.withdraw(100);

        // Deposit 100 dollars into the second account
        account2.deposit(100);

        // Print the account details to the console
        account1.printAccountDetails();
        account2.printAccountDetails();
    }
}


