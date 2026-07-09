import java.util.ArrayList;
import java.util.List;

class Question3 {
    public static void main(String[] args) {
        List<String> actoress = new ArrayList<>();
        actoress.add("Hema");
        actoress.add("Rekha");
        actoress.add("Jaya");
        actoress.add("Madhuri");
        System.out.println(actoress.remove("Hema"));
       System.out.println(actoress);
       System.out.println(actoress.remove(0));
       System.out.println(actoress);

    }
}
