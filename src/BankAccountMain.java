public class BankAccountMain {
    public static void main(String[] args) {
        // Instantiate two BankAccount objects
        BankAccount account1 = new BankAccount(5000, "Larry");
        BankAccount account2 = new BankAccount(300, "Mary");

        // Withdraw 100 dollars from the first account
        account1.withdraw(100);

        // Deposit 100 dollars into the second account
        account2.deposit(100);

        // Print the account details to the console
        System.out.println(account1); // Uses toString method
        System.out.println(account2); // Uses toString method
    }
}

