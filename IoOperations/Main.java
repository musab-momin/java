package IoOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // try {
        // System.out.println("Please enter a whole number: ");
        // int input = System.in.read();
        // System.out.println("User input was: " + (input - 48));
        // } catch (IOException err) {
        // System.out.println(err);

        // }

        // Reader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // System.out.println("Write some message: ");

        // try {

        // String userMssg = bf.readLine();
        // System.out.println("Users message: " + userMssg);
        // System.out.println();

        // System.out.println("Now please enter a whole number: ");
        // int num = (int) Integer.parseInt(bf.readLine());
        // System.out.println("Users number: " + num);

        // bf.close();
        // } catch (IOException err) {
        // System.out.println(err);
        // }

        Scanner sc = new Scanner(System.in);

        // Reading a string
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        // Reading an integer
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");

        // Reading a double
        System.out.println("Enter your height in meters:");
        double height = sc.nextDouble();
        System.out.println("Your height is " + height + " meters.");

        sc.close();

    }

}
