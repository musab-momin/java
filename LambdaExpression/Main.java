package LambdaExpression;

@FunctionalInterface
interface Greetable {
    void sayGreet();
}

interface Addable {
    int addTwoNumbers(int x, int y);
}

public class Main {
    public static void main(String[] args) {
        Greetable arabicGreet = new Greetable() {
            @Override
            public void sayGreet() {
                System.out.println("Assalamualikum");
            }
        };
        arabicGreet.sayGreet();

        Greetable urduGreet = () -> System.out.println("Adaab");
        urduGreet.sayGreet();

        // we don't need to write type for parameters
        Addable calcy = (x, y) -> x + y;
        int result = calcy.addTwoNumbers(56, 28);
        System.out.println("@@ Result is: " + result);
    }

}
