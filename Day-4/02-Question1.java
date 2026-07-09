import java.util.ArrayList;
import java.util.List;

class Question1 {
    public static void main(String[] args) {
         List<String> actors = new ArrayList<>();
        
        actors.add("Amitabh");
        actors.add("Amir");
        actors.add("salman");
        actors.add("Akshay");
        actors.add("Hrithik");

        for (String s : actors) {
        System.out.println(s);
       }
    }
}
