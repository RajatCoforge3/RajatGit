package Pac1;
import java.util.Scanner;
 
public class Lab2_1{
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter Name: ");
        String name = sc.next();
 
        System.out.print("Enter Age: ");
        float age = sc.nextFloat();
 
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();
 
        Person1 p = new Person1(name, age);
        Account acc = new Account(p, bal);
 
        while (true) {
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
            System.out.print("Choose option: ");
            int ch = sc.nextInt();
 
            switch (ch) {
                case 1:
                    System.out.print("Enter amount: ");
                    acc.deposit(sc.nextDouble());
                    break;
 
                case 2:
                    System.out.print("Enter amount: ");
                    acc.withdraw(sc.nextDouble());
                    break;
 
                case 3:
                    System.out.println(acc);
                    break;
 
                case 4:
                    System.out.println("Thank you!");
                    return;
 
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
