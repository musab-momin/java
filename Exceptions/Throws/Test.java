package Exceptions.Throws;

public class Test {

    public void printClassName() throws ClassNotFoundException {
        Class.forName("Book");
    }

}
