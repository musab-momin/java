
public class Main {

    public static void main(String[] args) {
        // normal single dimensional array
        int[] arr = { 2, 4, 5 };
        for (short i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("____________________________________");

        int[] objArr = new int[4];
        for (int i = 0; i < objArr.length; i++) {
            objArr[i] = (int) (Math.random() * 100);
        }
        // enhanced for loop
        for (int ele : objArr) {
            System.out.println(ele);
        }

        // multidimensional array
        int[][] twoDimensionalArr = { { 2, 3, 4 }, { 23, 33, 44 }, { 321, 235, 876 } };
        System.out.println(twoDimensionalArr[0] + " : " + twoDimensionalArr[1] + " : " + twoDimensionalArr[2]);

        int[][] twoDimensionalArrobj = new int[3][];
        twoDimensionalArrobj[0][0] = 2;
        twoDimensionalArrobj[0][1] = 2;
        twoDimensionalArrobj[0][2] = 22;

        // when you don't define the length of other dimension in array that type of
        // array is called jacked array
        int[][] twoDimensionalJackedArr = new int[3][];

        for (int i = 0; i < twoDimensionalJackedArr.length; i++) {
            int len = (int) (Math.random() * 10 + 1);
            twoDimensionalJackedArr[i] = new int[len];
            for (int j = 0; j < len; j++) {
                twoDimensionalJackedArr[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int outer[] : twoDimensionalJackedArr) {
            for (int ele : outer) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }

}
