import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Question1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(76);
        list.add(54);
        list.add(1);
        list.add(87);
        System.out.println("Before sorting");
        System.out.println(list);
        System.out.println("After sorting");
        Collections.sort(list);
        System.out.println(list);
    }
}
