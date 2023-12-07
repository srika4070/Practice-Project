package camera_Rental_Application;

public class Wallet {

	 private double balance;
	    //Constructor - to store initial balance
	    public Wallet(double balance) {
	        this.balance = balance;
	    }
	    
	    public double getBalance() {
	        return balance;
	    }
	    //deposit () to add amount to balance
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("YOUR WALLET BALANCE UPDATED SUCCESSFULLY. CURRENT WALLET BALANCE - INR. "+getBalance());
	    }
	    //deduct() to deduct amount from balance
	    public void deduct(double amount) {
	        balance -= amount;
	    }
	}