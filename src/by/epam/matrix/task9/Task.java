package by.epam.matrix.task9;

import java.util.Scanner;

/* Задана матрица неотрицательных чисел.
 Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows = ");
		int rows = scanner.nextInt();
		System.out.print("Enter the number of columns = ");
		int columns = scanner.nextInt();

		int[][] array = new int[rows][columns];
		System.out.println("Input the elements of array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = scanner.nextInt();
				if (array[i][j] < 0) {
					System.out.println("Invalid data, one of the elements of the matrix is a negative number");
					System.exit(0);
				}
			}
			System.out.println();
		}
		scanner.close();

		System.out.println("The matrix:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------");

		int maxSum = 0;
		int maxColIndex = 0;
		for (int j = 0; j < array[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum += array[i][j];
			}
			if (sum > maxSum) {
				maxSum = sum;
				maxColIndex = j;
			}
		}

		System.out.println("The column with the max sum is: " + (maxColIndex + 1));
	}
}
