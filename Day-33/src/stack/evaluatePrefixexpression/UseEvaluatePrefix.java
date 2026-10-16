package stack.evaluatePrefixexpression;

import java.util.Scanner;

public class UseEvaluatePrefix {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter postfix Expression");
        String prefix=kb.next();
        EvaluatePrefix eval=new EvaluatePrefix(prefix);
        System.out.println(eval.evaluate());
    }
}
