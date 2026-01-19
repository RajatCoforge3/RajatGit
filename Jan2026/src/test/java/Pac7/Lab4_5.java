package Pac7;
import java.io.*;
import java.util.*;

class Lab4_5 {

   static String getInsurance(double salary) {
       if (salary > 5000) return "Premium";
       else if (salary >= 3000) return "Standard";
       else return "Basic";
   }

   public static void main(String[] args) {

       HashMap<Integer, Employee> map = new HashMap<>();
       Scanner sc = new Scanner(System.in);

       // i) Add employee details
       System.out.print("Enter number of employees: ");
       int n = sc.nextInt();

       for (int i = 0; i < n; i++) {
           System.out.print("Id Name Salary: ");
           int id = sc.nextInt();
           String name = sc.next();
           double sal = sc.nextDouble();

           String scheme = getInsurance(sal);
           map.put(id, new Employee(id, name, sal, scheme));
       }

       // ii) Display employee details based on insurance scheme
       System.out.print("Enter insurance scheme to display: ");
       String sch = sc.next();

       for (Employee e : map.values()) {
           if (e.insuranceScheme.equalsIgnoreCase(sch))
               System.out.println(e);
       }

       // iii) Delete employee
       System.out.print("Enter employee id to delete: ");
       int delId = sc.nextInt();
       map.remove(delId);

       System.out.println("Remaining Employees:");
       for (Employee e : map.values())
           System.out.println(e);
   }
}