package by.epam.matrix.Task4;

import java.util.Scanner;

/* Сформировать квадратную матрицу порядка n
 по заданному образцу(n - четное) */

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int n = scanner.nextInt();
        if (n % 2 != 0) {
            System.out.println("Invalid value of n");
        } else {

            int[][] array = new int[n][n];
            System.out.println("Input the elements of array: ");
            for (int i = 0; i < array.length; i++) {
                if ((i + 1) % 2 != 0) {
                    for (int j = 0; j < array.length; j++) {
                        array[i][j] = scanner.nextInt();
                    }
                } else {
                    for (int k = array.length - 1; k >= 0; k--) {
                        array[i][k] = scanner.nextInt();
                    }
                }
                System.out.println();
            }
            scanner.close();
            System.out.println("------------------------");

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }

        }
    }
}

