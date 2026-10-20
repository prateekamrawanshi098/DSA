package queue._01_growablequeue;

import java.util.*;

public class MyQueue2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(); //Growable and Priority order
        int choice, x;
        Scanner kb = new Scanner(System.in);

        do {
            System.out.println("Enter Your choice");
            System.out.println("1. add element\n2. delete element\n3. peek element\n4. exit ");
            choice = kb.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter element to add");
                    x = kb.nextInt();
                    queue.add(x);
                    System.out.println(x + " added successfully in queue");
                }

                case 2 -> {
                    try {
                        x = queue.remove();
                        System.out.println(x + " removed successfully");
                    } catch (NoSuchElementException ex) {
                        System.out.println("Queue is empty .");
                    }
                }

                case 3 -> {
                    try {
                        x = queue.element();
                        System.out.println(x + " is the head element .");
                    } catch (NoSuchElementException ex) {
                        System.out.println("Queue is empty .");
                    }
                }
                case 4 ->{
                    System.out.println("Thanks for using App");
                }

                default -> System.out.println("Wrong choice");
            }
        }while (choice!=4);
    }
}
