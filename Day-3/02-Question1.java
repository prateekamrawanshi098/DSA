import java.util.ArrayList;
import java.util.List;

class Question1{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(0, 20);
        list.add(1, 30);
        list.add(2, 40);
        list.add(4, 50);
        list.add(5, 60);
        list.add(70);
        System.out.println(list);
    }
}


/*

Actual data will be displayed coz of toString().
8 times toString will be called .
1 of ArrayList (overriden)
other 7 for each element bt Interger toString(overriden)

*/