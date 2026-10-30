import java.util.ArrayList;
import java.util.List;

class Question2 {
    public static void main(String[] args) {
        List<String> actors = new ArrayList<>();
        System.out.println(" Size of ArrayList " + actors.size());
        System.out.println("Is ArrayList Empty "+actors.isEmpty());
        actors.add("Amitabh");
        actors.add("Amir");
        actors.add("salman");
        actors.add("Akshay");
        actors.add("Hrithik");
        System.out.println(actors.get(0));
        System.out.println(actors.get(4));
        System.out.println(" Size of ArrayList " + actors.size());
        System.out.println("Is ArrayList Empty "+actors.isEmpty());

    }
}
