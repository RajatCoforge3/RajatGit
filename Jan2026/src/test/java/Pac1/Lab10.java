package Pac1;
class PositiveString {
	static boolean isPositive(String s) {
		for( int i=0; i<s.length( ) - 1; i++)
			if(s.charAt(i)> s.charAt(i+1))
				return false; 
		return true; 
		
	}
}

public class Lab10 {

	public static void main(String[] args) {
		String s = "ANT";
		System.out.println(PositiveString.isPositive(s));
		
		

	}

}
