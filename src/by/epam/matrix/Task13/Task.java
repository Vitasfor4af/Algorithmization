package by.epam.matrix.Task13;

import java.util.Scanner;

/* Отсотрировать строки матрицы по возрастанию и убыванию значений элементов. */

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
		int i, j = 0, k;
		System.out.println("Do you want to sort the matrix in ascending(0) or descending(1)?");
		int select = scanner.nextInt();
		while (select < 0 || select > 1) {
			System.out.println("invalid data, try again");
			select = scanner.nextInt();
		}
		scanner.close();
		System.out.println("After:");
		if (select == 0) {
			for (i = 0; i < array.length; i++) {
				for (j = 0; j < array.length; j++) {
					for (k = j + 1; k < array.length; k++) {
						if (array[i][j] > array[i][k]) {
							int tmp = array[i][j];
							array[i][j] = array[i][k];
							array[i][k] = tmp;
						}
					}
				}
			}
		} else {
			for (i = 0; i < array.length; i++) {
				for (j = 0; j < array.length; j++) {
					for (k = j + 1; k < array.length; k++) {
						if (array[i][j] < array[i][k]) {
							int tmp = array[i][j];
							array[i][j] = array[i][k];
							array[i][k] = tmp;
						}
					}
				}
			}
		}
		for (int z = 0; z < array.length; z++) {
			for (int l = 0; l < array.length; l++) {
				System.out.print(array[z][l] + "\t");
			}
			System.out.println();
		}
	}
}