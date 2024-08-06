package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> students = new LinkedHashMap<String, Integer>();

        students.put("eliot", 37);
        students.put("moblly", 43);
        students.put("cisco", 39);
        System.out.println("Map: " + students);

        Integer singleValue = students.get("eliot");
        System.out.println("Eliot: " + singleValue);

        students.putIfAbsent("musab", 40);
        System.out.println(students);

    }

}
