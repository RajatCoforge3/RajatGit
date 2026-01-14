package Pac1;

public class Person {
	String FirstName;
	String LastName;
	char gender;
	String num;
	
	

	public Person(String fn, String ln,char g,String n) {
		this.FirstName=fn;
		this.LastName=ln;
		this.gender=g;
		this.num=n;
		
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

}
