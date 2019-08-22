package by.epam.matrix.task12;

import java.util.Scanner;

/* Отсотрировать стобцы матрицы по возрастанию и убыванию значений элементов. */

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
		System.out.println("Do you want to sort the matrix in ascending(0) or descending(1)?");
		int select = scanner.nextInt();

		while (select < 0 || select > 1) {
			System.out.println("invalid data, try again");
			select = scanner.nextInt();
		}
		scanner.close();

		System.out.println("After:");
		if (select == 0) {
			for (int i = 0; i < array[0].length; i++) {
				for (int j = 1; j < array.length; j++) {
					for (int k = array.length - 1; k >= j; k--) {
						if (array[k][i] > array[k - 1][i]) {
							int term = array[k][i];
							array[k][i] = array[k - 1][i];
							array[k - 1][i] = term;
						}
					}
				}
			}
		} else {
			for (int i = 0; i < array[0].length; i++) {
				for (int j = 1; j < array.length; j++) {
					for (int k = array.length - 1; k >= j; k--) {
						if (array[k][i] < array[k - 1][i]) {
							int term = array[k][i];
							array[k][i] = array[k - 1][i];
							array[k - 1][i] = term;
						}
					}
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