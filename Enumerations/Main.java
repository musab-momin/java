package Enumerations;

public class Main {
    public static void main(String[] args) {
        Laptop l = Laptop.ChromeBook;
        Laptop m = Laptop.MacBook;
        System.out.println("@@ ENUM: " + l + " : " + m);

        Laptop res = Laptop.valueOf("ChromeBook");
        System.out.println(res == l);

        SeverityLevel sl = SeverityLevel.CRITICAL;
        System.out.println("@@ Severity level: " + sl.name() + sl.getLevelCode() + " : " + sl.getShortForm());
    }

}
