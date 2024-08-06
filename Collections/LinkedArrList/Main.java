package Collections.LinkedArrList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new LinkedList<Integer>();

        arr.add(45);
        arr.add(23);
        arr.add(12);
        // add element at specific index
        arr.add(1, 8);

        System.out.println(arr);
        arr.remove(Integer.valueOf(12));
        System.out.println(arr);
    }

}
