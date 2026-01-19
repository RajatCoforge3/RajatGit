package Pac7;
import java.io.*;
class Lab4_3 {
    public static void main(String[] args) throws Exception {
 
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.dat"));
        oos.writeObject(new Employee(1,"Rajat",4000,"yes"));
        oos.close();
 
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.dat"));
        Employee e = (Employee) ois.readObject();
        ois.close();
 
        System.out.println(e.id+" "+e.name+" "+e.salary);
    }
}
