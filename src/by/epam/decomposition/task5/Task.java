package by.epam.decomposition.task5;

import java.util.Scanner;

/* Составить программу, которая в массиве A[N] находит второе по величине
   число (вывести на печать число, которое меньше максимального элемента
   массива, но больше всех других элементов). */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of array = ");
		int size = scanner.nextInt();

		while (size < 2) {
			System.out.println("Invalid value of size (minimum two element), try again");
			size = scanner.nextInt();
		}
		scanner.close();

		float[] arrayA = new float[size];
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (float) ((Math.random() * ((50 - 0) + 1)) + 0);
		}

		System.out.println("Source array = ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}

		System.out.println("\nSecond max element = " + getSecondMax(arrayA));
	}

	private static float getSecondMax(float[] array) {
		int iFirstMax;
		int iSecondMax;
		if (array[0] > array[1]) {
			iFirstMax = 0;
			iSecondMax = 1;
		} else {
			iFirstMax = 1;
			iSecondMax = 0;
		}
		for (int i = 2; i < array.length; i++) {
			if (array[i] > array[iFirstMax]) {
				iSecondMax = iFirstMax;
				iFirstMax = i;
			} else if (array[i] > array[iSecondMax]) {
				iSecondMax = i;
			}
		}
		return array[iSecondMax];
	}
}
