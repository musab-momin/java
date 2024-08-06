package ComparetorAndComparable.ComparableImplementation;

// Write a Comparator to sort the students first by grade in descending order. 
// If two students have the same grade, then sort them by age in ascending order. 
// If the grades and ages are the same, sort them by name in ascending order.

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private float grade;

    public Student(String name, int age, float grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student that) {
        if (this.grade != that.grade) {
            return Float.compare(that.grade, this.grade); // decending order
        } else if (this.age != that.age) {
            return Integer.compare(this.age, that.age);
        } else {
            return name.compareTo(that.name);
        }
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
    }
}
