package _01_collectionminiproject;

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

    public void viewAllStudent(){
        if (students.isEmpty()){
            System.out.println("No student found !");
            return;
        }

        for (Student s:students){
            System.out.println(s);
        }
    }

    public void searchStudent(int id){
        Student s=studentMap.get(id);
        if (s==null){
            System.out.println("No student with id "+id);
            return;
        }
        System.out.println(s);
    }

    public void enrollStudentInCourse(int id, String course) {
        Student s = studentMap.get(id);
        if (s == null) {
            System.out.println("No Student with id " + id);
            return;
        }

        if (s.enrollCourse(course)) {
            System.out.println("Course added successfully !");
        } else{
            System.out.println("Student already enrolled with this course ");
        }
    }

    public void dropCourse(int id ,String course){
        Student s = studentMap.get(id);
        if (s == null) {
            System.out.println("No Student with id " + id);
            return;
        }

        if (s.removeCourse(course)){
            System.out.println("course removed successfully !");
        }
        else {
            System.out.println("Course not found");
        }
    }

    public void viewStudentCourse(int id ){
        Student s = studentMap.get(id);
        if (s == null) {
            System.out.println("No Student with id " + id);
            return;
        }
        if (s.getCourses().isEmpty()){
            System.out.println("Not enrolled in any courses");
        }
        else System.out.println(s.getCourses());
    }
}
