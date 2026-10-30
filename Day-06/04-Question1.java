import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
class Question1 implements Comparator<Integer>{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1000);
        list.add(2230);
        list.add(7438);
        list.add(3120);
        System.out.println("Before Sorting");
        System.out.println(list);
        Collections.sort(list,new Question1());
        System.out.println("After sorting");
        System.out.println(list);

    }

  
    public int compare(Integer e1, Integer e2) {
        return e2 - e1;
    }
}
