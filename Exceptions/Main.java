package Exceptions;

public class Main {
    public static void main(String[] args) {
        int x = 24;
        int y = 0;

        // we can use multiple catch block for single try
        try {
            int result = x / y;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Something went wrong: " + e);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Will this handle excpetion: " + ae);
        }

        // We can have try catch inside catch block
        try {
            int result = x / y;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            int[] arr = { 4, 5, 78, 21 };
            try {
                System.out.println("Arr: " + arr[5]);
            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("Will this handle excpetion: " + ae);
            }
        }

        System.out.println("Remeing code");
    }

}
