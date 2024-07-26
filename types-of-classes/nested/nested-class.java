
class Outer {
    private int x;
    public static int staticX = 43;

    static class StaticInner {
        private float pi;

        StaticInner() {
        }

        StaticInner(float pi) {
            this.pi = pi;
        }

        void printer() {
            System.out.println("Static inner class");
            System.out.println(staticX);
        }

        void printPi() {
            System.out.println(this.pi);
        }

        void outerAccess() {
            Outer.printStatic();
        }
    }

    class NormalInner {
        // This x will shadow the outer x, so inside this class when you print x you
        // will get the value of
        // constructor
        private int x;

        NormalInner(int x) {
            this.x = x;
        }

        void printer() {
            System.out.println(x);
            System.out.println(this.x);
        }
    }

    void printer() {
        System.out.println(this.x);
    }

    static void printStatic() {
        System.out.println(staticX);
    }

}

class NestedClass {

    public static void main(String args[]) {
        Outer.StaticInner si = new Outer.StaticInner(3.9f);
        si.printer();
        si.printPi();

        Outer ut = new Outer();
        ut.printer();

        System.out.println();
        // we can directyly access static properties and methods of class without even
        // object.
        System.out.println(Outer.staticX);
        Outer.printStatic();
        System.out.println();

        Outer.NormalInner nc = ut.new NormalInner(32);
        nc.printer();
    }
}