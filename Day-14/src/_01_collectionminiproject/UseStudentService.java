package _01_collectionminiproject;

import java.util.Scanner;

public class UseStudentService {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        StudentService srv=new StudentService();
        int choice;

        do{
            System.out.println("Select and Option");
            System.out.println("1. Add Student ");
            System.out.println("2. Remove Student ");
            System.out.println("3. View all Student ");
            System.out.println("4. Search Student by id ");
            System.out.println("5. Enroll Student in course ");
            System.out.println("6. Drop Student course ");
            System.out.println("7. View Student course ");
            System.out.println("8. Exit ");
            choice= kb.nextInt();

            switch (choice){

                case 1->{
                    System.out.println("Enter student id");
                    int id=kb.nextInt();
                    System.out.println("Enter name of student");
                    String name=kb.next();
                    Student s=new Student(id,name);
                    srv.addStudent(s);
                }

                case 2->{
                    System.out.println("Enter student id ");
                    int id=kb.nextInt();
                    srv.removeStudent(id);
                }

                case 3->{
                    srv.viewAllStudent();
                }

                case 4->{
                    System.out.println("Enter student id ");
                    int id=kb.nextInt();
                    srv.searchStudent(id);
                }

                case 5->{
                    System.out.println("Student id");
                    int id=kb.nextInt();
                    System.out.println("Enter course name");
                    String course=kb.next();
                    srv.enrollStudentInCourse(id,course);
                }

                case 6->{
                    System.out.println("Student id");
                    int id=kb.nextInt();
                    System.out.println("Enter course name");
                    String course=kb.next();
                    srv.dropCourse(id,course);
                }

                case 7->{
                    System.out.println("Student id");
                    int id=kb.nextInt();
                    srv.viewStudentCourse(id);
                }

                case 8->{
                    System.out.println("Thanks for using the App");
                }
                default -> System.out.println(" wrong input ");

            }

        }while (choice!=8);
    }
}
