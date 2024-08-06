package Collections.HashSet;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> se = new HashSet<Integer>();
        se.add(12);
        se.add(8);
        se.add(45);

        System.out.println(se);

        boolean flag = se.contains(Integer.valueOf(23));
        System.out.println(flag);

        se.remove(45);
        System.out.println(se);

        Queue<Integer> linkedListQueue = new LinkedList<Integer>();
        linkedListQueue.add(20);
        linkedListQueue.add(10);
        linkedListQueue.add(30);

        System.out.println("LinkedList Queue: " + linkedListQueue);
    }

}
