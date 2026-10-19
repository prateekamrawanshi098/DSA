package stack.GoogleInterviewQuestion;

import java.util.Stack;

public class MyStack {
    public void sort(Stack<Integer> s1){
        Stack<Integer> s2=new Stack<>();

        while (!s1.isEmpty()){
            int x= s1.pop();


            while (!s2.isEmpty() && s2.peek()>x){
                s1.push(s2.pop());
            }
            s2.push(x);

        }

        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }


    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(5);
        stack.push(7);
        stack.push(12);
        System.out.println("Before sorting ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        stack.push(10);
        stack.push(5);
        stack.push(7);
        stack.push(12);
        System.out.println("After sorting");
        MyStack s=new MyStack();
        s.sort(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
