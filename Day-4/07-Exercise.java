/*
Create a class called Emp with following instance members:

age
name
sal

Provide appropriate constructor to initialize Emp object. Then create a driver class called UseEmp which maintains a list of employees. Now do the following operations on this list:

1. Add 4 Emp objects
2. Display Emp records
3. Remove an Emp object from the list
4. Sort the List 
 

 */

import java.util.ArrayList;
import java.util.List;

class Emp {
    int age;
    String name;
    double sal;

    Emp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    public String toString() {
        return "age : " + this.age + " ,name : " + this.name + " ,sal : " + this.sal + " ; ";
    }
}

class UseEmp {
    public static void main(String[] args) {
       
        Emp emp1 = new Emp(30, "Chetan", 24000);
        Emp emp2 = new Emp(21, "Deepak", 20000);
        Emp emp3 = new Emp(54, "Raadhe", 25000);
        Emp emp4 = new Emp(53, "Krishn", 27000);
        List<Emp> emp = new ArrayList<>();
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);
         System.out.println(emp);
        
    }
}
