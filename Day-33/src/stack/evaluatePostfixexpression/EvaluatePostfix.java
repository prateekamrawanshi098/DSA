package stack.evaluatePostfixexpression;

import java.util.Stack;

public class EvaluatePostfix {
    String postfix;

    public EvaluatePostfix(String postfix) {
        this.postfix = postfix;
    }

    public double evaluate(){
        Stack<Double> stack=new Stack<>();

        for (char c: postfix.toCharArray()){
            if (Character.isDigit(c)){
                double x=c-'0';
                stack.push(x);
            }
            else {
                double op2=stack.pop();
                double op1= stack.pop();
                double x=calculate(op1,op2,c);
                stack.push(x);
            }
        }
       return stack.pop();
    }

    private double calculate(double op1, double op2, char c) {
         switch (c){
            case '+' : return  op1+op2;
            case '-' :return  op1-op2;
            case '*' :return op1*op2;
            case '/' :return op1/op2;
            case '%' :return op1%op2;
            case '$' : return Math.pow(op1,op2);
            default :return 0.0;
        }
    }
}
