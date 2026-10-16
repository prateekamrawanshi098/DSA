package _02_stackUsingArrayList;


import java.util.Scanner;

public class USeStack {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        Stack s=new Stack();

        int choice ;
        do{
            System.out.println("Enter option to operate");
            System.out.println("1. To push Element in stack");
            System.out.println("2. To pop Element from stack");
            System.out.println("3. To peek Element in stack");
            System.out.println("4. To exit the App");
            choice=kb.nextInt();
            switch (choice){

                case 1-> {

                        System.out.println("Enter element to push");
                        int x = kb.nextInt();
                        s.push(x);
                        System.out.println("Element pushed successfully");
                }

                case 2-> {

                    try {
                        int x =(int) s.pop();
                        System.out.println("Element " + x + " popped successfully");
                    }catch (StackException ex){
                        System.out.println(ex.getMessage());
                    }

                }case 3-> {

                    try {
                        int x =(int) s.peek();
                        System.out.println(x + " is at the top of stack ");
                    }catch (StackException ex){
                        System.out.println(ex.getMessage());
                    }

                }case 4-> {
                    System.out.println("Thanks for using the app");

                }
                default -> System.out.println("Wrong choice");

            }
        }while (choice!=4);

    }
}
