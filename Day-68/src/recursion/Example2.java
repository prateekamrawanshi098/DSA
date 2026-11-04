package recursion;

public class Example2 {
    public static void greetings(int n){
        if (n<=0){
            return;
        }
        System.out.println("Good Evening");
        greetings(n-1);
    }

    public static void main(String[] args) {
        greetings(5);
    }
}
