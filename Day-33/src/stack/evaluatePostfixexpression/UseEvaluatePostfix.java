package stack.evaluatePostfixexpression;

import java.util.Scanner;

public class UseEvaluatePostfix {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter postfix Expression");
        String postfix=kb.next();
        EvaluatePostfix eval=new EvaluatePostfix(postfix);
        System.out.println(eval.evaluate());
    }
}
