package Pac7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TC_FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text : ");
		String text = sc.nextLine();
		FileWriter fw=new FileWriter("input.txt");
		fw.write(text);
		fw.close();
		
	}

}
"C:\Users\Rajat.3\git\RajatGit\Jan2026\input.txt"