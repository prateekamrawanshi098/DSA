package _01_collectionminiproject;


import java.util.Set;
import java.util.TreeSet;

public class Student {

    private int id;
    private String name;
    private Set<String> courses;

    public Student(int id, java.lang.String name) {
        this.id = id;
        this.name = name;
        courses=new TreeSet<>();
    }

    public boolean enrollCourse(String course){
        return courses.add(course);
    }

    public boolean removeCourse(String course){
        return courses.remove(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<String > getCourses(){
        return courses;
    }


}
