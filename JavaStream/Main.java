package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45, 2, 98, 38, 21);
        Stream<Integer> evenDoubleList = list.stream().filter(num -> num % 2 == 0).map(num -> num * 2);
        int sum = list.stream().reduce(0, (cur, acc) -> acc += cur);
        evenDoubleList.forEach(num -> System.out.println(num));
        System.out.println("Total is : " + sum);
    }

}
