package Pac6;
import java.util.ArrayList;

public class TC_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> List = new ArrayList<Integer>();
		List.add(0,new Integer(42));
		int total=List.get(0).intValue();
		System.out.println("Total : "+total);
		
		ArrayList<String> L1=new ArrayList<String>();
		String str ="hi";
		L1.add(str);
		L1.add("Welcome to collection");
		System.out.println(L1.size());
		System.out.println(L1);
		for (String L2:L1) {
			System.out.println(L2);
		}

	}

}
