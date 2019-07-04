package by.epam.matrix.Task3;

import java.util.Scanner;

/* Дата матрица. Вывести k-ю строку и p-й столбец матрицы */

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Input the elements of array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Input the index of row(k) = ");
        int k = scanner.nextInt();
        System.out.print("Input the index of column(p) = ");
        int p = scanner.nextInt();

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
