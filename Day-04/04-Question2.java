import java.util.ArrayList;
import java.util.List;

class Question2 {
    public static void main(String[] args) {
        List<String> actoress = new ArrayList<>();
        actoress.add("Hema");
        actoress.add("Rekha");
        actoress.add("Jaya");
        actoress.add("Madhuri");
        System.out.println(actoress.contains("Hema"));
        System.out.println(actoress.indexOf("Hema"));
        System.out.println(actoress.contains("HEMA"));
        System.out.println(actoress.contains("KIARA"));

    }
}
