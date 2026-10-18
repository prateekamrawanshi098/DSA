package stack._01_InfixToPrefix;

import java.util.Stack;

public class InfixToPrefix {
    String infix;
    StringBuffer prefix;

    public InfixToPrefix(String infix) {
        this.infix = infix;
        this.prefix = new StringBuffer();
    }

    public void convert(){
        Stack<Character>stack=new Stack<>();
        for (int i=infix.length()-1;i>=0;i--){
            char c=infix.charAt(i);
            if(Character.isLetterOrDigit(c)){
                prefix.append(c);
            }
            else {
                while (!stack.isEmpty()){
                    if (precedence(c)>=precedence(stack.peek())){
                        break;
                    }
                    else
                        prefix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){
            prefix.append(stack.pop());
        }
        prefix=prefix.reverse();
    }

    public void display(){
        System.out.println("Infix "+infix);
        System.out.println("Prefix "+prefix);
    }

    private int precedence(char c) {
        if(c=='$'){
            return 3;
        }
        else if(c=='*' || c=='/' || c=='%'){
            return 2;
        }

        else if(c=='+' || c=='-' ){
            return 1;
        }

        else return 0;

    }


}
