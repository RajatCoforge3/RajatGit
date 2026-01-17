package Pac6;

import java.util.Scanner;

class AgeException extends Exception
{
	private int age;
	
	AgeException(int a){
		this.age=a;
	}
	
	public AgeException(String string) {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return age+"is a valid age";
	}
}

class emp{
	String name;
	int age;
	
	void getempdetails() throws AgeException{
	System.out.println("Enter your age :");
	Scanner sc = new Scanner(System.in);
	name=sc.next();
	
	System.out.println("Enter your age:");
	age=sc.nextInt();
	
	if(age<16) {
		throw new AgeException(age);
	}
		
	}
}

public class TC_UserDefinderException {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub

		emp obj = new emp();
		obj.getempdetails();
	}

}
