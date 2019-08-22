package by.epam.matrix.task3;

import java.util.Scanner;

/* Дата матрица. Вывести k-ю строку и p-й столбец матрицы */

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
			}
			System.out.println();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.print("Input the number of row(k) = ");
		int k = scanner.nextInt() - 1;
		System.out.print("Input the number of column(p) = ");
		int p = scanner.nextInt() - 1;
		scanner.close();

		System.out.println("row: ");
		for (int i = 0; i < array[0].length; i++) {
			System.out.print(array[k][i] + "\t");
		}

		System.out.println();

		System.out.println("column: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i][p]);
		}
	}
}
