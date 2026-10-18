package stack.convertexpression2;

import java.util.Stack;

public class InfixToPostfix {

    String infix;
    StringBuilder postfix;

    public InfixToPostfix(String infix) {
        this.infix = infix;
        postfix=new StringBuilder();
    }

    public void convert(){
        Stack<Character> stack=new Stack<>();
        for (char c : infix.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                postfix.append(c);
            }
            else{
                while(!stack.isEmpty()){
                    if (precedence(c)>precedence(stack.peek())){
                        break;
                    }
                    else {
                        postfix.append(stack.pop());
                    }
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){
            postfix.append(stack.pop());
        }

    }

    public int precedence(char op){
        switch (op){
            case '$' : return 3;
            case '*' : case '/'  : case '%' : return 2;
            case '+' : case '-' : return 1;
            default: return 0;
        }
    }

    public void display(){
        System.out.println("infix "+infix);
        System.out.println("postfix "+postfix);
    }
}
