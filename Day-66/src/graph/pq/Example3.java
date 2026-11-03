package graph.pq;

import java.util.PriorityQueue;


class Person implements Comparable<Person> {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }
}

public class Example3 {
    public static void main(String[] args) {
        PriorityQueue<Person>pq=new PriorityQueue<>();
        pq.add(new Person(10,"Amit"));
        pq.add(new Person(9,"Sumit"));
        pq.add(new Person(20,"Ramesh"));
        pq.add(new Person(16,"Jayesh"));
        pq.add(new Person(3,"Sachin"));
        pq.add(new Person(22,"Karan"));

       while (!pq.isEmpty()){
           System.out.println(pq.poll());
       }
    }
}
