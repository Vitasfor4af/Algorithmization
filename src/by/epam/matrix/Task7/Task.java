package by.epam.matrix.Task7;

import java.util.Scanner;
import static java.lang.Math.*;

/* Сформировать квадратную матрицу порядка N по правилу
   и подсчитать количество положительных элементов в ней. */

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int n = scanner.nextInt();
        scanner.close();
        double[][] array = new double[n][n];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sin((pow(i,2) - pow(j, 2))/n);
                if(array[i][j] > 0) count++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%.2f\t", array[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nNumber of positive elements of array = " + count);
    }
}
