package Exceptions.Throws;

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        try {
            t.printClassName();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

}
