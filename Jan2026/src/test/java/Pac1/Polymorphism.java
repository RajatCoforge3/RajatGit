package Pac1;

public class Polymorphism {
    public static void main(String[] args) {
 
        Account s = new SavingsAccount(2000);
        Account c = new CurrentAccount(1000);
 
        System.out.println(s.withdraw(1600)); // false (min balance)
        System.out.println(c.withdraw(1800)); // true (overdraft)
 
        System.out.println("Savings Balance: " + s.getBalance());
        System.out.println("Current Balance: " + c.getBalance());
    }
}
