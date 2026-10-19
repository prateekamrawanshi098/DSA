package queue.CircularQueueImpl;

import java.util.Scanner;

public class UseQueue {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Size of Queue");
        int size=kb.nextInt();
        Queue queue=new Queue(size);
        int choice;
        do{
            System.out.println("Enter your choice");
            System.out.println("1. queue");
            System.out.println("2. dequeue");
            System.out.println("3. peek");
            System.out.println("4. Exit");
            choice=kb.nextInt();

            switch (choice){



                case 1 -> {
                    try {
                        System.out.println("Enter element to queue");
                        int x = kb.nextInt();
                        queue.enqueue(x);
                        System.out.println(x+" queued successfully");
                    } catch (QueueException ex){
                        System.out.println(ex.getMessage());
                    }
                }
                case 2->{
                    try {

                        int x = queue.dequeue();
                        System.out.println(x + "  dequeued successfully");
                    }catch (QueueException ex){
                        System.out.println(ex.getMessage());
                    }
                }

                case 3->{
                    try {
                        int x = queue.peek();
                        System.out.println("Element at front of queue is " + x);
                    }catch (QueueException ex){
                        System.out.println(ex.getMessage());
                    }

                }

                case 4-> {
                    System.out.println("Thanks for using the app");
                }

                default -> System.out.println("Wrong choice");
            }
        }while (choice!=4);
    }

}
