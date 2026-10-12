package _02_collectionminiproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService {

    private Map<Integer,Student> studentMap=new HashMap<>();
    private List<Student> students=new ArrayList<>();

    public void addStudent(Student student){
        if (studentMap.containsKey(student.getId())){
            System.out.println("Student already present");
            return;
        }
        studentMap.put(student.getId(), student);
        students.add(student);
        System.out.println("Student added successfully !");
    }

    public void removeStudent(int id){
        Student s=studentMap.get(id);
        if (s==null){
            System.out.println("student not present");
            return;
        }
        students.remove(s);
        studentMap.remove(id);
        System.out.println("Student removed successfully !");
    }
}
