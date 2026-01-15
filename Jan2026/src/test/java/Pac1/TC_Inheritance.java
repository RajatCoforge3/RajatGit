package Pac1;

class Base {
	public void basemethod()
	{
		System.out.println("Base Method");
		
	}
	
}
class Derived extends Base{
	public void derivedMethod() {
	System.out.println("Derived Method");
	}
	
}
public class TC_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived derived= new Derived();
		System.out.println(derived instanceof Derived);
		derived.basemethod();
		derived.derivedMethod();
		
		

	}

}
