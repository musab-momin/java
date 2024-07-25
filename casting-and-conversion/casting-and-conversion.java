
class CastingAndConversion {

  public static void main(String args[]) {

    // Below code give you error simply because you can lose some value while
    // convertin int to byte
    // int i = 56;
    // byte b = i;

    // Explicit type conversion is know as type casting
    int i = 56;
    byte b = (byte) i;
    System.out.println(b);

    // java will automatically change the type convert the type of k into double d
    int k = 45;
    double d = k;
    System.out.println(d);

    byte ten = 10;
    byte thirty = 30;
    int result = ten * thirty;
    System.out.println(result);
  }

}
