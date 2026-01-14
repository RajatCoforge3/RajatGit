package Pac1;
import java.util.*;


public class Lab9 {
    static String op(String s, int c) {
        if (c == 1) return s + s;
 
        if (c == 2) {
            char[] a = s.toCharArray();
            for R(int i = 1; i < a.length; i += 2) a[i] = '#';
            return new String(a);
        }
 
        if (c == 3) {
            String r = "";
            for (char x : s.toCharArray())
                if (!r.contains(x + "")) r += x;
            return r;
        }
 
        if (c == 4) {
            char[] a = s.toCharArray();
            for (int i = 1; i < a.length; i += 2)
                a[i] = Character.toUpperCase(a[i]);
            return new String(a);
        }
        return "Invalid";
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = sc.nextInt();
        System.out.println(op(s, c));
    }
}
