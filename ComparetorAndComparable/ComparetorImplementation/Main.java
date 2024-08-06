package ComparetorAndComparable.ComparetorImplementation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(43);
        arr.add(91);
        arr.add(32);
        arr.add(67);

        System.out.println(arr);
        // default sort
        arr.sort(null);
        System.out.println(arr);

        // Comparator<Integer> com = new Comparator<Integer>() {
        // @Override
        // public int compare(Integer num1, Integer num2) {
        // if (num1 % 10 > num2 % 10)
        // return 1;
        // return -1;
        // }
        // };
        // Because Comparator is a functional interface we can use Lambda Expression for
        // compare method
        Comparator<Integer> com = (num1, num2) -> ((num1 % 10) > (num2 % 10)) ? 1 : -1;

        // custom sort: sorting based on last digit of 2 digit number
        arr.sort(com);
        System.out.println(arr);

        System.out.println("--------------------------------------------------------");

        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Stawberry");
        fruits.add("Watermellon");
        fruits.add("Chessnuts");

        // default sort
        fruits.sort(null);
        System.out.println(fruits);

        System.out.println("");

        // custom sort based on elements length
        Comparator<String> compareLen = (f1, f2) -> f1.length() > f2.length() ? 1 : -1;
        fruits.sort(compareLen);
        System.out.println(fruits);

        System.out.println("--------------------------------------------------------");

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Alice", 22, 3.8));
        studentsList.add(new Student("Bob", 20, 3.8));
        studentsList.add(new Student("Charlie", 21, 3.7));
        studentsList.add(new Student("David", 22, 3.9));
        studentsList.add(new Student("Eve", 22, 3.8));

        studentsList.sort(new CompareStudent());
        for (Student s : studentsList) {
            System.out.println(s);
        }
    }

}
