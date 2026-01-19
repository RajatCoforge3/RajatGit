package Pac7;

import java.io.*;
import java.util.*;
 
class Lab4_2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("C:\\Users\\Rajat.3\\git\\RajatGit\\Jan2026\\src\\test\\java\\number.txt"));
        sc.useDelimiter(",");
 
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0)
                System.out.println(n);
        }
        sc.close();
    }
}
