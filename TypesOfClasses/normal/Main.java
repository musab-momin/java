package TypesOfClasses.normal;

class Calculator {
  int x;
  int y;

  // If you remove the below constructor, java will add the same constructor for
  // you while compling the code.
  Calculator() {
  }

  Calculator(int x, int y) {
    this.x = x;
    this.y = y;
  }

  int add(int a, int b) {
    return a + b;
  }

  int substract() {
    return this.x - this.y;
  }

}

class Main {
  public static void main(String[] args) {
    // without parameter constructor method will be called for object creation
    Calculator c = new Calculator();
    int result = c.add(34, 32);
    System.out.println(result);

    // parameterised constructor method will be called for object creation
    Calculator sc = new Calculator(5, 4);
    int sResult = sc.substract();
    System.out.println(sResult);

  }
}