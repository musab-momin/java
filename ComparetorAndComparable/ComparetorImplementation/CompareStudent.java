package ComparetorAndComparable.ComparetorImplementation;

import java.util.Comparator;

// Write a Comparator to sort the students first by grade in descending order. 
// If two students have the same grade, then sort them by age in ascending order. 
// If the grades and ages are the same, sort them by name in ascending order.

public class CompareStudent implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getCgpa() != student2.getCgpa()) {
            return Double.compare(student2.getCgpa(), student1.getCgpa()); // Descending order of grades
        } else if (student1.getAge() != student2.getAge()) {
            return Integer.compare(student1.getAge(), student2.getAge()); // Ascending order of ages
        } else {
            return student1.getName().compareTo(student2.getName()); // Ascending order of names
        }
    }

}
