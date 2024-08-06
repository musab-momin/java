package ComparetorAndComparable.ComparetorImplementation;

public class Student {
    private String name;
    private int age;
    private double cgpa;

    public Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", cgpa=" + cgpa + "]";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCgpa() {
        return cgpa;
    }

}
