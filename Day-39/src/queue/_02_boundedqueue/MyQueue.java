package queue._02_boundedqueue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedBlockingQueue<>(3); //FIFO but restricted size
        int choice, x;
        Scanner kb = new Scanner(System.in);

        do {
            System.out.println("Enter Your choice");
            System.out.println("1. add element\n2. delete element\n3. peek element\n4. exit ");
            choice = kb.nextInt();

            switch (choice) {
                case 1 -> {

                    try {
                        System.out.println("Enter element to add");
                        x = kb.nextInt();
                        queue.add(x);
                        System.out.println(x + " added successfully in queue");
                    }catch (IllegalStateException ex){
                        System.out.println("Queue overflow");
                    }
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
