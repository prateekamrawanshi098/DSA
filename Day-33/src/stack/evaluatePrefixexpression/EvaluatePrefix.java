package stack.evaluatePrefixexpression;

import java.util.Stack;

public class EvaluatePrefix {
    String prefix;

    public EvaluatePrefix(String prefix) {
        this.prefix = prefix;
    }

    public double evaluate(){
        Stack<Double> stack=new Stack<>();

        for (int i=prefix.length()-1;i>=0;i--){
            char c=prefix.charAt(i);
            if (Character.isDigit(c)){
                double x=c-'0';
                stack.push(x);
            }
            else {
                double op1=stack.pop();
                double op2= stack.pop();
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
