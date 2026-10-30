import java.util.ArrayList;
import java.util.List;

class Question3 {
    public static void main(String[] args) {
         List<String> actors = new ArrayList<>();
        
        actors.add("Amitabh");
        actors.add("Amir");
        actors.add("salman");
        actors.add("Akshay");
        actors.add("Hrithik");

        for (int i = 0; i < actors.size(); i++) {
            System.out.println(actors.get(i));
        }
    }
}
