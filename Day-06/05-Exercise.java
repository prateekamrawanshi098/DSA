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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Emp1 implements Comparator<Emp1>{
    int age;
    String name;
    double sal;

    Emp1() {
        
    }

    Emp1(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    public String toString() {
        return "age : " + this.age + " ,name : " + this.name + " ,sal : " + this.sal + " ; ";
    }

    public boolean equals(Object o) {
        Emp1 p = (Emp1) o;
        if (this.age == p.age && this.name.equals(p.name) && this.sal == p.sal) {
            return true;
        }
        return false;
    }

   

    @Override
    public int compare(Emp1 o1, Emp1 o2) {
        int x = o1.age - o2.age;
        if(x!=0)
            return x;
        return o1.name.compareTo(o2.name);
    }


}

class UseEmp1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       
        Emp1 emp1 = new Emp1(30, "Chetan", 24000);
        Emp1 emp2 = new Emp1(21, "Deepak", 20000);
        Emp1 emp3 = new Emp1(54, "Raadhe", 25000);
        Emp1 emp4 = new Emp1(30, "Aakash", 27000);
        List<Emp1> emp = new ArrayList<>();
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);
        System.out.println("before Sorting");
        System.out.println(emp);
        System.out.println("After sorting");
        Collections.sort(emp,new Emp1() );
        System.out.println(emp);
         
       
        
    }
}
