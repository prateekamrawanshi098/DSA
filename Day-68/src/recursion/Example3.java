package recursion;

public class Example3 {
    public static void goodMorning(int n){
        System.out.println("Good Morning !");
    }

    public static void gooAfternoon(){
        int x=10;
        goodMorning(x);
        System.out.println("Good Afternoon !");
    }

    public static void main(String[] args) {
        int x=10;
        gooAfternoon();
        System.out.println("Good Night !");
    }
}
