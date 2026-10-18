package stack.convertexpression;

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
                    boolean result=precedence(c,stack.peek());
                    if (result){
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

    public boolean precedence(char out,char in){
        if (in=='$'){
            return false;
        } else if (out=='$') {
            return true;
        }
        else if(in=='*' || in=='/' || in=='%'){
            return false;
        }
        else if (out=='*' || out=='/' || out=='%'){
            return true;
        }
        else if (in=='+' || in=='-'){
            return false;
        }

        else
            return true;
    }

    public void display(){
        System.out.println("infix "+infix);
        System.out.println("postfix "+postfix);
    }
}
