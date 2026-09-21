package _01CustomHashSet;

/* Here both amit  added in HashSet ,when hashset is custom hashset*/


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person1{

    String name;

    public Person1(String name){
        this.name=name;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

public class Example02 {
    public static void main(String[] args) {
        Person1 p2= new Person1("Sumit");
        Person1 p3= new Person1("Amit");
        Person1 p1= new Person1("Amit");
        System.out.println("p1 hashcode : "+p1.hashCode());
        System.out.println("p2 hashcode : "+p2.hashCode());
        System.out.println("p3 hashcode : "+p3.hashCode());
        Set<Person1> hs= new HashSet<>();
        hs.add(p1);
        hs.add(p2);
        hs.add(p3);
        System.out.println("Size of hashset is : "+hs.size() );
    }
}
