package linkedlist.application.dynamicstack;

public class UseDynamicStack {
    public static void main(String[] args) {
        DynamicStack stack=new DynamicStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
