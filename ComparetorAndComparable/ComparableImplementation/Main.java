package ComparetorAndComparable.ComparableImplementation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Alice", 22, 3.8f));
        studentsList.add(new Student("Bob", 20, 3.8f));
        studentsList.add(new Student("Charlie", 21, 3.7f));
        studentsList.add(new Student("David", 22, 3.9f));
        studentsList.add(new Student("Eve", 22, 3.8f));

        studentsList.sort(null);

        for (Student s : studentsList) {
            System.out.println(s);
        }

    }

}
