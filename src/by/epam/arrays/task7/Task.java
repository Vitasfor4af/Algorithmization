package by.epam.arrays.task7;

import java.util.Scanner;

/* Даны действительные числа a 1 , a 2 , ... , a n .
 Найти  max(a 1 + a 2 n , a 2 + a 2 n − 1 , ..., a n + a n + 1) */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the value of n = ");
		int n = scanner.nextInt();
		double[] array = new double[n * 4];
		System.out.println("Input the " + (2 * n) + " elements of array: ");
		for (int i = 0; i < (2 * n); i++) {
			array[i] = scanner.nextDouble();
		}
		scanner.close();
		for (int i = 0; i < array.length && array[i] != 0; i++) {
			System.out.print((int) array[i] + "\t");
		}
		double max = array[0] + array[2 * n];

		for (int i = 0; i < n; i++) {
			if (array[i] + array[2 * n - i + 1] > max) {
				max = array[i] + array[2 * n - i + 1];
			}
		}
		System.out.println("\nmax = " + max);
	}
}
