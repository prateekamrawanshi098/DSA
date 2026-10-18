package stack._01_InfixToPrefix;

import java.util.Scanner;

public class UseInfixToPrefix {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter valid Infix expression");
        String infix=kb.next();
        InfixToPrefix citp=new InfixToPrefix(infix);
        citp.convert();
        citp.display();
    }
}
