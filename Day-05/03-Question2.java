import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Question2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("JAN");
        list.add("FEB");
        list.add("MAR");
        list.add("APR");
        list.add("MAY");
        System.out.println("Before sorting");
        System.out.println(list);
        System.out.println("After sorting");
        Collections.sort(list);
        System.out.println(list);
    }
}
