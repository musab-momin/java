
class Car {
    private static String category;
    private String brand;
    private String name;
    private int price;

    Car(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    static {
        System.out.println("STATIC BLOCK GETS CALLED");
        category = "Automobile Vehical";
    }
    static {
        category = "Automobile";
        System.out.println("ANOTER STATIC BLOCK: >>>>> " + category);

    }

    void printStaticValues() {
        System.out.println(category);
    }

    void printInfo() {
        System.out.println(this.brand + " : " + this.name + " : " + this.price);
    }
}

class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "R8", 40000000);
        audi.printInfo();

        Car porsche = new Car("Porsche", "Spyder", 30000000);
        porsche.printInfo();
    }
}