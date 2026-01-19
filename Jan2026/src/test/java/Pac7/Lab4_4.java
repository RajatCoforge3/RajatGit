package Pac7;

import java.util.*;

class Lab4_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pen");
        list.add("Laptop");
        list.add("Book");
 
        Collections.sort(list);
 
        for (String s : list)
            System.out.println(s);
    }
}
