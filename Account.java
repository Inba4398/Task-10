package Task10;

public class Account {
	    private double balance;

	    // No-argument constructor
	    public Account() {
	        balance = 1000.0;
	    }

	    // Two-argument constructor
	    public Account(double initialBalance) {
	        balance = initialBalance;
	    }

	    // Method to withdraw balance
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. \nRemaining balance: " + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }

	    // Method to deposit balance
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. \nUpdated balance: " + balance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    // Getter method to retrieve the current balance
	    public double getBalance() {
	        return balance;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        Account account1 = new Account(); // Using the no-argument constructor
	        System.out.println("Initial balance for account 1: " + account1.getBalance());

	        Account account2 = new Account(100.0); // Using the two-argument constructor
	        System.out.println("Initial balance for account 2: " + account2.getBalance());

	        account1.deposit(50.0);
	        account2.withdraw(30.0);

	        System.out.println("Final balance for account1: " + account1.getBalance());
	        System.out.println("Final balance for account2: " + account2.getBalance());
	    }
	}