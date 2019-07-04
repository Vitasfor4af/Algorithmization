package by.epam.arrays.Task7;

import java.util.Random;
import java.util.Scanner;

/* Даны действительные числа a 1 , a 2 , ... , a n .
 Найти  max(...) */

public class Task {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the value of n = ");
		int n = scanner.nextInt();
		double[] array = new double[1000];
		System.out.println("Input the " + (2 * n) + " elements of array: ");
		for (int i = 0; i < (2 * n); i++) {
			array[i] = scanner.nextDouble();
		}
		scanner.close();
		for (int i = 0; i < array.length && array[i] != 0; i++) {
			System.out.print((int)array[i] + "\t");
		}
		double max = array[0] + array[2 * n];

		for (int i = 0; i < n; i++) {
			if (array[i] + array[2 * n - i + 1] > max) {
				max = array[i] + array[2 * n - i + 1];
			}
		}
		System.out.println("\nmax = " + (int)max);

//		int[] doubleArray = new int[array.length * 2];
//		System.arraycopy(array, 0, doubleArray, 0, array.length);
//
//		for (int i = array.length; i < doubleArray.length; i++) {
//			doubleArray[i] = random.nextInt(50);
//		}
//		int[] specArray = new int[array.length];
//
//		for (int i = 0; i < specArray.length; i++) {
//			if (i == specArray.length - 1) {
//				specArray[i] = doubleArray[specArray.length - 1] + doubleArray[(specArray.length - 1) + 1];
//			} else if (i % 2 == 0) {
//				specArray[i] = doubleArray[i] + doubleArray[2 * (specArray.length - 1)];
//			} else if (i % 2 != 0) {
//				specArray[i] = doubleArray[i] + doubleArray[(2 * (specArray.length - 1)) - 1];
//			}
//		}
//
//		for (int i = 0; i < specArray.length; i++) {
//			System.out.print(specArray[i] + "\t");
//		}
//
//		int max = array[0];
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > max) {
//				max = array[i];
//			}
//		}
//
//		System.out.println("\nMAX = " + max);
	}
}
