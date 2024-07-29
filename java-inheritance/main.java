
class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }
}

class AdvanceCalCulator extends Calculator {

    public int multiple(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        return x / y;
    }
}

class ScientificCalculator extends AdvanceCalCulator {
    public int powerOf(int x, int y) {
        return (int) Math.pow(x, y);
    }
}

class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(24, 32));
        System.out.println(c.subtract(43, 23));
        System.out.println("----------------------------");
        AdvanceCalCulator ac = new AdvanceCalCulator();
        System.out.println(ac.add(18, 98));
        System.out.println(ac.subtract(76, 50));
        System.out.println(ac.multiple(2, 9));
        System.out.println(ac.divide(5, 25));
        System.out.println("----------------------------");
        ScientificCalculator sc = new ScientificCalculator();
        System.out.println(sc.add(18, 98));
        System.out.println(sc.subtract(76, 50));
        System.out.println(sc.multiple(2, 9));
        System.out.println(sc.divide(5, 25));
        System.out.println(sc.powerOf(16, 2));

    }

}
