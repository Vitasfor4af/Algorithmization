package by.epam.matrix.Task4;

import java.util.Scanner;

/* Сформировать квадратную матрицу порядка n
 по заданному образцу(n - четное) */

public class Task {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int n = scn.nextInt();
        if (n % 2 != 0) {
            System.out.println("Invalid value of n");
        } else {

            int[][] array = new int[n][n];
            System.out.println("Input the elements of array: ");
            for (int i = 0; i < array.length; i++) {
                if ((i + 1) % 2 != 0) {
                    for (int j = 0; j < array.length; j++) {
                        array[i][j] = scn.nextInt();
                    }
                } else {
                    for (int k = array.length - 1; k >= 0; k--) {
                        array[i][k] = scn.nextInt();
                    }
                }
                System.out.println();
            }

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

