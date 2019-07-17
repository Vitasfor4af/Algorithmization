package by.epam.matrix.task6;

import java.util.Scanner;

/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное) */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size(n) of array = ");
		int n = scanner.nextInt();
		while (n % 2 != 0) {
			System.out.println("Invalid value of n, try again");
			n = scanner.nextInt();
		}
		scanner.close();
		int[][] array = new int[n][n];
		int halfArray = array.length / 2;

		for (int i = 0, k = i; i < array.length; i++) {
			for (int j = k; j < array.length - k; j++) {
				array[i][j] = 1;
			}
			if ((i + 1) < halfArray) {
				k++;
			} else if ((i + 1) > halfArray) {
				k--;
			} else if (array.length % 2 != 0) {
				k++;
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
