package by.epam.matrix.task15;

import java.util.Scanner;

/* Найдите наибольший элемент матрицы и заменить все
   нечетные элементы на него. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of matrix = ");
		int size = scanner.nextInt();
		int[][] array = new int[size][size];
		System.out.println("input the elements of matrix: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Before:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		scanner.close();
		int max = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] > max)
					max = array[i][j];
			}
		}
		System.out.println("max = " + max);
		System.out.println("After:");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] % 2 != 0) {
					array[i][j] = max;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
