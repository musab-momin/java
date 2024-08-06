package Collections.ArrList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(59);
        arr.add(9);
        arr.add(4);
        arr.add(2);
        arr.add(12);

        System.out.println(arr);

        arr.remove(2);
    }
}
