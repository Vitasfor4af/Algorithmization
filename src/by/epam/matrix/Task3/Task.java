import java.util.Scanner;

/* Дата матрица. Вывести k-ю строку и p-й столбец матрицы */

public class Task {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int n = scn.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Input the elements of array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Input the index of row(k) = ");
        int k = scn.nextInt();
        System.out.print("Input the index of column(p) = ");
        int p = scn.nextInt();

        System.out.println("row: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[k][i] + "\t");
        }

        System.out.println();

        System.out.println("column: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][p]);
        }
    }
}