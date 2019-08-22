package by.epam.matrix.task1;

import java.util.Scanner;

/* Дана матрица.
 Вывести на экран все нечетные столбцы,
  у которых первый элемент больше последнего. */

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
		scanner.close();

		System.out.println("Source matrix:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("---------------------------");

		System.out.println("Result:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (((j + 1) % 2 != 0) && (array[0][j] > array[array.length - 1][j])) {
					System.out.print(array[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

}
