package stackUsingArray.stackImpone;

import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of Stack");
        int size=kb.nextInt();
        Stack s=new Stack(size);
        for (int i = 0; i <=size ; i++) {
            System.out.println("Enter element to push");
            int x=kb.nextInt();
            s.push(x);
            System.out.println(x+" pushed successfully");
        }
        for (int i = 0; i <=size ; i++) {
            int x=s.pop();
            System.out.println(x+" popped successfully");
        }
    }
}
