package Pac7;

import java.io.*;

class Lab4_1 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\Users\\Rajat.3\\git\\RajatGit\\Jan2026\\src\\test\\java\\input.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) sb.append((char) ch);
        fr.close();
 
        FileWriter fw = new FileWriter("C:\\Users\\Rajat.3\\git\\RajatGit\\Jan2026\\src\\test\\java\\input.txtinput.txt");
        fw.write(sb.reverse().toString());
        fw.close();
    }
}