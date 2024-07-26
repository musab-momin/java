class Main {

    void add(int x, int y) {
        System.out.println(x + y);
    }

    void add(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    // static method can also be overlaod
    static void addStatic(int x) {
        System.out.println(x + x);
    }

    static void addStatic(int x, int y) {
        System.out.println(x + y);
    }

    // we can combine static and normal method for overloading
    void addStatic(int x, int y, int k) {
        System.out.println(x + y + k);
    }

    // abstract methods can also be overloaded
    void absFirst(int i) {
    }

    void absFirst(int i, int j) {
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.add(55, 85);
        obj.add(34, 213, 2);

        Main.addStatic(3);
        Main.addStatic(4, 5);
        obj.addStatic(5, 5, 5);
    }
}