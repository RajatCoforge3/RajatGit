package Pac1;
import java.util.Random;


class Account {
    private long accNum;
    private double balance;
    private Person accHolder;
 
    public Account(Person1 p, double balance) {
        this.accNum = new Random().nextInt(900000) + 100000;
        this.accHolder = p;
        this.balance = balance >= 500 ? balance : 500;
    }
 
    public Account(double balance2) {
		// TODO Auto-generated constructor stub
	}

	public void deposit(double amt) {
        balance += amt;
        System.out.println("Amount Deposited");
    }
 
    public boolean withdraw(double amt) {
        if (balance - amt >= 500)
            balance -= amt;
        else
            System.out.println("Minimum balance ₹500 required");
    }
 
    public double getBalance() {
        return balance;
    }
 
    public String toString() {
        return "Account No: " + accNum +
               "\nHolder: " + accHolder.getName() +
               "\nBalance: ₹" + balance;
    }
}
 
