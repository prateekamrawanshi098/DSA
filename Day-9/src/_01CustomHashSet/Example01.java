package _01CustomHashSet;

/* Here Only one amit that is first one is added in HashSet , when hashset is of type String */


import java.util.HashSet;
import java.util.Set;

class Person{

    String name;

    public Person(String name){
        this.name=name;

    }
}

public class Example01 {
    public static void main(String[] args) {
        String s1= new String("Amit");
        String s2= new String("Sumit");
        String s3= new String("Amit");
        System.out.println("s1 hashcode : "+s1.hashCode());
        System.out.println("s2 hashcode : "+s2.hashCode());
        System.out.println("s3 hashcode : "+s3.hashCode());
        Set<String> hs= new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println("Size of hashset is : "+hs.size() );
    }
}
