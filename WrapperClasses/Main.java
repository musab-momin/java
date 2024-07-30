package WrapperClasses;

public class Main {
    public static void main(String[] args) {
        int number = 14;
        Integer numberObj = number; // this is autoboxing
        System.out.println("Number is : " + numberObj);

        Boolean flagObj = true;
        boolean flag = flagObj; // this is autounboxing
        System.out.println(flagObj);

        int x = 45;
        Double obj = 45.5;
        System.out.println("Floating value: " + obj.doubleValue());
        // Integer intObj = (Integer) obj; // we can not cast wrapper objects into
        // another wrapper object
    }
}
