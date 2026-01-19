package Pac7;

import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    double salary;
    String insuranceScheme;
 
    Employee(int id, String name, double salary, String scheme) {
        this.id  = id;
        this.name = name; 
        this.salary = salary;
        this.insuranceScheme=scheme;
        
    }
    public String toString() {
    	return id + " " +name + " " + salary + " "+insuranceScheme;
    }
    
}