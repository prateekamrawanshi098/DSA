package _01_CustomTreeMap;

import java.util.Map;
import java.util.TreeMap;

class Student{
    int roll;
    String name;
    double per;

    public Student(int roll, String name, double per) {
        this.roll = roll;
        this.name = name;
        this.per = per;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", per=" + per +
                '}';
    }

    public int getRoll() {
        return roll;
    }
}


public class Example01 {
    public static void main(String[] args) {
        Map<Integer,Student> map = new TreeMap<>();
        Student s1=new Student(11,"Ravi",90.2);
        Student s2=new Student(53,"Ravi",90.2);
        Student s3=new Student(1,"Ravi",90.2);

        map.put(s1.getRoll(),s1);
        map.put(s2.getRoll(),s2);
        map.put(s3.getRoll(),s3);

        System.out.println(map);


    }
}
