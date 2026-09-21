package _01TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Example02 {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();
        ts.add("ravi");
        ts.add("bhavesh");
        ts.add("tanishka");
        ts.add("yash");
        ts.add("jhanvi");
        ts.add("lokesh");
        Iterator<String>it=ts.iterator();
        while (it.hasNext()){
            String s= it.next();
            System.out.println(s);
        }
    }
}
