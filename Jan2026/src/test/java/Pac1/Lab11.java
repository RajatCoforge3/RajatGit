package Pac1;
import java.time.*;
import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {       
	Scanner sc = new Scanner(System.in);
	 
    System.out.print("Enter date (yyyy-mm-dd): ");
    LocalDate d = LocalDate.parse(sc.next());

    LocalDate today = LocalDate.now();
    Period p = Period.between(d, today);

    System.out.println("Years : " + p.getYears());
    System.out.println("Months: " + p.getMonths());
    System.out.println("Days  : " + p.getDays());
}
}
