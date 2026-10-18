package stack.convertexpression2;

import java.util.Scanner;

public class UseInfixToPostfix {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter valid Infix expression");
        String infix=kb.next();
        InfixToPostfix citp=new InfixToPostfix(infix);
        citp.convert();
        citp.display();
    }
}
