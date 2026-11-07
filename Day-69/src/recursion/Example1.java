package recursion;

public class Example1 {

    public static int fun(int n){
        if (n<=0){
            return 0;
        }
        return n+fun(n-1);
    }

    public static void main(String[] args) {
        int result=fun(5);
        System.out.println(result);
    }
}
