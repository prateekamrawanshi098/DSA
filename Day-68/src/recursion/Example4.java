package recursion;

public class Example4 {
    public static void greetings(int n){
        if (n<=0){
            return;
        }
        System.out.println("Good Evening");
        greetings(n-1);
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        greetings(3);
        System.out.println("Good Night");
    }
}
