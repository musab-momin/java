class Student {
    private String name;
    private int rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    // can not use outside this class
    private void meth() {
        System.out.println("Nothing");
    }

}

class Main {
    public static void main(String[] args) {
        Student eliot = new Student();

        eliot.setName("Eliot");
        eliot.setRollno(58);

        System.out.println(eliot.getName());
        System.out.println(eliot.getRollno());

    }
}