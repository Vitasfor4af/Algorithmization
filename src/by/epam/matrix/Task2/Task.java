package by.epam.matrix.Task2;

import java.util.Scanner;

/* Дана квадратная матрица. Вывести на экран элементы,
 стоящие на диагонали */

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

        System.out.println("---------------------------");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + "\t");
        }

    }
}
