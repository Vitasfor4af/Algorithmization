package by.epam.matrix.task15;

import java.util.Scanner;

/* Найдите наибольший элемент матрицы и заменить все
   нечетные элементы на него. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows = ");
		int rows = scanner.nextInt();
		System.out.print("Enter the number of columns = ");
		int columns = scanner.nextInt();

		int[][] array = new int[rows][columns];
		System.out.println("input the elements of matrix: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
		System.out.println("Before:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		scanner.close();

		int max = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] > max)
					max = array[i][j];
			}
		}
		System.out.println("\nmax = " + max);
		System.out.println("\nAfter:");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] % 2 != 0) {
					array[i][j] = max;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
