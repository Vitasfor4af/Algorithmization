import java.util.Scanner;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное) */

public class Task {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int n = scn.nextInt();
        if (n % 2 != 0) {
            System.out.println("Invalid value of n");
        } else {

            int[][] array = new int[n][n];
            int halfArray = array.length / 2;

            for (int i = 0, k = i; i < array.length; i++) {
                for (int j = k; j < array.length - k; j++) {
                    array[i][j] = 1;
                }
                if ((i + 1) < halfArray) {
                    k++;
                } else if ((i + 1) > (array.length % 2 == 0 ? halfArray : halfArray + 1)) {
                    k--;
                }
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }


        }
    }
}
